package com.asd.designpattern.command;

public class SaveCommand implements Command {
	
	private Database db=new Database();
	private Person person;
	
	public SaveCommand(Person person) {
		this.person=person;
	}
	
	@Override
	public boolean execute() {
		return db.savePersonAction(person);
	}

	@Override
	public boolean undo() {
		return db.removePersonAction(person);
	}

	public Database getDb() {
		return db;
	}

	public Person getPerson() {
		return person;
	}

}
