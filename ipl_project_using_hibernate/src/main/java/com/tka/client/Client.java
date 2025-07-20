package com.tka.client;

import java.util.List;

import com.tka.controller.IPLController;
import com.tka.model.Player;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		IPLController controller = new IPLController();
		
		List<Player> allPlayers = controller.getAllPlayers();
		System.out.println("All Players");
		for(Player p : allPlayers) {
			System.out.println(p);
		}
		
		List<Player> MIPlayers = controller.getPlayersFromMI();
		System.out.println("MI PLayers : ");
		for(Player p : MIPlayers) {
			System.out.println(p);
		}
		
		List<Player> RCBPlayers = controller.getPlayersFromRCB();
		System.out.println("RCB Players : ");
		for(Player p : RCBPlayers) {
			System.out.println(p);
		}
		
		List<Player> Batsmen = controller.getBatsmen();
		System.out.println("Batsmen : ");
		for(Player p : Batsmen){
			System.out.println(p);
		}
		
		List<Player> Bowlers = controller.getBowlers();
		System.out.println("Bowlers : ");
		for(Player p : Bowlers){
			System.out.println(p);
		}
		
		List<Player> AllRounders= controller.getAllRounders();
		System.out.println("AllRounders : ");
		for(Player p : AllRounders){
			System.out.println(p);
		}
	}

}
