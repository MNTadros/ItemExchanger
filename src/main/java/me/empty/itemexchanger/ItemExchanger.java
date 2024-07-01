package me.empty.itemexchanger;

import me.empty.itemexchanger.commands.OpenItemExchanger;
import me.empty.itemexchanger.events.*;
import org.bukkit.ChatColor;
import org.bukkit.configuration.InvalidConfigurationException;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.configuration.file.YamlConfiguration;
import org.bukkit.plugin.java.JavaPlugin;

import java.io.File;
import java.io.IOException;

public final class ItemExchanger extends JavaPlugin {

    private File redstonef,itemsf,armorf,spawneggsf;
    private FileConfiguration redstone,items,armor,spawneggs;

    @Override
    public void onEnable() {
        // Plugin startup logic
        //config init
        createSpawneggs();
        createArmor();
        createRedstone();
        createItems();
        getConfig().options().copyDefaults();
        saveDefaultConfig();

        getCommand("exchanger").setExecutor(new OpenItemExchanger(this));
        getServer().getPluginManager().registerEvents(new InventoryEvents(this),this);
        getServer().getPluginManager().registerEvents(new SpawnEggsShopEvents(this),this);
        getServer().getPluginManager().registerEvents(new RedstoneShopEvents(this),this);
        getServer().getPluginManager().registerEvents(new ItemsShopEvents(this),this);
        getServer().getPluginManager().registerEvents(new ArmorShopEvents(this),this);

        getServer().getConsoleSender().sendMessage(ChatColor.GOLD + "§l[ItemExchanger] §6Plugin enabled!");
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
        getServer().getConsoleSender().sendMessage(ChatColor.RED + "§l[ItemExchanger] §6Plugin disabled!");
    }
    public FileConfiguration getRedstone() {
        return this.redstone;
    }
    private void createRedstone() {
        redstonef = new File(getDataFolder(), "redstone.yml");
        if (!redstonef.exists()) {
            redstonef.getParentFile().mkdirs();
            saveResource("redstone.yml", false);
        }

        redstone = new YamlConfiguration();
        try {
            redstone.load(redstonef);
        } catch (IOException | InvalidConfigurationException e) {
            e.printStackTrace();
        }
    }

    public FileConfiguration getItems() {
        return this.items;
    }
    private void createItems() {
        itemsf = new File(getDataFolder(), "items.yml");
        if (!itemsf.exists()) {
            itemsf.getParentFile().mkdirs();
            saveResource("items.yml", false);
        }

        items = new YamlConfiguration();
        try {
            items.load(itemsf);
        } catch (IOException | InvalidConfigurationException e) {
            e.printStackTrace();
        }
    }

    public FileConfiguration getArmor() {
        return this.armor;
    }
    private void createArmor() {
        armorf = new File(getDataFolder(), "armor.yml");
        if (!armorf.exists()) {
            armorf.getParentFile().mkdirs();
            saveResource("armor.yml", false);
        }

        armor = new YamlConfiguration();
        try {
            armor.load(armorf);
        } catch (IOException | InvalidConfigurationException e) {
            e.printStackTrace();
        }
    }


    public FileConfiguration getSpawneggs() {
        return this.spawneggs;
    }
    private void createSpawneggs() {
        spawneggsf = new File(getDataFolder(), "spawneggs.yml");
        if (!spawneggsf.exists()) {
            spawneggsf.getParentFile().mkdirs();
            saveResource("spawneggs.yml", false);
        }

        spawneggs = new YamlConfiguration();
        try {
            spawneggs.load(spawneggsf);
        } catch (IOException | InvalidConfigurationException e) {
            e.printStackTrace();
        }
    }
}




