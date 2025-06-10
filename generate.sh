#!/usr/bin/env bash

# See https://openapi-generator.tech/docs/installation to install openapi-generator-cli

#    --input-spec https://aws.us-east-1.lamin.ai/api/openapi.json \

npx @openapitools/openapi-generator-cli generate \
    --generator-name java \
    --input-spec https://staging.laminhub.com/api/openapi.json \
    --config config.yaml \
    --skip-validate-spec \
    --output .
