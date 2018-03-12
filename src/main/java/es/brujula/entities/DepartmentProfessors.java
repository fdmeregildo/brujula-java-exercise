package es.brujula.entities;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import es.brujula.exception.BrujulaException;
import es.brujula.util.Util;

public class DepartmentProfessors {

	private String departamentName;
	private List<Professor> listProfessor;
	
	public DepartmentProfessors(String departamentName) throws BrujulaException {
		this.departamentName = Util.validateString(departamentName);
	}

	public void addProfessor(Professor newProfessor) throws BrujulaException {
		
		if(listProfessor == null) {
			listProfessor = new ArrayList<>();
		}
		
		if(!departamentName.equals(newProfessor.getDepartament())){
			throw new BrujulaException("Professor no pertenece al mismo departamento");
		}
		
		if(!professorExist(newProfessor)) {
			listProfessor.add(newProfessor);
		}
		
	}

	private boolean professorExist(Professor newProfessor) {
		
		if(listProfessor!=null && !listProfessor.isEmpty()) {
			for (Professor professor : listProfessor) {
				if(professor.getCompleteName().equals(newProfessor.getCompleteName())) {
					return true;
				}
			}
		}
		
		return false;
	}
	
	public List<Professor> list() {
		
		Collections.sort(listProfessor, new Comparator<Professor>() {
		   public int compare(Professor professor1, Professor professor2) {
		      return professor1.getCompleteName().compareTo(professor2.getCompleteName());
		   }
		});
		
		return listProfessor;
	}
	
	
	

	public String getDepartamentName() {
		return departamentName;
	}

	public void setDepartamentName(String departamentName) throws BrujulaException {
		this.departamentName = Util.validateString(departamentName);
	}

}
