package me.nelson131.elytralimitation;

import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.player.PlayerInteractEvent;

import static me.nelson131.elytralimitation.ElytraLimitation.plugin;

public class ElytraFireworkDisableEvent implements Listener {
    @EventHandler

    public void onMove(PlayerInteractEvent event){
        Player player = event.getPlayer();
        Action action = event.getAction();
        Boolean isfireworkdisable = plugin.getConfig().getBoolean("isfireworkdisable");
        if(player.isGliding()){
            if(isfireworkdisable == true){
                if((action == Action.PHYSICAL) || (event.getItem().getType() == Material.FIREWORK_ROCKET)){
                    player.setGliding(false);
                }
            }
        }
    }
}
