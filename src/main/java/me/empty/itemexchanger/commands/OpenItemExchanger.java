package me.empty.itemexchanger.commands;

import me.empty.itemexchanger.ItemExchanger;
import me.empty.itemexchanger.inventories.ItemExchangerInventorySelection;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import static me.empty.itemexchanger.inventories.ItemExchangerInventorySelection.replaceString;

public class OpenItemExchanger implements CommandExecutor {
    private final ItemExchanger plugin;

    public OpenItemExchanger(ItemExchanger plugin) {
        this.plugin = plugin;
    }
    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
        if (!(sender instanceof Player)) {
            sender.sendMessage("[!] Only players can use this command! [!]");
            return true;
        }
        Player player = (Player) sender;
        if (cmd.getName().equalsIgnoreCase("exchanger")) {
            player.sendMessage(replaceString(plugin.getConfig().getString("message-config-opening")));
            ItemExchangerInventorySelection gui = new ItemExchangerInventorySelection();
            player.openInventory(gui.getInventory());
            return true;
        }
        return true;
    }
}
