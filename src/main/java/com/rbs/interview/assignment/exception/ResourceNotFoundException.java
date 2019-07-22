package com.rbs.interview.assignment.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

/**
 * Resource not found exception handling
 * @author Azad Singh
 *
 */
@ResponseStatus(value = HttpStatus.NOT_FOUND)
public class ResourceNotFoundException extends Exception{

	private static final long serialVersionUID = 1L;

	public ResourceNotFoundException(String message){
    	super(message);
    }
}
