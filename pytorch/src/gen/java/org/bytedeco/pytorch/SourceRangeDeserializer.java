// Targeted by JavaCPP version 1.5.8-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.pytorch;

import org.bytedeco.pytorch.Allocator;
import org.bytedeco.pytorch.Function;
import org.bytedeco.pytorch.Module;
import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import static org.bytedeco.openblas.global.openblas_nolapack.*;
import static org.bytedeco.openblas.global.openblas.*;

import static org.bytedeco.pytorch.global.torch.*;


@Namespace("torch::jit") @NoOffset @Properties(inherit = org.bytedeco.pytorch.presets.torch.class)
public class SourceRangeDeserializer extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public SourceRangeDeserializer(Pointer p) { super(p); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public SourceRangeDeserializer(long size) { super((Pointer)null); allocateArray(size); }
    private native void allocateArray(long size);
    @Override public SourceRangeDeserializer position(long position) {
        return (SourceRangeDeserializer)super.position(position);
    }
    @Override public SourceRangeDeserializer getPointer(long i) {
        return new SourceRangeDeserializer((Pointer)this).offsetAddress(i);
    }

  public SourceRangeDeserializer() { super((Pointer)null); allocate(); }
  private native void allocate();
  public SourceRangeDeserializer(@ByVal IValue text_table) { super((Pointer)null); allocate(text_table); }
  private native void allocate(@ByVal IValue text_table);
  
}