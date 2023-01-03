package net.minecraft.util;

import lombok.Getter;

/**
 * This class is a wrapper for the Slice API.
 *
 * @author Nick
 * @since 1/3/2023
 * */
@SuppressWarnings("unused")
public class Vec3i {

    @Getter private final int x = 0, y = 0, z = 0;

    public Vec3i(int xIn, int yIn, int zIn) {}
    public Vec3i(double xIn, double yIn, double zIn){}

    public void compareTo(Vec3i p_compareTo_1_){}
    public Vec3i crossProduct(Vec3i vec){return null;}
    public double distanceSq(double toX, double toY, double toZ){return 0;}
    public double distanceSqToCenter(double xIn, double yIn, double zIn){return 0;}
    public double distanceSq(Vec3i to){return 0;}

    @Override
    public boolean equals(Object p_equals_1_){return false;}

    @Override
    public int hashCode(){return 0;}

    @Override
    public String toString(){return null;}
}
