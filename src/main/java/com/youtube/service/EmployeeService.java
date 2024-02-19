package com.youtube.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.youtube.dao.EmployeeDao;
import com.youtube.model.Employee;

@Service
public class EmployeeService {

	@Autowired
	private EmployeeDao employeeDao;
	
	public int saveEmp(Employee employee) {
		int id = employeeDao.insertEmp(employee);
		return id;
	}
}
