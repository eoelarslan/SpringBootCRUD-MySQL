From openjdk:8
copy ./target/com.docker.one-0.0.1.jar com.docker.one-0.0.1.jar
CMD ["java","-jar","com.docker.one-0.0.1.jar"]