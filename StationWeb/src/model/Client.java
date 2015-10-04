package model;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import java.time.LocalDate;
public class Client implements Serializable {
	private String id;
	private String FName;
	private String LName;
	private long phone;
	private String email;
	private LocalDate ddate;
	public LocalDate getDdate() {
		return ddate;
	}
	public void setDdate(LocalDate ddate) {
		this.ddate = ddate;
	}
	private List vin;
	private String address;
	public List getVin() {
		return vin;
	}
	public void setVin(List vin) {
		this.vin = vin;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	public Client(){}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getFName() {
		return FName;
	}
	public void setFName(String fName) {
		FName = fName;
	}
	public String getLName() {
		return LName;
	}
	public void setLName(String lName) {
		LName = lName;
	}
	public long getPhone() {
		return phone;
	}
	public void setPhone(long phone) {
		this.phone = phone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	

}
