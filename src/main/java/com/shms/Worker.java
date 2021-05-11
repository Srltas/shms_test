package com.shms;

public class Worker {
	private String empNumber;
	private String name;
	private String cardNumber;
	private String phoneNumber;
	private char isDelete;
	
	public Worker() {}

	public Worker(String empNumber, String name, String cardNumber, String phoneNumber, char isDelete) {
		super();
		this.empNumber = empNumber;
		this.name = name;
		this.cardNumber = cardNumber;
		this.phoneNumber = phoneNumber;
		this.isDelete = isDelete;
	}

	public String getEmpNumber() {
		return empNumber;
	}

	public void setEmpNumber(String empNumber) {
		this.empNumber = empNumber;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCardNumber() {
		return cardNumber;
	}

	public void setCardNumber(String cardNumber) {
		this.cardNumber = cardNumber;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public char getIsDelete() {
		return isDelete;
	}

	public void setIsDelete(char isDelete) {
		this.isDelete = isDelete;
	}
}
