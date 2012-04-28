package gdts.module.arithmetic;

import gdts.common.data.VarRole;
import gdts.common.data.type.VInteger;
import gdts.common.module.ModuleBase;
import gdts.common.module.ModuleType;
import gdts.common.module.annotation.Command;
import gdts.common.module.annotation.Module;
import gdts.common.module.annotation.Param;

@Module(id="Arithmetic", version="1.0.0", type=ModuleType.BOTH)
public class Arithmetic extends ModuleBase {

	@Command(
			id="addInts", 
			params={
					@Param(id="first", type=VInteger.class, role=VarRole.INPUT),
					@Param(id="second", type=VInteger.class, role=VarRole.INPUT),
					@Param(id="result", type=VInteger.class, role=VarRole.OUTPUT),
			})
	public void addInts(VInteger first, VInteger second, VInteger result) {
		result.setValue(first.add(second));
	}
	
	@Command(
			id="subInts", 
			params={
					@Param(id="first", type=VInteger.class, role=VarRole.INPUT),
					@Param(id="second", type=VInteger.class, role=VarRole.INPUT),
					@Param(id="result", type=VInteger.class, role=VarRole.OUTPUT),
			})
	public void subInts(VInteger first, VInteger second, VInteger result) {
		result.setValue(first.substract(second));
	}
}
