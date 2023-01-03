package net.minecraft.client.entity;

import net.minecraft.entity.player.PlayerCapabilities;
import net.minecraft.util.BlockPos;

/**
 * This is the wrapper for the player class.
 *
 * @author Nick
 * @since 1/3/2023
 * */
@SuppressWarnings("unused")
public class EntityPlayerSP {

    public PlayerCapabilities capabilities;

    public double motionX, motionY, motionZ, posX, posY, posZ;
    public float rotationYaw, rotationPitch, stepHeight;
    public int jumpTicks;

    public boolean onGround;

    /***
     * Makes the player jump.
     * */
    public void jump() {}

    /**
     * Checks if a player is a spectator.
     * */
    public boolean isSpectator() {return false;}

    /***
     * Checks if a player is blocking an item. (sword blocking)
     * */
    public boolean isBlocking() {return false;}

    /**
     * Checks if a player is thePlayer.
     * */
    public boolean isUser() {return false;}

    /**
     * Sets the player's client brand.
     *
     * @param brand the brand to set
     * */
    public void setClientBrand(String brand) {}

    /**
     * Returns the player's client brand.
     * */
    public String getClientBrand() {return null;}

    /**
     * Sends capabilities to the server.
     * */
    public void sendPlayerAbilities(){}

    /**
     * Sends a packet to open a horses inventory.
     * */
    public void sendHorseInventory(){}

    /***
     * Sets the sprinting state of the player.
     *
     * @param sprinting the sprinting state
     * */
    public void setSprinting(boolean sprinting) {}

    /**
     * Sets the XP Stats of the player.
     *
     * @param currentXP the current XP
     * @param maxXP the max XP
     * @param level the level
     * */
    public void setXPStats(float currentXP, int maxXP, int level) {}

    /**
     * Makes the player send a chat message.
     *
     * @param message the message to send
     * */
    public void sendChatMessage(String message) {}

    /***
     * Makes the player swing their arm.
     * */
    public void swingArm() {}

    /***
     * Respawns the player.
     * */
    public void respawnPlayer() {}

    /**
     * Gets the player's position.
     * */
    public BlockPos getPosition(){return null;}

    /**
     * Plays a sound.
     *
     * @param name the sound to play
     * @param volume the volume of the sound
     * @param pitch the pitch of the sound
     * */
    public void playSound(String name, float volume, float pitch){}

    /**
     * Checks if the world the player is in is a world in a server.
     * */
    public boolean isServerWorld() {return false;}

    /***
     * Checks if the player is riding a horse
     * */
    public boolean isRidingHorse() {return false;}

    /***
     * Checks the jump power of the horse the player is riding.
     * */
    public float getHorseJumpPower(){return 0;}

    /***
     * Checks if the player is sneaking.
     * */
    public boolean isSneaking(){return false;}
}
