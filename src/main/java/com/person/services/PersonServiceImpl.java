package com.person.services;

import com.person.domain.Address;
import com.person.domain.Person;
import com.person.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonServiceImpl implements PersonService {

    @Autowired
	private PersonRepository repository;
	
	@Autowired
	public PersonServiceImpl(PersonRepository repository) {
		this.repository = repository;
	}

	@Override
	public Person savePerson(Person person) {
		try{
			person = repository.save(person);
			System.out.println("Person saved at id: " + person.getId());
		}
		catch(Exception ex){
			System.out.println("Exception in savePerson of PersonServiceImpl.java" + ex);
			ex.printStackTrace();
		}
		return null;
	}

    @Override
    public void create(Person person) {
        repository.save(person);
    }

    @Override
    public List<Person> findAll() {
        return  repository.findAll();
    }

    @Override
    public void addAddress(Long personId, Address address) {
        Person person = repository.findOne(personId);
        person.getAdresses().add(address);
        repository.save(person);
    }

    @Override
    public Person findPerson(Long personId) {
        Person person = repository.findOne(personId);
        return person;
    }

}
