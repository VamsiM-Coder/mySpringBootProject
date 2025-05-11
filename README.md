🎓 Student Record System App

A CRUD-based web application developed to manage student records efficiently. This app provides functionality to Create, Retrieve, Update, and Delete (CRUD) student records through a user-friendly interface and backend REST APIs.

Built using Java, Spring MVC, JPA, and Hibernate, with MySQL as the database. API testing and validation are handled via Postman.

🚀 Features :

   > Add New Student

   > View Student Records

   > Update Existing Student Details

   > Delete Student Records

   > Built on RESTful principles for smooth client-server interaction.

🛠️ Tech Stack :

   > Backend: Java, Spring MVC, Spring Data JPA, Hibernate

   > Database: MySQL

   > API Testing: Postman

   > Build Tool: Maven

💻 Modules :

   > StudentController: Handles HTTP requests for CRUD operations.

   > StudentService: Business logic layer.

   > StudentRepository: Data access layer using Spring Data JPA.

   > Entity Classes: Represents Student records mapped to database tables.

🌐 API Endpoints :

  > Method	Endpoint	Description
  > POST	/students	Create new student
  > GET	/students	Retrieve all students
  > GET	/students/{id}	Get student by ID
  > PUT	/students/{id}	Update student by ID
  > DELETE	/students/{id}	Delete student by ID
