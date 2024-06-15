package com.javatpoint.exception;

public class CustomerNotFoundException extends RuntimeException {

	private int id;
	private String msg;

	/**
	 * @param id
	 */
	public CustomerNotFoundException(String msg,int id) {
		super();
		this.msg = msg + id;
		this.id = id;
	}
	
}
