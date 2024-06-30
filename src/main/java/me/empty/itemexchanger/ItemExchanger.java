package me.empty.itemexchanger;

import org.bukkit.plugin.java.JavaPlugin;

public final class ItemExchanger extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        System.out.println("Enabled!");

    }

    @Override
    public void onDisable() {
        System.out.println("Disabled!");
        // Plugin shutdown logic
    }
}
