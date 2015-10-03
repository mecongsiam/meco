
import org.hibernate.cfg.Configuration;
import java.util.Date;
import org.hibernate.SessionFactory;
import org.hibernate.Session;
import org.hibernate.Transaction;
public class InsClientCard {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Configuration cfg=new Configuration();
		cfg.configure("Hibernate.cfg.xml");
		SessionFactory sf=cfg.buildSessionFactory();
		Session s=sf.openSession();
		Transaction tx=s.beginTransaction();
		ClientCard cc=new ClientCard();
		Date d=new Date();
		cc.setId("1");
		cc.setId_card("8a");
		cc.setMake(d);
		cc.setModel("Volvo");
		cc.setVIN("gh4");
		cc.setYear(1988);
		s.save(cc);
		s.flush();
		tx.commit();
		s.close();

	}

}
