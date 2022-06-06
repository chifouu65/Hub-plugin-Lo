package fr.noah.hub;

import fr.noah.hub.hub.items.guimenu.game1.GuiOne;
import fr.noah.hub.hub.items.guimenu.home.HomeListeners;
import fr.noah.hub.hub.event.PlayerJoin;
import fr.noah.hub.hub.event.ProtectionHub;
import fr.noah.hub.hub.items.guimenu.game1.MiniGamesListeners;
import fr.noah.hub.hub.items.guimenu.home.Gui;
import fr.noah.hub.utils.PlayerCount;
import org.bukkit.Bukkit;
import org.bukkit.event.Listener;
import org.bukkit.plugin.PluginManager;

public class EventManager {

    private final Hub instance;
    private final PluginManager pluginManager;

    public EventManager (Hub instance) {
        this.instance = instance;
        this.pluginManager = Bukkit.getPluginManager();
        registerEvents();
    }

    private void registerEvents() {
        addNewEvent(new PlayerJoin());

        addNewEvent(new Gui());
        addNewEvent(new HomeListeners());

        addNewEvent(new MiniGamesListeners());
        addNewEvent(new GuiOne());

        addNewEvent(new ProtectionHub());
        addNewEvent(new PlayerCount());
    }

    public void addNewEvent(Listener listener){
        pluginManager.registerEvents(listener, instance);
    }

}
