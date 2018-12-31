#!/bin/bash
kubectl apply -f mongodb-secrets.yaml -f mongodb-config.yaml -f mongodb-storage.yaml -f mongodb-deployment.yaml -f mongodb-service.yaml --record
kubectl apply -f dockerreactdemo-deployment.yaml -f dockerreactdemo-service.yaml --record