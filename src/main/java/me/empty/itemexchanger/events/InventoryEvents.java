package me.empty.itemexchanger.events;

import me.empty.itemexchanger.ItemExchanger;
import me.empty.itemexchanger.inventories.*;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.ClickType;
import org.bukkit.event.inventory.InventoryClickEvent;

import static me.empty.itemexchanger.inventories.ItemExchangerInventorySelection.replaceString;

public class InventoryEvents implements Listener {
    private final ItemExchanger plugin;
    public InventoryEvents(ItemExchanger plugin){
        this.plugin = plugin;
    }
    @EventHandler
    public void onClick(InventoryClickEvent event) {
        if (event.getClick() == ClickType.LEFT || event.getClick() == ClickType.RIGHT || event.getClick() == ClickType.SHIFT_LEFT || event.getClick() == ClickType.SHIFT_RIGHT || event.getClick() == ClickType.MIDDLE) {
            if (event.getInventory() == null) {
                return;
            }
            if (event.getClickedInventory().getHolder() instanceof ItemExchangerInventorySelection ||
                    event.getClickedInventory().getHolder() instanceof SpawnEggs ||
                    event.getClickedInventory().getHolder() instanceof Redstone ||
                    event.getClickedInventory().getHolder() instanceof Items ||
                    event.getClickedInventory().getHolder() instanceof Armor

            ) {
                event.setCancelled(true);
            }
            Player player = (Player) event.getWhoClicked();
            if (event.getCurrentItem() == null) {
                return;
            }
            if (event.getCurrentItem().getType() == Material.BARRIER &&
                    event.getClickedInventory().getHolder() instanceof ItemExchangerInventorySelection ||
                    event.getCurrentItem().getType() == Material.BARRIER && event.getClickedInventory().getHolder() instanceof SpawnEggs||
                    event.getCurrentItem().getType() == Material.BARRIER && event.getClickedInventory().getHolder() instanceof Redstone ||
                    event.getCurrentItem().getType() == Material.BARRIER && event.getClickedInventory().getHolder() instanceof Items||
                    event.getCurrentItem().getType() == Material.BARRIER && event.getClickedInventory().getHolder() instanceof Armor) {
                player.sendMessage(replaceString(plugin.getConfig().getString("message-config-closing")));
                player.closeInventory();
            }

            if (event.getCurrentItem().getType() == Material.ELDER_GUARDIAN_SPAWN_EGG && event.getClickedInventory().getHolder() instanceof ItemExchangerInventorySelection) {
                SpawnEggs eggs = new SpawnEggs(plugin);
                player.openInventory(eggs.getInventory());
            }

            if (event.getCurrentItem().getType() == Material.DISPENSER && event.getClickedInventory().getHolder() instanceof ItemExchangerInventorySelection) {
                Redstone redstone = new Redstone(plugin);
                player.openInventory(redstone.getInventory());
            }

            if (event.getCurrentItem().getType() == Material.IRON_CHESTPLATE && event.getClickedInventory().getHolder() instanceof ItemExchangerInventorySelection) {
                Armor armor = new Armor(plugin);
                player.openInventory(armor.getInventory());
            }

            if (event.getCurrentItem().getType() == Material.DIAMOND && event.getClickedInventory().getHolder() instanceof ItemExchangerInventorySelection) {
                Items items = new Items(plugin);
                player.openInventory(items.getInventory());
            }
        }
    }
}
