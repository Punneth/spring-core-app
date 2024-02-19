package com.youtube.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.youtube.model.Employee;

@Controller
public class ContactController {

	@Autowired
	private HibernateTemplate hibernateTemplate;

	@RequestMapping(path = "/contact")
	public String contact() {
		return "contact";
	}

	@RequestMapping(path = "/processform", method = RequestMethod.POST)
	public String processForm(@ModelAttribute("student") Employee employee, Model model) {

		System.out.println("Your UserName is " + employee.getUsername());
		System.out.println("Email " + employee.getEmail());
		System.out.println("Password " + employee.getPassword());
		System.out.println("Employee Id " + employee.getEmpId());

		int id = (int) hibernateTemplate.save(employee);
		System.out.println(id);

		return "processform";
	}

}
