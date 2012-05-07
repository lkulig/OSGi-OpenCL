package opencl;

import gdts.common.data.type.VArray;
import gdts.common.data.type.VBoolean;
import gdts.common.data.type.VString;
import gdts.common.data.type.Variable;

public interface IJavaCL {

    void compile(VString kernelData, VBoolean result);

    void setParameters(Variable result, VArray parameters);

//    void executeProgram(Variable result);
}