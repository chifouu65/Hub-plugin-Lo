package fr.noah.hub.utils;

import org.bukkit.Bukkit;
import org.bukkit.Location;


public enum HubLocations {

    SPAWN_LOC(new Location(Bukkit.getWorld("world"),
            0.50, 100, 0.50, 1.7f, 7.9f)),
    ;
    private final Location location;

    HubLocations(Location location) {
        this.location = location;
    }

    public Location getLocation() {
        return location;
    }
}