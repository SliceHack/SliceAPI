package net.minecraft.client;

import net.minecraft.client.entity.EntityPlayerSP;

/**
 * Everything in this file is a wrapper for the Slice API.
 *
 * @author Nick
 * @since 1/3/2023
 * */
@SuppressWarnings("unused")
public class Minecraft {

    /** the player instance */
    public EntityPlayerSP thePlayer = null;

    /***
     * Returns the version of the game.
     * */
    public String getVersion() {
        return null;
    }

    /***
     * Returns the instance of the Minecraft class.
     * */
    public static Minecraft getMinecraft() {
        return null;
    }
}
