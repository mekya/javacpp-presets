// Targeted by JavaCPP version 1.5.2: DO NOT EDIT THIS FILE

package org.bytedeco.ffmpeg.avutil;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.ffmpeg.global.avutil.*;


/**
 * This struct aggregates all the (hardware/vendor-specific) "high-level" state,
 * i.e. state that is not tied to a concrete processing configuration.
 * E.g., in an API that supports hardware-accelerated encoding and decoding,
 * this struct will (if possible) wrap the state that is common to both encoding
 * and decoding and from which specific instances of encoders or decoders can be
 * derived.
 *
 * This struct is reference-counted with the AVBuffer mechanism. The
 * av_hwdevice_ctx_alloc() constructor yields a reference, whose data field
 * points to the actual AVHWDeviceContext. Further objects derived from
 * AVHWDeviceContext (such as AVHWFramesContext, describing a frame pool with
 * specific properties) will hold an internal reference to it. After all the
 * references are released, the AVHWDeviceContext itself will be freed,
 * optionally invoking a user-specified callback for uninitializing the hardware
 * state.
 */
@Properties(inherit = org.bytedeco.ffmpeg.presets.avutil.class)
public class AVHWDeviceContext extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public AVHWDeviceContext() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public AVHWDeviceContext(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public AVHWDeviceContext(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public AVHWDeviceContext position(long position) {
        return (AVHWDeviceContext)super.position(position);
    }

    /**
     * A class for logging. Set by av_hwdevice_ctx_alloc().
     */
    public native @Const AVClass av_class(); public native AVHWDeviceContext av_class(AVClass setter);

    /**
     * Private data used internally by libavutil. Must not be accessed in any
     * way by the caller.
     */
    public native AVHWDeviceInternal internal(); public native AVHWDeviceContext internal(AVHWDeviceInternal setter);

    /**
     * This field identifies the underlying API used for hardware access.
     *
     * This field is set when this struct is allocated and never changed
     * afterwards.
     */
    public native @Cast("AVHWDeviceType") int type(); public native AVHWDeviceContext type(int setter);

    /**
     * The format-specific data, allocated and freed by libavutil along with
     * this context.
     *
     * Should be cast by the user to the format-specific context defined in the
     * corresponding header (hwcontext_*.h) and filled as described in the
     * documentation before calling av_hwdevice_ctx_init().
     *
     * After calling av_hwdevice_ctx_init() this struct should not be modified
     * by the caller.
     */
    public native Pointer hwctx(); public native AVHWDeviceContext hwctx(Pointer setter);

    /**
     * This field may be set by the caller before calling av_hwdevice_ctx_init().
     *
     * If non-NULL, this callback will be called when the last reference to
     * this context is unreferenced, immediately before it is freed.
     *
     * \note when other objects (e.g an AVHWFramesContext) are derived from this
     *       struct, this callback will be invoked after all such child objects
     *       are fully uninitialized and their respective destructors invoked.
     */
    public static class Free_AVHWDeviceContext extends FunctionPointer {
        static { Loader.load(); }
        /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
        public    Free_AVHWDeviceContext(Pointer p) { super(p); }
        protected Free_AVHWDeviceContext() { allocate(); }
        private native void allocate();
        public native void call(AVHWDeviceContext ctx);
    }
    public native @Name("free") Free_AVHWDeviceContext _free(); public native AVHWDeviceContext _free(Free_AVHWDeviceContext setter);

    /**
     * Arbitrary user data, to be used e.g. by the free() callback.
     */
    public native Pointer user_opaque(); public native AVHWDeviceContext user_opaque(Pointer setter);
}