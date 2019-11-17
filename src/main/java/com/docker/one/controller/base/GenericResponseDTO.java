package com.docker.one.controller.base;

import org.springframework.http.HttpStatus;

import java.util.ArrayList;
import java.util.List;

public class GenericResponseDTO<T> {

	private String message;
	private HttpStatus status;
	private List<T> results;

	public GenericResponseDTO(HttpStatus status, String message, List<T> results) {
		this.status = status;
		this.message = message;

		if (results != null) {
			this.results = results;
		} else {
			this.results = new ArrayList<>();
		}
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public HttpStatus getStatus() {
		return status;
	}

	public void setStatus(HttpStatus status) {
		this.status = status;
	}

	public List<T> getResults() {
		return results;
	}

	public void setResults(ArrayList<T> results) {
		this.results = results;
	}
}
