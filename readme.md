# Build docker image

````shell
mvn compile jib:dockerBuild
````

## Check image and app vulnerability

````shell
trivy image lapierre/sample-backend-service:0.0.1-SNAPSHOT
````

## Change base image to alpine 