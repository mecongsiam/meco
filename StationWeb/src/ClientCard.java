
import java.io.Serializable;
import java.util.Date;
public class ClientCard implements Serializable  {
	private String id;
	private Date Make;
	private String Model;
	private int Year;
	public int getYear() {
		return Year;
	}

	public void setYear(int year) {
		Year = year;
	}

	private String VIN;
	private String id_card;
	
	public String getId_card() {
		return id_card;
	}

	public void setId_card(String id_card) {
		this.id_card = id_card;
	}

	public ClientCard(){}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Date getMake() {
		return Make;
	}

	public void setMake(Date make) {
		Make = make;
	}

	public String getModel() {
		return Model;
	}

	public void setModel(String model) {
		Model = model;
	}

	

	public String getVIN() {
		return VIN;
	}

	public void setVIN(String vIN) {
		VIN = vIN;
	}

	
	
	

}
