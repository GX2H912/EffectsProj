package me.CrescendoFX;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;


public class EffectHandler implements Listener{

	main plugin = main.getInstance();
	
	@EventHandler
	public void onClickEvent(InventoryClickEvent event) {
		Player p = (Player) event.getWhoClicked();
		if(event.getInventory().getName() != plugin.MANDAR_NAME) {
			return;
		}
		if(event.getCurrentItem().getItemMeta().getDisplayName().contains(plugin.MANDAR_FIRSTITEM)) {
			event.setCancelled(true);
			plugin.itemWan.add(event.getWhoClicked().getName());
			event.getWhoClicked().closeInventory();
			p.sendMessage(plugin.MANDAR_NAME + " §bSuccessfully enabled flame effects!");
			
		}
		if(event.getCurrentItem().getItemMeta().getDisplayName().contains(plugin.MANDAR_SECONDITEM)) {
			event.setCancelled(true);
			plugin.itemTwo.add(event.getWhoClicked().getName());
			event.getWhoClicked().closeInventory();
			p.sendMessage(plugin.MANDAR_NAME + " §bSuccessfully enabled cool effects!");
			
		}
		if(event.getInventory().getName() != plugin.MANDAR_NAME) {
			return;
		}
		if(event.getCurrentItem().getItemMeta().getDisplayName().contains(plugin.MANDAR_ITEMDISABLE)) {
			event.setCancelled(true);
			if(plugin.itemWan.contains(event.getWhoClicked().getName)){
				plugin.itemWan.remove(event.getWhoClicked().getName());
			}
			if(plugin.itemTwo.contains(event.getWhoClicked().getName)){
				plugin.itemTwo.remove(event.getWhoClicked().getName());
			}
			if(plugin.itemtwee.contains(event.getWhoClicked().getName)){
				plugin.itemtwee.remove(event.getWhoClicked().getName());
			}
			event.getWhoClicked().closeInventory();
			p.sendMessage(plugin.MANDAR_NAME + " §bSuccessfully disabled flame effects!");
			
		}
		
	}
}
