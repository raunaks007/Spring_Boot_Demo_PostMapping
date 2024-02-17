package com.mbrdi.services;

import java.util.List;

import com.mbrdi.model.Employee;

public interface EmployeeService {
	
	public Employee saveEmployee(Employee employee);
	
	public List<Employee> getAllEmployeeList();
	
	public Employee getEmployeeById(Long id);

}
