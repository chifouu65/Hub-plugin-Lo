package fr.noah.hub;

import fr.noah.hub.database.DatabaseManager;
import org.bukkit.plugin.java.JavaPlugin;

public final class Hub extends JavaPlugin {
    public static Hub INSTANCE;
    public DatabaseManager database;
    @Override
    public void onEnable() {
        INSTANCE = this;
        EventManager eventManager = new EventManager(this);
        database = new DatabaseManager("jdbc:mysql://", "93.2.133.173", "hubdata", "root", "");
        database.setConnection();
    }

    @Override
    public void onDisable() {
        database.deco();
    }
}
