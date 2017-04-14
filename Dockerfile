FROM java:8-alpine

COPY build/libs/TestApp-1.0-SNAPSHOT.jar ./test-app.jar

EXPOSE 8080
CMD ["java","-jar","test-app.jar"]