# Build docker image

````shell
mvn compile jib:dockerBuild
````

## Check image and app vulnerability

````shell
trivy image lapierre/sample-backend-service:0.0.1-SNAPSHOT
````

# OWASP Dependency check

````shell
mvn dependency-check:check
````

It is recorded to use NIST API Key (`-DnvdApiKey`), you can use `<nvdApiKey>.....</nvdApiKey>` property in your `settings.xml` too.

# Monitoring

- Grafana Dashboard for Spring Boot: https://grafana.com/grafana/dashboards/19004-spring-boot-statistics/
- https://grafana.com/grafana/dashboards/6083-spring-boot-hikaricp-jdbc/

