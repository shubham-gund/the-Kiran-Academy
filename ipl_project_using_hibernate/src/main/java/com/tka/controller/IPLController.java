package com.tka.controller;

import java.util.List;

import com.tka.model.Player;
import com.tka.service.IPLService;

public class IPLController {

	
	private IPLService iplService;
	
	public List<Player> getAllPlayers(){
		
		iplService = new IPLService();
		return iplService.getAllPlayers();
	}

	public List<Player> getPlayersFromMI() {
		// TODO Auto-generated method stub
		return iplService.getPlayersFromMI();
	}

	public List<Player> getPlayersFromRCB() {
		// TODO Auto-generated method stub
		return iplService.getPlayersFromRCB();
	}
	
	public List<Player> getBatsmen(){
		return iplService.getBatsmen();
	}

	public List<Player> getBowlers() {
		// TODO Auto-generated method stub
		return iplService.getBowlers();
	}

	public List<Player> getAllRounders() {
		// TODO Auto-generated method stub
		return iplService.getAllRounders();
	}
		
}
