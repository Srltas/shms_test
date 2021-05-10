package com.shms;

import java.sql.Timestamp;

public class WearLog {
	private String code;
	private String safeHatCode;
	private String gatewayCode;
	private String empNumber;
	private Timestamp time;
	private char isWear;
	private double latitude;
	private double longitude;
	
	public WearLog() {}

	public WearLog(String code, String safeHatCode, String gatewayCode, String empNumber, Timestamp time,
			char isWear, double latitude, double longitude) {
		super();
		this.code = code;
		this.safeHatCode = safeHatCode;
		this.gatewayCode = gatewayCode;
		this.empNumber = empNumber;
		this.time = time;
		this.isWear = isWear;
		this.latitude = latitude;
		this.longitude = longitude;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getSafeHatCode() {
		return safeHatCode;
	}

	public void setSafeHatCode(String safeHatCode) {
		this.safeHatCode = safeHatCode;
	}

	public String getGatewayCode() {
		return gatewayCode;
	}

	public void setGatewayCode(String gatewayCode) {
		this.gatewayCode = gatewayCode;
	}

	public String getEmpNumber() {
		return empNumber;
	}

	public void setEmpNumber(String empNumber) {
		this.empNumber = empNumber;
	}

	public Timestamp getTime() {
		return time;
	}

	public void setTime(Timestamp time) {
		this.time = time;
	}

	public char getIsWear() {
		return isWear;
	}

	public void setIsWear(char isWear) {
		this.isWear = isWear;
	}

	public double getLatitude() {
		return latitude;
	}

	public void setLatitude(double latitude) {
		this.latitude = latitude;
	}

	public double getLongitude() {
		return longitude;
	}

	public void setLongitude(double longitude) {
		this.longitude = longitude;
	}
}
