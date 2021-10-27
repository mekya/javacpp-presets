// Targeted by JavaCPP version 1.5.7-SNAPSHOT: DO NOT EDIT THIS FILE

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


// Each use is represented by this type, see 'Node::uses()'
// 'user' is the consumer of the value, 'offset' is the index into
// 'user's input this where the producers will be found.
@Namespace("torch::jit") @NoOffset @Properties(inherit = org.bytedeco.pytorch.presets.torch.class)
public class Use extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public Use(Pointer p) { super(p); }

  public Use(JitNode user, @Cast("size_t") long offset) { super((Pointer)null); allocate(user, offset); }
  private native void allocate(JitNode user, @Cast("size_t") long offset);
  public native JitNode user(); public native Use user(JitNode setter);
  public native @Cast("size_t") long offset(); public native Use offset(long setter);

  public native @Cast("bool") @Name("operator ==") boolean equals(@Const @ByRef Use b);
}