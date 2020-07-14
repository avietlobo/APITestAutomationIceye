#Place this file in the src/main/docker directory
FROM openjdk

VOLUME /tmp
ADD maven/api-test-automation-quickstart-0.0.1-SNAPSHOT.jar api-test-automation-quickstart-0.0.1-SNAPSHOT.jar
RUN sh -c 'touch /api-test-automation-quickstart-0.0.1-SNAPSHOT.jar'
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/api-test-automation-quickstart-0.0.1-SNAPSHOT.jar"]

EXPOSE 8080