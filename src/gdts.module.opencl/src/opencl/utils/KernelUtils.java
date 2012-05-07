package opencl.utils;

public final class KernelUtils {

    public static String extractKernelFrom(String kernelData) {
        String[] splittedOnNawias = kernelData.split("(");
        String[] splittedOnSpace = splittedOnNawias[0].split(" ");
        return splittedOnSpace[2];
    }
}