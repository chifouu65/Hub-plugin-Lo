package fr.noah.hub.hub.items.guimenu.home;

import fr.noah.hub.utils.ItemBuilder;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.inventory.Inventory;

public class Gui implements Listener {
    private Player player;
    public Gui() {
        this.player = player;
    }
    @EventHandler
    public static Inventory GameGui() {

        Inventory GAME_GUI = Bukkit.createInventory(null, 9 * 1, "Menu entre Joueurs");

        GAME_GUI.setItem(1, new ItemBuilder(Material.DIAMOND_SWORD).setName(org.bukkit.ChatColor.YELLOW + "§l§eMode :§r Jeux-1").toItemStack());
        GAME_GUI.setItem(3, new ItemBuilder(Material.LAVA_BUCKET).setName(org.bukkit.ChatColor.YELLOW + "§l§eMode :§r Jeux-2").toItemStack());
        GAME_GUI.setItem(5, new ItemBuilder(Material.SKULL_ITEM).setName(org.bukkit.ChatColor.YELLOW + "§l§eMode :§r Jeux-3").toItemStack());
        GAME_GUI.setItem(7, new ItemBuilder(Material.DIAMOND).setName(org.bukkit.ChatColor.YELLOW + "§l§eMode :§r Jeux-4").toItemStack());

        return GAME_GUI;
    }
    public void open(Player player) {
        player.openInventory(GameGui());
    }
}

