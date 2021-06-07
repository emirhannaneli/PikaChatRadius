package xyz.pikadev;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.plugin.java.JavaPlugin;
import xyz.pikadev.Events.OnChat;
import xyz.pikadev.Events.OnLogin;
import xyz.pikadev.Events.OnMove;

public final class PikaChatRadius extends JavaPlugin {

    public static String sendConsoleMessage(String message) {
        return ChatColor.translateAlternateColorCodes('&', "&6Pika&edev => " + message);
    }

    @Override
    public void onEnable() {
        //Enable
        sendConsoleMessage("&aAktif...");
        //Events
        getServer().getPluginManager().registerEvents(new OnChat(), this);
        getServer().getPluginManager().registerEvents(new OnMove(), this);
        getServer().getPluginManager().registerEvents(new OnLogin(), this);
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
