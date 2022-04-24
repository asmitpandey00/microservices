package com.lazycodr.microservice.productservice.entity;

public class Response {
	private String message;
	private Object body;

	public Response() {

	}

	public Response(String message, Object body) {

		this.message = message;
		this.body = body;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public Object getBody() {
		return body;
	}

	public void setBody(Object body) {
		this.body = body;
	}

	@Override
	public String toString() {
		return "Response [message=" + message + ", body=" + body + "]";
	}

}
