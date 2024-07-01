package me.empty.itemexchanger.events;

import me.empty.itemexchanger.ItemExchanger;
import me.empty.itemexchanger.inventories.ItemExchangerInventorySelection;
import me.empty.itemexchanger.inventories.SpawnEggs;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.ClickType;
import org.bukkit.event.inventory.InventoryClickEvent;

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
            if (event.getClickedInventory().getHolder() instanceof ItemExchangerInventorySelection
                    || event.getClickedInventory().getHolder() instanceof SpawnEggs
            ) {
                event.setCancelled(true);
            }
            Player player = (Player) event.getWhoClicked();
            if (event.getCurrentItem() == null) {
                return;
            }
            if (event.getCurrentItem().getType() == Material.BARRIER &&
                    event.getClickedInventory().getHolder() instanceof ItemExchangerInventorySelection ||
                    event.getCurrentItem().getType() == Material.BARRIER && event.getClickedInventory().getHolder() instanceof SpawnEggs) {
                player.sendMessage("§6[!] Closing item exchanger! [!]");
                player.closeInventory();
            }

            if (event.getCurrentItem().getType() == Material.ELDER_GUARDIAN_SPAWN_EGG && event.getClickedInventory().getHolder() instanceof ItemExchangerInventorySelection) {
                player.sendMessage("Test");
                SpawnEggs eggs = new SpawnEggs(plugin);
                player.openInventory(eggs.getInventory());
            }
        }
    }
}
