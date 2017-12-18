package me.CrescendoFX;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class Effects implements CommandExecutor{

	main plugin = main.getInstance();
	
	
	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String commandLabel, String[] args) {

		Player p = (Player) sender;
		plugin.createGUI(p);
		if(plugin.itemWan.contains(p.getName())) {
			plugin.secGUI(p);
		}
		if(plugin.itemTwo.contains(p.getName())) {
			plugin.secGUI(p);
		}
		if(plugin.itemtwee.contains(p.getName())) {
			plugin.secGUI(p)	
		}
		
		return true;
	}
	

}
