package com.eaiesb.students;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

@Data
@Document(collection="STUDENT")
public class Vitstudents {
	
	@Id
	public String id;
	
	public String stuid;
	private String stuname;
	private String Fathername;
	private String stucity;
	private String Pno;
	private String emailid;
	public String depid;
	public String campid;
	
//	public String getCampid() {
//		return campid;
//	}
//	public void setCampid(String campid) {
//		this.campid = campid;
//	}
//	public String getId() {
//		return id;
//	}
//	public void setId(String id) {
//		this.id = id;
//	}
//	public String getStuid() {
//		return stuid;
//	}
//	public void setStuid(String stuid) {
//		this.stuid = stuid;
//	}
//	public String getStuname() {
//		return stuname;
//	}
//	public void setStuname(String stuname) {
//		this.stuname = stuname;
//	}
//	public String getFathername() {
//		return Fathername;
//	}
//	public void setFathername(String fathername) {
//		Fathername = fathername;
//	}
//	public String getStucity() {
//		return stucity;
//	}
//	public void setStucity(String stucity) {
//		this.stucity = stucity;
//	}
//	public String getPno() {
//		return Pno;
//	}
//	public void setPno(String pno) {
//		Pno = pno;
//	}
//	public String getEmailid() {
//		return emailid;
//	}
//	public void setEmailid(String emailid) {
//		this.emailid = emailid;
//	}
//	public String getDepid() {
//		return depid;
//	}
//	public void setDepid(String depid) {
//		this.depid = depid;
//	}
//	
	
}
