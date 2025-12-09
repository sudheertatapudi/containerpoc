FROM openjdk:17.0.2-jdk

ADD target/devpoc.jar devpoc.jar

ENTRYPOINT ["java","-jar","/devpoc.jar"]
