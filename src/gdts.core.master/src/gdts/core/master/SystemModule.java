package gdts.core.master;

import gdts.common.data.VarRole;
import gdts.common.data.type.VArray;
import gdts.common.data.type.VInteger;
import gdts.common.data.type.VMatrix;
import gdts.common.data.type.Variable;
import gdts.common.module.ModuleBase;
import gdts.common.module.annotation.Command;
import gdts.common.module.annotation.Param;
import gdts.common.util.Util;

/**
 * Wykonawczy moduł Nadzorcy.
 * 
 * @author Maciej Milczarek
 */
public class SystemModule extends ModuleBase {
	
	@Command(
			id="WAIT",
			params={
					@Param(id="inMilis", type=VInteger.class, role=VarRole.INPUT),
			})
	public void wait(VInteger inMilis) {
		try {
			Thread.sleep(inMilis.longValue());
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	@Command(
			id="ADD_TO_ARRAY",
			params={
					@Param(id="array", type=VArray.class, role=VarRole.INOUT),
					@Param(id="value", type=Variable.class, role=VarRole.INPUT)
			})
	public void addToArray(VArray array, Variable var) {
		array.add(var.duplicate());
	}
	
	@Command(
			id="INIT_MATRIX",
			params={
					@Param(id="matrix", type=VMatrix.class, role=VarRole.INOUT),
					@Param(id="height", type=VInteger.class, role=VarRole.INPUT),
					@Param(id="width", type=VInteger.class, role=VarRole.INPUT)
			})
	public void initMatrix(VMatrix matrix, VInteger height, VInteger width) {
		matrix.resizeAndClean((int)height.longValue(), (int)width.longValue());
	}
	
	@Command(
			id="INCREMENT", 
			params={
					@Param(id="var", type=VInteger.class, role=VarRole.INOUT)
		})
	public void increment(VInteger var) {
		var.setValue(var.add(new VInteger(1L)));
	}
	
	@Command(
			id="DECREMENT", 
			params={
					@Param(id="var", type=VInteger.class, role=VarRole.INOUT)
		})
	public void decrement(VInteger var) {
		var.setValue(var.substract(new VInteger(1L)));
	}

	@Command(
			id="PRINT", 
			params={
					@Param(id="text", type=Variable.class, role=VarRole.INPUT)
		})
	public void print(Variable obj) {
		System.out.print("FROM SCRIPT AT " + Util.timeString() + ": " + obj.toString());
		//SimpleLogger.log("[SCRIPT OUTPUT] " + obj.toString());
	}
	
	
	
	@Command(
			id="PRINTLN", 
			params={
					@Param(id="text", type=Variable.class, role=VarRole.INPUT)
		})
	public void println(Variable obj) {
		System.out.println("FROM SCRIPT AT " + Util.timeString() + ": " + obj.toString());
	}
}
