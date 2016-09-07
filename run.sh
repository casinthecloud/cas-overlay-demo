#!/bin/sh

mvn clean package
java -jar cas-overlay-server-demo/target/cas.war &
java -jar cas-overlay-management-demo/target/cas-management.war &
