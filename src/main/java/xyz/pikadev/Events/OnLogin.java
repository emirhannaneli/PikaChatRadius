package xyz.pikadev.Events;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerLoginEvent;
import xyz.pikadev.Handlers.PlayerLocations;

public class OnLogin implements Listener {
    PlayerLocations playerLocations = new PlayerLocations();

    @EventHandler
    public void onLogin(PlayerLoginEvent e) {
        Player player = e.getPlayer();
        playerLocations.addPlayerLocation(player, player.getLocation());
    }
}
