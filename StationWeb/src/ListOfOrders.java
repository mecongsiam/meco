
import java.io.Serializable;
import java.util.Date;
public class ListOfOrders implements Serializable {
	private String id_order;
	private String id_card;
	private Date dateo;
	private int Order_Amount;
	public int getOrder_Amount() {
		return Order_Amount;
	}

	public void setOrder_Amount(int order_Amount) {
		Order_Amount = order_Amount;
	}

	private String Order_Status;
	
	public ListOfOrders(){}

	public String getId_order() {
		return id_order;
	}

	public void setId_order(String id_order) {
		this.id_order = id_order;
	}

	public String getId_card() {
		return id_card;
	}

	public void setId_card(String id_card) {
		this.id_card = id_card;
	}

	public Date getDateo() {
		return dateo;
	}

	public void setDateo(Date dateo) {
		this.dateo = dateo;
	}

	

	public String getOrder_Status() {
		return Order_Status;
	}

	public void setOrder_Status(String order_Status) {
		Order_Status = order_Status;
	}
	
	

}
