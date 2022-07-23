package me.nelson131.elytralimitation;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerMoveEvent;

import static me.nelson131.elytralimitation.ElytraLimitation.plugin;

public class ElytraDisableEvent implements Listener {


    @EventHandler
    public void onMove(PlayerMoveEvent event){
        Player player = event.getPlayer();
        Boolean iselytradisable = plugin.getConfig().getBoolean("iselytradisable");

        if(player.isGliding()){
            if(iselytradisable == true){
                player.setGliding(false);
            }
        }
    }
}
