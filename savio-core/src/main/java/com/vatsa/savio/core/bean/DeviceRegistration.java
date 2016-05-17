package com.vatsa.savio.core.bean;

import java.io.Serializable;

/**
 * 
 * @author webwerk
 *
 *This class gives complete information related to device
 */
public class DeviceRegistration implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 7466031115272826215L;

	private String partyId ;	
	private String partyAuthPIN ;
	private String cookie ;
	private String deviceId ;
	private String status ;
	private String PNSDeviceId ;

	public String getPartyId() {
		return partyId;
	}
	public void setPartyId(String partyId) {
		this.partyId = partyId;
	}
	public String getPartyAuthPIN() {
		return partyAuthPIN;
	}
	public void setPartyAuthPIN(String partyAuthPIN) {
		this.partyAuthPIN = partyAuthPIN;
	}
	public String getCookie() {
		return cookie;
	}
	public void setCookie(String cookie) {
		this.cookie = cookie;
	}
	public String getDeviceId() {
		return deviceId;
	}
	public void setDeviceId(String deviceId) {
		this.deviceId = deviceId;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getPNSDeviceId() {
		return PNSDeviceId;
	}
	public void setPNSDeviceId(String pNSDeviceId) {
		PNSDeviceId = pNSDeviceId;
	}
}
