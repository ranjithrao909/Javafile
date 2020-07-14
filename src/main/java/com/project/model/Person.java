package com.project.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Person
{
@Id
String id;
String firstname;
String lastname;
int age;

public Person(String firstname,String lastname,int age)
{
	this.firstname=firstname;
	this.lastname=lastname;
	this.age=age;
}

public String getFirstname() {
	return firstname;
}

public void setFirstname(String firstname) {
	this.firstname = firstname;
}

public String getLastname() {
	return lastname;
}

public void setLastname(String lastname) {
	this.lastname = lastname;
}

public int getAge() {
	return age;
}

public void setAge(int age) {
	this.age = age;
}
public String toString() 
{
return "Person First Name: "+ firstname + "LastName: "+lastname+"age: "+age;	
}
}
