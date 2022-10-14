// Targeted by JavaCPP version 1.5.7: DO NOT EDIT THIS FILE

package org.bytedeco.arrow;

import org.bytedeco.arrow.Function;
import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.arrow.global.arrow.*;
  // namespace fs

@Name("arrow::IterationTraits<arrow::fs::FileInfoVector>") @Properties(inherit = org.bytedeco.arrow.presets.arrow.class)
public class IterationTraits extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public IterationTraits() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public IterationTraits(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public IterationTraits(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public IterationTraits position(long position) {
        return (IterationTraits)super.position(position);
    }
    @Override public IterationTraits getPointer(long i) {
        return new IterationTraits((Pointer)this).offsetAddress(i);
    }

  public static native @ByVal FileInfoVector End();
  public static native @Cast("bool") boolean IsEnd(@Const @ByRef FileInfoVector val);
}