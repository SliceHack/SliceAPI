package net.minecraft.util;

import lombok.Getter;

import java.util.Iterator;
import java.util.Random;

/**
 * This class is a wrapper for the Slice API.
 *
 * @author Nick
 * @since 1/3/2023
 * */
@SuppressWarnings("unused")
public enum EnumFacing {
    DOWN(0, 0, 0, null, null, null, null),
    UP(0, 0, 0, null, null, null, null),
    NORTH(0, 0, 0, null, null, null, null),
    SOUTH(0, 0, 0, null, null, null, null),
    WEST(0, 0, 0, null, null, null, null),
    EAST(0, 0, 0, null, null, null, null);

    private final int index = 0, opposite = 0, horizontalIndex = 0;
    private final String name = null;
    private final EnumFacing.Axis axis = null;
    @Getter private final EnumFacing.AxisDirection axisDirection = null;
    @Getter private final Vec3i directionVec = null;
    public static final EnumFacing[] VALUES = new EnumFacing[6];
    private static final EnumFacing[] HORIZONTALS = new EnumFacing[4];

    EnumFacing(int indexIn, int oppositeIn, int horizontalIndexIn, String nameIn, EnumFacing.AxisDirection axisDirectionIn, EnumFacing.Axis axisIn, Vec3i directionVecIn) {}

    public int getIndex() {return 0;}
    public int getHorizontalIndex() {return 0;}
    public EnumFacing getOpposite() {return null;}
    public EnumFacing rotateAround(EnumFacing.Axis axis){return null;}

    public EnumFacing rotateY(){return null;}
    public EnumFacing rotateX(){return null;}
    public EnumFacing rotateZ(){return null;}
    public EnumFacing rotateYCCW(){return null;}

    public int getFrontOffsetX() {return 0;}
    public int getFrontOffsetY() {return 0;}
    public int getFrontOffsetZ() {return 0;}

    public String getName2() {return null;}

    public EnumFacing.AxisDirection getAxis() {return null;}

    public static EnumFacing byName(String name) {return null;}
    public static EnumFacing getFront(int index) {return null;}
    public static EnumFacing getHorizontal(int p_176731_0_){return null;}
    public static EnumFacing fromAngle(double angle){return null;}
    public static EnumFacing random(Random rand){return null;}
    public static EnumFacing getFacingFromVector(float p_176737_0_, float p_176737_1_, float p_176737_2_){return null;}

    @Override
    public String toString() {return null;}
    public String getName() {return null;}
    public static EnumFacing getFacingFromAxis(EnumFacing.AxisDirection p_181076_0_, EnumFacing.Axis p_181076_1_) {return null;}
    public enum Axis {
        X(null, null),
        Y(null, null),
        Z(null, null);

        private final String name = "";
        @Getter private final EnumFacing.Plane plane = null;

        Axis(String nameIn, EnumFacing.Plane planeIn) {}
        public static EnumFacing.Axis byName(String name){return null;}

        @Override
        public String toString(){return null;}
        public String getName() {return null;}
        public String getName2(){return null;}
        public boolean isVertical(){return false;}
        public boolean isHorizontal(){return false;}
        public boolean apply(EnumFacing facing){return false;}
    }

    public enum AxisDirection {
        POSITIVE(0, null),
        NEGATIVE(0, null);

        @Getter private final int offset = 0;
        private final String description = "";

        AxisDirection(int offsetIn, String descriptionIn) {}

        @Override
        public String toString() {return null;}
    }

    public enum Plane {
        HORIZONTAL,
        VERTICAL;

        public EnumFacing[] facings(){return null;}
        public EnumFacing random(Random rand){return null;}
        public boolean apply(EnumFacing p_apply_1_){return false;}
        public Iterator<EnumFacing> iterator(){return null;}
    }

}
