package me.empty.itemexchanger.commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class OpenItemExchanger implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
        if (!(sender instanceof Player)) {
            sender.sendMessage("[!] Only players can use this command! [!]");
            return true;
        }
        Player player = (Player) sender;
        if (cmd.getName().equalsIgnoreCase("exchanger")) {
            player.sendMessage("§6[!] Opening item exchanger! [!]");
            return true;
        }
        return true;
    }
}
