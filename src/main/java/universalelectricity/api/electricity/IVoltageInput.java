package universalelectricity.api.electricity;

import net.minecraftforge.common.util.ForgeDirection;

/**
 * Implement this on your TileEntity if it has a voltage based energy input. You machine will still
 * need to run its own voltage checks as this doesn't do anything on its own.
 * 
 * @author DarkGuardsman
 */
public interface IVoltageInput
{
	/** Voltage input on the side mainly used for meters */
	public double getVoltageInput(ForgeDirection direction);

	/** Called when the network voltage doesn't equal the input */
	public void onWrongVoltage(ForgeDirection direction, double voltage);
}
