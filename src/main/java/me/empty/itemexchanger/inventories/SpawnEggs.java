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
import static me.empty.itemexchanger.inventories.ItemExchangerInventorySelection.formatCurrency;

public class SpawnEggs implements InventoryHolder {
    public static Inventory eggsinv;

    private final ItemExchanger plugin;

    public SpawnEggs(ItemExchanger plugin){
        this.plugin = plugin;
        eggsinv = Bukkit.createInventory(this,27,"§a§lSpawn Eggs");
        setupSpawnEggsInventory(eggsinv);
        init();
    }

    private void init(){
        ItemStack item;
        item = createItem("§7", Material.LIME_STAINED_GLASS_PANE,null);
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

    public void setupSpawnEggsInventory(Inventory eggsinv) {
        int[] slots = {10, 11, 12, 13, 14, 15, 16};

        for (int i = 0; i < 7; i++) {
            String slotPrefix = "slot" + (i + 1);
            ItemStack item;
            List<String> itemLore = new ArrayList<>();

            itemLore.add("§f" + plugin.getSpawneggs().getString(slotPrefix + ".lore.1"));
            itemLore.add("");
            itemLore.add("§3§lBuy: §f" + formatCurrency(
                    plugin.getSpawneggs().getString(slotPrefix + ".price"),
                    plugin.getSpawneggs().getString(slotPrefix + ".currency")
            ));
            itemLore.add("§3§lSell: §4§lNOT SELLABLE");

            item = createItem("§2§l" + plugin.getSpawneggs().getString(slotPrefix + ".name"), Material.valueOf(plugin.getSpawneggs().getString(slotPrefix + ".material")), itemLore);
            eggsinv.setItem(slots[i], item);
        }
    }
    @Override
    public Inventory getInventory() {
        return eggsinv;
    }
}
