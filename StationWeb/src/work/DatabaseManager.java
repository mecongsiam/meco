package work;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
public class DatabaseManager {
    private static DatabaseManager instance = null;
    private final SessionFactory sessionFactory;
    private DatabaseManager() {
     Configuration cfg=new Configuration();
   cfg.configure("Hibernate.cfg.xml");
   sessionFactory=cfg.buildSessionFactory();
    }
    public static DatabaseManager getInstance() {
       if(instance == null) {
          instance = new DatabaseManager();
       }
       return instance;
    }

    public void insertClient(model.Client client)
    {
     Session s=sessionFactory.openSession();
   Transaction tx=s.beginTransaction();
     s.save(client);
   s.flush();
   tx.commit();
   s.close();
    }

}