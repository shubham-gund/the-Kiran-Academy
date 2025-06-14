package com.ipl.service;

import com.ipl.dao.IplDao;
import com.ipl.model.Player;
import java.util.*;

public class IplService {
    private IplDao dao = new IplDao();

    public List<Player> getTeam(String teamName) {
        return dao.getTeam(teamName);
    }

    public List<Player> getPlayersWithRunsGreaterThan(int runs) {
        return dao.getPlayersWithRunsGreaterThan(runs);
    }

    public List<Player> getPlayersWithWicketsGreaterThan(int wk) {
        return dao.getPlayersWithWicketsGreaterThan(wk);
    }

    public List<Player> getPlayersStartingWith(char c) {
        return dao.getPlayersStartingWith(c);
    }
}
