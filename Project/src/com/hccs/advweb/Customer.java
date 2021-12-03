package com.hccs.advweb;

public class Customer {
	private int id = 0;
	private String cusName = "";
	private String cusEmail = "";
	private String cusSubject = "";
	private String cusMessage = "";

	public Customer(String cusName, String cusEmail, String cusSubject, String cusMessage) {
		this.cusName = cusName;
		this.cusEmail = cusEmail;
		this.cusSubject = cusSubject;
		this.cusMessage = cusMessage;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCusName() {
		return cusName;
	}

	public void setCusName(String cusName) {
		this.cusName = cusName;
	}

	public String getCusEmail() {
		return cusEmail;
	}

	public void setCusEmail(String cusEmail) {
		this.cusEmail = cusEmail;
	}

	public String getCusSubject() {
		return cusSubject;
	}

	public void setCusSubject(String cusSubject) {
		this.cusSubject = cusSubject;
	}

	public String getCusMessage() {
		return cusMessage;
	}

	public void setCusMessage(String cusMessage) {
		this.cusMessage = cusMessage;
	}

	public Customer() {
	}

}
