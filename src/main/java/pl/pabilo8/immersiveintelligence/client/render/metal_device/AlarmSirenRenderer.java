package pl.pabilo8.immersiveintelligence.client.render.metal_device;

import blusunrize.immersiveengineering.client.ClientUtils;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.RenderHelper;
import net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer;
import net.minecraft.util.EnumFacing;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import pl.pabilo8.immersiveintelligence.ImmersiveIntelligence;
import pl.pabilo8.immersiveintelligence.client.model.metal_device.ModelAlarmSiren;
import pl.pabilo8.immersiveintelligence.common.blocks.metal.TileEntityAlarmSiren;

/**
 * Created by Pabilo8 on 15-06-2019.
 */

@SideOnly(Side.CLIENT)
public class AlarmSirenRenderer extends TileEntitySpecialRenderer<TileEntityAlarmSiren>
{
	private static ModelAlarmSiren model = new ModelAlarmSiren();

	private static String texture = ImmersiveIntelligence.MODID+":textures/blocks/metal_device/alarm_siren.png";

	@Override
	public void render(TileEntityAlarmSiren te, double x, double y, double z, float partialTicks, int destroyStage, float alpha)
	{
		if(te!=null)
		{
			ClientUtils.bindTexture(texture);
			GlStateManager.pushMatrix();
			GlStateManager.translate((float)x+1, (float)y, (float)z);
			GlStateManager.color(1.0f, 1.0f, 1.0f, 1.0f);

			GlStateManager.disableLighting();
			RenderHelper.enableStandardItemLighting();

			model.getBlockRotation(te.getFacing(), model);
			model.render();

			GlStateManager.popMatrix();
			return;

		}
		else
		{

			GlStateManager.pushMatrix();
			GlStateManager.translate(x+1, y, z);
			GlStateManager.enableBlend();
			GlStateManager.enableAlpha();

			ClientUtils.bindTexture(texture);
			GlStateManager.color(1.0f, 1.0f, 1.0f, 1.0f);

			model.getBlockRotation(EnumFacing.NORTH, model);

			model.render();

			GlStateManager.popMatrix();
			return;
		}
	}
}
