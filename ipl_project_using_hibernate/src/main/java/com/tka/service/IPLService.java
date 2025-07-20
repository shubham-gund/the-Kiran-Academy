package com.tka.service;

import java.util.List;

import com.tka.dao.IPLDao;
import com.tka.model.Player;

public class IPLService {

	private IPLDao iplDao;
	
	public List<Player> getAllPlayers() {
		// TODO Auto-generated method stub
		iplDao = new IPLDao();
		return iplDao.getAllPlayers();
	}

	public List<Player> getPlayersFromMI() {
		// TODO Auto-generated method stub
		return iplDao.getPlayersFromMI();
	}

	public List<Player> getPlayersFromRCB() {
		// TODO Auto-generated method stub
		return iplDao.getPlayersFromRCB();
	}

	public List<Player> getBatsmen() {
		// TODO Auto-generated method stub
		return iplDao.getBatsmen();
	}

	public List<Player> getBowlers() {
		// TODO Auto-generated method stub
		return iplDao.getBowlers();
	}

	public List<Player> getAllRounders() {
		// TODO Auto-generated method stub
		return iplDao.getAllRounders();
	}

}
