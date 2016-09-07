## What is this project?

This project *cas-overlay-demo* has been created to test the CAS server and the CAS management webapps (version >= *4.0*) using the [*Maven overlay* mechanism](http://apereo.github.io/cas/4.2.x/installation/Maven-Overlay-Installation.html):  
It's composed of two overlays:

- the *cas-overlay-server-demo* module is the CAS server webapp
- the *cas-overlay-management-demo* module is the CAS management webapp.

## Build & test

To start quickly, build the project:

```shell
cd cas-overlay-demo
mvn clean install
```

and launch the two web applications:

```shell
java -jar cas-overlay-server-demo/target/cas.war
```

and

```shell
java -jar cas-overlay-management-demo/target/cas-management.war
```

To test:

- call the [http://localhost:8081/cas-management](http://localhost:8081/cas-management) url to access the CAS services management webapp
- you will be redirected to the CAS server for login (username: jleleu, password: jleleu)
- then, you'll be redirected back to the CAS services management webapp, successfully authenticated.
