package br.com.erudio.exceptions;

import java.io.Serializable;
import java.util.Date;

public class ExceptionResponse implements Serializable {

	private static final long serialVersionUID = 1L;

	private Date timestamp;
	private String message;
	private String details;
	private Integer status;

	public ExceptionResponse(Date timestamp, String message, String details, Integer status) {
		this.timestamp = timestamp;
		this.message = message;
		this.details = details;
		this.status = status;
	}

	public Date getTimestamp() {
		return timestamp;
	}

	public String getMessage() {
		return message;
	}

	public String getDetails() {
		return details;
	}

	public Integer getStatus() {
		return status;
	}
}