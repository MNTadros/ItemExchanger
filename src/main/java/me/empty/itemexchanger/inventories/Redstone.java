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

public class Redstone implements InventoryHolder {

    public static Inventory redstoneinv;
    private final ItemExchanger plugin;

    public Redstone(ItemExchanger plugin){
    this.plugin = plugin;
    redstoneinv = Bukkit.createInventory(this,54,"§4§lRedstone");
    setOuterLayer(redstoneinv,ItemExchangerInventorySelection.glasspane);
    setupRedstoneInventory(redstoneinv);
    init();
    }

    private void init(){
        ItemStack item;

        List<String> lore = new ArrayList<>();
        lore.add("§cClick this to close the selection");
        item = createItem("§c§lClose selection", Material.BARRIER,lore);
        redstoneinv.setItem(49,item);
    }

    public void setupRedstoneInventory(Inventory redstoneinv) {
        int[] slots = {10, 11, 12, 13, 14, 15, 16, 19, 20, 21, 22, 23, 24, 25, 28, 29, 30, 31, 32, 33, 34, 37, 38, 39, 40, 41, 42, 43};

        for (int i = 0; i < 28; i++) {
            String slotPrefix = "slot" + (i + 1);
            ItemStack item;
            List<String> itemLore = new ArrayList<>();

            itemLore.add("§f" + plugin.getRedstone().getString(slotPrefix + ".lore.1"));
            itemLore.add("");
            itemLore.add("§3§lBuy: §f" + formatCurrency(
                    plugin.getRedstone().getString(slotPrefix + ".price"),
                    plugin.getRedstone().getString(slotPrefix + ".currency")
            ));
            itemLore.add("§3§lSell: §4§lNOT SELLABLE");

            item = createItem("§2§l" + plugin.getRedstone().getString(slotPrefix + ".name"), Material.valueOf(plugin.getRedstone().getString(slotPrefix + ".material")), itemLore);
            redstoneinv.setItem(slots[i], item);
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
        return redstoneinv;
    }
}
