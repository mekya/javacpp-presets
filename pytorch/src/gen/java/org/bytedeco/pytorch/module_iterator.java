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
 // namespace detail

// This iterator allows the (optionally recursive) enumeration of
// the  members of a Module. It performs a depth-first pre-order
// traversal of the module. The Policy template parameter determines
// which slots of the object should be included. For instance,
// when iterating parameters, we return the parameter tensors,
// but skip modules, buffers, and other attributes.
// See ModulePolicy for comments about Policy object's API.
@Name("torch::jit::slot_iterator_impl<torch::jit::detail::ModulePolicy>") @NoOffset @Properties(inherit = org.bytedeco.pytorch.presets.torch.class)
public class module_iterator extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public module_iterator(Pointer p) { super(p); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public module_iterator(long size) { super((Pointer)null); allocateArray(size); }
    private native void allocateArray(long size);
    @Override public module_iterator position(long position) {
        return (module_iterator)super.position(position);
    }
    @Override public module_iterator getPointer(long i) {
        return new module_iterator((Pointer)this).offsetAddress(i);
    }

  public module_iterator(
        @ByVal JitModule root,
        @Cast("bool") boolean recurse,
        @Cast("bool") boolean return_module) { super((Pointer)null); allocate(root, recurse, return_module); }
  private native void allocate(
        @ByVal JitModule root,
        @Cast("bool") boolean recurse,
        @Cast("bool") boolean return_module);
  // empty cursors_, represents end of iteration
  public module_iterator() { super((Pointer)null); allocate(); }
  private native void allocate();
  public native @ByVal @Name("operator *") JitModule multiply();
  public native @ByVal @Name("operator ->") JitModule access();
  public native @ByRef @Name("operator ++") module_iterator increment();
  public native @ByVal @Name("operator ++") module_iterator increment(int arg0);
}