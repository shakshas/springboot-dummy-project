# Use Java 21 runtime image
FROM eclipse-temurin:21-jdk-jammy

# Set working directory
WORKDIR /app

# Copy jar from target folder
COPY target/*.jar app.jar

# Expose spring boot port
EXPOSE 8080

# Run the jar
ENTRYPOINT ["java","-jar","app.jar"]
