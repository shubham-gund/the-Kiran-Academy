package hibernateProject;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.tka.model.Player;



public class UpdateOperation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Configuration config = new Configuration();
        config.configure("hibernate.cfg.xml"); // Loads config from classpath
        config.addAnnotatedClass(com.tka.model.Player.class);
        SessionFactory factory = config.buildSessionFactory();
        
        Session session = factory.openSession();
        Transaction tx = session .beginTransaction();
       
        Player p1 = new Player(02,"Shubham Gund", "IND", 4800, 8);
        
        //session.update(p1); // throws error if pk not found
        session.saveOrUpdate(p1); // if not found insert it or else update it
        System.out.println("Updated succesfully!!");
        tx.commit();
        session.close();

	}

}
