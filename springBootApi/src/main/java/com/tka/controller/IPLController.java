package com.tka.controller;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.tka.model.Player;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IPLController {
	
    @GetMapping("/getAllNames")
    public List<String> getAllNames() {
        return Arrays.asList("shubham", "ajay", "dinesh", "priyanshu");
    }

    @GetMapping("/getSinglePlayer")
    public Player getSinglePlayer() {
        return new Player(1, "Virat Kohli", "Royal Challengers Bangalore");
    }

    
    @GetMapping("/getAllPlayers")
    public List<Player> getAllPlayers() {
        return Arrays.asList(
            new Player(1, "MS Dhoni", "Chennai Super Kings"),
            new Player(2, "Rohit Sharma", "Mumbai Indians"),
            new Player(3, "Virat Kohli", "Royal Challengers Bangalore")
        );
    }


    @GetMapping("/getTeamCaptains")
    public Map<String, String> getTeamCaptains() {
        Map<String, String> captains = new HashMap<>();
        captains.put("CSK", "MS Dhoni");
        captains.put("MI", "Rohit Sharma");
        captains.put("RCB", "Faf du Plessis");
        return captains;
    }

    @GetMapping("/getWelcomeMessage")
    public ResponseEntity<String> getWelcomeMessage() {
        return ResponseEntity.ok("Welcome to the IPL API!");
    }
}
