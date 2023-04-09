package be.lequi.minicley.listeners;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.plugin.java.JavaPlugin;

public class PlayerListener extends JavaPlugin {
	
	@EventHandler
	public void onJoin(PlayerJoinEvent event) {
		Player player = event.getPlayer();
		event.setJoinMessage("§6" + player.getDisplayName() + " §aà rejoint");
		player.setHealth(20);
		player.setFoodLevel(20);
		
	}
		

}
