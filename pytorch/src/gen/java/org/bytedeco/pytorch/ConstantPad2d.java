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


/** A {@code ModuleHolder} subclass for {@code ConstantPad2dImpl}.
 *  See the documentation for {@code ConstantPad2dImpl} class to learn what methods it
 *  provides, and examples of how to use {@code ConstantPad2d} with {@code torch::nn::ConstantPad2dOptions}.
 *  See the documentation for {@code ModuleHolder} to learn about PyTorch's
 *  module storage semantics. */
@Namespace("torch::nn") @Properties(inherit = org.bytedeco.pytorch.presets.torch.class)
public class ConstantPad2d extends ConstantPad2dImplModuleHolder {
    static { Loader.load(); }

     public ConstantPad2d(@ByVal @Cast("std::nullptr_t*") PointerPointer arg0) { super((Pointer)null); allocate(arg0); }
    private native void allocate(@ByVal @Cast("std::nullptr_t*") PointerPointer arg0); public ConstantPad2d(@SharedPtr @Cast({"", "std::shared_ptr<torch::nn::ConstantPad2dImpl>"}) ConstantPad2dImpl module) { super((Pointer)null); allocate(module); }
    private native void allocate(@SharedPtr @Cast({"", "std::shared_ptr<torch::nn::ConstantPad2dImpl>"}) ConstantPad2dImpl module);
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public ConstantPad2d(Pointer p) { super(p); }

  }