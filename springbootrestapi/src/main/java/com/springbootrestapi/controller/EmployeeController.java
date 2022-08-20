package com.springbootrestapi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springbootrestapi.entity.Employee;
import com.springbootrestapi.repository.EmployeeRepository;

@RestController
@RequestMapping("/api/v1")
@CrossOrigin("*")
public class EmployeeController {
	
	@Autowired
	private EmployeeRepository eRepo;
	
	@GetMapping("/employees")
	public List<Employee> getAllEmployees() {
		return eRepo.findAll();
	}
}
