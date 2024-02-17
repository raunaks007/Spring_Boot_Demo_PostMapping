package com.mbrdi.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.mbrdi.model.Employee;
import com.mbrdi.repository.EmployeeRepository;
import com.mbrdi.services.EmployeeService;

@RestController
@RequestMapping("/employee")
public class EmployeeController {

	public EmployeeService employeeService;

	public EmployeeController(EmployeeService employeeService) {
		super();
		this.employeeService = employeeService;
	}

	// build create employee Rest Api
	@PostMapping("/save")
	public ResponseEntity<Employee> saveEmployee(@RequestBody Employee employee) {
		return new ResponseEntity<Employee>(employeeService.saveEmployee(employee), HttpStatus.CREATED);
	}
	
	
	// build to get all employee Rest Api
	@GetMapping("/getEmployee")
	public List<Employee> getAllEmployeeList()
	{
		return employeeService.getAllEmployeeList();
	}
	
	//build to get employee by id Rest Api
	
	@GetMapping("/getEmployeeById")
	public ResponseEntity<Employee>   getEmployeeById(@RequestParam Long id)
	{
		return new ResponseEntity<Employee>(employeeService.getEmployeeById(id), HttpStatus.OK);
	}

}
