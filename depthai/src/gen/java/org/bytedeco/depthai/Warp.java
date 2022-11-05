// Targeted by JavaCPP version 1.5.8: DO NOT EDIT THIS FILE

package org.bytedeco.depthai;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import static org.bytedeco.openblas.global.openblas_nolapack.*;
import static org.bytedeco.openblas.global.openblas.*;
import org.bytedeco.opencv.opencv_core.*;
import static org.bytedeco.opencv.global.opencv_core.*;
import org.bytedeco.opencv.opencv_imgproc.*;
import static org.bytedeco.opencv.global.opencv_imgproc.*;

import static org.bytedeco.depthai.global.depthai.*;


/**
 * \brief Warp node. Capability to crop, resize, warp, ... incoming image frames
 */
@Namespace("dai::node") @NoOffset @Properties(inherit = org.bytedeco.depthai.presets.depthai.class)
public class Warp extends WarpPropertiesNode {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public Warp(Pointer p) { super(p); }

    @MemberGetter public static native @Cast("const char*") BytePointer NAME();
    public Warp(@SharedPtr PipelineImpl par, @Cast("int64_t") long nodeId) { super((Pointer)null); allocate(par, nodeId); }
    private native void allocate(@SharedPtr PipelineImpl par, @Cast("int64_t") long nodeId);
    public Warp(@SharedPtr PipelineImpl par, @Cast("int64_t") long nodeId, @UniquePtr WarpProperties props) { super((Pointer)null); allocate(par, nodeId, props); }
    private native void allocate(@SharedPtr PipelineImpl par, @Cast("int64_t") long nodeId, @UniquePtr WarpProperties props);

    // /**
    //  * Initial config to use when manipulating frames
    //  */
    // WarpConfig initialConfig;

    // /**
    //  * Input WarpConfig message with ability to modify parameters in runtime
    //  * Default queue is blocking with size 8
    //  */
    // Input inputConfig{*this, "inputConfig", Input::Type::SReceiver, true, 8, {{DatatypeEnum::WarpConfig, true}}};

    /**
     * Input image to be modified
     * Default queue is blocking with size 8
     */
    @MemberGetter public native @ByRef Input inputImage();

    /**
     * Outputs ImgFrame message that carries warped image.
     */
    @MemberGetter public native @ByRef Output out();

    /**
     * Sets output frame size in pixels
     *
     * @param size width and height in pixels
     */
    public native void setOutputSize(@ByVal @Cast("std::tuple<int,int>*") Pointer size);
    public native void setOutputSize(int width, int height);

    /**
     * Set a custom warp mesh
     * @param meshData 2D plane of mesh points, starting from top left to bottom right
     * @param width Width of mesh
     * @param height Height of mesh
     */
    public native void setWarpMesh(@Const @ByRef Point2fVector meshData, int width, int height);
    public native void setWarpMesh(@Const @ByRef FloatFloatPairVector meshData, int width, int height);

    /**
     * Specify number of frames in pool.
     * @param numFramesPool How many frames should the pool have
     */
    public native void setNumFramesPool(int numFramesPool);

    /**
     * Specify maximum size of output image.
     * @param maxFrameSize Maximum frame size in bytes
     */
    public native void setMaxOutputFrameSize(int maxFrameSize);

    /**
     * Specify which hardware warp engines to use
     * @param ids Maximum frame size in bytes
     */
    public native void setHwIds(@ByVal IntVector ids);
    /** Retrieve which hardware warp engines to use */
    public native @ByVal IntVector getHwIds();

    /**
     * Specify which interpolation method to use
     * @param interpolation type of interpolation
     */
    public native void setInterpolation(@ByVal WarpProperties.Interpolation interpolation);
    /** Retrieve which interpolation method to use */
    public native @ByVal WarpProperties.Interpolation getInterpolation();
}