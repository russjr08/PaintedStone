package net.owexz.PaintedStone;
 
import org.bukkit.plugin.Plugin;
import org.getspout.spoutapi.block.design.GenericCubeBlockDesign;
import org.getspout.spoutapi.material.block.GenericCubeCustomBlock;
 
public class OrangeCobbleStoneBlock extends GenericCubeCustomBlock
{
 
    public OrangeCobbleStoneBlock(Plugin plugin)
    {
        super(plugin, "OrangeCobbleStone Block", new GenericCubeBlockDesign(plugin, "http://www.jamoscraft.owexz.net/uploads/1/4/8/5/1485487/1749389.png", 16));
    }
}