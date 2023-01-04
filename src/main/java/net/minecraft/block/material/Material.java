package net.minecraft.block.material;

/**
 * The wrapper for the Material class.
 *
 * @author Nick
 * @since 1/4/2023
 * */
@SuppressWarnings("unused")
public class Material {
    public static final Material air = null, grass = null, ground = null, wood = null, rock = null,
            iron = null, anvil = null, water = null, lava = null, leaves = null, plants = null,
            vine = null, sponge = null, cloth = null, fire = null, sand = null, circuits = null,
            carpet = null, glass = null, redstoneLight = null, tnt = null, coral = null, ice = null,
            packedIce = null, snow = null, craftedSnow = null, cactus = null, clay = null, gourd = null,
            dragonEgg = null, portal = null, cake = null, web = null, piston = null, barrier = null;

    public Material(MapColor color){}
    public boolean isLiquid() {return false;}
    public boolean isSolid() {return true;}
    public boolean blocksLight() {return true;}
    public boolean blocksMovement(){return true;}
    public boolean getCanBurn() {return false;}
    public Material setReplaceable(){return null;}
    public boolean isReplaceable(){return false;}
    public boolean isOpaque(){return false;}
    public boolean isToolNotRequired(){return false;}
    public int getMaterialMobility(){return 0;}
    public MapColor getMaterialMapColor(){return null;}
}
