package com.codedecode.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.codedecode.demo.entity.Employee;
import com.codedecode.demo.repository.EmployeeCrudRepo;

@Service
public class EmployeeService implements EmployeeServiceInterface {

	@Autowired
	EmployeeCrudRepo crudRepo;

	@Override
	public Employee addEmployee(Employee employee) {

		Employee savedEmployee = crudRepo.save(employee);
		return savedEmployee;

	}
}
