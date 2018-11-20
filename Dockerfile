FROM java:8
EXPOSE 8082

ENTRYPOINT ["java","-jar","employee_v1.jar "]
