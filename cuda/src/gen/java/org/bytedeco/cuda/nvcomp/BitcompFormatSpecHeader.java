// Targeted by JavaCPP version 1.5.11-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.cuda.nvcomp;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import org.bytedeco.cuda.cudart.*;
import static org.bytedeco.cuda.global.cudart.*;

import static org.bytedeco.cuda.global.nvcomp.*;


/**
 * \bried Format specification for Bitcomp compression
 */
@Namespace("nvcomp") @Properties(inherit = org.bytedeco.cuda.presets.nvcomp.class)
public class BitcompFormatSpecHeader extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public BitcompFormatSpecHeader() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public BitcompFormatSpecHeader(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public BitcompFormatSpecHeader(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public BitcompFormatSpecHeader position(long position) {
        return (BitcompFormatSpecHeader)super.position(position);
    }
    @Override public BitcompFormatSpecHeader getPointer(long i) {
        return new BitcompFormatSpecHeader((Pointer)this).offsetAddress(i);
    }

  /**
   * \brief Bitcomp algorithm options,
   *
   * - 0 : Default algorithm, usually gives the best compression ratios
   * - 1 : "Sparse" algorithm, works well on sparse data (with lots of zeroes).
   *        and is usually a faster than the default algorithm.
   */
  public native int algo(); public native BitcompFormatSpecHeader algo(int setter);
  /**
   * \brief One of nvcomp's possible data types
   */
  public native @Cast("nvcompType_t") int data_type(); public native BitcompFormatSpecHeader data_type(int setter);
}