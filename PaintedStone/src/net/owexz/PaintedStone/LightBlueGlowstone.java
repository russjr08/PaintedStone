package net.owexz.PaintedStone;
 
import org.bukkit.plugin.Plugin;
import org.getspout.spoutapi.block.design.GenericCubeBlockDesign;
import org.getspout.spoutapi.material.block.GenericCubeCustomBlock;
 
public class LightBlueGlowstone extends GenericCubeCustomBlock
{
    public int getBlockId() {
    	return 4;
        }
    public LightBlueGlowstone(Plugin plugin)
    {
        super(plugin, "Light-Blue Glowstone", new GenericCubeBlockDesign(plugin, "http://www.jamoscraft.owexz.net/uploads/1/4/8/5/1485487/5379460.png", 16));
    }
}