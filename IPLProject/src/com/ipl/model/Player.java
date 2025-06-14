package com.ipl.model;

public class Player {
    private int jerseyNo;
    private String name;
    private int runs;
    private int wickets;
    private int catches;

    public Player(int jerseyNo, String name, int runs, int wickets, int catches) {
        this.jerseyNo = jerseyNo;
        this.name = name;
        this.runs = runs;
        this.wickets = wickets;
        this.catches = catches;
    }

    public int getJerseyNo() { return jerseyNo; }
    public String getName() { return name; }
    public int getRuns() { return runs; }
    public int getWickets() { return wickets; }
    public int getCatches() { return catches; }

    @Override
    public String toString() {
        return jerseyNo + " " + name + " " + runs + " runs, " + wickets + " wkts, " + catches + " catches";
    }
}
