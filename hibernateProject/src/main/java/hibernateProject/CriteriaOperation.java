package hibernateProject;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Restrictions;

import com.tka.model.Player;



public class CriteriaOperation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Configuration config = new Configuration();
        config.configure("hibernate.cfg.xml"); // Loads config from classpath
        config.addAnnotatedClass(com.tka.model.Player.class);
        SessionFactory factory = config.buildSessionFactory();
        
        Session session = factory.openSession();
        Transaction tx = session .beginTransaction();
        
        Criteria criteria = session.createCriteria(Player.class); // select * from player; 
//      criteria.add(Restrictions.gt("runs", 7000)); // select * from player where runs > 7000;
        criteria.add(Restrictions.like("playerName", "%r%")); // select * from player where playerName = %r%;
        List<Player> allplayers = criteria.list();
        
    	for(Player p: allplayers) {
    		System.out.println(p);
    	}
//}
//        tx.commit();
//        session.close();

	}
}

