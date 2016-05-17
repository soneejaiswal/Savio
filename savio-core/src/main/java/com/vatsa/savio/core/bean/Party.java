package com.vatsa.savio.core.bean;

import java.io.Serializable;

/**
 * 
 * @author webwerk
 * 
 * This class Gives Use Information
 *
 */
public class Party implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -193597591528824837L;
	private String partyId ;
	private String partyName ;
	private String partyAddressLine1 ;
	private String partyAddressLine2 ;
	private String partyAddressLine3 ;
	private String partyTown ;
	private String partyPostCode ;
	private String partyCountry ;
	private String partyMobile ;
	private String partyEmail ;

	public String getPartyId() {
		return partyId;
	}
	public void setPartyId(String partyId) {
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
}
