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

public class Armor implements InventoryHolder {
    private final ItemExchanger plugin;
    public static Inventory armorinv;

    public Armor(ItemExchanger plugin){
        this.plugin = plugin;
        init();
        armorinv = Bukkit.createInventory(this,54,"§6§lArmor");
    }
    private void init(){
        ItemStack item;
        item = createItem("§7", Material.LIME_STAINED_GLASS,null);
        for (int i = 0; i < 10;i++){
            armorinv.setItem(i,item);
        }
        armorinv.setItem(17,item);
        for (int i = 18; i < 27;i++){
            armorinv.setItem(i,item);
        }
        List<String> lore = new ArrayList<>();
        lore.add("§cClick this to close the selection");
        item = createItem("§c§lClose selection", Material.BARRIER,lore);
        armorinv.setItem(22,item);
    }

    @Override
    public Inventory getInventory() {
        return armorinv;
    }
}
