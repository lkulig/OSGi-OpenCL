package gdts.module.matrixoperations;

import gdts.common.data.VarRole;
import gdts.common.data.VarType;
import gdts.common.data.type.VArray;
import gdts.common.data.type.VInteger;
import gdts.common.data.type.VMatrix;
import gdts.common.module.ModuleBase;
import gdts.common.module.ModuleType;
import gdts.common.module.annotation.Command;
import gdts.common.module.annotation.Module;
import gdts.common.module.annotation.Param;

@Module(id = "MatrixOperations", version = "1.0.0", type = ModuleType.BOTH)
public class MatrixOperations extends ModuleBase {

	@Command(id = "verifyInput", params = {
			@Param(id = "firstMatrix", type = VMatrix.class, role = VarRole.INPUT),
			@Param(id = "secondMatrix", type = VMatrix.class, role = VarRole.INPUT),
			@Param(id = "resultMatrixSize", type = VInteger.class, role = VarRole.OUTPUT), })
	public void verifyInput(VMatrix firstMatrix, VMatrix secondMatrix,
			VInteger resultMatrixSize) {
		if (firstMatrix.getHeight() == secondMatrix.getWidth()) {
			resultMatrixSize.setValue(new VInteger(firstMatrix.getHeight()));
		} else {
			throw new RuntimeException(
					"MatrixOperations.verifyInput: incorrect!!");
		}
	}

	@Command(id = "sliceMatrixToMultiply", params = {
			@Param(id = "firstMatrix", type = VMatrix.class, role = VarRole.INPUT),
			@Param(id = "secondMatrix", type = VMatrix.class, role = VarRole.INPUT),
			@Param(id = "vectorsFromFirst", type = VArray.class, role = VarRole.OUTPUT),
			@Param(id = "vectorsFromSecond", type = VArray.class, role = VarRole.OUTPUT), })
	public void sliceMatrixToMultiply(VMatrix firstMatrix,
			VMatrix secondMatrix, VArray vectorsFromFirst,
			VArray vectorsFromSecond) {

		int size = firstMatrix.getHeight();

		VArray first = new VArray(VarType.ARRAY);
		VArray second = new VArray(VarType.ARRAY);

		for (int i = 0; i < size; i++) {
			first.add(firstMatrix.getRow(i));
			second.add(secondMatrix.getColumn(i));
		}

		vectorsFromFirst.setValue(first.duplicate());
		vectorsFromSecond.setValue(second.duplicate());
	}

	@Command(id = "multiplyVectors", params = {
			@Param(id = "firstVector", type = VArray.class, role = VarRole.INPUT),
			@Param(id = "secondVector", type = VArray.class, role = VarRole.INPUT),
			@Param(id = "result", type = VInteger.class, role = VarRole.OUTPUT), })
	public void multiplyVectors(VArray firstVector, VArray secondVector,
			VInteger result) {

		long longResult = 0;

		for (int i = 0; i < firstVector.size(); i++) {
			longResult += ((VInteger) firstVector.getElementAt(i)).longValue()
					* ((VInteger) secondVector.getElementAt(i)).longValue();
		}

		result.setValue(new VInteger(longResult));
	}
}
