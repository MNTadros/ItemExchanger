package me.empty.itemexchanger.inventories;

import me.empty.itemexchanger.ItemExchanger;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.InventoryHolder;
import org.bukkit.inventory.ItemStack;

import java.util.ArrayList;
import java.util.List;

import static me.empty.itemexchanger.inventories.ItemExchangerInventorySelection.*;

public class Items implements InventoryHolder {

    public static Inventory itemsinv;
    private final ItemExchanger plugin;

    public Items(ItemExchanger plugin){
        this.plugin = plugin;
        itemsinv = Bukkit.createInventory(this,54,"§6§lItems");
        setOuterLayer(itemsinv,ItemExchangerInventorySelection.glasspane);
        setupItemsInventory(itemsinv);
        init();
    }
    private void init(){
        ItemStack item;

        List<String> lore = new ArrayList<>();
        lore.add("§cClick this to close the selection");
        item = createItem("§c§lClose selection", Material.BARRIER,lore);
        itemsinv.setItem(49,item);
    }

    public void setupItemsInventory(Inventory itemsinv) {
        int[] slots = {10, 11, 12, 13, 14, 15, 16, 19, 20, 21, 22, 23, 24, 25, 28, 29, 30, 31, 32, 33, 34, 37, 38, 39, 40, 41, 42, 43};

        for (int i = 0; i < 28; i++) {
            String slotPrefix = "slot" + (i + 1);
            ItemStack item;
            List<String> itemLore = new ArrayList<>();

            itemLore.add("§f" + plugin.getItems().getString(slotPrefix + ".lore.1"));
            itemLore.add("");
            itemLore.add("§3§lBuy: §f" + formatCurrency(
                    plugin.getItems().getString(slotPrefix + ".price"),
                    plugin.getItems().getString(slotPrefix + ".currency")
            ));
            itemLore.add("§3§lSell: §4§lNOT SELLABLE");

            item = createItem("§2§l" + plugin.getItems().getString(slotPrefix + ".name"), Material.valueOf(plugin.getItems().getString(slotPrefix + ".material")), itemLore);
            itemsinv.setItem(slots[i], item);
        }
    }

    public void setOuterLayer(Inventory inventory, ItemStack material) {
        int rows = 6; // Assuming the inventory has 6 rows
        int columns = 9; // Assuming the inventory has 9 columns

        for (int row = 0; row < rows; row++) {
            for (int col = 0; col < columns; col++) {
                if (row == 0 || row == rows - 1 || col == 0 || col == columns - 1) {
                    int slot = row * columns + col;
                    inventory.setItem(slot, material);
                }
            }
        }
    }
    @Override
    public Inventory getInventory() {
        return itemsinv;
    }
}
