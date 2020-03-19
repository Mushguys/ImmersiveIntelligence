package pl.pabilo8.immersiveintelligence.api.bullets.penhandlers;

import pl.pabilo8.immersiveintelligence.api.bullets.PenetrationRegistry.IPenetrationHandler;

/**
 * Created by Pabilo8 on 06-03-2020.
 */
public class PenetrationHandlerBricks implements IPenetrationHandler
{
	@Override
	public float getIntegrity()
	{
		return 245f;
	}

	@Override
	public float getDensity()
	{
		return 0.9f;
	}
}
