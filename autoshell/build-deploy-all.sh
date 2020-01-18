#!/bin/bash

cd "$(dirname "$0")" || exit
./build-deploy-service-config.sh
./build-deploy-service-a.sh
./build-deploy-service-b.sh
./build-deploy-service-self-healing.sh