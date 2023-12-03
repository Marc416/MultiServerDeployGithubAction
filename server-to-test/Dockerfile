FROM eclipse-temurin:17
WORKDIR /app
COPY . .

RUN ./gradlew build -x test
WORKDIR build/libs
RUN chmod 644 server-to-test-0.0.1-SNAPSHOT.jar
RUN chmod +x /opt/java/openjdk/bin/java
ENTRYPOINT ["java","-jar","server-to-test-0.0.1-SNAPSHOT.jar"]
