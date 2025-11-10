# Etapa 1: Build con Maven
FROM maven:3.9.6-eclipse-temurin-17 AS build
WORKDIR /app

# Copiamos los archivos necesarios
COPY pom.xml .
COPY src ./src

# Compilamos el proyecto (sin tests opcional)
RUN mvn clean package -DskipTests

# Etapa 2: Runtime (ejecución)
FROM eclipse-temurin:17-jdk-jammy
WORKDIR /app

# Copiamos el jar generado desde la etapa anterior
COPY --from=build /app/target/*.jar app.jar

# Exponemos el puerto
EXPOSE 8081

# Comando de arranque
ENTRYPOINT ["java", "-jar", "app.jar"]
