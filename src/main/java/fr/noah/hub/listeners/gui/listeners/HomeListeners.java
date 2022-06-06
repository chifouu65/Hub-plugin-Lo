package fr.noah.hub.listeners.gui;

import fr.noah.hub.items.guimenu.home.Gui;
import fr.noah.hub.items.guimenu.home.HubItems;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerInteractEvent;

public class HomeListeners implements Listener {

    private static Gui gui;

    @EventHandler
    public void onInteractItem(PlayerInteractEvent event) {

        Player player = event.getPlayer();

        if (player.getItemInHand() == null)
            return;

        if (player.getItemInHand().hasItemMeta()
                && player.getItemInHand().equals(HubItems.GAME_SELECTOR.getItemStack())) {
            new Gui().open(player);
            event.setCancelled(true);
        } else {
            return;
        }

    }

}
