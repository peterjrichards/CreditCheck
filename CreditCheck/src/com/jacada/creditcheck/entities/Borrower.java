package com.jacada.creditcheck.entities;

public class Borrower {
	protected String postcode;
	
	protected String houseNameOrNumber;
	
	protected String surname;
	
	protected String forename;

	public String getPostcode() {
		return postcode;
	}

	public void setPostcode(String postcode) {
		this.postcode = postcode;
	}

	public String getHouseNameOrNumber() {
		return houseNameOrNumber;
	}

	public void setHouseNameOrNumber(String houseNameOrNumber) {
		this.houseNameOrNumber = houseNameOrNumber;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public String getForename() {
		return forename;
	}

	public void setForename(String forename) {
		this.forename = forename;
	}
}
