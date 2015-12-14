package com.person.services;

import com.person.domain.Address;
import com.person.domain.Person;

import java.util.List;

public interface PersonService {
	
	public Person savePerson(Person person);
	
    void create(Person person);

    List<Person> findAll();

    void addAddress(Long personId, Address address);

    Person findPerson(Long personId);
}
