package com.tka.types;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GrandParent gp = new GrandParent(); // static dispatch
		gp.m1();
		
		GrandParent gp1 = new Parent(); // dynamic dispatch
		GrandParent gp2 = new Jay();
		GrandParent gp3 = new Viru();
		
		// gp1, gp2, gp3 can access only m1 methods;
		
		Parent p = new Parent() ; // static dispatch
		p.m1();
		p.m2();
		
		Parent p1 = new Jay(); // dynamic dispatch
		Parent p2 = new Viru();
		
		// p1, p2 can access only m1 & m2 methods;
		
		Jay c1 = new Jay();
		c1.m1();
		c1.m2();
		c1.m3();
		
		
		Viru c2 = new Viru();
		c2.m1();
		c2.m2();
		c2.m4();
		
		/* visual representation of hybrid inheritance consisting :- Single level
		  														   - Multilevel
		  														   - Heirarchical
		 
		  
		  		 GrandParent (m1)
		  		 	   |
		  		 Parent (m1, m2)
		  		 /           \
		 Jay(m1, m2, m3)    Viru  (m1, m2, m4)
		  		 
		 */
 	}

}
