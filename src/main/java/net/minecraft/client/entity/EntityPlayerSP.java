package net.minecraft.client.entity;

/**
 * This is the wrapper for the player class.
 *
 * @author Nick
 * @since 1/3/2023
 * */
@SuppressWarnings("unused")
public class EntityPlayerSP {

    public double motionX, motionY, motionZ, posX, posY, posZ;
    public float rotationYaw, rotationPitch, stepHeight;
    public int jumpTicks;

    public boolean onGround;

    /***
     * Makes the player jump.
     * */
    public void jump() {}

}
