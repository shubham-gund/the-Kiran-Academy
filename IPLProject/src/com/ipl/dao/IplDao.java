package com.ipl.dao;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.ipl.model.Player;

public class IplDao {
    private Map<String, List<Player>> teamMap = new HashMap<>();

    public IplDao() {
        addRCBPlayers();
        addMIPlayers();
        addGTPlayers();
        addPKSPlayers();
    }

    private void addRCBPlayers() {
        List<Player> rcb = new ArrayList<>();
        rcb.add(new Player(18, "Virat Kohli", 7263, 4, 85));
        rcb.add(new Player(17, "Faf du Plessis", 4000, 0, 55));
        rcb.add(new Player(33, "Glenn Maxwell", 2500, 30, 40));
        rcb.add(new Player(5, "Dinesh Karthik", 4500, 0, 80));
        rcb.add(new Player(96, "Mohammed Siraj", 100, 70, 10));
        rcb.add(new Player(86, "Harshal Patel", 200, 85, 12));
        teamMap.put("RCB", rcb);
    }

    private void addMIPlayers() {
        List<Player> mi = new ArrayList<>();
        mi.add(new Player(45, "Rohit Sharma", 6211, 15, 90));
        mi.add(new Player(93, "Ishan Kishan", 2300, 2, 50));
        mi.add(new Player(33, "Suryakumar Yadav", 3100, 1, 60));
        mi.add(new Player(99, "Jasprit Bumrah", 150, 120, 8));
        mi.add(new Player(55, "Tilak Varma", 800, 0, 15));
        mi.add(new Player(63, "Piyush Chawla", 300, 100, 25));
        teamMap.put("MI", mi);
    }

    private void addGTPlayers() {
        List<Player> gt = new ArrayList<>();
        gt.add(new Player(33, "Shubman Gill", 3000, 0, 45));
        gt.add(new Player(33, "Hardik Pandya", 2000, 50, 35));
        gt.add(new Player(13, "David Miller", 2500, 0, 30));
        gt.add(new Player(22, "Rashid Khan", 400, 120, 25));
        gt.add(new Player(60, "Wriddhiman Saha", 1800, 0, 40));
        gt.add(new Player(35, "Mohit Sharma", 120, 95, 10));
        teamMap.put("GT", gt);
    }

    private void addPKSPlayers() {
        List<Player> pks = new ArrayList<>();
        pks.add(new Player(7, "Shikhar Dhawan", 6500, 0, 75));
        pks.add(new Player(29, "Liam Livingstone", 1500, 15, 20));
        pks.add(new Player(9, "Sam Curran", 1100, 40, 18));
        pks.add(new Player(99, "Arshdeep Singh", 80, 70, 12));
        pks.add(new Player(23, "Jonny Bairstow", 1400, 0, 22));
        pks.add(new Player(36, "Harpreet Brar", 300, 25, 15));
        teamMap.put("PKS", pks);
    }

    public List<Player> getTeam(String teamName) {
        return teamMap.getOrDefault(teamName, new ArrayList<>());
    }

    public List<Player> getPlayersWithRunsGreaterThan(int runs) {
        List<Player> result = new ArrayList<>();
        for (List<Player> team : teamMap.values()) {
            for (Player p : team) {
                if (p.getRuns() > runs) result.add(p);
            }
        }
        return result;
    }

    public List<Player> getPlayersWithWicketsGreaterThan(int wk) {
        List<Player> result = new ArrayList<>();
        for (List<Player> team : teamMap.values()) {
            for (Player p : team) {
                if (p.getWickets() > wk) result.add(p);
            }
        }
        return result;
    }

    public List<Player> getPlayersStartingWith(char c) {
        List<Player> result = new ArrayList<>();
        for (List<Player> team : teamMap.values()) {
            for (Player p : team) {
                if (p.getName().startsWith(String.valueOf(c))) result.add(p);
            }
        }
        return result;
    }
}
