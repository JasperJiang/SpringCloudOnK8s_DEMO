#!/bin/bash

SERVICE_NAME=service-config

cd "$(dirname "$0")" || exit
../$SERVICE_NAME/build.sh

./deploy-$SERVICE_NAME.sh