FROM openjdk:8
EXPOSE 8086
ADD target/microservice2.jar microservice2.jar
ENTRYPOINT ["java","-jar","/microservice2.jar"]
