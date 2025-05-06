FROM openjdk:17

WORKDIR /app

COPY ./target/testcicd.jar /app

EXPOSE 8080

CMD ["java", "-jar", "testcicd.jar"]