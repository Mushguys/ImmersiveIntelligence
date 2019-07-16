package pl.pabilo8.immersiveintelligence.api.data.operators.logic;

import pl.pabilo8.immersiveintelligence.api.data.DataPacket;
import pl.pabilo8.immersiveintelligence.api.data.operators.DataOperator;
import pl.pabilo8.immersiveintelligence.api.data.types.DataPacketTypeBoolean;
import pl.pabilo8.immersiveintelligence.api.data.types.DataPacketTypeExpression;
import pl.pabilo8.immersiveintelligence.api.data.types.IDataType;

/**
 * Created by Pabilo8 on 05-07-2019.
 */
public class DataOperationNOT extends DataOperator
{
	public DataOperationNOT()
	{
		name = "NOT";
		sign = "!";
		allowedType1 = DataPacketTypeBoolean.class;
		allowedType2 = DataPacketTypeBoolean.class;
		expectedResult = DataPacketTypeBoolean.class;
	}

	@Override
	public IDataType execute(DataPacket packet, DataPacketTypeExpression data)
	{
		DataPacketTypeBoolean t1, t2;
		boolean i1, i2;

		t1 = ((DataPacketTypeBoolean)getVarInType(DataPacketTypeBoolean.class, data.getType1(), packet));
		t2 = ((DataPacketTypeBoolean)getVarInType(DataPacketTypeBoolean.class, data.getType2(), packet));
		i1 = t1.value;
		i2 = t2.value;

		//Yes
		return new DataPacketTypeBoolean(!i1);
	}
}