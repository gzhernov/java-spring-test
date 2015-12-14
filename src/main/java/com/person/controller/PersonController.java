package com.person.controller;

import com.person.domain.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import com.person.domain.Address;
import com.person.services.PersonService;

import java.util.List;

@Controller
@RequestMapping
public class PersonController {

    @Autowired
	private PersonService service;

    @RequestMapping(value="/persons/{personId}/addresses", method=RequestMethod.POST)
    public ResponseEntity create(@PathVariable("personId") Long personId, @RequestBody Address address){
        service.addAddress(personId,  address);
        return new ResponseEntity(HttpStatus.OK);
    }


	@RequestMapping(value="/persons", method=RequestMethod.GET)
     public @ResponseBody List<Person> findALL(){
        return service.findAll();
    }

    @RequestMapping(value="/persons/{personId}", method=RequestMethod.GET)
    public @ResponseBody Person findALL(@PathVariable("personId") Long personId){
        return service.findPerson(personId);
    }

    @RequestMapping(value="/persons", method=RequestMethod.POST)
    public @ResponseBody Person create(@RequestBody Person person){
        service.create(person);
        return person;
    }

}
