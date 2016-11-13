package com.uhc.repository;

import com.uhc.entity.Person;

public interface PersonDAO {
	public void savePerson(Person p);
	public Person getPerson();
}
