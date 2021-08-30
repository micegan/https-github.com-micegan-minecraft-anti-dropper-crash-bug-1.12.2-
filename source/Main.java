package plugin;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.block.BlockFace;
import org.bukkit.block.BlockState;
import org.bukkit.material.Dispenser;
import org.bukkit.block.Dropper;
import org.bukkit.block.ShulkerBox;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.HandlerList;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.block.BlockDispenseEvent;
import org.bukkit.event.block.BlockEvent;
import org.bukkit.event.block.BlockPlaceEvent;
import org.bukkit.event.block.BlockRedstoneEvent;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.material.Directional;
import org.bukkit.material.MaterialData;
import org.bukkit.metadata.MetadataValue;
import org.bukkit.plugin.Plugin;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.util.BlockVector;
import org.bukkit.util.Vector;


public class Main extends JavaPlugin implements Listener {

	@Override
	   public void onEnable() {
        PluginManager manager = getServer().getPluginManager();
        manager.registerEvents(this, this);
	}
	
	
	@Override
	public void onDisable() {
		
	}
	
	
    public BlockFace getBlockFace(Player player) {
         List<Block> lastTwoTargetBlocks = player.getLastTwoTargetBlocks(null, 100);
        if ((lastTwoTargetBlocks.size() == 2) || (lastTwoTargetBlocks.get(1).getType().isOccluding()== true)) {
        
         Block targetBlock = lastTwoTargetBlocks.get(1);
         Block adjacentBlock = lastTwoTargetBlocks.get(0);
        return targetBlock.getFace(adjacentBlock);
        }
        else {
        	return null;
        }
       
    }
	

    
	@EventHandler
	public void OnitemPlace(BlockPlaceEvent event) {
			
			if(event.getBlock().getType() ==  Material.DISPENSER) {

				if ((event.getBlock().getLocation().getBlockY() >= event.getBlock().getWorld().getMaxHeight() -1)) {
					
					//event.getBlock().getLocation();
						//BlockFace targetFace = ((org.bukkit.material.Dispenser) event.getBlock().getState().getData()).getFacing();
					

					Dispenser disp = (Dispenser) event.getBlock().getState().getData();
					 
					BlockFace face = ((Directional) disp).getFacing();
						if (face == BlockFace.UP) {
					
							 
							
							
							
							event.setCancelled(true);
							
							
							event.getPlayer().sendMessage(ChatColor.RED + "" + ChatColor.BOLD + "This exploit is bypassed by " + ChatColor.YELLOW + "" + ChatColor.BOLD +  "1.12.2 Anti-Dispenser server crash" + ChatColor.RED + "" + ChatColor.BOLD + ", Spigot web page");
					        
							//event.getBlock().get
						
					}
			        }
				}
				
			}
			

			
		
		
		
	
	
	
	@EventHandler
	public void OnitemPlace2(BlockPlaceEvent event) {
			
			if(event.getBlock().getType() ==  Material.DISPENSER) {

				if ((event.getBlock().getLocation().getBlockY() == 0)) {
					
					
						//BlockFace targetFace = ((org.bukkit.material.Dispenser) event.getBlock().getState().getData()).getFacing();
						
					Dispenser disp = (Dispenser) event.getBlock().getState().getData();
					 
					BlockFace face = ((Directional) disp).getFacing();
						if (face == BlockFace.DOWN) {
					
					event.setCancelled(true);
					
					event.getPlayer().sendMessage(ChatColor.RED + "" + ChatColor.BOLD + "This exploit is bypassed by " + ChatColor.YELLOW + "" + ChatColor.BOLD +  "1.12.2 Anti-Dispenser server crash" + ChatColor.RED + "" + ChatColor.BOLD + ", Spigot web page");
					
						
				}
				}
				
			}
			
			
			
		
		
		}
		
	@EventHandler
	public void OnitemPlaces(PlayerInteractEvent event) {

		
	    //System.out.print(String.valueOf(event.getBlock().getBlockPower()));
		
		
		
		if (event.getAction() == Action.RIGHT_CLICK_BLOCK) {
		
			if(event.getClickedBlock().getType() ==  Material.DISPENSER) {
		       // System.out.print("d");
				if ((event.getClickedBlock().getLocation().getBlockY() >= event.getClickedBlock().getWorld().getMaxHeight() -1)) {
			        //System.out.print("bonk");
					//event.getClickedBlock().getLocation().setDirection(new Vector(0,1,0));
					//event.getPlayer().sendMessage("X" + String.valueOf(event.getClickedBlock().getLocation().getDirection().getBlockX()) + "Y" + String.valueOf(event.getClickedBlock().getLocation().getDirection().getBlockY()) + "Z" + String.valueOf(event.getClickedBlock().getLocation().getDirection().getBlockZ()) );
					//BlockFace targetFace = ((org.bukkit.material.Dispenser) event.getBlock().getState().getData()).getFacing();
					
					Dispenser disp = (Dispenser) event.getClickedBlock().getState().getData();
					 
					BlockFace face = ((Directional) disp).getFacing();
						if (face == BlockFace.UP) {
						
							event.setCancelled(true);
							
							event.getPlayer().sendMessage(ChatColor.RED + "" + ChatColor.BOLD + "This exploit is bypassed by " + ChatColor.YELLOW + "" + ChatColor.BOLD +  "1.12.2 Anti-Dispenser server crash" + ChatColor.RED + "" + ChatColor.BOLD + ", Spigot web page");
							
						
					//event.getClickedBlock().breakNaturally();
					
					
					//event.getPlayer().kickPlayer(ChatColor.RED + "Don't crash my 1.12.2 server!");
					}
					
					}
					
				}
				
			}
			
			
			
		}
		
		



@EventHandler
public void OnitemPlaceds(PlayerInteractEvent event) {

	
    //System.out.print(String.valueOf(event.getBlock().getBlockPower()));
	
	
	
	if (event.getAction() == Action.RIGHT_CLICK_BLOCK) {
	
		if(event.getClickedBlock().getType() ==  Material.DISPENSER) {
	       // System.out.print("d");
			if ((event.getClickedBlock().getLocation().getBlockY() == 0)) {
		        //System.out.print("bonk");
			
			 
				//BlockFace targetFace = ((org.bukkit.material.Dispenser) event.getBlock().getState().getData()).getFacing();
				
				
				
				Dispenser disp = (Dispenser) event.getClickedBlock().getState().getData();
				 
				BlockFace face = ((Directional) disp).getFacing();
					if (face == BlockFace.DOWN) {
				
				event.setCancelled(true);
				
				event.getPlayer().sendMessage(ChatColor.RED + "" + ChatColor.BOLD + "This exploit is bypassed by " + ChatColor.YELLOW + "" + ChatColor.BOLD +  "1.12.2 Anti-Dispenser server crash" + ChatColor.RED + "" + ChatColor.BOLD + ", Spigot web page");
				
					
				}
				
				
				//event.getPlayer().kickPlayer(ChatColor.RED + "Don't crash my 1.12.2 server!");
				}
				}
				
			}
			
		}
		
		
		
	
	
	}
		
	
		
		
	/*	for (int i = 0; i < nnn.size(); i++) {
			if (nnn.get(i).getClass() == ShulkerBox.class) {
				
				ArrayList<ItemStack> is = new ArrayList<ItemStack>();
				
				
				ShulkerBox sb = (ShulkerBox) nnn.get(i);
				
				
				
					if (sb.getInventory().getContents().length == 27) {
						
					}
				
			}
		}*/
	
	
	

