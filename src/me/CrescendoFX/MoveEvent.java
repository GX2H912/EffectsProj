package me.CrescendoFX;

import org.bukkit.Effect;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerMoveEvent;

public class MoveEvent implements Listener{

	main plugin = main.getInstance();
	
	@SuppressWarnings("deprecation")
	@EventHandler
	public void onMove(PlayerMoveEvent e) {
		Player p = (Player) e.getPlayer();
		if(plugin.itemWan.contains(p.getName())) {
			p.playEffect(p.getLocation(), Effect.MOBSPAWNER_FLAMES, 50);
		}
		if(plugin.itemTwo.contains(p.getName())) {
			p.playEffect(p.getLocation(), Effect.BLAZE_SHOOT, 50);
		}
	}
}
