# Debian 9
FROM debian:9

# Corretto 11
COPY --from=amazoncorretto:11 / /

# Maven
COPY --from=maven:3.6.1 / /

# Ubicarse en carpeta de proyecto
WORKDIR /usr/src/backend

# Copiar pom.xml
COPY pom.xml /usr/src/backend/pom.xml

# Instalar dependencias
RUN mvn dependency:resolve