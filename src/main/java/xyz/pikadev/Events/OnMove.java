package xyz.pikadev.Events;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerMoveEvent;
import xyz.pikadev.Handlers.PlayerLocations;

public class OnMove implements Listener {
    PlayerLocations playerLocations = new PlayerLocations();
    @EventHandler
    public void onMove(PlayerMoveEvent e) {
        Player player = e.getPlayer();
        playerLocations.replacePlayerLocation(player,player.getLocation());
    }
}
