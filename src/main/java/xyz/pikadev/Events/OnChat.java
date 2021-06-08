package xyz.pikadev.Events;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.AsyncPlayerChatEvent;
import xyz.pikadev.Handlers.PlayerRadius;

public class OnChat implements Listener {
    PlayerRadius playerRadius = new PlayerRadius();

    @EventHandler
    public void onChat(AsyncPlayerChatEvent e) {
        Player player = e.getPlayer();
        e.setCancelled(true);
        playerRadius.check(player, e.getMessage());
    }
}
