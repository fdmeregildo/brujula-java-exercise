package es.brujula.entities;

import java.util.Calendar;

import es.brujula.exception.BrujulaException;
import es.brujula.util.Util;

public class Person {

	private String name;
	private String surName;
	private Integer yearOfBith;
	
	public Person(String name, String surName, Integer yearOfBith) throws BrujulaException {
		this.name = Util.validateString(name);
		this.surName = Util.validateString(surName);
		this.yearOfBith = yearOfBith;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) throws BrujulaException {
		this.name = Util.validateString(name);
	}
	public String getSurName() {
		return surName;
	}
	public void setSurName(String surName) throws BrujulaException {
		this.surName = Util.validateString(surName);
	}
	public Integer getYearOfBith() {
		return yearOfBith;
	}
	public void setYearOfBith(Integer yearOfBith) {
		this.yearOfBith = yearOfBith;
	}
	
	public String getCompleteName() {
		return surName.concat(", ").concat(name);
	}

	public int getAge() {	
		return Calendar.getInstance().get(Calendar.YEAR) - this.yearOfBith;
	}
	
	
}
