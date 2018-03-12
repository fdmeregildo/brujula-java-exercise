package es.brujula.entities;

import java.time.LocalDate;

import es.brujula.exception.BrujulaException;

public class ActingProfessor extends Professor{

	private LocalDate endDate;

	public ActingProfessor(String name, String surname, Integer yearOfBith, String departament, LocalDate endDate) throws BrujulaException {
		super(name, surname, yearOfBith, departament);
		setEndDate(endDate);
	}
	
	public LocalDate getEndDate() {
		return endDate;
	}

	public void setEndDate(LocalDate endDate) throws BrujulaException {
		
		if(endDate.compareTo(LocalDate.now()) < 0) {
			throw new BrujulaException("La fecha fin no puede ser menos a la fecha actual");
		}else {
			this.endDate = endDate;
		}
	}

	
	
}
