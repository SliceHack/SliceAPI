package net.minecraft.entity.player;

import lombok.Getter;
import lombok.Setter;

/**
 * This class is a wrapper for the Slice API.
 *
 * @author Nick
 * @since 1/3/2023
 * */
public class PlayerCapabilities {
    public boolean disableDamage, isFlying, allowFlying, isCreativeMode, allowEdit;

    @Getter @Setter
    private float flySpeed = 0.05F;

    @Getter @Setter
    private float walkSpeed = 0.1F;
}
