package com.nagarro.advanceJava5API.model;


public class Response {
	private Boolean status;
	private String message;
	private Object data;
	public Boolean getStatus() {
		return status;
	}
	public void setStatus(Boolean status) {
		this.status = status;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public Object getData() {
		return data;
	}
	public void setData(Object data) {
		this.data = data;
	}
	public Response() {
		message = "Success";
		status = true;
	}
}
