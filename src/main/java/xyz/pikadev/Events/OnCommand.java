package xyz.pikadev.Events;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerCommandPreprocessEvent;

public class OnCommand implements Listener {
    @EventHandler
    public void onCommand(PlayerCommandPreprocessEvent e) {
        if (e.getMessage().startsWith("/msg") ||
                e.getMessage().startsWith("/w") ||
                e.getMessage().startsWith("/tell") ||
                e.getMessage().startsWith("/r") ||
                e.getMessage().startsWith("/minecraft:msg") ||
                e.getMessage().startsWith("/minecraft:w") ||
                e.getMessage().startsWith("/minecraft:tell") ||
                e.getMessage().startsWith("/minecraft:r")
        ) {
            if(!(e.getPlayer().isOp()) || !(e.getPlayer().hasPermission("pcr.admin"))){
                e.setCancelled(true);
            }
        }
    }
}
