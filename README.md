## What is this project?

This project *cas-overlay-demo* has been created to test the CAS server using the [*Maven overlay* mechanism](http://apereo.github.io/cas/5.2.x/installation/Maven-Overlay-Installation.html):  

## Build & test

Build the project:

```shell
cd cas-overlay-demo
mvn clean package
```

And run the built WAR (`cas.war`) in Tomcat on `http://localhost:8080/cas`.

Use `jleleu`/`jleleu` or `leleuj`/`leleuj` to log in.

Authorized applications match the following pattern: `^http://localhost:.*`.
