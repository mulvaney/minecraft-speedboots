package com.github.mulvaney.speedboots;


import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public class BootCommand implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String alias, String[] args) {
        if (!(sender instanceof Player)) {
            return false;
        }

        Player player = (Player) sender;
        ItemStack is = new ItemStack(Material.IRON_BOOTS);

        ItemMeta meta = is.getItemMeta();
        meta.setUnbreakable(true);

        meta.setDisplayName(BootsListener.BOOTS_OF_SPEED_DISPLAY_NAME);
        is.setItemMeta(meta);
        player.getInventory().addItem(is);

        return true;
    }
}
