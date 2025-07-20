package com.tka.utility;

import org.hibernate.SessionFactory;

import org.hibernate.cfg.Configuration;

import com.tka.model.Player;

public class HibernateUtility {

	
	private HibernateUtility() {
		
	}
	public static SessionFactory getSessionFactory() {
		// TODO Auto-generated method stub
		return new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Player.class).buildSessionFactory();
	}

}
