FROM ubuntu:latest
RUN apt update && \
    apt install openjdk-17-jdk -y && \
    apt install maven -y
WORKDIR /app
COPY . /app
RUN mvn clean package
#ENTRYPOINT ["java", "-jar", "target/cloud-functions-aws-0.0.1-SNAPSHOT.jar"]
ENTRYPOINT ["java", "-jar", "target/cloud-functions-aws-0.0.1-SNAPSHOT.jar"]