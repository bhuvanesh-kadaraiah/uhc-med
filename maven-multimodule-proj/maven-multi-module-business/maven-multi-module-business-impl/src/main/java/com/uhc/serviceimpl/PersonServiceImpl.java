package com.uhc.serviceimpl;

import com.uhc.entity.Person;
import com.uhc.repository.PersonDAO;
import com.uhc.repository.PersonDaoImpl;
import com.uhc.service.PersonService;

public class PersonServiceImpl implements PersonService{

	public void createPerson(Person p) {
		Person P = new Person();
		PersonDAO personDao = new PersonDaoImpl();
		personDao.savePerson(p);
		
	}

	public Person getperson() {
		PersonDAO personDao = new PersonDaoImpl();
		Person p = personDao.getPerson();
		return p;
	}

}
