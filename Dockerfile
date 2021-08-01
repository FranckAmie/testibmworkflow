FROM adoptopenjdk/openjdk11:alpine-jre
ADD target/test-arval-k8s-0.0.1-SNAPSHOT.jar app.jar
ENTRYPOINT ["java","-jar","app.jar"]