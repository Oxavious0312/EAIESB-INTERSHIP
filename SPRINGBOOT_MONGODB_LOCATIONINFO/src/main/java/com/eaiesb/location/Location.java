package com.eaiesb.location;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="NNRG_Location")
public class Location {

	@Id
	public String id;
	
	private String locid;
	private String postal;
	private String city;
	private String countryid;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getLocid() {
		return locid;
	}
	public void setLocid(String locid) {
		this.locid = locid;
	}
	public String getPostal() {
		return postal;
	}
	public void setPostal(String postal) {
		this.postal = postal;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getCountryid() {
		return countryid;
	}
	public void setCountryid(String countryid) {
		this.countryid = countryid;
	}
	
	
}
