// Targeted by JavaCPP version 1.5.2: DO NOT EDIT THIS FILE

package org.bytedeco.tensorrt.nvinfer;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import org.bytedeco.cuda.cudart.*;
import static org.bytedeco.cuda.global.cudart.*;

import static org.bytedeco.tensorrt.global.nvinfer.*;


/**
 *  \class IOutputDimensionsFormula
 * 
 *  \brief Application-implemented interface to compute layer output sizes.
 *  */
@Namespace("nvinfer1") @Properties(inherit = org.bytedeco.tensorrt.presets.nvinfer.class)
public class IOutputDimensionsFormula extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public IOutputDimensionsFormula(Pointer p) { super(p); }

    /**
     *  \brief Application-implemented interface to compute the HW output dimensions of a layer from the layer input
     *  and parameters.
     * 
     *  @param inputDims The input dimensions of the layer.
     *  @param kernelSize The kernel size (or window size, for a pooling layer) parameter of the layer operation.
     *  @param stride The stride parameter for the layer.
     *  @param padding The padding parameter of the layer.
     *  @param dilation The dilation parameter of the layer (only applicable to convolutions).
     *  @param layerName The name of the layer.
     * 
     *  @return The output size of the layer
     * 
     *  Note that for dilated convolutions, the dilation is applied to the kernel size before this routine is called.
     *  */
    public native @ByVal DimsHW compute(@ByVal DimsHW inputDims, @ByVal DimsHW kernelSize, @ByVal DimsHW stride, @ByVal DimsHW padding, @ByVal DimsHW dilation, String layerName);
    public native @ByVal DimsHW compute(@ByVal DimsHW inputDims, @ByVal DimsHW kernelSize, @ByVal DimsHW stride, @ByVal DimsHW padding, @ByVal DimsHW dilation, @Cast("const char*") BytePointer layerName);
}