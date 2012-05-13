package net.owexz.PaintedStone.Glowstone;
 
import net.owexz.PaintedStone.CFTextures;

import org.bukkit.plugin.Plugin;
import org.getspout.spoutapi.block.design.GenericCubeBlockDesign;
import org.getspout.spoutapi.material.block.GenericCubeCustomBlock;
 
public class BrownGlowstone extends GenericCubeCustomBlock
{
    public int getBlockId() {
    	return 89;
        }
    public BrownGlowstone(Plugin plugin)
    {
        super(plugin, "Brown Glowstone", new GenericCubeBlockDesign(plugin, CFTextures.getString("BrownGlowstone"), 16));
    }
}