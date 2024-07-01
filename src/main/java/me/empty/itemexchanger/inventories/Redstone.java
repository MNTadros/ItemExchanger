package me.empty.itemexchanger.inventories;

import me.empty.itemexchanger.ItemExchanger;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.InventoryHolder;
import org.bukkit.inventory.ItemStack;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static me.empty.itemexchanger.inventories.ItemExchangerInventorySelection.*;

public class Redstone implements InventoryHolder {

    public static Inventory redstoneinv;
    private final ItemExchanger plugin;

    public Redstone(ItemExchanger plugin){
    this.plugin = plugin;
    redstoneinv = Bukkit.createInventory(this,54,"§4§lRedstone");
    setOuterLayer(redstoneinv,ItemExchangerInventorySelection.glasspane);
    RedstoneExchangeable();
    init();
    }

    private void init(){
        ItemStack item;

        List<String> lore = new ArrayList<>();
        lore.add("§cClick this to close the selection");
        item = createItem("§c§lClose selection", Material.BARRIER,lore);
        redstoneinv.setItem(49,item);
    }
    public void RedstoneExchangeable() {
        ItemStack slot1;
        List<String> slot1lore = new ArrayList<>();
        slot1lore.add("§fBasic redstone component");
        slot1lore.add("");
        slot1lore.add("§3§lBuy: §f2 Iron Nuggets");
        slot1lore.add("§3§lSell: §4§lNOT SELLABLE");
        slot1 = createItem("§2§lRedstone Dust", Material.REDSTONE, slot1lore);
        redstoneinv.setItem(10, slot1);
// Slot 2: Redstone Torch
        ItemStack slot2;
        List<String> slot2lore = new ArrayList<>();
        slot2lore.add("§fA basic light source and signal transmitter");
        slot2lore.add("");
        slot2lore.add("§3§lBuy: §f2 Iron Nuggets");
        slot2lore.add("§3§lSell: §4§lNOT SELLABLE");
        slot2 = createItem("§2§lRedstone Torch", Material.REDSTONE_TORCH, slot2lore);
        redstoneinv.setItem(11, slot2);

// Slot 3: Redstone Block
        ItemStack slot3;
        List<String> slot3lore = new ArrayList<>();
        slot3lore.add("§fCompact storage and power source");
        slot3lore.add("");
        slot3lore.add("§3§lBuy: §f2 Iron Ingots");
        slot3lore.add("§3§lSell: §4§lNOT SELLABLE");
        slot3 = createItem("§2§lRedstone Block", Material.REDSTONE_BLOCK, slot3lore);
        redstoneinv.setItem(12, slot3);

// Slot 4: Redstone Repeater
        ItemStack slot4;
        List<String> slot4lore = new ArrayList<>();
        slot4lore.add("§fExtends redstone signals");
        slot4lore.add("");
        slot4lore.add("§3§lBuy: §f4 Iron Nuggets");
        slot4lore.add("§3§lSell: §4§lNOT SELLABLE");
        slot4 = createItem("§2§lRedstone Repeater", Material.REPEATER, slot4lore);
        redstoneinv.setItem(13, slot4);

// Slot 5: Redstone Comparator
        ItemStack slot5;
        List<String> slot5lore = new ArrayList<>();
        slot5lore.add("§fCompares redstone signals");
        slot5lore.add("");
        slot5lore.add("§3§lBuy: §f6 Iron Nuggets");
        slot5lore.add("§3§lSell: §4§lNOT SELLABLE");
        slot5 = createItem("§2§lRedstone Comparator", Material.COMPARATOR, slot5lore);
        redstoneinv.setItem(14, slot5);

// Slot 6: Lever
        ItemStack slot6;
        List<String> slot6lore = new ArrayList<>();
        slot6lore.add("§fSimple on/off switch");
        slot6lore.add("");
        slot6lore.add("§3§lBuy: §f2 Iron Nuggets");
        slot6lore.add("§3§lSell: §4§lNOT SELLABLE");
        slot6 = createItem("§2§lLever", Material.LEVER, slot6lore);
        redstoneinv.setItem(15, slot6);

// Slot 7: Button (Stone)
        ItemStack slot7;
        List<String> slot7lore = new ArrayList<>();
        slot7lore.add("§fTemporary power switch");
        slot7lore.add("");
        slot7lore.add("§3§lBuy: §f2 Iron Nuggets");
        slot7lore.add("§3§lSell: §4§lNOT SELLABLE");
        slot7 = createItem("§2§lButton (Stone)", Material.STONE_BUTTON, slot7lore);
        redstoneinv.setItem(16, slot7);

// Slot 8: Button (Wood)
        ItemStack slot8;
        List<String> slot8lore = new ArrayList<>();
        slot8lore.add("§fTemporary power switch");
        slot8lore.add("");
        slot8lore.add("§3§lBuy: §f2 Iron Nuggets");
        slot8lore.add("§3§lSell: §4§lNOT SELLABLE");
        slot8 = createItem("§2§lButton (Wood)", Material.OAK_BUTTON, slot8lore);
        redstoneinv.setItem(19, slot8);

// Slot 9: Pressure Plate (Stone)
        ItemStack slot9;
        List<String> slot9lore = new ArrayList<>();
        slot9lore.add("§fTrigger power with weight");
        slot9lore.add("");
        slot9lore.add("§3§lBuy: §f3 Iron Nuggets");
        slot9lore.add("§3§lSell: §4§lNOT SELLABLE");
        slot9 = createItem("§2§lPressure Plate (Stone)", Material.STONE_PRESSURE_PLATE, slot9lore);
        redstoneinv.setItem(20, slot9);

// Slot 10: Pressure Plate (Wood)
        ItemStack slot10;
        List<String> slot10lore = new ArrayList<>();
        slot10lore.add("§fTrigger power with weight");
        slot10lore.add("");
        slot10lore.add("§3§lBuy: §f3 Iron Nuggets");
        slot10lore.add("§3§lSell: §4§lNOT SELLABLE");
        slot10 = createItem("§2§lPressure Plate (Wood)", Material.OAK_PRESSURE_PLATE, slot10lore);
        redstoneinv.setItem(21, slot10);

// Slot 11: Iron Door
        ItemStack slot11;
        List<String> slot11lore = new ArrayList<>();
        slot11lore.add("§fA sturdy door for security");
        slot11lore.add("");
        slot11lore.add("§3§lBuy: §f3 Iron Ingots");
        slot11lore.add("§3§lSell: §4§lNOT SELLABLE");
        slot11 = createItem("§2§lIron Door", Material.IRON_DOOR, slot11lore);
        redstoneinv.setItem(22, slot11);

// Slot 12: Wooden Door
        ItemStack slot12;
        List<String> slot12lore = new ArrayList<>();
        slot12lore.add("§fA simple wooden door");
        slot12lore.add("");
        slot12lore.add("§3§lBuy: §f2 Iron Nuggets");
        slot12lore.add("§3§lSell: §4§lNOT SELLABLE");
        slot12 = createItem("§2§lWooden Door", Material.OAK_DOOR, slot12lore);
        redstoneinv.setItem(23, slot12);

//// Slot 13: Piston
        ItemStack slot13;
        List<String> slot13lore = new ArrayList<>();
        slot13lore.add("§fA pushing mechanism");
        slot13lore.add("");
        slot13lore.add("§3§lBuy: §f2 Iron Ingots");
        slot13lore.add("§3§lSell: §4§lNOT SELLABLE");
        slot13 = createItem("§2§lPiston", Material.PISTON, slot13lore);
        redstoneinv.setItem(24, slot13);

//// Slot 14: Sticky Piston
        ItemStack slot14;
        List<String> slot14lore = new ArrayList<>();
        slot14lore.add("§fA pulling mechanism with adhesive");
        slot14lore.add("");
        slot14lore.add("§3§lBuy: §f3 Iron Ingots");
        slot14lore.add("§3§lSell: §4§lNOT SELLABLE");
        slot14 = createItem("§2§lSticky Piston", Material.STICKY_PISTON, slot14lore);
        redstoneinv.setItem(25, slot14);

// Slot 15: Observer
        ItemStack slot15;
        List<String> slot15lore = new ArrayList<>();
        slot15lore.add("§fDetects block changes");
        slot15lore.add("");
        slot15lore.add("§3§lBuy: §f3 Iron Ingots");
        slot15lore.add("§3§lSell: §4§lNOT SELLABLE");
        slot15 = createItem("§2§lObserver", Material.OBSERVER, slot15lore);
        redstoneinv.setItem(28, slot15);

// Slot 16: Dropper
        ItemStack slot16;
        List<String> slot16lore = new ArrayList<>();
        slot16lore.add("§fDrops items upon activation");
        slot16lore.add("");
        slot16lore.add("§3§lBuy: §f2 Iron Ingots");
        slot16lore.add("§3§lSell: §4§lNOT SELLABLE");
        slot16 = createItem("§2§lDropper", Material.DROPPER, slot16lore);
        redstoneinv.setItem(29, slot16);

// Slot 17: Dispenser
        ItemStack slot17;
        List<String> slot17lore = new ArrayList<>();
        slot17lore.add("§fShoots items upon activation");
        slot17lore.add("");
        slot17lore.add("§3§lBuy: §f3 Iron Ingots");
        slot17lore.add("§3§lSell: §4§lNOT SELLABLE");
        slot17 = createItem("§2§lDispenser", Material.DISPENSER, slot17lore);
        redstoneinv.setItem(30, slot17);

// Slot 18: Hopper
        ItemStack slot18;
        List<String> slot18lore = new ArrayList<>();
        slot18lore.add("§fTransfers items");
        slot18lore.add("");
        slot18lore.add("§3§lBuy: §f4 Iron Ingots");
        slot18lore.add("§3§lSell: §4§lNOT SELLABLE");
        slot18 = createItem("§2§lHopper", Material.HOPPER, slot18lore);
        redstoneinv.setItem(31, slot18);

// Slot 19: Note Block
        ItemStack slot19;
        List<String> slot19lore = new ArrayList<>();
        slot19lore.add("§fPlays musical notes");
        slot19lore.add("");
        slot19lore.add("§3§lBuy: §f3 Iron Nuggets");
        slot19lore.add("§3§lSell: §4§lNOT SELLABLE");
        slot19 = createItem("§2§lNote Block", Material.NOTE_BLOCK, slot19lore);
        redstoneinv.setItem(32, slot19);

// Slot 20: Jukebox
        ItemStack slot20;
        List<String> slot20lore = new ArrayList<>();
        slot20lore.add("§fPlays music discs");
        slot20lore.add("");
        slot20lore.add("§3§lBuy: §f2 Gold Nuggets");
        slot20lore.add("§3§lSell: §4§lNOT SELLABLE");
        slot20 = createItem("§2§lJukebox", Material.JUKEBOX, slot20lore);
        redstoneinv.setItem(33, slot20);

// Slot 21: Daylight Sensor
        ItemStack slot21;
        List<String> slot21lore = new ArrayList<>();
        slot21lore.add("§fDetects daylight");
        slot21lore.add("");
        slot21lore.add("§3§lBuy: §f4 Iron Nuggets");
        slot21lore.add("§3§lSell: §4§lNOT SELLABLE");
        slot21 = createItem("§2§lDaylight Sensor", Material.DAYLIGHT_DETECTOR, slot21lore);
        redstoneinv.setItem(34, slot21);

// Slot 22: Iron Trapdoor
        ItemStack slot22;
        List<String> slot22lore = new ArrayList<>();
        slot22lore.add("§fA sturdy trapdoor");
        slot22lore.add("");
        slot22lore.add("§3§lBuy: §f3 Iron Ingots");
        slot22lore.add("§3§lSell: §4§lNOT SELLABLE");
        slot22 = createItem("§2§lIron Trapdoor", Material.IRON_TRAPDOOR, slot22lore);
        redstoneinv.setItem(37, slot22);

// Slot 23: Wooden Trapdoor
        ItemStack slot23;
        List<String> slot23lore = new ArrayList<>();
        slot23lore.add("§fA simple wooden trapdoor");
        slot23lore.add("");
        slot23lore.add("§3§lBuy: §f2 Iron Nuggets");
        slot23lore.add("§3§lSell: §4§lNOT SELLABLE");
        slot23 = createItem("§2§lWooden Trapdoor", Material.OAK_TRAPDOOR, slot23lore);
        redstoneinv.setItem(38, slot23);

// Slot 24: Tripwire Hook
        ItemStack slot24;
        List<String> slot24lore = new ArrayList<>();
        slot24lore.add("§fActivates redstone with string");
        slot24lore.add("");
        slot24lore.add("§3§lBuy: §f2 Iron Nuggets");
        slot24lore.add("§3§lSell: §4§lNOT SELLABLE");
        slot24 = createItem("§2§lTripwire Hook", Material.TRIPWIRE_HOOK, slot24lore);
        redstoneinv.setItem(39, slot24);

// Slot 25: Redstone Lamp
        ItemStack slot25;
        List<String> slot25lore = new ArrayList<>();
        slot25lore.add("§fEmits light when powered");
        slot25lore.add("");
        slot25lore.add("§3§lBuy: §f2 Gold Ingots");
        slot25lore.add("§3§lSell: §4§lNOT SELLABLE");
        slot25 = createItem("§2§lRedstone Lamp", Material.REDSTONE_LAMP, slot25lore);
        redstoneinv.setItem(40, slot25);

// Slot 26: Target
        ItemStack slot26;
        List<String> slot26lore = new ArrayList<>();
        slot26lore.add("§fEmits redstone signal when hit");
        slot26lore.add("");
        slot26lore.add("§3§lBuy: §f3 Iron Nuggets");
        slot26lore.add("§3§lSell: §4§lNOT SELLABLE");
        slot26 = createItem("§2§lTarget", Material.TARGET, slot26lore);
        redstoneinv.setItem(41, slot26);

// Slot 27: Minecart with Hopper
        ItemStack slot27;
        List<String> slot27lore = new ArrayList<>();
        slot27lore.add("§fTransfers items in motion");
        slot27lore.add("");
        slot27lore.add("§3§lBuy: §f5 Iron Ingots");
        slot27lore.add("§3§lSell: §4§lNOT SELLABLE");
        slot27 = createItem("§2§lMinecart with Hopper", Material.HOPPER_MINECART, slot27lore);
        redstoneinv.setItem(42, slot27);

// Slot 28: Minecart with TNT
        ItemStack slot28;
        List<String> slot28lore = new ArrayList<>();
        slot28lore.add("§fExplosive minecart");
        slot28lore.add("");
        slot28lore.add("§3§lBuy: §f4 Iron Ingots");
        slot28lore.add("§3§lSell: §4§lNOT SELLABLE");
        slot28 = createItem("§2§lMinecart with TNT", Material.TNT_MINECART, slot28lore);
        redstoneinv.setItem(43, slot28);

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
