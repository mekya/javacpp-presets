// Targeted by JavaCPP version 1.5.11-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.cuda.nvcomp;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import org.bytedeco.cuda.cudart.*;
import static org.bytedeco.cuda.global.cudart.*;

import static org.bytedeco.cuda.global.nvcomp.*;

// #endif

/******************************************************************************
 * Batched compression/decompression interface for Zstd
 *****************************************************************************/

/**
 * \brief Zstd compression options for the low-level API
 */
@Properties(inherit = org.bytedeco.cuda.presets.nvcomp.class)
public class nvcompBatchedZstdOpts_t extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public nvcompBatchedZstdOpts_t() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public nvcompBatchedZstdOpts_t(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public nvcompBatchedZstdOpts_t(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public nvcompBatchedZstdOpts_t position(long position) {
        return (nvcompBatchedZstdOpts_t)super.position(position);
    }
    @Override public nvcompBatchedZstdOpts_t getPointer(long i) {
        return new nvcompBatchedZstdOpts_t((Pointer)this).offsetAddress(i);
    }

  public native int reserved(); public native nvcompBatchedZstdOpts_t reserved(int setter);
}