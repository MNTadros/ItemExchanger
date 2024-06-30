package me.empty.itemexchanger;

import me.empty.itemexchanger.commands.OpenItemExchanger;
import me.empty.itemexchanger.events.InventoryEvents;
import org.bukkit.ChatColor;
import org.bukkit.plugin.java.JavaPlugin;

public final class ItemExchanger extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        getCommand("exchanger").setExecutor(new OpenItemExchanger());
        getServer().getPluginManager().registerEvents(new InventoryEvents(),this);
        getServer().getConsoleSender().sendMessage(ChatColor.GOLD + "§l[ItemExchanger] §6Plugin enabled!");
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
        getServer().getConsoleSender().sendMessage(ChatColor.RED + "§l[ItemExchanger] §6Plugin disabled!");
    }
}