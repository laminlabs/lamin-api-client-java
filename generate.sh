#!/usr/bin/env bash

# See https://openapi-generator.tech/docs/installation to install openapi-generator-cli

# Override with e.g. INPUT_SPEC=api/openapi.yaml to regenerate from the stored spec
INPUT_SPEC="${INPUT_SPEC:-https://aws.us-east-1.lamin.ai/api/openapi.json}"
# INPUT_SPEC="https://staging.laminhub.com/api/openapi.json"

rm -r ./src

# ./templates overrides the generator's built-in mustache templates (only the
# files present there; everything else falls back to the built-ins)
npx @openapitools/openapi-generator-cli generate \
    --generator-name java \
    --config config.yaml \
    --input-spec "$INPUT_SPEC" \
    --template-dir ./templates \
    --skip-validate-spec \
    --output .

# restore custom tests (generation wipes ./src)
mkdir -p src/test/java/ai/lamin/lamin_api_client/model
cp custom/*.java src/test/java/ai/lamin/lamin_api_client/model/

# postfix readme
# anchor the badges on our own title heading rather than on the spec title, which
# silently stopped matching when the spec was renamed from FastAPI to LaminHub REST API
BADGES='[![Maven Central Version](https://img.shields.io/maven-central/v/ai.lamin/lamin-api-client.svg)](https://central.sonatype.com/artifact/ai.lamin/lamin-api-client/overview)\n[![javadoc](https://javadoc.io/badge2/ai.lamin/lamin-api-client/javadoc.svg)](https://javadoc.io/doc/ai.lamin/lamin-api-client)'
SED_CMD1="s|^# lamin-api-client\$|# lamin-api-client\n\n$BADGES|"
SED_CMD2='s#mvn clean deploy#mvn clean deploy -P deployment#'
sed -i "$SED_CMD1;$SED_CMD2" README.md

# postfix generated file
sed -i 's#private Role role = member;#private Role role;#' src/main/java/ai/lamin/lamin_api_client/model/AddTeamMemberRequestBody.java
# (Body.java compilation fixes moved into templates/libraries/okhttp-gson/anyof_model.mustache)

# update pom.xml with artifact version
VERSION=$(yq -r '.artifactVersion' config.yaml)
sed -i "s/^    <version>[^<]*<\/version>$/    <version>$VERSION<\/version>/" pom.xml
