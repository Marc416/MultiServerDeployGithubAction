FROM eclipse-temurin:17-jre
WORKDIR /app
COPY . .

CMD chmod +x ./gradlew
CMD ./gradlew build -x test
CMD ls -a
RUN cd /build/libs
RUN ls -a
#CMD cp ./build/libs/server-to-test-0.0.1-SNAPSHOT.jar app.jar
#ENTRYPOINT ["java","-jar","server-to-test-0.0.1-SNAPSHOT.jar"]
