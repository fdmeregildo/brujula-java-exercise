package es.brujula.util;

import es.brujula.exception.BrujulaException;

public class Util {

	public static String validateString(String text) throws BrujulaException {
		
		if(!(text.length() <= 20 && text.trim().length() > 0)) {
			throw new BrujulaException("El texto no puede ser mayor a 20 caracteres o vacío");
		}
		
		return text;
	}
}
