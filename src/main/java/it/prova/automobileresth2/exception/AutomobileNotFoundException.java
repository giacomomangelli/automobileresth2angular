package it.prova.automobileresth2.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class AutomobileNotFoundException extends RuntimeException {

	private static final long serialVersionUID = 1L;
	
	public AutomobileNotFoundException(String message) {
		super(message);
	}

}
