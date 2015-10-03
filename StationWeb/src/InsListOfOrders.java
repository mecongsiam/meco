
import org.hibernate.cfg.Configuration;
import java.util.Date;
import org.hibernate.SessionFactory;
import org.hibernate.Session;
import org.hibernate.Transaction;
public class InsListOfOrders {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Configuration cfg=new Configuration();
		cfg.configure("Hibernate.cfg.xml");
		SessionFactory sf=cfg.buildSessionFactory();
		Session s=sf.openSession();
		Transaction tx=s.beginTransaction();
		ListOfOrders lof=new ListOfOrders();
		Date d=new Date();
		lof.setId_card("1a");
		lof.setId_order("b1");
		lof.setDateo(d);
		lof.setOrder_Amount(300);
		lof.setOrder_Status("Complete");
		s.save(lof);
		s.flush();
		tx.commit();
		s.close();


	}

}
