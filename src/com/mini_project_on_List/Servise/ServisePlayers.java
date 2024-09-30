package com.mini_project_on_List.Servise;

import java.util.ArrayList;
import java.util.List;

import com.mini_project_on_List.PlayerDao.PlayerDao;
import com.mini_project_on_List.entity.IPLPlayers;

public class ServisePlayers {

    PlayerDao pd = new PlayerDao();

    public List<IPLPlayers> getPlayersByRole(String team, String role) {
        List<IPLPlayers> players = new ArrayList<>();
        List<IPLPlayers> teamPlayers;

        switch (team.toUpperCase()) {
            case "CSK":
                teamPlayers = pd.cskPlayersDao();
                break;
            case "MI":
                teamPlayers = pd.miPlayersDao();
                break;
            case "RCB":
                teamPlayers = pd.rcbPlayersDao();
                break;
            default:
                System.out.println("Invalid team.");
                return players;
        }

        System.out.println(role + "'s From " + team + " Team: ");

        for (IPLPlayers iplPlayers : teamPlayers) {
            switch (role.toLowerCase()) {
                case "batsman":
                    if (iplPlayers.getRuns() > 200 && iplPlayers.getWeickets() < 5) {
                        players.add(iplPlayers);
                    }
                    break;
                case "bowler":
                    if (iplPlayers.getRuns() <= 200 && iplPlayers.getWeickets() > 3) {
                        players.add(iplPlayers);
                    }
                    break;
                case "all-rounder":
                    if (iplPlayers.getRuns() >= 100 && iplPlayers.getWeickets() >= 8) {
                        players.add(iplPlayers);
                    }
                    break;
                default:
                    System.out.println("Invalid role.");
                    return players;
            }
        }

        if (players.isEmpty()) {
            System.out.println("No players found for the given role.");
        } else {
            for (IPLPlayers player : players) {
                System.out.println(player);
            }
        }

        return players;
    }

    public List<IPLPlayers> getCSKBatsmanServise() {
        return getPlayersByRole("CSK", "batsman");
    }

    public List<IPLPlayers> getCSKBowerServise() {
        return getPlayersByRole("CSK", "bowler");
    }

    public List<IPLPlayers> getCSKAllRounderServise() {
        return getPlayersByRole("CSK", "all-rounder");
    }

    public List<IPLPlayers> getMIBatsmanRounderServise() {
        return getPlayersByRole("MI", "batsman");
    }

    public List<IPLPlayers> getMIBowerServise() {
        return getPlayersByRole("MI", "bowler");
    }

    public List<IPLPlayers> getMIAllRounderServise() {
        return getPlayersByRole("MI", "all-rounder");
    }

    public List<IPLPlayers> getRCBBatsmanServise() {
        return getPlayersByRole("RCB", "batsman");
    }

    public List<IPLPlayers> getRCBBowerServise() {
        return getPlayersByRole("RCB", "bowler");
    }

    public List<IPLPlayers> getRCBAllRounderServise() {
        return getPlayersByRole("RCB", "all-rounder");
    }
}
