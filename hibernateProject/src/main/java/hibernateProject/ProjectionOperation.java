package hibernateProject;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Projection;
import org.hibernate.criterion.ProjectionList;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;

import com.tka.model.Player;



public class ProjectionOperation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Configuration config = new Configuration();
        config.configure("hibernate.cfg.xml"); // Loads config from classpath
        config.addAnnotatedClass(com.tka.model.Player.class);
        SessionFactory factory = config.buildSessionFactory();
        
        Session session = factory.openSession();
        Transaction tx = session .beginTransaction();
        
        Criteria criteria = session.createCriteria(Player.class); // select * from player; 

//        Projection property1 = Projections.property("playerName");  //for single column
//        criteria.setProjection(property1);// select name from player;
        criteria.add(Restrictions.like("playerName", "%r%" ));
        ProjectionList projList = Projections.projectionList(); // for multiple columns
		projList.add(Projections.property("playerName"));
		projList.add(Projections.property("runs"));
		projList.add(Projections.property("teamName"));
		criteria.setProjection(projList);
		
        List<Object[]> allData = criteria.list();	  
        
        for(Object[] data: allData) {
        	System.out.print( "Name is : " + (String)data[0]);
        	System.out.print(", Runs are : "+ (Integer)data[1]);
        	System.out.println(", Team name is : " + (String)data[2]);
        }
        
//        tx.commit();
//        session.close();

	}
}

