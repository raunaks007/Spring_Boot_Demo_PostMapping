package com.mbrdi.services.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.mbrdi.exception.ResourceNotFoundException;
import com.mbrdi.model.Employee;
import com.mbrdi.repository.EmployeeRepository;
import com.mbrdi.services.EmployeeService;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	private EmployeeRepository employeeRepository;

	public EmployeeServiceImpl(EmployeeRepository employeeRepository) {
		super();
		this.employeeRepository = employeeRepository;
	}

	@Override
	public Employee saveEmployee(Employee employee) {
		// TODO Auto-generated method stub

		return employeeRepository.save(employee);
	}

	@Override
	public List<Employee> getAllEmployeeList() {
		// TODO Auto-generated method stub
		return employeeRepository.findAll();
	}

	@Override
	public Employee getEmployeeById(Long id) {
		// TODO Auto-generated method stub
		//return employeeRepository.findById(id).orElseThrow(()-> new ResourceNotFoundException("Employee", "id", id));
		
		Optional<Employee> findByIdEmployee = employeeRepository.findById(id);
		if (findByIdEmployee.isPresent()) {
			
			return findByIdEmployee.get();
		}
		else {
			throw new ResourceNotFoundException("Employee", "id", id);
		}
	}


}
