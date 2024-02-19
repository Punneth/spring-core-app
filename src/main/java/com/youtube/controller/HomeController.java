package com.youtube.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {
	
	@RequestMapping("/home")
	public String home(Model model) {
		System.out.println("This is home resolver");
		model.addAttribute("name", "Puneeth S B");
		model.addAttribute("city", "Coorge");
		
		return "index";
	}
	
	@RequestMapping("/about")
	public String about() {
		System.out.println("Inside about resolver");
		return "about";
	}
	
	@RequestMapping("/services")
	public ModelAndView services() {
		System.out.println("Service controller get called");
		
		ModelAndView modelAndView = new ModelAndView();
		
		List<String> travel = new ArrayList<String>();
		travel.add("Food");
		travel.add("Car");
		travel.add("Woki Toki");
		
		modelAndView.addObject("service", travel);
		modelAndView.addObject("assist", "Pooja");
		
		modelAndView.setViewName("services");
		
		return modelAndView;
	}

}
