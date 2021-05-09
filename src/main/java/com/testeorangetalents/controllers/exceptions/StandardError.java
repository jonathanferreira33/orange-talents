package com.testeorangetalents.controllers.exceptions;

public class StandardError {
	
	private Integer status;
	private Long timesstamp;
	private String message;
	
	public StandardError() {
		super();
	}

	public StandardError(Integer status, Long timesstamp, String message) {
		super();
		this.status = status;
		this.timesstamp = timesstamp;
		this.message = message;
	}

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public Long getTimesstamp() {
		return timesstamp;
	}

	public void setTimesstamp(Long timesstamp) {
		this.timesstamp = timesstamp;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
	
	
}
