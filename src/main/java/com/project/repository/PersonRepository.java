package com.project.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.project.model.Person;

@Repository
public interface PersonRepository extends MongoRepository<Person, String>{

	public Person findByfirstname(String firstname);
	public List<Person> findByage(int age);
}
