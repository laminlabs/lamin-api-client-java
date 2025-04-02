#!/usr/bin/env bash

# See https://openapi-generator.tech/docs/installation to install openapi-generator-cli

npx @openapitools/openapi-generator-cli generate \
    --generator-name java \
    --input-spec https://aws.us-east-1.lamin.ai/openapi.json \
    --config config.yaml \
    --skip-validate-spec \
    --output .

# git diff > patches/publish.patch

git apply --ignore-space-change --ignore-whitespace patches/publish.patch