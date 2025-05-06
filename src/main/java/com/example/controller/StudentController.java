package com.example.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.Entity.Student;
import com.example.Repo.StudentRepo;

@RestController
public class StudentController {
	
   @Autowired	
   // Used for automatically creating objects.
   private StudentRepo studentrepo;	
   
   // Inserting data into DB
   @PostMapping("/api/students")	
   public ResponseEntity<Student> saveStudent(@RequestBody Student student) {
	   return new ResponseEntity<>(studentrepo.save(student),HttpStatus.CREATED);
   }
   
   // Getting all the data
   @GetMapping("/api/students")
   public ResponseEntity<List<Student>> getStudent(@RequestBody Student student) {
	   return new ResponseEntity<>(studentrepo.findAll(),HttpStatus.OK);
   }
   
   // Getting data by ID
   @GetMapping("/api/students/{id}")
   public ResponseEntity<Student> getStudent(@PathVariable long id){
	   Optional<Student> student=studentrepo.findById(id);
	   
	   if(student.isPresent()) {
		   return new ResponseEntity<>(student.get(),HttpStatus.OK);
	   }
	   else {
		   return new ResponseEntity<>(HttpStatus.NOT_FOUND);
	   }
   }
   
   // Updating data by ID
   @PutMapping("/api/students/{id}")
   public ResponseEntity<Student> updateStudent(@PathVariable long id,@RequestBody Student stud){
	   Optional<Student> student=studentrepo.findById(id);
	   
	   if(student.isPresent()) {
		   student.get().setFirstName(stud.getFirstName());
		   student.get().setPhoneNumber(stud.getPhoneNumber());
		   student.get().setDepartment(stud.getDepartment());
		   return new ResponseEntity<>(studentrepo.save(student.get()),HttpStatus.OK);
	   }
	   else {
		   return new ResponseEntity<>(HttpStatus.NOT_FOUND);
	   }
   }
   
   //Deleting data by ID
   @DeleteMapping("/api/students/{id}")
   public ResponseEntity<Void> deleteStudent(@PathVariable long id){
       Optional<Student> student=studentrepo.findById(id);
	   
	   if(student.isPresent()) {
		   studentrepo.deleteById(id);
		   return new ResponseEntity<>(HttpStatus.NO_CONTENT);
	   }
	   else {
		   return new ResponseEntity<>(HttpStatus.NOT_FOUND);
	   }
   }
   
}
