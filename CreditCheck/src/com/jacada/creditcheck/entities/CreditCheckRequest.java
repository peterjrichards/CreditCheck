package com.jacada.creditcheck.entities;

import java.math.BigDecimal;
import java.util.Currency;

import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import com.jacada.creditcheck.typeAdapters.CurrencyAdapter;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CreditCheckRequest")
public class CreditCheckRequest {
	@XmlElement(name = "postcode", required = true, nillable = false)
    protected String postcode;
	
    @XmlElement(name = "houseNameOrNumber", required = true, nillable = false)
    protected String houseNameOrNumber;
    
    @XmlElement(name = "surname", required = true, nillable = false)
    protected String surname;
    
    @XmlElement(name = "forename", required = true, nillable = false)
    protected String forename;
    
    @XmlElement(name = "loanCurrency", required = true, nillable = false)
    @XmlJavaTypeAdapter(CurrencyAdapter.class)
    protected Currency loanCurrency;
    
    @XmlElement(name = "loanAmount", required = true, nillable = false)
    protected BigDecimal loanAmount;

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

	public Currency getLoanCurrency() {
		return loanCurrency;
	}

	public void setLoanCurrency(Currency loanCurrency) {
		this.loanCurrency = loanCurrency;
	}

	public BigDecimal getLoanAmount() {
		return loanAmount;
	}

	public void setLoanAmount(BigDecimal loanAmount) {
		this.loanAmount = loanAmount;
	}
}
