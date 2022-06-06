package fr.noah.hub.hub.event;

import fr.noah.hub.utils.HubLocations;
import fr.noah.hub.hub.items.guimenu.home.HubItems;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.GameMode;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

public class PlayerJoin implements Listener {
    @Deprecated
    @EventHandler
    public void onPlayerJoin(PlayerJoinEvent event) {
        Player player = event.getPlayer();
        player.teleport(HubLocations.SPAWN_LOC.getLocation());
        player.setGameMode(GameMode.ADVENTURE);
        player.setHealth(20);
        player.setFoodLevel(20);
        player.setAllowFlight(false);
        player.getInventory().clear();
        player.getInventory().setHeldItemSlot(0);
        player.getInventory().setItem(0, HubItems.GAME_SELECTOR.getItemStack());
        player.getInventory().setItem(8, HubItems.HUBS.getItemStack());
        player.updateInventory();
    }



    @EventHandler
    public void JoinMessage(PlayerJoinEvent event) {
        Player player = event.getPlayer();
        event.setJoinMessage(ChatColor.GREEN + event.getPlayer().getDisplayName() +
                "§e as join server §a" + Bukkit.getOnlinePlayers().size() + "/" + Bukkit.getServer().getMaxPlayers());
    }
}
