
import java.io.Serializable;
import java.util.Date;
public class Client implements Serializable {
	private String id;
	private String FName;
	private String LName;
	private long phone;
	private String email;
	private Date ddate;
	public Date getDdate() {
		return ddate;
	}
	public void setDdate(Date ddate) {
		this.ddate =ddate;
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
