package me.empty.itemexchanger.inventories;

import me.empty.itemexchanger.ItemExchanger;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.InventoryHolder;
import org.bukkit.inventory.ItemStack;

import java.util.ArrayList;
import java.util.List;
import static me.empty.itemexchanger.inventories.ItemExchangerInventorySelection.createItem;

public class SpawnEggs implements InventoryHolder {
    public static Inventory eggsinv;

    private final ItemExchanger plugin;

    public SpawnEggs(ItemExchanger plugin){
        this.plugin = plugin;
        eggsinv = Bukkit.createInventory(this,27,"§a§lSpawn Eggs");
        SpawnEggsExchangeable();
        init();
    }

    private void init(){
        ItemStack item;
        item = createItem("§7", Material.LIME_STAINED_GLASS,null);
        for (int i = 0; i < 10;i++){
            eggsinv.setItem(i,item);
        }
        eggsinv.setItem(17,item);
        for (int i = 18; i < 27;i++){
            eggsinv.setItem(i,item);
        }
        List<String> lore = new ArrayList<>();
        lore.add("§cClick this to close the selection");
        item = createItem("§c§lClose selection", Material.BARRIER,lore);
        eggsinv.setItem(22,item);
    }
    public void SpawnEggsExchangeable() {
        ItemStack slot1;
        List<String> slot1lore = new ArrayList<>();
        slot1lore.add("§fAn explosive creature!");
        slot1lore.add("");
        slot1lore.add("§3§lBuy: §f3 Gold Blocks");
        slot1lore.add("§3§lSell: §4§lNOT SELLABLE");
        slot1 = createItem("§2§lCreeper Spawn Egg", Material.CREEPER_SPAWN_EGG, slot1lore);
        eggsinv.setItem(10, slot1);

        ItemStack slot2;
        List<String> slot2lore = new ArrayList<>();
        slot2lore.add("§fA furry friend!");
        slot2lore.add("");
        slot2lore.add("§3§lBuy: §f2 Gold Blocks");
        slot2lore.add("§3§lSell: §4§lNOT SELLABLE");
        slot2 = createItem("§f§lWolf Spawn Egg", Material.WOLF_SPAWN_EGG, slot2lore);
        eggsinv.setItem(11, slot2);

        ItemStack slot3;
        List<String> slot3lore = new ArrayList<>();
        slot3lore.add("§fA flying menace!");
        slot3lore.add("");
        slot3lore.add("§3§lBuy: §f4 Gold Blocks");
        slot3lore.add("§3§lSell: §4§lNOT SELLABLE");
        slot3 = createItem("§3§lPhantom Spawn Egg", Material.PHANTOM_SPAWN_EGG, slot3lore);
        eggsinv.setItem(12, slot3);

        ItemStack slot4;
        List<String> slot4lore = new ArrayList<>();
        slot4lore.add("§fA fiery creature!");
        slot4lore.add("");
        slot4lore.add("§3§lBuy: §f5 Gold Blocks");
        slot4lore.add("§3§lSell: §4§lNOT SELLABLE");
        slot4 = createItem("§c§lBlaze Spawn Egg", Material.BLAZE_SPAWN_EGG, slot4lore);
        eggsinv.setItem(13, slot4);

        ItemStack slot5;
        List<String> slot5lore = new ArrayList<>();
        slot5lore.add("§fA water creature!");
        slot5lore.add("");
        slot5lore.add("§3§lBuy: §f3 Gold Blocks");
        slot5lore.add("§3§lSell: §4§lNOT SELLABLE");
        slot5 = createItem("§b§lGuardian Spawn Egg", Material.GUARDIAN_SPAWN_EGG, slot5lore);
        eggsinv.setItem(14, slot5);

        ItemStack slot6;
        List<String> slot6lore = new ArrayList<>();
        slot6lore.add("§fA zombie villager!");
        slot6lore.add("");
        slot6lore.add("§3§lBuy: §f2 Gold Blocks");
        slot6lore.add("§3§lSell: §4§lNOT SELLABLE");
        slot6 = createItem("§2§lZombie Villager Spawn Egg", Material.ZOMBIE_VILLAGER_SPAWN_EGG, slot6lore);
        eggsinv.setItem(15, slot6);

        ItemStack slot7;
        List<String> slot7lore = new ArrayList<>();
        slot7lore.add("§fA dangerous insect!");
        slot7lore.add("");
        slot7lore.add("§3§lBuy: §f3 Gold Blocks");
        slot7lore.add("§3§lSell: §4§lNOT SELLABLE");
        slot7 = createItem("§6§lBee Spawn Egg", Material.BEE_SPAWN_EGG, slot7lore);
        eggsinv.setItem(16, slot7);
    }

    @Override
    public Inventory getInventory() {
        return eggsinv;
    }
}
