package me.empty.itemexchanger.inventories;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.InventoryHolder;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ItemExchangerInventorySelection implements InventoryHolder {
    public Inventory maininv;

    public ItemExchangerInventorySelection(){
        maininv = Bukkit.createInventory(this,27,"§6§lItem Exchanger");
        init();
        initSelection();
    }

    private void init(){
        ItemStack item;
        //left
        for (int i = 0; i < 10;i++){
            item = createItem("§7", Material.LIME_STAINED_GLASS_PANE,null);
            maininv.setItem(i,item);
        }
        item = createItem("§7", Material.LIME_STAINED_GLASS_PANE,null);
        maininv.setItem(17,item);
        maininv.setItem(11,item);
        maininv.setItem(13,item);
        maininv.setItem(15,item);


        for (int i = 18; i < 27;i++){
            item = createItem("§7", Material.LIME_STAINED_GLASS_PANE,null);
            maininv.setItem(i,item);
        }
        List<String> lore = new ArrayList<>();
        lore.add("§cClick this to close the selection");
        item = createItem("§c§lClose selection", Material.BARRIER,lore);
        maininv.setItem(22,item);

    }
    void initSelection(){
        ItemStack slot1;
        List<String> slot1lore = new ArrayList<>();
        slot1lore.add("§fExchange items for other items");
        slot1lore.add("§fmake sure to have space in your");
        slot1lore.add("§finventory when purchasing!");
        slot1lore.add("");
        slot1lore.add("§3§l► §fOres");
        slot1lore.add("§3§l► §fRare Blocks");

        slot1 = createItem("§3§lItems", Material.DIAMOND,slot1lore);
        maininv.setItem(10,slot1);

        ItemStack slot2;
        List<String> slot2lore = new ArrayList<>();
        slot2lore.add("§fExchange items for armor");
        slot2lore.add("§fmake sure to have space in your");
        slot2lore.add("§finventory when purchasing!");
        slot2lore.add("");
        slot2lore.add("§f§l► §fDefault Armor");
        slot2lore.add("§f§l► §fCustom Armor");
        slot2 = createItem("§f§lArmor", Material.IRON_CHESTPLATE,slot2lore);
        maininv.setItem(12,slot2);

        ItemStack slot3;
        List<String> slot3lore = new ArrayList<>();
        slot3lore.add("§fExchange items for spawn eggs");
        slot3lore.add("§fmake sure to have space in your");
        slot3lore.add("§finventory when purchasing!");
        slot3lore.add("");
        slot3lore.add("§a► §fHostile mob spawn eggs");
        slot3lore.add("§a► §fPassive mob spawn eggs");
        slot3 = createItem("§a§lSpawn Eggs", Material.ELDER_GUARDIAN_SPAWN_EGG,slot3lore);
        maininv.setItem(14,slot3);

        ItemStack slot4;
        List<String> slot4lore = new ArrayList<>();
        slot4lore.add("§fExchange items for redstone components");
        slot4lore.add("§fmake sure to have space in your");
        slot4lore.add("§finventory when purchasing!");
        slot4lore.add("");
        slot4lore.add("§c► §fPistons");
        slot4lore.add("§c► §fDispensers");
        slot4 = createItem("§c§lRedstone", Material.DISPENSER,slot4lore);
        maininv.setItem(16,slot4);

    }

    public static ItemStack createItem(String name, Material mat, List<String> lore){
        ItemStack item = new ItemStack(mat,1);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName(name);
        meta.setLore(lore);
        meta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
        item.setItemMeta(meta);
        return item;
    }

    public static String formatCurrency(String price, String currency) {
        return price + " " + Arrays.stream(currency.split("_"))
                .map(word -> word.substring(0, 1).toUpperCase() + word.substring(1).toLowerCase())
                .collect(Collectors.joining(" "));
    }

    public static String replaceString(String input) {
        return input.replace("&", "\u00A7");
    }

    @Override
    public Inventory getInventory() {
        return maininv;
    }
    static ItemStack glasspane = createItem("§7", Material.LIME_STAINED_GLASS_PANE,null);
}
