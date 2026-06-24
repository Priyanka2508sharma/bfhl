FROM eclipse-temurin:17-jdk

WORKDIR /app

COPY . .

RUN chmod +x mvnw && ./mvnw clean install

EXPOSE 8080

CMD ["java", "-jar", "target/bfhl-0.0.1-SNAPSHOT.jar"]