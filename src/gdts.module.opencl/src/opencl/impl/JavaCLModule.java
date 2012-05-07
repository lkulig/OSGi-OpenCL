package opencl.impl;

import static opencl.utils.KernelUtils.extractKernelFrom;
import gdts.common.data.VarRole;
import gdts.common.data.type.VArray;
import gdts.common.data.type.VBoolean;
import gdts.common.data.type.VString;
import gdts.common.data.type.Variable;
import gdts.common.logger.SimpleLogger;
import gdts.common.module.ModuleBase;
import gdts.common.module.ModuleType;
import gdts.common.module.annotation.Command;
import gdts.common.module.annotation.Module;
import gdts.common.module.annotation.Param;
import opencl.IJavaCL;

import com.nativelibs4java.opencl.CLContext;
import com.nativelibs4java.opencl.CLKernel;
import com.nativelibs4java.opencl.CLProgram;
import com.nativelibs4java.opencl.JavaCL;

@Module(id = "JavaCLModule", version = "1.0.0", type = ModuleType.BOTH)
public class JavaCLModule extends ModuleBase implements IJavaCL {

    private CLContext context = JavaCL.createBestContext();
    private CLProgram program;
    private CLKernel kernel;
    private int parametersCount;

    @Command(id = "compile", params = { @Param(id = "kernel", type = VString.class, role = VarRole.INPUT),
            @Param(id = "result", type = VBoolean.class, role = VarRole.OUTPUT) })
    public void compile(VString kernelData, VBoolean result) {
        program = context.createProgram(kernelData.toString());
        kernel = program.createKernel(extractKernelFrom(kernelData.toString()));

        result.setValue(new VBoolean(kernel != null));
    }

    @Command(id = "setParameters", params = { @Param(id = "result", type = Variable.class, role = VarRole.OUTPUT),
            @Param(id = "parameters", type = VArray.class, role = VarRole.INPUT) })
    public void setParameters(Variable result, VArray parameters) {
        if (kernel == null) {
            SimpleLogger.log("Kernel is not set");
            return;
        }

        parametersCount = parameters.size();

        for (int i = 0; i < parametersCount; i++) {
            // Variable v = parameters.getElementAt(i);
            // CLBuffer<Float> parameter = context.createBuffer(Usage.Input, v.)
            // kernel.setObjectArg(i, parameters.getElementAt(i));
        }

        result.setValue(new VBoolean(true));
    }
    // @Command(id = "executeProgram", params = { @Param(id = "result", type = Variable.class, role = VarRole.OUTPUT) })
    // public void executeProgram(Variable result) {
    // CLBuffer<Float> out = context.createBuffer(Usage.Output, );
    // CLQueue queue = context.createDefaultQueue();
    // CLEvent addEvt = kernel.enqueueNDRange(queue, new int[] { 1 });
    //
    // }
}