package com.tka.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.tka.model.Player;
import com.tka.utility.HibernateUtility;

public class IPLDao {

	public List<Player> getAllPlayers() {
		// TODO Auto-generated method stub
		SessionFactory sf = HibernateUtility.getSessionFactory();
		Session session  = sf.openSession();
		session.beginTransaction();
		
		return session.createQuery("from Player", Player.class).list();
	}
	
	public List<Player> getPlayersFromMI(){
		SessionFactory sf = HibernateUtility.getSessionFactory();
		Session session  = sf.openSession();
		session.beginTransaction();
		
		return session.createQuery("from Player where teamName='Mumbai Indians'").list();

	}

	public List<Player> getPlayersFromRCB() {
		SessionFactory sf = HibernateUtility.getSessionFactory();
		Session session  = sf.openSession();
		session.beginTransaction();
		
		return session.createQuery("from Player where teamName='Royal Challengers Bangalore'").list();
			
	}

	public List<Player> getBatsmen() {
		// TODO Auto-generated method stub
		SessionFactory sf = HibernateUtility.getSessionFactory();
		Session session  = sf.openSession();
		session.beginTransaction();
		
		return session.createQuery("from Player where role='Batsmen'").list();
	}

	public List<Player> getBowlers() {
		// TODO Auto-generated method stub
		SessionFactory sf = HibernateUtility.getSessionFactory();
		Session session  = sf.openSession();
		session.beginTransaction();
		
		return session.createQuery("from Player where role='Bowler'").list();

	}
	
	public List<Player> getAllRounders() {
		// TODO Auto-generated method stub
		SessionFactory sf = HibernateUtility.getSessionFactory();
		Session session  = sf.openSession();
		session.beginTransaction();
		
		return session.createQuery("from Player where role='All-Rounder'").list();

	}

}
