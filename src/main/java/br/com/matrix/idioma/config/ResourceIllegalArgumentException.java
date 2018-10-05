package br.com.matrix.idioma.config;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.NOT_ACCEPTABLE)
public class ResourceIllegalArgumentException extends IllegalArgumentException {
	
	private static final long serialVersionUID = 1L;
	
	public ResourceIllegalArgumentException(String message) {
		super(message);
	}
	
}
