package fr.noah.hub.hub.items.guimenu.home;

import fr.noah.hub.utils.Constants;
import fr.noah.hub.utils.ItemBuilder;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;

public enum HubItems {

    GAME_SELECTOR(new ItemBuilder(Material.COMPASS, 1)
            .setName(Constants.PREFIX + "§e§lSelection du mode de jeux")
            .addLoreLine("§f   ")
            .toItemStack()),
    HUBS(new ItemBuilder(Material.ENDER_PORTAL_FRAME, 1)
            .setName(Constants.PREFIX + "§9§lHub selector")
            .addLoreLine("§f   ")
            .toItemStack());

    private final ItemStack itemStack;

    HubItems(ItemStack itemStack) {
        this.itemStack = itemStack;
    }

    public ItemStack getItemStack() {
        return itemStack;
    }
}