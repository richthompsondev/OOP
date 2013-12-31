package com.example.demo.controller;
// From Udemy's Quick course for creating restful spring boot microservice
import java.util.Optional;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.pojo.Person;
/*
 * This class is taking name, last name and age and returning in a string.
 * If the age is not valid, it returns "Age should be numeric" and status INTERNAL_SERVER_ERROR.
 * If there is no age, then returns only name and last name and status OK.
 */
@RestController // Retorna o objeto, e os dados do objeto são gravados na resposta HTTP como JSON ou XML
public class TestHttpMethod {
	// Test on postman - http://localhost:8080/person/fn/Jonatas/ln/Dourado?age=29
	@GetMapping("/person/fn/{firstName}/ln/{lastName}")
	public ResponseEntity<Person> getCustomMessage(
			@PathVariable (value = "firstName") String fName,
			@PathVariable (value = "lastName") String lName,
			@RequestParam Optional<String> age
			) {
		Integer personAge = 0;
		if(age.isPresent()) {
			try {
				personAge = Integer.parseInt(age.get());
			} catch (Exception e) {
				return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR)
						.body(null);
			}
			Person person = new Person(fName, lName, personAge);
			return ResponseEntity.status(HttpStatus.OK).body(person);
		}
		Person person = new Person(fName, lName);
		return ResponseEntity.status(HttpStatus.OK).body(person);
	}
}
