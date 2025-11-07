# Person Viewer Backend

![Build](https://github.com/Torokzoliii/person-viewer-backend-devops/actions/workflows/ci.yml/badge.svg)

## Tech
Spring Boot, JPA, Flyway, MySQL, Testcontainers, JUnit, Prometheus

## Run locally (docker-compose)
docker-compose up --build

- Backend: http://localhost:8080
- Frontend: http://localhost:4200
- Prometheus: http://localhost:9090
- Grafana: http://localhost:3000 (user/password = admin/admin elsőre)

## Run locally without Docker
1. Install MySQL and create `persondb`.
2. Edit `src/main/resources/application.yml` datasource url
3. ./gradlew bootRun

## Tests
Unit + integration: