package net.minecraft.entity;

import java.util.UUID;

import net.minecraft.block.material.Material;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.util.BlockPos;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.Vec3;

@SuppressWarnings("unused")
public abstract class Entity {
    public double renderDistanceWeight;
    public boolean preventEntitySpawning;
    public Entity riddenByEntity, ridingEntity;
    public boolean forceSpawn;
//    public World worldObj;
    public double prevPosX,prevPosY, prevPosZ, posX, posY, posZ, motionX, motionY, motionZ, lastTickPosX, lastTickPosY, lastTickPosZ;
    public float rotationYaw, rotationPitch, prevRotationYaw, prevRotationPitch, width, height, prevDistanceWalkedModified, distanceWalkedModified, distanceWalkedOnStepModified, fallDistance, stepHeight;
    public boolean onGround, isCollidedHorizontally, isCollidedVertically, isCollided, velocityChanged, isInWeb, isOutsideBorder, isDead;

    public boolean noClip;
    public float entityCollisionReduction;
    public int nextStepDistance, ticksExisted, fireResistance, hurtResistantTime;
    public boolean addedToChunk;
    public int chunkCoordX, chunkCoordY, chunkCoordZ, serverPosX, serverPosY, serverPosZ;
    public boolean ignoreFrustumCheck, isAirBorne;
    public int timeUntilPortal, dimension;

    public int getEntityId() {return 0;}
    public void setEntityId(int id){}
    public void onKillCommand(){}
    protected abstract void entityInit();
//    public DataWatcher getDataWatcher(){return null;}
    @Override
    public boolean equals(Object p_equals_1_) {return false;}
    @Override
    public int hashCode(){return 0;}
    public void setDead(){}
    public void setPosition(double x, double y, double z){}
    public void setAngles(float yaw, float pitch){}
    public void onUpdate(){}
    public void onEntityUpdate() {}
    public int getMaxInPortalTime() {return 0;}
    public void setFire(int seconds){}
    public void extinguish(){}
    public boolean isOffsetPositionInLiquid(double x, double y, double z){return false;}
    public void moveEntity(double x, double y, double z){}
    public void playSound(String name, float volume, float pitch){}
    public boolean isSilent(){return false;}
    public void setSilent(boolean isSilent){}
    public AxisAlignedBB getCollisionBoundingBox() {return null;}
    public final boolean isImmuneToFire() {return false;}
    public void fall(float distance, float damageMultiplier) {}
    public boolean isWet(){return false;}
    public boolean isInWater() {return false;}
    public boolean handleWaterMovement(){return false;}
    public void spawnRunningParticles(){}
    public boolean isInsideOfMaterial(Material materialIn){return false;}
    public boolean isInLava(){return false;}
    public void moveFlying(float strafe, float forward, float friction) {}
    public int getBrightnessForRender(float partialTicks) {return 0;}
    public float getBrightness(float partialTicks){return 0;}
//    public void setWorld(World worldIn){}
    public void setPositionAndRotation(double x, double y, double z, float yaw, float pitch){}
    public void moveToBlockPosAndAngles(BlockPos pos, float rotationYawIn, float rotationPitchIn){}
    public void setLocationAndAngles(double x, double y, double z, float yaw, float pitch){}
    public float getDistanceToEntity(Entity entityIn) {return 0;}
    public double getDistanceSq(double x, double y, double z){return 0;}
    public double getDistanceSq(BlockPos pos){return 0;}
    public double getDistanceSqToCenter(BlockPos pos){return 0;}
    public double getDistance(double x, double y, double z){return 0;}
    public double getDistance(BlockPos pos){return 0;}
    public double getDistanceSqToEntity(Entity entityIn){return 0;}
//    public void onCollideWithPlayer(EntityPlayer entityIn) {}
    public void applyEntityCollision(Entity entityIn){}
    public void addVelocity(double x, double y, double z) {}
//    public boolean attackEntityFrom(DamageSource source, float amount){return false;}
    public Vec3 getLook(float partialTicks) {return null;}
    public Vec3 getPositionEyes(float partialTicks) {return null;}
//    public MovingObjectPosition rayTrace(double blockReachDistance, float partialTicks){return null;}
    public boolean canBeCollidedWith() {return false;}
    public boolean canBePushed() {return false;}
    public void addToPlayerScore(Entity entityIn, int amount) {}
    public boolean isInRangeToRender3d(double x, double y, double z) {return false;}
    public boolean isInRangeToRenderDist(double distance){return false;}
//    public EntityItem dropItem(Item itemIn, int size) { return null; }
//    public EntityItem dropItemWithOffset(Item itemIn, int size, float offsetY){return null;}
//    public EntityItem entityDropItem(ItemStack itemStackIn, float offsetY){return null;
    public boolean isEntityAlive() {return !this.isDead;}
    public boolean isEntityInsideOpaqueBlock() {return false;}
//    public boolean interactFirst(EntityPlayer playerIn) {return false;}
    public AxisAlignedBB getCollisionBox(Entity entityIn){return null;}
    public void updateRidden() {}
    public void updateRiderPosition(){}
    public double getYOffset() {return 0;}
    public double getMountedYOffset(){return 0;}
    public void mountEntity(Entity entityIn) {}
    public void setPositionAndRotation2(double x, double y, double z, float yaw, float pitch, int posRotationIncrements, boolean p_180426_10_){}
    public float getCollisionBorderSize(){return 0;}
    public Vec3 getLookVec(){return null;}
    public void setPortal(BlockPos pos) {}
    public int getPortalCooldown() {return 300;}
    public void setVelocity(double x, double y, double z) {}
    public void handleStatusUpdate(byte id) {}
    public void performHurtAnimation() {}
//    public ItemStack[] getInventory() {return null;}
//    public void setCurrentItemOrArmor(int slotIn, ItemStack stack) {}
    public boolean isBurning() {return false;}
    public boolean isRiding(){return false;}
    public boolean isSneaking(){return false;}
    public void setSneaking(boolean sneaking){}
    public boolean isSprinting(){return false;}
    public void setSprinting(boolean sprinting){}
    public boolean isInvisible(){return false;}
//    public boolean isInvisibleToPlayer(EntityPlayer player){return false;}
    public void setInvisible(boolean invisible){}
    public boolean isEating(){return false;}
    public void setEating(boolean eating){}
    public int getAir() {return 0;}
    public void setAir(int air) {}
//    public void onStruckByLightning(EntityLightningBolt lightningBolt){}
//    public void onKillEntity(EntityLivingBase entityLivingIn){}
    public void setInWeb(){}
    public String getName(){return null;}
    public Entity[] getParts(){return null;}
    public boolean isEntityEqual(Entity entityIn){return false;}
    public float getRotationYawHead(){return 0;}
    public void setRotationYawHead(float rotation){}
    public void setRenderYawOffset(float offset) {}
    public boolean canAttackWithItem() {return false;}
    public boolean hitByEntity(Entity entityIn){return false;}
    @Override
    public String toString(){return null;}
//    public boolean isEntityInvulnerable(DamageSource source){return false;}
    public void copyLocationAndAnglesFrom(Entity entityIn){}
    public void copyDataFromOld(Entity entityIn){}
//    public float getExplosionResistance(Explosion explosionIn, World worldIn, BlockPos pos, IBlockState blockStateIn){return 0.0F;}
//    public boolean verifyExplosion(Explosion explosionIn, World worldIn, BlockPos pos, IBlockState blockStateIn, float p_174816_5_){return true;}
    public int getMaxFallHeight() {return 0;}
    public Vec3 func_181014_aG(){return null;}
    public EnumFacing getTeleportDirection(){return null;}
    public boolean doesEntityNotTriggerPressurePlate(){return false;}
    public boolean canRenderOnFire() { return false; }
    public UUID getUniqueID(){return null;}
    public boolean isPushedByWater(){return false;}
    public void setCustomNameTag(String name){}
    public String getCustomNameTag(){return null;}
    public boolean hasCustomName(){return false;}
    public void setAlwaysRenderNameTag(boolean alwaysRenderNameTag){}
    public boolean getAlwaysRenderNameTag(){return false;}
    public void setPositionAndUpdate(double x, double y, double z){}
    public boolean getAlwaysRenderNameTagForRender(){return false;}
    public void onDataWatcherUpdate(int dataID) {}
    public EnumFacing getHorizontalFacing(){return null;}
//    public boolean isSpectatedByPlayer(EntityPlayerMP player){return false;}
    public AxisAlignedBB getEntityBoundingBox(){return null;}
    public void setEntityBoundingBox(AxisAlignedBB bb){}
    public float getEyeHeight(){return 0;}
    public boolean isOutsideBorder(){return false;}
    public void setOutsideBorder(boolean outsideBorder){}
//    public boolean replaceItemInInventory(int inventorySlot, ItemStack itemStackIn){return false;}
    public boolean canCommandSenderUseCommand(int permLevel, String commandName){return false;}
    public BlockPos getPosition() {return null;}
    public Vec3 getPositionVector(){return null;}
//    public World getEntityWorld(){return null;}
    public Entity getCommandSenderEntity() {return this;}
    public boolean sendCommandFeedback() {return false;}
//    public void setCommandStat(CommandResultStats.Type type, int amount) {this.cmdResultStats.setCommandStatScore(this, type, amount);}
//    public CommandResultStats getCommandStats() {return null;}
    public void setCommandStats(Entity entityIn){}
//    public void clientUpdateEntityNBT(NBTTagCompound compound){}
//    public boolean interactAt(EntityPlayer player, Vec3 targetVec3){return false;}
    public boolean isImmuneToExplosions(){return false;}
}
