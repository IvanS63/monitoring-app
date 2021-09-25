# Spring Boot + Prometheus + Grafana + Docker
Sprin Boot application for collecting and showing metrics in Grafana and Prometheus.

## Technologies
- Java 11
- Maven
- Spring Boot 
- Grafana
- Prometheus
- Docker

Workflow
========
## Run project
1. Replace HOST_IP with current IP address (cmd ipconfig) in prometheus.yml file.
2. Run: **docker-compose up** command from  project root directory to run containers.
3. Check http://localhost:8080/actuator/prometheus and http://localhost:9090/targets for metrics.
4. Check Grafana in http://localhost:3000/ and configure datasouce. Configuration from root JSON file can be imported for Spring Boot app.