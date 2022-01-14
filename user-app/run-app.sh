#!/bin/bash
export PROJECTS_PATH="$(dirname "$(pwd)")"

cd $PROJECTS_PATH

printf "\n> Compilando User APP \n"
mvn clean install -f modules/user-app-service/pom.xml
cd modules/user-app-service

printf "\n> Executando User APP \n"
mvn spring-boot:run