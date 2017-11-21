## What is this project?

This project *cas-overlay-demo* has been created to test the CAS server and the CAS management webapps using the [*Maven overlay* mechanism](http://apereo.github.io/cas/5.2.x/installation/Maven-Overlay-Installation.html):  
It's composed of two overlays:

- the *cas-overlay-server-demo* module is the CAS server webapp
- the *cas-overlay-management-demo* module is the CAS management webapp.

## Build & test

To start quickly, build the project:

```shell
cd cas-overlay-demo
mvn clean install
```

and launch the CAS webapps via your favorite web application server with `-Dcas.standalone.config=cas-overlay-server-demo/config`.
