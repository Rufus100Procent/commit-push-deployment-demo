FROM maven:3-amazoncorretto-17 AS build
WORKDIR /app/myapp
COPY pom.xml .
COPY src ./src

RUN mvn package

# Stage 2: Package the application in a runtime image
FROM amazoncorretto:17-alpine
WORKDIR /app/myapp
COPY --from=build /app/myapp/target/ROOT.jar app.jar
#default profile if non is selected
ENV SPRING_PROFILES_ACTIVE=dev
ENTRYPOINT ["java", "-jar", "app.jar"]
