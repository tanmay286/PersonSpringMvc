package com.capgemini.spring.mvc.model.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.capgemini.spring.mvc.model.entity.Person;
import com.capgemini.spring.mvc.model.service.PersonService;

@RequestMapping("/person")
@Controller
public class PersonController {

	@Autowired
	private PersonService service;
	
	@RequestMapping("/")
	public String show() {
		return "index";
	}
	
	@RequestMapping("/new")
	public String addPerson( @RequestParam("personId") int personId, @RequestParam("personName") String personName) {
		System.out.println("123");
		service.add(new Person(personId,personName));
		
		return "success";
	}
}
