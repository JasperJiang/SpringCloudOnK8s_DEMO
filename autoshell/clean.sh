#!/bin/bash

cd "$(dirname "$0")" || exit
kubectl delete -f ../k8s_yaml/service-a.yaml
kubectl delete -f ../k8s_yaml/service-b.yaml
kubectl delete -f ../k8s_yaml/service-self-healing.yaml
kubectl delete -f ../k8s_yaml/service-config.yaml