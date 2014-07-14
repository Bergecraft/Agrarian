package com.bergecraft.agrarian;

import java.util.logging.Logger;

import org.bukkit.event.Listener;
import org.bukkit.plugin.java.JavaPlugin;

public class Agrarian  extends JavaPlugin implements Listener {

    private static final Logger LOG = Logger.getLogger("Agrarian");

    @Override
    public void onEnable() {
        super.onEnable();
    
        LOG.info("[Agrarian] is now enabled");
    }
    
    @Override
    public void onDisable() {
        LOG.info("[Agrarian] is now disabled");
        super.onDisable();
    }
    
}
