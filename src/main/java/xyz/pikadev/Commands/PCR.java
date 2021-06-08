package xyz.pikadev.Commands;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.plugin.Plugin;
import org.jetbrains.annotations.NotNull;
import xyz.pikadev.PikaChatRadius;

public class PCR implements CommandExecutor {
    Plugin plugin = PikaChatRadius.getPlugin(PikaChatRadius.class);

    @Override
    public boolean onCommand(@NotNull CommandSender sender, @NotNull Command command, @NotNull String label, @NotNull String[] args) {
        if (!sender.hasPermission("pcr.admin")) {
            about(sender);
            return false;
        }
        if (args.length == 0) {
            about(sender);
            return false;
        }
        if(args.length >= 1){
            if(args[0].equalsIgnoreCase("about")){
                about(sender);
                return false;
            }
            if(args[0].equalsIgnoreCase("reload")){
                plugin.reloadConfig();
                sender.sendMessage(ChatColor.translateAlternateColorCodes('&',
                        plugin.getConfig().getString("Prefix")+
                        "&aReloaded Config."));
            }
        }
        return false;
    }

    private void about(CommandSender player) {
        player.sendMessage(ChatColor.translateAlternateColorCodes('&',"&6Pika&edev Sunar..."));
        player.sendMessage(ChatColor.translateAlternateColorCodes('&',"  &7&l=> &6Version: 1.0-SNAPSHOT"));
        player.sendMessage(ChatColor.translateAlternateColorCodes('&',"  &7&l=> &6Web: https://pikadev.xyz"));
        player.sendMessage(ChatColor.translateAlternateColorCodes('&',"  &7&l=> &6Source Code: https://github.com/PiikaDev/PikaChatRadius"));
    }
}
