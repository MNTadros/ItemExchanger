package me.empty.itemexchanger.events;

import me.empty.itemexchanger.ItemExchanger;
import me.empty.itemexchanger.inventories.Items;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.ClickType;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.inventory.ItemStack;

import static me.empty.itemexchanger.inventories.ItemExchangerInventorySelection.replaceString;

public class ItemsShopEvents implements Listener {
    private final ItemExchanger plugin;

    public ItemsShopEvents(ItemExchanger plugin) {
        this.plugin = plugin;
    }

    @EventHandler
    public void onClick(InventoryClickEvent event) {
        if (event.getClick() == ClickType.LEFT || event.getClick() == ClickType.RIGHT ||
                event.getClick() == ClickType.SHIFT_LEFT || event.getClick() == ClickType.SHIFT_RIGHT ||
                event.getClick() == ClickType.MIDDLE) {
            if (event.getInventory() == null || event.getCurrentItem() == null) {
                return;
            }

            Player player = (Player) event.getWhoClicked();
            ItemStack currentItem = event.getCurrentItem();

            if (event.getClickedInventory().getHolder() instanceof Items) {
                for (int i = 1; i <= 28; i++) { // Loop through all armor slots defined in your YAML file
                    String slotPrefix = "slot" + i;
                    String materialKey = plugin.getItems().getString(slotPrefix + ".material");
                    String currencyKey = plugin.getItems().getString(slotPrefix + ".currency");
                    int price = plugin.getItems().getInt(slotPrefix + ".price");

                    if (currentItem.getType() == Material.valueOf(materialKey)) {
                        if (player.getInventory().contains(Material.valueOf(currencyKey), price)) {
                            player.getInventory().removeItem(new ItemStack(Material.valueOf(currencyKey), price));
                            player.getInventory().addItem(new ItemStack(Material.valueOf(materialKey), 1));
                        } else {
                            player.sendMessage(replaceString(plugin.getConfig().getString("message-config-missingitems")));
                        }
                        break;
                    }
                }
            }
        }
    }
}
