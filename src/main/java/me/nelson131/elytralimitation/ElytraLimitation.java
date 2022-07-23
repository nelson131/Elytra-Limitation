package me.nelson131.elytralimitation;

import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.plugin.Plugin;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.logging.Logger;

public class ElytraLimitation extends JavaPlugin {
    Logger log = getLogger();
    FileConfiguration config = getConfig();
    
    public static Plugin plugin = ElytraLimitation.getPlugin();

    private static Plugin getPlugin() {
        return plugin;
    }

    @Override
    public void onEnable() {
        plugin = this;
        log.info("Enabled ElytraLimitation");
        config.addDefault("iselytradisable", true);
        config.addDefault("isfireworkdisable", true);
        config.options().copyDefaults(true);
        getServer().getPluginManager().registerEvents(new ElytraDisableEvent(), this);
        getServer().getPluginManager().registerEvents(new ElytraFireworkDisableEvent(), this);
        saveConfig();
    }

    @Override
    public void onDisable() {

    }
}
