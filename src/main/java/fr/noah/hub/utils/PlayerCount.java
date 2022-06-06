package fr.noah.hub.utils;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerQuitEvent;

import java.util.List;

public class PlayerCount implements Listener {

    public static int playercount = 0;

    @EventHandler
    private static void PlayerAdd(PlayerJoinEvent event) {
            playercount = playercount + 1;
    }

    @EventHandler
    private static void PlayerRemove(PlayerQuitEvent event) {
            playercount = playercount - 1;
        }
    }
