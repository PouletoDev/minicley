package be.lequi.minicley;

import org.bukkit.event.Listener;
import org.bukkit.plugin.java.JavaPlugin;

import be.lequi.minicley.listeners.PlayerListener;

public class Main extends JavaPlugin {
	
	@Override
	public void onEnable() {
		getServer().getPluginManager().registerEvents((Listener) new PlayerListener(), this);
	}

}
