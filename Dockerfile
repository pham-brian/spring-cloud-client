FROM java:8-jre
MAINTAINER java_docker
ADD ./target/spring-cloud-client-0.0.1-SNAPSHOT.jar /app/

EXPOSE 8080

ENTRYPOINT ["java","-agentlib:jdwp=transport=dt_socket,address=8000,suspend=n,server=y", "-Xmx200m", "-jar", "/app/spring-cloud-client-0.0.1-SNAPSHOT.jar"]
