package me.empty.itemexchanger.inventories;

import me.empty.itemexchanger.ItemExchanger;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.InventoryHolder;
import org.bukkit.inventory.ItemStack;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.ArrayList;
import java.util.List;

import static me.empty.itemexchanger.inventories.ItemExchangerInventorySelection.createItem;

public class Redstone implements InventoryHolder {

    public static Inventory redstoneinv;
    private final ItemExchanger plugin;

    public Redstone(ItemExchanger plugin){
            this.plugin = plugin;
            redstoneinv = Bukkit.createInventory(this,54,"§4§lRedstone");
            RedstoneExchangeable();
            init();
        }

        private void init(){
            ItemStack item;
            item = createItem("§7", Material.LIME_STAINED_GLASS,null);
            for (int i = 0; i < 10;i++){
                redstoneinv.setItem(i,item);
            }
            redstoneinv.setItem(17,item);
            for (int i = 18; i < 27;i++){
                redstoneinv.setItem(i,item);
            }
            List<String> lore = new ArrayList<>();
            lore.add("§cClick this to close the selection");
            item = createItem("§c§lClose selection", Material.BARRIER,lore);
            redstoneinv.setItem(22,item);
        }
        public void RedstoneExchangeable() {

        }

        @Override
        public Inventory getInventory() {
            return redstoneinv;
        }
    }
