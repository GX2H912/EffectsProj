package me.CrescendoFX;

import java.util.ArrayList;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.plugin.java.JavaPlugin;

import net.md_5.bungee.api.ChatColor;

public class main extends JavaPlugin{

	ArrayList<String> itemWan = new ArrayList<String>();
	ArrayList<String> itemTwo = new ArrayList<String>();
	ArrayList<String> itemtwee = new ArrayList<String>();
	
	public void createGUI(Player p){
		Inventory inv = Bukkit.getServer().createInventory(null, 9, MANDAR_NAME);
		
		ItemStack one = new ItemStack(Material.BLAZE_POWDER);
		
		ItemStack two = new ItemStack(Material.CAKE);
		
		ItemMeta oneMeta = one.getItemMeta();
		
		ItemMeta twoMeta = two.getItemMeta();
		
		oneMeta.setDisplayName(MANDAR_FIRSTITEM);
		
		twoMeta.setDisplayName(MANDAR_SECONDITEM);
		
		one.setItemMeta(oneMeta);
		
		two.setItemMeta(twoMeta);
		
		inv.setItem(0, one);
		
		inv.setItem(1, two)
		
		p.openInventory(inv);
	}
	public void secGUI(Player p){
		
		if(itemWan().contains(p.getName)){
			itemWan.remove(p.getName);
		}
		if(itemTwo().contains(p.getName)){
			itemTwo.remove(p.getName);
		}
		if(itemtwee().contains(p.getName)){
			itemtwee.remove(p.getName);
		}
		Inventory inv = Bukkit.getServer().createInventory(null, 9, MANDAR_NAME);
		
		ItemStack one = new ItemStack(Material.BLAZE_POWDER);
		
		ItemMeta oneMeta = one.getItemMeta();
		
		oneMeta.setDisplayName(MANDAR_ITEMDISABLE);
		
		one.setItemMeta(oneMeta);
		
		inv.setItem(0, one);
		
		p.openInventory(inv);
	}
	
	final String MANDAR_NAME = ChatColor.RED + "[Flame Particles Menu]";
	final String MANDAR_FIRSTITEM = ChatColor.RED + "[Click here to enable first effect!]";
	final String MANDAR_THIRDITEM = ChatColor.RED + "[Click here to enable third effect!]"
	final String MANDAR_SECONDITEM = ChatColor.RED + "[Click here to disable second effect!]"
	final String MANDAR_ITEMDISABLE = ChatColor.RED + "[Click here to disable effects!]";
	
	
	private static main plugin;
	
	public void onEnable(){
		plugin = this;
		this.registerTehCommands();
		this.registerTehEventHandlerz();
	}
	public void onDisable(){
		
	}
	public static main getInstance(){
		return plugin;
	}
	
	public void registerTehCommands(){
		this.getCommand("ee").setExecutor(new Effects());
	}
	public void registerTehEventHandlerz(){
		Bukkit.getServer().getPluginManager().registerEvents(new EffectHandler(), this);
		Bukkit.getServer().getPluginManager().registerEvents(new MoveEvent(), this);
	}
}
