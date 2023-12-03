FROM openjdk:17-oracle
WORKDIR /app
COPY . .

RUN microdnf install findutils
RUN ./gradlew build -x test
WORKDIR build/libs
RUN chmod 644 server-to-test-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java","-jar","server-to-test-0.0.1-SNAPSHOT.jar"]
