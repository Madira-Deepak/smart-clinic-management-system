# Build stage

FROM maven:3.9.6-eclipse-temurin-17 AS build

# Set working directory

WORKDIR /app

# Copy source code

COPY . .

# Build application

RUN mvn clean package -DskipTests

# Runtime stage

FROM eclipse-temurin:17-jre

# Set runtime directory

WORKDIR /app

# Copy built JAR from build stage

COPY --from=build /app/target/*.jar app.jar

# Expose application port

EXPOSE 8080

# Run Spring Boot application

ENTRYPOINT ["java","-jar","app.jar"]
