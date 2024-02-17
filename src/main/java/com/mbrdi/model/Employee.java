package com.mbrdi.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "employees")
public class Employee {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@Column(name = "First_Name", nullable = false)
	private String first_Name;
	
	@Column(name = "Last_Name", nullable = false)
	private String last_Name;
	
	@Column(name = "Email_Id")
	private String email_Id;

}
