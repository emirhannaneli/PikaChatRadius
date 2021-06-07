package xyz.pikadev.Handlers;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.entity.Player;

import java.util.ArrayList;
import java.util.List;

public class PlayerRadius {
    float radius = 5;

    public static void sendPlayerMessage(Player player, String message) {
        player.sendMessage(ChatColor.translateAlternateColorCodes('&', message));
    }

    public boolean check(Player player, String message) {
        try {
            List<Player> allPlayers = new ArrayList<>(Bukkit.getOnlinePlayers());

            double playerX = player.getLocation().getBlockX();
            double playerZ = player.getLocation().getBlockZ();

            double otherPX;
            double otherPZ;
            for (Player otherPlayer : allPlayers) {
                if (otherPlayer == player) {
                    continue;
                }
                otherPX = otherPlayer.getLocation().getBlockX();
                otherPZ = otherPlayer.getLocation().getBlockZ();
                sendPlayerMessage(player, message);
                if (Math.abs(playerX - otherPX) <= radius && Math.abs(playerZ - otherPZ) <= radius) {
                    sendPlayerMessage(otherPlayer, message);
                }
            }
            return true;
        }catch (Exception e){
            e.printStackTrace();
            return false;
        }
    }
}
