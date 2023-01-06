package net.minecraft.util;

import lombok.Getter;

/**
 * This class is a wrapper for the Slice API.
 *
 * @author Nick
 * @since 1/3/2023
 * */
@SuppressWarnings("unused")
public class BlockPos {
    public static final BlockPos ORIGIN = new BlockPos(0, 0, 0);

    public BlockPos(int x, int y, int z){}
    public BlockPos(double x, double y, double z){}
    public BlockPos(Vec3i source){}

    public BlockPos subtract(Vec3i vec){return null;}
    public BlockPos add(Vec3i vec){return null;}
    public BlockPos add(double x, double y, double z){return null;}
    public BlockPos add(int x, int y, int z){return null;}

    public BlockPos up() {return null;}
    public BlockPos up(int n) {return null;}
    public BlockPos down() {return null;}
    public BlockPos down(int n) {return null;}
    public BlockPos north() {return null;}
    public BlockPos north(int n) {return null;}
    public BlockPos south() {return null;}
    public BlockPos south(int n) {return null;}
    public BlockPos west() {return null;}
    public BlockPos west(int n) {return null;}
    public BlockPos east() {return null;}
    public BlockPos east(int n) {return null;}
    public BlockPos offset(EnumFacing facing) {return null;}

    public long toLong() {return 0;}
    public static BlockPos fromLong(long serialized){return null;}
    public static Iterable<BlockPos> getAllInBox(BlockPos from, BlockPos to){return null;}
    public static Iterable<BlockPos.MutableBlockPos> getAllInBoxMutable(BlockPos from, BlockPos to){return null;}
    public BlockPos crossProduct(Vec3i vec){return null;}

    public int getX() {return 0;}
    public int getY() {return 0;}
    public int getZ() {return 0;}

    public static final class MutableBlockPos extends BlockPos {
        @Getter private int x, y, z;

        public MutableBlockPos() {
            this(0, 0, 0);
        }

        public MutableBlockPos(int x_, int y_, int z_) {
            super(0, 0, 0);
        }

        public BlockPos.MutableBlockPos set(int xIn, int yIn, int zIn) {
            return null;
        }
    }
}
