FROM eclipse-temurin:17-alpine
WORKDIR /app
COPY . .

RUN ./gradlew build -x test
#WORKDIR build/libs
RUN cp ./build/libs/server-to-test-0.0.1-SNAPSHOT.jar .
#RUN chmod 644 server-to-test-0.0.1-SNAPSHOT.jar
CMD chmod 644 /opt/java/openjdk/bin/java
CMD ["java","-jar","server-to-test-0.0.1-SNAPSHOT.jar"]
