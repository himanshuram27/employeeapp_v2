FROM java:8
EXPOSE 8082
ADD /target/employeeapp_v1.jar employeeapp_v1.jar
ENTRYPOINT ["java","-jar","employee_v1.jar "]