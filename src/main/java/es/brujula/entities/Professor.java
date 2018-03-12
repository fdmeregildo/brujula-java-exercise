package es.brujula.entities;

import es.brujula.exception.BrujulaException;
import es.brujula.util.Util;

public class Professor extends Person {

	private String departament;

	public Professor(String name, String surname, Integer yearOfBith, String departament) throws BrujulaException {
		super(name, surname, yearOfBith);
		this.departament = Util.validateString(departament);
	}

	public String getDepartament() {
		return departament;
	}

	public void setDepartament(String departament) throws BrujulaException {
		this.departament = Util.validateString(departament);
	}

}
