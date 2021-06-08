package xyz.pikadev;

import org.bukkit.ChatColor;
import org.bukkit.plugin.java.JavaPlugin;
import xyz.pikadev.Commands.PCR;
import xyz.pikadev.Events.OnChat;
import xyz.pikadev.Events.OnLogin;
import xyz.pikadev.Events.OnMove;

public final class PikaChatRadius extends JavaPlugin {

    public static String sendConsoleMessage(String message) {
        return ChatColor.translateAlternateColorCodes('&', "&6Pika&edev » " + message);
    }

    @Override
    public void onEnable() {
        //Enable
        sendConsoleMessage("&aAktif...");
        getConfig().options().copyDefaults(true);
        saveConfig();
        //Commands
        getCommand("pcr").setExecutor(new PCR());
        //Events
        getServer().getPluginManager().registerEvents(new OnChat(), this);
        getServer().getPluginManager().registerEvents(new OnMove(), this);
        getServer().getPluginManager().registerEvents(new OnLogin(), this);
        //Bstats
        Metrics metrics = new Metrics(this, 11617);
    }

    @Override
    public void onDisable() {
        sendConsoleMessage("&cDeaktif...");
    }
}
