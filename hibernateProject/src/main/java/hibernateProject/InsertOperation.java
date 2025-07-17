package hibernateProject;

import java.io.Serializable;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.tka.model.Player;



public class InsertOperation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Configuration config = new Configuration();
        config.configure("hibernate.cfg.xml"); // Loads config from classpath
        config.addAnnotatedClass(com.tka.model.Player.class);
        SessionFactory factory = config.buildSessionFactory();
        
        Session session = factory.openSession();
        Transaction tx = session .beginTransaction();
        
        Player p1 = new Player(02,"Shubham", "IND", 4800, 8);
        Serializable save =  session.save(p1);
        
        System.out.println("PLayer with jn: " + save);
        tx.commit();
        session.close();

	}

}
