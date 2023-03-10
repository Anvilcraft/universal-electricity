package universalelectricity.api.energy;

import net.minecraftforge.common.util.ForgeDirection;

/**
 * This interface is to be applied to all TileEntities which can store energy.
 * 
 * @author Calclavia
 */
public interface IEnergyContainer
{
	/**
	 * Sets the amount of energy this unit stored.
	 * 
	 * This function is NOT recommended for calling.
	 */
	public void setEnergy(ForgeDirection from, double energy);

	/**
	 * * @return Get the amount of energy currently stored in the block.
	 */
	public double getEnergy(ForgeDirection from);

	/**
	 * @return Get the max amount of energy that can be stored in the block.
	 */
	public double getEnergyCapacity(ForgeDirection from);
}
