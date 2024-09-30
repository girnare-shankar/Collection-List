package com.mini_project_on_List.PlayerDao;

import java.util.ArrayList;
import java.util.List;

import com.mini_project_on_List.entity.IPLPlayers;

public class PlayerDao {

	IPLPlayers pl = new IPLPlayers();

	public List<IPLPlayers> cskPlayersDao() {
		
		List<IPLPlayers> cskplayer = new ArrayList<IPLPlayers>();
		
		cskplayer.add(new IPLPlayers("MS Dhoni", "CSK", 1500, 0, 7));   // Captain and Wicketkeeper
		cskplayer.add(new IPLPlayers("Ravindra Jadeja", "CSK", 250, 15, 8)); // All-rounder
		cskplayer.add(new IPLPlayers("Devdutt Padikkal", "CSK", 400, 0, 28)); // Batsman
		cskplayer.add(new IPLPlayers("Ruturaj Gaikwad", "CSK", 590, 0, 31)); // Batsman
		cskplayer.add(new IPLPlayers("Deepak Chahar", "CSK", 80, 12, 65)); // Bowler
		cskplayer.add(new IPLPlayers("Shivam Dube", "CSK", 400, 10, 24)); // All-rounder
		cskplayer.add(new IPLPlayers("Tushar Deshpande", "CSK", 200, 15, 27)); // Bowler
		cskplayer.add(new IPLPlayers("Matisha Pathirana", "CSK", 90, 20, 83)); // Bowler
		cskplayer.add(new IPLPlayers("Dwaine Pretorius", "CSK", 200, 5, 9)); // All-rounder
		cskplayer.add(new IPLPlayers("Prashant Solanki", "CSK", 50, 3, 44)); // Bowler
		cskplayer.add(new IPLPlayers("Ajay Mandal", "CSK", 100, 5, 54)); // All-rounder
		
		return cskplayer;
	}
	
	public List<IPLPlayers> miPlayersDao() {
	    
	    List<IPLPlayers> miplayer = new ArrayList<IPLPlayers>();
	    
	    miplayer.add(new IPLPlayers("Rohit Sharma", "MI", 5000, 0, 45));   // Captain and Batsman
	    miplayer.add(new IPLPlayers("Suryakumar Yadav", "MI", 1100, 0, 63)); // Batsman
	    miplayer.add(new IPLPlayers("Ishan Kishan", "MI", 1000, 0, 32)); // Wicketkeeper-Batsman
	    miplayer.add(new IPLPlayers("Tim David", "MI", 400, 0, 24)); // Batsman
	    miplayer.add(new IPLPlayers("Jasprit Bumrah", "MI", 50, 20, 93)); // Bowler
	    miplayer.add(new IPLPlayers("Tristan Stubbs", "MI", 200, 0, 21)); // Batsman
	    miplayer.add(new IPLPlayers("Basil Thampi", "MI", 40, 10, 17)); // Bowler
	    miplayer.add(new IPLPlayers("Dewald Brevis", "MI", 150, 0, 87)); // Batsman
	    miplayer.add(new IPLPlayers("Rahul Chahar", "MI", 10, 10, 59)); // Bowler
	    miplayer.add(new IPLPlayers("Akash Madhwal", "MI", 30, 5, 19)); // Bowler
	    miplayer.add(new IPLPlayers("Jason Behrendorff", "MI", 20, 5, 26)); // Bowler
	    
	    return miplayer;
	}
	public List<IPLPlayers> rcbPlayersDao() {
	    
	    List<IPLPlayers> rcbplayer = new ArrayList<IPLPlayers>();
	    
	    rcbplayer.add(new IPLPlayers("Faf du Plessis", "RCB", 700, 0, 18)); // Captain and Batsman
	    rcbplayer.add(new IPLPlayers("Virat Kohli", "RCB", 500, 0, 18)); // Batsman
	    rcbplayer.add(new IPLPlayers("Glenn Maxwell", "RCB", 400, 0, 33)); // All-rounder
	    rcbplayer.add(new IPLPlayers("Dinesh Karthik", "RCB", 250, 0, 7)); // Wicketkeeper-Batsman
	    rcbplayer.add(new IPLPlayers("Mohammed Siraj", "RCB", 10, 20, 24)); // Bowler
	    rcbplayer.add(new IPLPlayers("Wanindu Hasaranga", "RCB", 200, 25, 30)); // All-rounder
	    rcbplayer.add(new IPLPlayers("Harshal Patel", "RCB", 50, 20, 8)); // Bowler
	    rcbplayer.add(new IPLPlayers("Shahbaz Ahmed", "RCB", 300, 10, 24)); // All-rounder
	    rcbplayer.add(new IPLPlayers("Karn Sharma", "RCB", 15, 5, 39)); // Bowler
		rcbplayer.add(new IPLPlayers("Anuj Rawat", "RCB", 100, 0, 23)); // Batsman
	    rcbplayer.add(new IPLPlayers("David Willey", "RCB", 80, 10, 25)); // All-rounder
	    
	    return rcbplayer;
	}


}
