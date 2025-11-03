# Use an official OpenJDK image
FROM openjdk:17-jdk-slim

# Set working directory
WORKDIR /app

# Copy Maven files and build
COPY . .

# Build the application
RUN apt-get update && apt-get install -y maven && mvn clean package -DskipTests


# Expose the port (Render will map it)
EXPOSE 8080

# Run the jar file
CMD ["java", "-jar", "target/*.jar"]
