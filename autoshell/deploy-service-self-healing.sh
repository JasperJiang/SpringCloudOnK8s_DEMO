#!/bin/bash

SERVICE_NAME=service-self-healing

cd "$(dirname "$0")" || exit
kubectl delete -f ../k8s_yaml/$SERVICE_NAME.yaml
kubectl apply -f ../k8s_yaml/$SERVICE_NAME.yaml