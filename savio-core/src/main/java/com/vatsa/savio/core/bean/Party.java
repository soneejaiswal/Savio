package com.vatsa.savio.core.bean;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * 
 * @author webwerk
 * 
 * This class Gives Use Information
 *
 */

@Entity(name = "PARTY")
public class Party implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -193597591528824837L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "PTY_ID")	
	private long partyId ;

	@JsonProperty ("first_name")
	@Column(name = "PTY_NAME")
	private String partyName ;

	@JsonProperty ("address_1")
	@Column(name = "PTY_ADDRESS_LINE_1")
	private String partyAddressLine1 ;

	@JsonProperty ("address_2")
	@Column(name = "PTY_ADDRESS_LINE_2")
	private String partyAddressLine2 ;

	@JsonProperty ("address_3")
	@Column(name = "PTY_ADDRESS_LINE_3")
	private String partyAddressLine3 ;

	@JsonProperty ("town")
	@Column(name = "PTY_TOWN")
	private String partyTown ;

	@JsonProperty ("post_code")
	@Column(name = "PTY_POST_CODE")
	private String partyPostCode ;

	@JsonProperty ("country")
	@Column(name = "PTY_COUNTRY")
	private String partyCountry ;

	@JsonProperty ("phone_number")
	@Column(name = "PTY_MOBILE")
	private String partyMobile ;

	@JsonProperty ("email")
	@Column(name = "PTY_EMAIL")
	private String partyEmail ;	

	@JsonProperty ("second_name")
	@Column(name = "PTY_SECOND_NAME")
	private String secondName ;

	@JsonProperty ("date_of_birth")
	@Column(name = "PTY_DOB")
	private String dateOfBirth ;

	@JsonProperty ("title")
	@Column(name = "PTY_TITLE")
	private String title ;


	public long getPartyId() {
		return partyId;
	}

	public void setPartyId(long partyId) {
		this.partyId = partyId;
	}

	public String getPartyName() {
		return partyName;
	}

	public void setPartyName(String partyName) {
		this.partyName = partyName;
	}

	public String getPartyAddressLine1() {
		return partyAddressLine1;
	}

	public void setPartyAddressLine1(String partyAddressLine1) {
		this.partyAddressLine1 = partyAddressLine1;
	}

	public String getPartyAddressLine2() {
		return partyAddressLine2;
	}

	public void setPartyAddressLine2(String partyAddressLine2) {
		this.partyAddressLine2 = partyAddressLine2;
	}

	public String getPartyAddressLine3() {
		return partyAddressLine3;
	}

	public void setPartyAddressLine3(String partyAddressLine3) {
		this.partyAddressLine3 = partyAddressLine3;
	}

	public String getPartyTown() {
		return partyTown;
	}

	public void setPartyTown(String partyTown) {
		this.partyTown = partyTown;
	}

	public String getPartyPostCode() {
		return partyPostCode;
	}

	public void setPartyPostCode(String partyPostCode) {
		this.partyPostCode = partyPostCode;
	}

	public String getPartyCountry() {
		return partyCountry;
	}

	public void setPartyCountry(String partyCountry) {
		this.partyCountry = partyCountry;
	}

	public String getPartyMobile() {
		return partyMobile;
	}

	public void setPartyMobile(String partyMobile) {
		this.partyMobile = partyMobile;
	}

	public String getPartyEmail() {
		return partyEmail;
	}

	public void setPartyEmail(String partyEmail) {
		this.partyEmail = partyEmail;
	}

	public String getSecondName() {
		return secondName;
	}

	public void setSecondName(String secondName) {
		this.secondName = secondName;
	}

	public String getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(String dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}
}
