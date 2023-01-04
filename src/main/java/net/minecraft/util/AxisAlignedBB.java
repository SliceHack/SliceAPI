package net.minecraft.util;

/**
 * Wrapped AxisAlignedBB class.
 *
 * @author Nick
 * @since 1/4/2023
 * */
public class AxisAlignedBB
{
    public final double minX = 0, minY = 0, minZ = 0, maxX = 0, maxY = 0, maxZ = 0;

    public AxisAlignedBB(double x1, double y1, double z1, double x2, double y2, double z2) {}

    public AxisAlignedBB(BlockPos pos1, BlockPos pos2) {}

    public AxisAlignedBB addCoord(double x, double y, double z) {return null;}

    public AxisAlignedBB expand(double x, double y, double z) {return null;}

    public AxisAlignedBB union(AxisAlignedBB other) {return null;}

    public static AxisAlignedBB fromBounds(double x1, double y1, double z1, double x2, double y2, double z2) {return null;}

    public AxisAlignedBB offset(double x, double y, double z){return null;}

    public double calculateXOffset(AxisAlignedBB other, double offsetX){return 0;}

    public double calculateYOffset(AxisAlignedBB other, double offsetY){return 0;}

    public double calculateZOffset(AxisAlignedBB other, double offsetZ){return 0;}

    public boolean intersectsWith(AxisAlignedBB other){return false;}

    public boolean isVecInside(Vec3 vec){return false;}

    public double getAverageEdgeLength(){return 0;}

    public AxisAlignedBB contract(double x, double y, double z){return null;}

//    public MovingObjectPosition calculateIntercept(Vec3 vecA, Vec3 vecB){return null;}

    private boolean isVecInYZ(Vec3 vec){return false;}
    private boolean isVecInXZ(Vec3 vec){return false;}
    private boolean isVecInXY(Vec3 vec){return true;}

    @Override
    public String toString(){return null;}

    public boolean hasNaN(){return false;}
}
