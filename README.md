# Statsmaster REST Api
REST api for sport stats analyser.

## Requirements
- Java 1.8
- Maven 3.5.0
- MySQL

## How to run App
Start MySQL
Create database named: test
Clone Repo
On commandline:
 - cd into project
 - mvn spring-boot:run

This will start Apache tomcat and create the required tables in the database.

## Sample Rest calls

### Create User
- http://localhost:8080/statsmaster/user/add?name=John&email=someemail@someemailprovider.com&username=johnsheehan
### Return all Users
- http://localhost:8080/statsmaster/user/all
### GET User by id 
- http://localhost:8080/statsmaster/user/user/?id=1
