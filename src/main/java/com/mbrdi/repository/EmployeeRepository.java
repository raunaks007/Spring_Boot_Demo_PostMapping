package com.mbrdi.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mbrdi.model.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long>{

}
