package com.rest.wesbservices.rest_web_services.helloworld;

public class MyNameBean {
	
	private String message;

	public MyNameBean(String message) {
		this.message= message;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	@Override
	public String toString() {
		return "MyNameBean [message=" + message + "]";
	}
}
