package hibernateProject;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
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
        
        Player p1 = session.load(Player.class, 18);
        
        System.out.println(p1);

	}

}
