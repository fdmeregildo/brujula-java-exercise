package es.brujula.entities;

import java.time.LocalDate;

import es.brujula.exception.BrujulaException;

public class AssociatedProfessor extends Professor{

	private LocalDate startDate;

	public AssociatedProfessor(String name, String surname, Integer yearOfBith, String departament, LocalDate startDate) throws BrujulaException {
		super(name, surname, yearOfBith, departament);
		this.startDate = startDate;
	}
	
	public LocalDate getStartDate() {
		return startDate;
	}

	public void setStartDate(LocalDate startDate) {
		this.startDate = startDate;
	}
	
	
	
}
