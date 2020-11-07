FROM openjdk:latest
VOLUME /temp
ADD build/libs/demoapp-0.0.1-SNAPSHOT.jar app.jar
ENTRYPOINT ["java","-jar","/app.jar"]
