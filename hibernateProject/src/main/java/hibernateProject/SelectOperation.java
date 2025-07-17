package hibernateProject;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.tka.model.Player;



public class SelectOperation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Configuration config = new Configuration();
        config.configure("hibernate.cfg.xml"); // Loads config from classpath
        config.addAnnotatedClass(com.tka.model.Player.class);
        SessionFactory factory = config.buildSessionFactory();
        
        Session session = factory.openSession();
        Transaction tx = session .beginTransaction();
       // Player p1 = session.load(Player.class, 188); // gives execption if the pk is not present
        Player p1 = session.get(Player.class, 2); // returns null if pk is not present
        
        if(p1 == null) {
        	System.out.println("No result founf in db.");
        }else {
        	System.out.println(p1);
        }
        tx.commit();
        session.close();

	}

}
