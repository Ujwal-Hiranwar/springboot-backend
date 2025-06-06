# Spring Boot Online Clipboard Application

## Overview
This is a Spring Boot-based backend application for an Online Clipboard system. The application provides a RESTful API to manage clipboard data, allowing users to store, retrieve, and share text snippets efficiently. It is built using Spring Boot and integrates with Jenkins for CI/CD and Docker for containerization, ensuring easy deployment and scalability.

**Repository URL**: [https://github.com/Ujwal-Hiranwar/springboot-backend](https://github.com/Ujwal-Hiranwar/springboot-backend)

## Features
- **End to End Encryption**: Provides endpoints for creating, reading, updating, and deleting clipboard entries.
- **Jenkins CI/CD**: Includes a `Jenkinsfile` for automated building, testing, and deployment.
- **Docker Support**: Includes a `Dockerfile` for containerizing the application.
- **Secure and Scalable**: Built with Spring Boot's robust features for security and scalability.

## Prerequisites
To run this project, ensure you have the following installed on your system:
- **Java**: JDK 17 or later
- **Maven**: For building and managing dependencies
- **Docker**: For containerizing and running the application
- **Git**: To clone the repository

### Installation Instructions
1. **Clone the Repository**:
   ```bash
   git clone https://github.com/Ujwal-Hiranwar/springboot-backend.git
   cd springboot-backend
   ```

## Project Setup
1. **Configure Database**:
   - The application uses an H2 in-memory database by default for development. To use a different database (e.g., MySQL or PostgreSQL), update the `application.properties` or `application.yml` file in `src/main/resources` with your database configuration. Example for MySQL:
     ```properties
     spring.datasource.url=jdbc:mysql://localhost:3306/clipboard_db
     spring.datasource.username=your_username
     spring.datasource.password=your_password
     spring.jpa.hibernate.ddl-auto=update
     ```

2. **Install Dependencies**:
   - Run the following command to download all required dependencies:
     ```bash
     mvn clean install
     ```

## Running the Application
### Option 1: Run Locally with Maven
1. Start the Spring Boot application:
   ```bash
   mvn spring-boot:run
   ```
2. The application will start on `http://localhost:8080` (or the port configured in `application.properties`).
3. Access the API endpoints using tools like Postman or cURL. Example:
   ```bash
   curl http://localhost:8080/api/clipboard
   ```

### Option 2: Run with Docker
1. **Run the Docker Container**:
   - Run the container, mapping the application port (default 8080):
     ```bash
     docker run -p 8080:8080 ujwalhiranwar/clipboardimage:fb79101
     ```
   - If using a database, ensure it is accessible to the container and configure environment variables if needed:
     ```bash
     docker run -p 8080:8080 \
       -e SPRING_DATASOURCE_URL=jdbc:mysql://host.docker.internal:3306/clipboard_db \
       -e SPRING_DATASOURCE_USERNAME=your_username \
       -e SPRING_DATASOURCE_PASSWORD=your_password \
       springboot-clipboard-backend
     ```

3. Run the pipeline in your local jenkins server using jenkins file to build, test, and deploy the application.

## Project Structure
```plaintext
springboot-backend/
├── src/
│   ├── main/
│   │   ├── java/
│   │   │   └── com/example/clipboard/
│   │   │       ├── controller/
│   │   │       ├── service/
│   │   │       ├── repository/
│   │   │       └── model/
│   │   └── resources/
│   │       └── application.properties
├── Jenkinsfile
├── Dockerfile
├── pom.xml
└── README.md
```

## Troubleshooting
- **Database Connection Issues**: Ensure the database is running and the credentials in `application.properties` are correct.
- **Port Conflicts**: If port 8080 is in use, change the port in `application.properties`:
  ```properties
  server.port=8081
  ```
- **Docker Issues**: It may be possible that port is alredy in use run with differnt port
  ```bash
  docker run -p 8081:8080 ujwalhiranwar/clipboardimage:fb79101
  ```
- **Maven Dependency Issues**: Run `mvn clean install` to refresh dependencies.
- For additional help, refer to the [Spring Boot Documentation](https://docs.spring.io/spring-boot/docs/current/reference/htmlsingle/).

## Contributing
Contributions are welcome! To contribute:
1. Fork the repository.
2. Create a new branch (`git checkout -b feature-branch`).
3. Make your changes and commit (`git commit -m 'Add new feature'`).
4. Push to the branch (`git push origin feature-branch`).
5. Create a Pull Request.

## License


## Contact
For questions or feedback, contact the repository owner at https://ujwalhiranwar-portfolio.vercel.app/