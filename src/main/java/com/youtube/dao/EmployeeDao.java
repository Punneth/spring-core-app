package com.youtube.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.youtube.model.Employee;

@Repository
public class EmployeeDao {

	@Autowired
	private HibernateTemplate hibernateTemplate;
	
	public int insertEmp(Employee employee) {
		System.out.println("Inside EmployeeDao");
		int id = (int)hibernateTemplate.save(employee);
		return id;
		
	}
	
}
