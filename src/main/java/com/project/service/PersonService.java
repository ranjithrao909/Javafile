package com.project.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.model.Person;
import com.project.repository.PersonRepository;

@Service
public class PersonService {
	@Autowired
	private PersonRepository personRepository; 
	
	//Create operation
	public Person create(String firstname,String lastname,int age) {
		return personRepository.save(new Person(firstname,lastname,age)); 
	}
	//Retrieve Operation
	public List<Person> getAll()
	{
		return personRepository.findAll();
	}
	public Person getByfirstname(String firstname) {
		return personRepository.findByfirstname(firstname);
	}
	//update Operation
	public Person update(String firstname,String lastname,int age) {
		Person p=personRepository.findByfirstname(firstname);
		p.setLastname(lastname);
		p.setAge(age);
		return personRepository.save(p);
	}
	//Delete Operation
	public void deleteAll() {
		personRepository.deleteAll();
	}
	public void delete(String firstname) {
		Person p=personRepository.findByfirstname(firstname);
		personRepository.delete(p);
		
	}

}
