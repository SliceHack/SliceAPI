package com.sliceclient.api.player;

import com.sliceclient.api.util.Location;
import lombok.experimental.UtilityClass;
import net.minecraft.client.Minecraft;
import net.minecraft.util.BlockPos;

/**
 * Slice Player API
 *
 * @author Nick
 * @since 1/6/23
 * */
public class Player {

    /**
     * Makes the player jump
     * */
    public void jump() {}

    /**
     * Sets the player's onGround state
     * */
    public void setOnGround(boolean onGround) {}

    /**
     * Checks if a player is on the ground
     * */
    public boolean isOnGround() {return false;}

    /**
     * Adds strafe to the player
     * */
    public void strafe(float speed) {}

    /**
     * Checks if the player is moving
     * */
    public boolean isMoving(){ return false; }

    /***
     * Returns the player's location
     * */
    public Location getLocation() { return null; }

}
