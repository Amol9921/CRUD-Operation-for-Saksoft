package com.codedecode.demo.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.codedecode.demo.entity.Employee;
import com.codedecode.demo.service.EmployeeServiceInterface;

@RestController
@RequestMapping("/code")
public class EmployeeController {

	/*
	 * @Autowired EmployeeCrudRepo empCrud;
	 * 
	 * @GetMapping public List<Employee> getAllEmployees() {
	 * 
	 * System.out.println("getting all employees"); return empCrud.findAll(); }
	 */
	@Autowired
	EmployeeServiceInterface employeeServiceInterface;

	@PostMapping("/save")

	public ResponseEntity<Employee> addEmployee(@RequestBody Employee employee) {

		Employee employeeSaved = employeeServiceInterface.addEmployee(employee);
		return new ResponseEntity<Employee>(employeeSaved, HttpStatus.CREATED);

	}

}
