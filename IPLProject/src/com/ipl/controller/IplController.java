package com.ipl.controller;

import com.ipl.service.IplService;
import com.ipl.model.Player;
import java.util.*;

public class IplController {
    public static void main(String[] args) {
        IplService service = new IplService();

        System.out.println("=== RCB Team ===");
        List<Player> rcb = service.getTeam("RCB"); 
        for (Player player : rcb) {
            System.out.println(player);
        }

        System.out.println("\n=== Players with > 5000 runs ===");
        List<Player> highRunPlayers = service.getPlayersWithRunsGreaterThan(5000);
        for (Player player : highRunPlayers) {
            System.out.println(player);
        }

        System.out.println("\n=== Players with > 20 wickets ===");
        List<Player> highWicketPlayers = service.getPlayersWithWicketsGreaterThan(20);
        for (Player player : highWicketPlayers) {
            System.out.println(player);
        }

        System.out.println("\n=== Players whose name starts with 'V' ===");
        List<Player> nameStartsWithV = service.getPlayersStartingWith('V');
        for (Player player : nameStartsWithV) {
            System.out.println(player);
        }
    }
}
