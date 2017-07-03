package com.github.mulvaney.speedboots;

import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {

    @Override
    public void onEnable(){
        getServer().getPluginManager().registerEvents(new BootsListener(), this);
        getCommand("speedboots").setExecutor(new BootCommand());

    }
}
