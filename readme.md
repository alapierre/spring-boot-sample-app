# Build docker image

````shell
mvn compile jib:dockerBuild
````

## Check image and app vulnerability

````shell
trivy image lapierre/sample-backend-service:0.0.1-SNAPSHOT
````

## Change base image to alpine

# OWASP Dependency check

````shell
mvn dependency-check:check
````

It is recorded to use NIST API Key (`-DnvdApiKey`), you can use `<nvdApiKey>.....</nvdApiKey>` property in your `settings.xml` too.