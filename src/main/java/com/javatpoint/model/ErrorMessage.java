package com.javatpoint.model;

public class ErrorMessage {

	String error;
	String status;

	public ErrorMessage(String error, String status) {
		this.status = status;
		this.error = error;
	}

}