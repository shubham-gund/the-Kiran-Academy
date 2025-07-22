package com.tka.model;

public class Player {
    private int id;
    private String name;
    private String teamName;

    // Constructors
    public Player() {}

    public Player(int id, String name, String teamName) {
        this.id = id;
        this.name = name;
        this.teamName = teamName;
    }

    // Getters and setters
    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getTeamName() { return teamName; }
    public void setTeamName(String teamName) { this.teamName = teamName; }
}
