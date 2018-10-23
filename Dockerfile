FROM java:8
ADD mybatisplus-0.0.1.jar app.jar
RUN bash -c 'touch /app.jar'
ENTRYPOINT ["java","-jar","/app.jar"]