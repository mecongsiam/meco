

import org.hibernate.cfg.Configuration;
import java.util.Date;
import org.hibernate.SessionFactory;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class InsClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Configuration cfg=new Configuration();
cfg.configure("Hibernate.cfg.xml");
SessionFactory sf=cfg.buildSessionFactory();
Session s=sf.openSession();
Transaction tx=s.beginTransaction();
Client emp=new Client();
Date d=new Date();
emp.setId("15");
emp.setFName("bulka");
emp.setLName("ae");
emp.setPhone(33443);
emp.setEmail("gav.com");
emp.setDdate( d);
s.save(emp);
s.flush();
tx.commit();
s.close();


	}

}
