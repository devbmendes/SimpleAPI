# Simple REST-API
<p> This is a simple Spring Boot API using with dependencies like : </br>
Spring Web </br>
Spring JPA </br>
H2 DataBase dependency</br>
Spring Valiation </br>
 <p/>
<h2> Features </h2>

 1. [ ] Save Student
 2. [ ] Find All Student
 3. [ ] Find a particular Student by Id
 4. [ ] Find a particular Student by email
 5. [ ] Update a Student
 6. [ ] Delete a particular Student
 7. [ ] The Exception Handling logic was also implemented
<h2> Getting Started </h2>
<p> To get started with this project, you will need to have the following installed on your local machine: </p>
 
 1. [ ] JDK 17+
 2. [ ] MAVEN 3+

To build and run the project, follow these steps:
 1. Clone the repository: `git clone http://github.com/devbmendes/SimpleAPI.git`
 2. Navigate to the project directory: cd SimpleAPI or open a Java IDE like IntelliJ IDEA or STS
 3. Run the project: Run as Spring Boot Application
 4. You can use de Postman tools or whatever you want
 
-> The application will be available in http://localhost:8080 or https://student-spring-api-production.up.railway.app/v1/student
## Endpoins

 1. Get all students - GET`localhost:8080/api/v1/student/all`
 2. Get student by Id - GET `localhost:8080/api/v1/student/4`
 3. Delete by Id - DELETE `localhost:8080/api/v1/student/4`
 4. Save student - POST  `localhost:8080/api/v1/student` 
 `{
     "firstname":  "Junior",
     "telefone":  "949994789",
     "lastname":  "Soares",
     "email":  "juniorsoares@gmail.com"
    }`

5. Update student - PUT `localhost:8080/api/v1/student`
	`{
	  "id":4,
    "firstname":  "Balduino",
    "telefone":  "999994789",
    "lastname":  "Mendes",
    "email":  "baldhuino@gmail.com"
    }`
6. Get student by email - GET `http://localhost:8080/api/v1/student?email=baldhuino@gmail.com`
 
