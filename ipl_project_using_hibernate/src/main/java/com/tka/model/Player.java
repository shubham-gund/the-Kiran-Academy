package com.tka.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Column;

@Entity
@Table(name = "player")
public class Player {

    @Id
    @Column(name = "jersey_no")
    private int jerseyNumber;

    @Column(name = "name", nullable = false)
    private String playerName;

    @Column(name = "team_name", nullable = false)
    private String teamName;

    @Column(name = "runs")
    private int runs;

    @Column(name = "wickets")
    private int wickets;
    
    @Column(name = "role")
    private String role;

    // Default constructor (required by Hibernate)
    public Player() {}

    // Parameterized constructor
    public Player(int jerseyNumber, String playerName, String teamName, int runs, int wickets, String role) {
        this.jerseyNumber = jerseyNumber;
        this.playerName = playerName;
        this.teamName = teamName;
        this.runs = runs;
        this.wickets = wickets;
        this.role = role;
    }


	// Getters and Setters
    public int getJerseyNumber() {
        return jerseyNumber;
    }

    public void setJerseyNumber(int jerseyNumber) {
        this.jerseyNumber = jerseyNumber;
    }

    public String getPlayerName() {
        return playerName;
    }

    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }

    public String getTeamName() {
        return teamName;
    }

    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }

    public int getRuns() {
        return runs;
    }

    public void setRuns(int runs) {
        this.runs = runs;
    }

    public int getWickets() {
        return wickets;
    }

    public void setWickets(int wickets) {
        this.wickets = wickets;
    }
    
    public String getRole() {
    	return role;
    }
    
    public void setRole(String role) {
    	this.role = role;
    }

    @Override
	public String toString() {
		return "Player jerseyNumber=" + jerseyNumber + ", playerName=" + playerName + ", teamName=" + teamName
				+ ", runs=" + runs + ", wickets=" + wickets + ", role=" + role + "";
	}
}
