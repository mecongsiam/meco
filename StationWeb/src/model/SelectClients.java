package model;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class SelectClients {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Configuration cfg=new Configuration();
		cfg.configure("Hibernate.cfg.xml");
		SessionFactory sf=cfg.buildSessionFactory();
		Session s=sf.openSession();
		Transaction tx=s.beginTransaction();
		Client c=(Client)s.load(Client.class,new String("1"));
		System.out.println(c.getId());
		System.out.println(c.getFName());
	
		System.out.println(c.getPhone());
		System.out.println(c.getDdate());
		System.out.println(c.getEmail());
		s.close();
	}

}
