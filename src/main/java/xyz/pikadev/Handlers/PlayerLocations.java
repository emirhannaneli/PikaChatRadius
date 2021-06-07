package xyz.pikadev.Handlers;

import org.bukkit.Location;
import org.bukkit.entity.Player;

import java.util.HashMap;

public class PlayerLocations {
    HashMap<Player, Location> playerLocations = new HashMap<Player, Location>();

    public HashMap<Player, Location> getPlayerLocations() {
        return playerLocations;
    }

    public boolean addPlayerLocation(Player player, Location playerLocation) {
        try {
            this.playerLocations.put(player,playerLocation);
            return true;
        }catch (Exception e){
            e.printStackTrace();
            return false;
        }
    }

    public boolean replacePlayerLocation(Player player, Location playerLocation){
        try {
            playerLocations.replace(player,playerLocation);
            return true;
        }catch (Exception e){
            e.printStackTrace();
            return false;
        }
    }

    public boolean clearPlayerLocations(){
        try {
            playerLocations.clear();
            return true;
        }catch (Exception e){
            e.printStackTrace();
            return false;
        }
    }
}
