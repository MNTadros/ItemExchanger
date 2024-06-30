package me.empty.itemexchanger.inventories;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.InventoryHolder;
import org.bukkit.inventory.ItemStack;

import java.util.ArrayList;
import java.util.List;

public class SpawnEggs implements InventoryHolder {

    public static Inventory eggsinv;

    public SpawnEggs(){
        eggsinv = Bukkit.createInventory(this,27,"§a§lSpawn Eggs");
        init();
    }

    private void init(){
        ItemStack item;
        //left
        for (int i = 0; i < 10;i++){
            item = ItemExchangerInventorySelection.createItem("§7", Material.LIME_STAINED_GLASS,null);
            eggsinv.setItem(i,item);
        }
        item = ItemExchangerInventorySelection.createItem("§7", Material.LIME_STAINED_GLASS,null);
        eggsinv.setItem(17,item);
        eggsinv.setItem(11,item);
        eggsinv.setItem(13,item);
        eggsinv.setItem(15,item);


        for (int i = 18; i < 27;i++){
            item = ItemExchangerInventorySelection.createItem("§7", Material.LIME_STAINED_GLASS,null);
            eggsinv.setItem(i,item);
        }
        List<String> lore = new ArrayList<>();
        lore.add("§cClick this to close the selection");
        item = ItemExchangerInventorySelection.createItem("§c§lClose selection", Material.BARRIER,lore);
        eggsinv.setItem(22,item);

    }


    @Override
    public Inventory getInventory() {
        return null;
    }
}
