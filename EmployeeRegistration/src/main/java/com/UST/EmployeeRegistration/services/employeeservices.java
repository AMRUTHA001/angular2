package com.UST.EmployeeRegistration.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.UST.EmployeeRegistration.model.Employee;
import com.UST.EmployeeRegistration.repository.employeerepo;

@Service
public class employeeservices {
	@Autowired
	private employeerepo repo;

	public Employee createEmployee(Employee employee) {
		
		return repo.save(employee);
	}

	


	public List<Employee> getEmployee() {
		// TODO Auto-generated method stub
		return repo.findAll();
	}

	

	

	
	

	

}
