#!/usr/bin/env bash

# See https://openapi-generator.tech/docs/installation to install openapi-generator-cli

INPUT_SPEC="https://aws.us-east-1.lamin.ai/api/openapi.json"
# INPUT_SPEC="https://staging.laminhub.com/api/openapi.json"

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

# update pom.xml with artifact version
VERSION=$(yq -r '.artifactVersion' config.yaml)
sed -i "s/^    <version>[^<]*<\/version>$/    <version>$VERSION<\/version>/" pom.xml
