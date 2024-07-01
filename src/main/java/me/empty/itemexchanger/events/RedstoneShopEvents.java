package me.empty.itemexchanger.events;

import me.empty.itemexchanger.ItemExchanger;
import me.empty.itemexchanger.inventories.Redstone;
import me.empty.itemexchanger.inventories.SpawnEggs;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.ClickType;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.inventory.ItemStack;

public class RedstoneShopEvents implements Listener {
    private final ItemExchanger plugin;
    public RedstoneShopEvents(ItemExchanger plugin){
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

            if (event.getCurrentItem().getType() == Material.REDSTONE && event.getClickedInventory().getHolder() instanceof Redstone) {
                if (player.getInventory().contains(Material.IRON_NUGGET, 2)) {
                    player.getInventory().removeItem(new ItemStack(Material.IRON_NUGGET, 2));
                    player.getInventory().addItem(new ItemStack(Material.REDSTONE, 1));
                } else {
                    player.sendMessage("§6[!] Missing Items [!]");
                }
            }

            if (event.getCurrentItem().getType() == Material.REDSTONE_TORCH && event.getClickedInventory().getHolder() instanceof Redstone) {
                if (player.getInventory().contains(Material.IRON_NUGGET, 2)) {
                    player.getInventory().removeItem(new ItemStack(Material.IRON_NUGGET, 2));
                    player.getInventory().addItem(new ItemStack(Material.REDSTONE_TORCH, 1));
                } else {
                    player.sendMessage("§6[!] Missing Items [!]");
                }
            }

            if (event.getCurrentItem().getType() == Material.REDSTONE_BLOCK && event.getClickedInventory().getHolder() instanceof Redstone) {
                if (player.getInventory().contains(Material.IRON_INGOT, 2)) {
                    player.getInventory().removeItem(new ItemStack(Material.IRON_INGOT, 2));
                    player.getInventory().addItem(new ItemStack(Material.REDSTONE_BLOCK, 1));
                } else {
                    player.sendMessage("§6[!] Missing Items [!]");
                }
            }

            if (event.getCurrentItem().getType() == Material.REPEATER && event.getClickedInventory().getHolder() instanceof Redstone) {
                if (player.getInventory().contains(Material.IRON_NUGGET, 4)) {
                    player.getInventory().removeItem(new ItemStack(Material.IRON_NUGGET, 4));
                    player.getInventory().addItem(new ItemStack(Material.REPEATER, 1));
                } else {
                    player.sendMessage("§6[!] Missing Items [!]");
                }
            }

            if (event.getCurrentItem().getType() == Material.COMPARATOR && event.getClickedInventory().getHolder() instanceof Redstone) {
                if (player.getInventory().contains(Material.IRON_NUGGET, 6)) {
                    player.getInventory().removeItem(new ItemStack(Material.IRON_NUGGET, 6));
                    player.getInventory().addItem(new ItemStack(Material.COMPARATOR, 1));
                } else {
                    player.sendMessage("§6[!] Missing Items [!]");
                }
            }

            if (event.getCurrentItem().getType() == Material.LEVER && event.getClickedInventory().getHolder() instanceof Redstone) {
                if (player.getInventory().contains(Material.IRON_NUGGET, 2)) {
                    player.getInventory().removeItem(new ItemStack(Material.IRON_NUGGET, 2));
                    player.getInventory().addItem(new ItemStack(Material.LEVER, 1));
                } else {
                    player.sendMessage("§6[!] Missing Items [!]");
                }
            }

// Slot 7: Button (Stone)
            if (event.getCurrentItem().getType() == Material.STONE_BUTTON && event.getClickedInventory().getHolder() instanceof Redstone) {
                if (player.getInventory().contains(Material.IRON_NUGGET, 2)) {
                    player.getInventory().removeItem(new ItemStack(Material.IRON_NUGGET, 2));
                    player.getInventory().addItem(new ItemStack(Material.STONE_BUTTON, 1));
                } else {
                    player.sendMessage("§6[!] Missing Items [!]");
                }
            }

// Slot 8: Button (Wood)
            if (event.getCurrentItem().getType() == Material.OAK_BUTTON && event.getClickedInventory().getHolder() instanceof Redstone) {
                if (player.getInventory().contains(Material.IRON_NUGGET, 2)) {
                    player.getInventory().removeItem(new ItemStack(Material.IRON_NUGGET, 2));
                    player.getInventory().addItem(new ItemStack(Material.OAK_BUTTON, 1));
                } else {
                    player.sendMessage("§6[!] Missing Items [!]");
                }
            }

// Slot 9: Pressure Plate (Stone)
            if (event.getCurrentItem().getType() == Material.STONE_PRESSURE_PLATE && event.getClickedInventory().getHolder() instanceof Redstone) {
                if (player.getInventory().contains(Material.IRON_NUGGET, 3)) {
                    player.getInventory().removeItem(new ItemStack(Material.IRON_NUGGET, 3));
                    player.getInventory().addItem(new ItemStack(Material.STONE_PRESSURE_PLATE, 1));
                } else {
                    player.sendMessage("§6[!] Missing Items [!]");
                }
            }

// Slot 10: Pressure Plate (Wood)
            if (event.getCurrentItem().getType() == Material.OAK_PRESSURE_PLATE && event.getClickedInventory().getHolder() instanceof Redstone) {
                if (player.getInventory().contains(Material.IRON_NUGGET, 3)) {
                    player.getInventory().removeItem(new ItemStack(Material.IRON_NUGGET, 3));
                    player.getInventory().addItem(new ItemStack(Material.OAK_PRESSURE_PLATE, 1));
                } else {
                    player.sendMessage("§6[!] Missing Items [!]");
                }
            }

// Slot 11: Iron Door
            if (event.getCurrentItem().getType() == Material.IRON_DOOR && event.getClickedInventory().getHolder() instanceof Redstone) {
                if (player.getInventory().contains(Material.IRON_INGOT, 3)) {
                    player.getInventory().removeItem(new ItemStack(Material.IRON_INGOT, 3));
                    player.getInventory().addItem(new ItemStack(Material.IRON_DOOR, 1));
                } else {
                    player.sendMessage("§6[!] Missing Items [!]");
                }
            }

// Slot 12: Wooden Door
            if (event.getCurrentItem().getType() == Material.OAK_DOOR && event.getClickedInventory().getHolder() instanceof Redstone) {
                if (player.getInventory().contains(Material.IRON_NUGGET, 2)) {
                    player.getInventory().removeItem(new ItemStack(Material.IRON_NUGGET, 2));
                    player.getInventory().addItem(new ItemStack(Material.OAK_DOOR, 1));
                } else {
                    player.sendMessage("§6[!] Missing Items [!]");
                }
            }

// Slot 13: Piston
            if (event.getCurrentItem().getType() == Material.PISTON && event.getClickedInventory().getHolder() instanceof Redstone) {
                if (player.getInventory().contains(Material.IRON_INGOT, 2)) {
                    player.getInventory().removeItem(new ItemStack(Material.IRON_INGOT, 2));
                    player.getInventory().addItem(new ItemStack(Material.PISTON, 1));
                } else {
                    player.sendMessage("§6[!] Missing Items [!]");
                }
            }

// Slot 14: Sticky Piston
            if (event.getCurrentItem().getType() == Material.STICKY_PISTON && event.getClickedInventory().getHolder() instanceof Redstone) {
                if (player.getInventory().contains(Material.IRON_INGOT, 3)) {
                    player.getInventory().removeItem(new ItemStack(Material.IRON_INGOT, 3));
                    player.getInventory().addItem(new ItemStack(Material.STICKY_PISTON, 1));
                } else {
                    player.sendMessage("§6[!] Missing Items [!]");
                }
            }

// Slot 15: Observer
            if (event.getCurrentItem().getType() == Material.OBSERVER && event.getClickedInventory().getHolder() instanceof Redstone) {
                if (player.getInventory().contains(Material.IRON_INGOT, 3)) {
                    player.getInventory().removeItem(new ItemStack(Material.IRON_INGOT, 3));
                    player.getInventory().addItem(new ItemStack(Material.OBSERVER, 1));
                } else {
                    player.sendMessage("§6[!] Missing Items [!]");
                }
            }

// Slot 16: Dropper
            if (event.getCurrentItem().getType() == Material.DROPPER && event.getClickedInventory().getHolder() instanceof Redstone) {
                if (player.getInventory().contains(Material.IRON_INGOT, 2)) {
                    player.getInventory().removeItem(new ItemStack(Material.IRON_INGOT, 2));
                    player.getInventory().addItem(new ItemStack(Material.DROPPER, 1));
                } else {
                    player.sendMessage("§6[!] Missing Items [!]");
                }
            }

// Slot 17: Dispenser
            if (event.getCurrentItem().getType() == Material.DISPENSER && event.getClickedInventory().getHolder() instanceof Redstone) {
                if (player.getInventory().contains(Material.IRON_INGOT, 3)) {
                    player.getInventory().removeItem(new ItemStack(Material.IRON_INGOT, 3));
                    player.getInventory().addItem(new ItemStack(Material.DISPENSER, 1));
                } else {
                    player.sendMessage("§6[!] Missing Items [!]");
                }
            }

// Slot 18: Hopper
            if (event.getCurrentItem().getType() == Material.HOPPER && event.getClickedInventory().getHolder() instanceof Redstone) {
                if (player.getInventory().contains(Material.IRON_INGOT, 4)) {
                    player.getInventory().removeItem(new ItemStack(Material.IRON_INGOT, 4));
                    player.getInventory().addItem(new ItemStack(Material.HOPPER, 1));
                } else {
                    player.sendMessage("§6[!] Missing Items [!]");
                }
            }

// Slot 19: Note Block
            if (event.getCurrentItem().getType() == Material.NOTE_BLOCK && event.getClickedInventory().getHolder() instanceof Redstone) {
                if (player.getInventory().contains(Material.IRON_NUGGET, 3)) {
                    player.getInventory().removeItem(new ItemStack(Material.IRON_NUGGET, 3));
                    player.getInventory().addItem(new ItemStack(Material.NOTE_BLOCK, 1));
                } else {
                    player.sendMessage("§6[!] Missing Items [!]");
                }
            }

// Slot 20: Jukebox
            if (event.getCurrentItem().getType() == Material.JUKEBOX && event.getClickedInventory().getHolder() instanceof Redstone) {
                if (player.getInventory().contains(Material.GOLD_NUGGET, 2)) {
                    player.getInventory().removeItem(new ItemStack(Material.GOLD_NUGGET, 2));
                    player.getInventory().addItem(new ItemStack(Material.JUKEBOX, 1));
                } else {
                    player.sendMessage("§6[!] Missing Items [!]");
                }
            }

// Slot 21: Daylight Sensor
            if (event.getCurrentItem().getType() == Material.DAYLIGHT_DETECTOR && event.getClickedInventory().getHolder() instanceof Redstone) {
                if (player.getInventory().contains(Material.IRON_NUGGET, 4)) {
                    player.getInventory().removeItem(new ItemStack(Material.IRON_NUGGET, 4));
                    player.getInventory().addItem(new ItemStack(Material.DAYLIGHT_DETECTOR, 1));
                } else {
                    player.sendMessage("§6[!] Missing Items [!]");
                }
            }

// Slot 22: Iron Trapdoor
            if (event.getCurrentItem().getType() == Material.IRON_TRAPDOOR && event.getClickedInventory().getHolder() instanceof Redstone) {
                if (player.getInventory().contains(Material.IRON_INGOT, 3)) {
                    player.getInventory().removeItem(new ItemStack(Material.IRON_INGOT, 3));
                    player.getInventory().addItem(new ItemStack(Material.IRON_TRAPDOOR, 1));
                } else {
                    player.sendMessage("§6[!] Missing Items [!]");
                }
            }

// Slot 23: Wooden Trapdoor
            if (event.getCurrentItem().getType() == Material.OAK_TRAPDOOR && event.getClickedInventory().getHolder() instanceof Redstone) {
                if (player.getInventory().contains(Material.IRON_NUGGET, 2)) {
                    player.getInventory().removeItem(new ItemStack(Material.IRON_NUGGET, 2));
                    player.getInventory().addItem(new ItemStack(Material.OAK_TRAPDOOR, 1));
                } else {
                    player.sendMessage("§6[!] Missing Items [!]");
                }
            }

// Slot 24: Tripwire Hook
            if (event.getCurrentItem().getType() == Material.TRIPWIRE_HOOK && event.getClickedInventory().getHolder() instanceof Redstone) {
                if (player.getInventory().contains(Material.IRON_INGOT, 1)) {
                    player.getInventory().removeItem(new ItemStack(Material.IRON_INGOT, 1));
                    player.getInventory().addItem(new ItemStack(Material.TRIPWIRE_HOOK, 1));
                } else {
                    player.sendMessage("§6[!] Missing Items [!]");
                }
            }

// Slot 25: Redstone Lamp
            if (event.getCurrentItem().getType() == Material.REDSTONE_LAMP && event.getClickedInventory().getHolder() instanceof Redstone) {
                if (player.getInventory().contains(Material.GLOWSTONE_DUST, 2)) {
                    player.getInventory().removeItem(new ItemStack(Material.GLOWSTONE_DUST, 2));
                    player.getInventory().addItem(new ItemStack(Material.REDSTONE_LAMP, 1));
                } else {
                    player.sendMessage("§6[!] Missing Items [!]");
                }
            }

// Slot 26: Target
            if (event.getCurrentItem().getType() == Material.TARGET && event.getClickedInventory().getHolder() instanceof Redstone) {
                if (player.getInventory().contains(Material.IRON_INGOT, 4)) {
                    player.getInventory().removeItem(new ItemStack(Material.IRON_INGOT, 4));
                    player.getInventory().addItem(new ItemStack(Material.TARGET, 1));
                } else {
                    player.sendMessage("§6[!] Missing Items [!]");
                }
            }
            //TODO
            //fix the amount for target price its not same as shown, also check others

// Slot 27: Minecart with Hopper
            if (event.getCurrentItem().getType() == Material.HOPPER_MINECART && event.getClickedInventory().getHolder() instanceof Redstone) {
                if (player.getInventory().contains(Material.IRON_INGOT, 5)) {
                    player.getInventory().removeItem(new ItemStack(Material.IRON_INGOT, 5));
                    player.getInventory().addItem(new ItemStack(Material.HOPPER_MINECART, 1));
                } else {
                    player.sendMessage("§6[!] Missing Items [!]");
                }
            }

// Slot 28: Minecart with TNT
            if (event.getCurrentItem().getType() == Material.TNT_MINECART && event.getClickedInventory().getHolder() instanceof Redstone) {
                if (player.getInventory().contains(Material.GUNPOWDER, 2)) {
                    player.getInventory().removeItem(new ItemStack(Material.GUNPOWDER, 2));
                    player.getInventory().addItem(new ItemStack(Material.TNT_MINECART, 1));
                } else {
                    player.sendMessage("§6[!] Missing Items [!]");
                }
            }
        }
    }
}

