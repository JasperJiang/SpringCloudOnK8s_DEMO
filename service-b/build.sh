#!/bin/bash

cd "$(dirname "$0")" || exit
mvn clean package -DskipTests docker:build