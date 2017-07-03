package com.github.mulvaney.speedboots;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerToggleSprintEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

public class BootsListener implements Listener {

    final static String BOOTS_OF_SPEED_DISPLAY_NAME = "Boots of speed";

    @EventHandler
    public void onPlayerSprint(PlayerToggleSprintEvent e) {
        Player player = e.getPlayer();
        ItemStack boots = player.getEquipment().getBoots();

        if (boots == null) {
            return;
        }

        if (! BOOTS_OF_SPEED_DISPLAY_NAME.equals(boots.getItemMeta().getDisplayName())) {
            return;
        }

        if (!player.isSprinting()) {
            player.addPotionEffect(new PotionEffect(PotionEffectType.SPEED, 1000, 6));
        } else {
            player.removePotionEffect(PotionEffectType.SPEED);

        }
    }

}
