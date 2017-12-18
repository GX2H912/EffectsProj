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
		
		ItemStack two = new
		
		ItemMeta oneMeta = one.getItemMeta();
		
		oneMeta.setDisplayName(MANDAR_FIRSTITEM);
		
		one.setItemMeta(oneMeta);
		
		inv.setItem(0, one);
		
		p.openInventory(inv);
	}
	public void secGUI(Player p){
		Inventory inv = Bukkit.getServer().createInventory(null, 9, MANDAR_NAME);
		
		ItemStack one = new ItemStack(Material.BLAZE_POWDER);
		
		ItemMeta oneMeta = one.getItemMeta();
		
		oneMeta.setDisplayName(MANDAR_FIRSTITEMDISABLE);
		
		one.setItemMeta(oneMeta);
		
		inv.setItem(0, one);
		
		p.openInventory(inv);
	}
	
	final String MANDAR_NAME = ChatColor.RED + "[Flame Particles Menu]";
	final String MANDAR_FIRSTITEM = ChatColor.RED + "[Click here to enable first!]";
	final String MANDAR_SECONDITEMDISABLE = ChatColor.RED + "[Click here to enable second item]"
	final String MANDAR_FIRSTITEMDISABLE = ChatColor.RED + "[Click here to disable effects!]";
	
	
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
