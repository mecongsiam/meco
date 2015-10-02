import org.hibernate.cfg.Configuration;
import org.hibernate.SessionFactory;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class InsertEmp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Configuration cfg=new Configuration();
cfg.configure("Hibernate.cfg.xml");
SessionFactory sf=cfg.buildSessionFactory();
Session s=sf.openSession();
Transaction tx=s.beginTransaction();
Client emp=new Client();
emp.setId("6");
emp.setFName("georg");
emp.setLName("ae");
emp.setPhone(33443);
emp.setEmail("gav.com");
s.save(emp);
s.flush();
tx.commit();
s.close();


	}

}
