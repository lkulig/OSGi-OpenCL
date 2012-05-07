package opencl.test;

import static org.fest.assertions.Assertions.assertThat;
import gdts.common.data.type.VBoolean;
import gdts.common.data.type.VString;
import opencl.impl.JavaCLModule;

import org.junit.Ignore;
import org.junit.Test;

@Ignore
public class JavaCLModuleTest {

    private JavaCLModule module = new JavaCLModule();

    @SuppressWarnings("null")
    @Test
    public void shouldCompileKernel() {
        // given
        VString kernel = new VString("");
        VBoolean result = null;

        // when
        module.compile(kernel, result);

        // then
        assertThat(result.booleanValue()).as("Kernel should be compiled").isTrue();
    }
}