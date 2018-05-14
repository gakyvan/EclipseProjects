package com.asd.designpattern.command;

import java.util.ArrayList;
import java.util.List;

public class Database {
	
	private List<Person> persons=new ArrayList<>();
	
	public boolean savePersonAction(Person person) {
		return persons.add(person);
	}
	
	public boolean removePersonAction(Person person) {
		return persons.remove(person);
	}
}
