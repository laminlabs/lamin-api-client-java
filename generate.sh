#!/usr/bin/env bash

# See https://openapi-generator.tech/docs/installation to install openapi-generator-cli

# INPUT_SPEC="https://aws.us-east-1.lamin.ai/api/openapi.json"
INPUT_SPEC="https://staging.laminhub.com/api/openapi.json"

npx @openapitools/openapi-generator-cli generate \
    --generator-name java \
    --config config.yaml \
    --input-spec "$INPUT_SPEC" \
    --skip-validate-spec \
    --output .

# postfix readme
SED_CMD1='s#FastAPI#[![Maven Central Version](https://img.shields.io/maven-central/v/ai.lamin/lamin-api-client.svg)](https://central.sonatype.com/artifact/ai.lamin/lamin-api-client/overview)\n[![javadoc](https://javadoc.io/badge2/ai.lamin/lamin-api-client/javadoc.svg)](https://javadoc.io/doc/ai.lamin/lamin-api-client)\n\nLamin API#'
SED_CMD2='s#mvn clean deploy#mvn clean deploy -P deployment#'
sed -i "$SED_CMD1;$SED_CMD2" README.md

# postfix generated file
sed -i 's#private Role role = member;#private Role role;#' src/main/java/ai/lamin/lamin_api_client/model/AddTeamMemberRequestBody.java

# fix Body.java compilation errors
BODY_FILE="src/main/java/ai/lamin/lamin_api_client/model/Body.java"
# fix malformed variable declaration
sed -i 's#final TypeAdapter<Map<String, Object>> adapterMap<String, Object> = gson.getDelegateAdapter(this, TypeToken.get(Map<String, Object>.class));#final Type typeInstanceMapStringObject = new TypeToken<Map<String, Object>>(){}.getType();\n            final TypeAdapter<Map<String, Object>> adapterMapStringObject = (TypeAdapter<Map<String, Object>>) gson.getDelegateAdapter(this, TypeToken.get(typeInstanceMapStringObject));#' "$BODY_FILE"
# fix instanceof with parameterized types (cannot use Map<String, Object> with instanceof)
sed -i 's#instanceof Map<String, Object>#instanceof Map<?, ?>#g' "$BODY_FILE"

# update pom.xml with artifact version
VERSION=$(yq -r '.artifactVersion' config.yaml)
sed -i "s/^    <version>[^<]*<\/version>$/    <version>$VERSION<\/version>/" pom.xml
