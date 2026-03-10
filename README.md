# Spring Boot API Project
This is a simple Spring Boot application built to practice DevOps concepts.

## Prerequisites
To run this application, you will need:
- **Java 21**: Make sure Java is installed on your machine.
- **Maven**: Ensure Maven is installed so you can build the project.

Since you are using a Mac, you can easily install Maven using Homebrew:
```bash
brew install maven
```
Verify the installation by running:
```bash
mvn -version
```

## How to Build the Project
Open your terminal, navigate to the project directory, and run the following command to compile and package the application into an executable JAR file:
```bash
mvn clean package
```

## How to Run the Application
After building the project, you can run the Spring Boot app using the Maven command:
```bash
mvn spring-boot:run
```
Alternatively, you can run the built JAR file directly:
```bash
java -jar target/demo-0.0.1-SNAPSHOT.jar
```

The application will start on port `8080`.

## API Endpoints
Once the application is running, you can access the following 3 endpoints using your browser or a tool like `curl`:

1. **Health Check**
   - URL: `http://localhost:8080/health`
   - Returns a simple JSON confirming the service is up.
   ```bash
   curl http://localhost:8080/health
   ```

2. **List Users**
   - URL: `http://localhost:8080/list-users`
   - Returns a sample array of user names.
   ```bash
   curl http://localhost:8080/list-users
   ```

3. **List Countries**
   - URL: `http://localhost:8080/list-countries`
   - Returns a sample array of country names.
   ```bash
   curl http://localhost:8080/list-countries
   ```

## Next Steps for DevOps Practice
- Create a `Dockerfile` to containerize the application.
- Write a simple CI/CD pipeline (e.g., GitHub Actions, Jenkins) to build and test the code automatically.
- Deploy the Docker container to a cloud provider or Kubernetes.
