# Commute Service - Commute API Gateway

This service offers a single entry point to the clusters of microservices

## Build
`mvn package`

## Local docker image build
 `mvn package docker:build "-Ddocker.image.tag=local"`

## Run
` mvn spring-boot:run`
