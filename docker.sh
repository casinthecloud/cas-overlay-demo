#!/bin/sh

mvn clean package
cd cas-overlay-server-demo
docker build -t cas-overlay-server-demo .
docker run --name server -p 127.0.0.1:8080:8080 -i -d cas-overlay-server-demo
cd ../cas-overlay-management-demo/
docker build -t cas-overlay-management-demo .
docker run --name management -p 127.0.0.1:8081:8081 -i -d cas-overlay-management-demo
