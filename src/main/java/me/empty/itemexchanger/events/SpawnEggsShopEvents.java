package me.empty.itemexchanger.events;

import me.empty.itemexchanger.ItemExchanger;
import me.empty.itemexchanger.inventories.SpawnEggs;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.ClickType;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.inventory.ItemStack;

public class SpawnEggsShopEvents implements Listener {
    private final ItemExchanger plugin;
    public SpawnEggsShopEvents(ItemExchanger plugin){
        this.plugin = plugin;
    }
    @EventHandler
    public void onClick(InventoryClickEvent event) {
        if (event.getClick() == ClickType.LEFT || event.getClick() == ClickType.RIGHT || event.getClick() == ClickType.SHIFT_LEFT || event.getClick() == ClickType.SHIFT_RIGHT || event.getClick() == ClickType.MIDDLE) {
            if (event.getInventory() == null) {
                return;
            }
            Player player = (Player) event.getWhoClicked();
            if (event.getCurrentItem() == null) {
                return;
            }

            if (event.getCurrentItem().getType() == Material.CREEPER_SPAWN_EGG && event.getClickedInventory().getHolder() instanceof SpawnEggs) {
                if (player.getInventory().contains(Material.GOLD_BLOCK,3)) {
                    player.getInventory().removeItem(new ItemStack(Material.GOLD_BLOCK, 3));
                    player.getInventory().addItem(new ItemStack(Material.CREEPER_SPAWN_EGG, 1));
                }
                else{
                    player.sendMessage("§6[!] Missing Items [!]");
                }
            }

            if (event.getCurrentItem().getType() == Material.WOLF_SPAWN_EGG && event.getClickedInventory().getHolder() instanceof SpawnEggs) {
                if (player.getInventory().contains(Material.GOLD_BLOCK,2)) {
                    player.getInventory().removeItem(new ItemStack(Material.GOLD_BLOCK, 2));
                    player.getInventory().addItem(new ItemStack(Material.WOLF_SPAWN_EGG, 1));
                }
                else{
                    player.sendMessage("§6[!] Missing Items [!]");
                }
            }

            if (event.getCurrentItem().getType() == Material.PHANTOM_SPAWN_EGG && event.getClickedInventory().getHolder() instanceof SpawnEggs) {
                if (player.getInventory().contains(Material.GOLD_BLOCK, 4)) {
                    player.getInventory().removeItem(new ItemStack(Material.GOLD_BLOCK, 4));
                    player.getInventory().addItem(new ItemStack(Material.PHANTOM_SPAWN_EGG, 1));
                } else {
                    player.sendMessage("§6[!] Missing Items [!]");
                }
            }

            if (event.getCurrentItem().getType() == Material.BLAZE_SPAWN_EGG && event.getClickedInventory().getHolder() instanceof SpawnEggs) {
                if (player.getInventory().contains(Material.GOLD_BLOCK, 5)) {
                    player.getInventory().removeItem(new ItemStack(Material.GOLD_BLOCK, 5));
                    player.getInventory().addItem(new ItemStack(Material.BLAZE_SPAWN_EGG, 1));
                } else {
                    player.sendMessage("§6[!] Missing Items [!]");
                }
            }

            if (event.getCurrentItem().getType() == Material.GUARDIAN_SPAWN_EGG && event.getClickedInventory().getHolder() instanceof SpawnEggs) {
                if (player.getInventory().contains(Material.GOLD_BLOCK, 3)) {
                    player.getInventory().removeItem(new ItemStack(Material.GOLD_BLOCK, 3));
                    player.getInventory().addItem(new ItemStack(Material.GUARDIAN_SPAWN_EGG, 1));
                } else {
                    player.sendMessage("§6[!] Missing Items [!]");
                }
            }

            if (event.getCurrentItem().getType() == Material.ZOMBIE_VILLAGER_SPAWN_EGG && event.getClickedInventory().getHolder() instanceof SpawnEggs) {
                if (player.getInventory().contains(Material.GOLD_BLOCK, 2)) {
                    player.getInventory().removeItem(new ItemStack(Material.GOLD_BLOCK, 2));
                    player.getInventory().addItem(new ItemStack(Material.ZOMBIE_VILLAGER_SPAWN_EGG, 1));
                } else {
                    player.sendMessage("§6[!] Missing Items [!]");
                }
            }

            if (event.getCurrentItem().getType() == Material.BEE_SPAWN_EGG && event.getClickedInventory().getHolder() instanceof SpawnEggs) {
                if (player.getInventory().contains(Material.GOLD_BLOCK, 3)) {
                    player.getInventory().removeItem(new ItemStack(Material.GOLD_BLOCK, 3));
                    player.getInventory().addItem(new ItemStack(Material.BEE_SPAWN_EGG, 1));
                } else {
                    player.sendMessage("§6[!] Missing Items [!]");
                }
            }

        }
    }
}

