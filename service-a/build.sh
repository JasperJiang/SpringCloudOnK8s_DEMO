#!/bin/bash

cd $(dirname "$0")
mvn clean package -DskipTests docker:build