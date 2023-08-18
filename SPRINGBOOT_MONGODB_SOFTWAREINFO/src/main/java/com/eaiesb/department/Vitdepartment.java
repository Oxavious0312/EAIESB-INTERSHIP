package com.eaiesb.department;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="DEPARTMENT")
public class Vitdepartment {
	
	@Id
	public String id;
	
	public String depid;
	private String depname;
	private String seats;
	private String HOD;
	
	
	public String campid;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getDepid() {
		return depid;
	}
	public void setDepid(String depid) {
		this.depid = depid;
	}
	public String getDepname() {
		return depname;
	}
	public void setDepname(String depname) {
		this.depname = depname;
	}
	public String getSeats() {
		return seats;
	}
	public void setSeats(String seats) {
		this.seats = seats;
	}
	public String getHOD() {
		return HOD;
	}
	public void setHOD(String hOD) {
		HOD = hOD;
	}
	public String getCampid() {
		return campid;
	}
	public void setCampid(String campid) {
		this.campid = campid;
	}
	
	
	
}
