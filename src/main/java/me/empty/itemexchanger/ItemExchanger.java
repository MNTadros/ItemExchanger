package me.empty.itemexchanger;

import me.empty.itemexchanger.commands.OpenItemExchanger;
import me.empty.itemexchanger.events.InventoryEvents;
import me.empty.itemexchanger.events.RedstoneShopEvents;
import me.empty.itemexchanger.events.SpawnEggsShopEvents;
import org.bukkit.ChatColor;
import org.bukkit.plugin.java.JavaPlugin;

public final class ItemExchanger extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        //config init
        getConfig().options().copyDefaults();
        saveDefaultConfig();

        getCommand("exchanger").setExecutor(new OpenItemExchanger());
        getServer().getPluginManager().registerEvents(new InventoryEvents(this),this);
        getServer().getPluginManager().registerEvents(new SpawnEggsShopEvents(this),this);
        getServer().getPluginManager().registerEvents(new RedstoneShopEvents(this),this);

        getServer().getConsoleSender().sendMessage(ChatColor.GOLD + "§l[ItemExchanger] §6Plugin enabled!");
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
        getServer().getConsoleSender().sendMessage(ChatColor.RED + "§l[ItemExchanger] §6Plugin disabled!");
    }
}
