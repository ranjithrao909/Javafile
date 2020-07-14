package com.project.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.project.model.Person;
import com.project.service.PersonService;

@RestController
public class PersonController {
	
	@Autowired
	private PersonService personservice;
	
	@RequestMapping("/create")
	public String create(@RequestParam String firstname,@RequestParam String lastname,@RequestParam int age) {
	
		Person p=personservice.create(firstname,lastname,age);
		return "Created Successfully "+p.toString();
	}
	@RequestMapping("/get")
	public Person getPerson(@RequestParam String firstname) {
		return personservice.getByfirstname(firstname);
	}
	@RequestMapping("/getAll")
	public List<Person> getAll(){
		return personservice.getAll();
	}
	@RequestMapping("/update")
	public String update(@RequestParam String firstname,@RequestParam String lastname,@RequestParam int age) {
	
		Person p=personservice.update(firstname, lastname, age);
		return p.toString();
	}
	//Delete Operation
	@RequestMapping("/delete")
	public String delete(@RequestParam String firstname) {
		
		personservice.delete(firstname);
		return "Deleted" +firstname;
	}
	@RequestMapping("/deleteAll")
	public String deleteAll() {
		personservice.deleteAll();
		return "Deleted All records";
	}

}
