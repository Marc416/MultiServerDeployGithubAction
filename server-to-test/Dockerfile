FROM openjdk:17-alpine
WORKDIR /app
COPY . .

RUN  chmod +x ./gradlew
RUN ./gradlew build -x test
RUN cp ./build/libs/server-to-test-0.0.1-SNAPSHOT.jar app.jar
RUN ls -a
#ENTRYPOINT ["java","-jar","server-to-test-0.0.1-SNAPSHOT.jar"]
