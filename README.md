## What is this project?

This project *cas-overlay-demo* has been created to test the CAS server and the CAS services management webapps (version >= *4.0*) using the *Maven overlay* mechanism: [http://jasig.github.io/cas/4.0.x/installation/Maven-Overlay-Installation.html](http://jasig.github.io/cas/4.0.x/installation/Maven-Overlay-Installation.html).  
It's composed of two overlays:

- the *cas-overlay-server-demo* module is the CAS server webapp
- the *cas-overlay-management-demo* module is the CAS services management webapp.

## Deploy

Deploy manually these two web applications in your favorite web applications server:

- cas-overlay-server-demo on /cas
- cas-overlay-management-demo on /cas-management.

For example, with Tomcat (in your *server.xml* file):

    <Context docBase="/usr/local/myapps/cas-overlay-demo/cas-overlay-server-demo/target/cas-overlay-server-demo" path="/cas" />
    <Context docBase="/usr/local/myapps/cas-overlay-demo/cas-overlay-management-demo/target/cas-overlay-management-demo" path="/cas-management" />

## Test

To test,

- call the [http://localhost:8080/cas-management](http://localhost:8080/cas-management) url to access the CAS services management webapp
- be redirected to CAS server and authenticate (username: jleleu, password: jleleu)
- be redirected back to the CAS services management webapp, being successfully authenticated.
