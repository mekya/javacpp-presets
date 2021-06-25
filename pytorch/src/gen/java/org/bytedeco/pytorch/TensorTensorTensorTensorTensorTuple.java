// Targeted by JavaCPP version 1.5.6-SNAPSHOT: DO NOT EDIT THIS FILE

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

@NoOffset @Name("std::tuple<at::Tensor,at::Tensor,at::Tensor,at::Tensor,at::Tensor>") @Properties(inherit = org.bytedeco.pytorch.presets.torch.class)
public class TensorTensorTensorTensorTensorTuple extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public TensorTensorTensorTensorTensorTuple(Pointer p) { super(p); }
    public TensorTensorTensorTensorTensorTuple(@ByRef Tensor value0, @ByRef Tensor value1, @ByRef Tensor value2, @ByRef Tensor value3, @ByRef Tensor value4) { allocate(value0, value1, value2, value3, value4); }
    private native void allocate(@ByRef Tensor value0, @ByRef Tensor value1, @ByRef Tensor value2, @ByRef Tensor value3, @ByRef Tensor value4);
    public TensorTensorTensorTensorTensorTuple()       { allocate();  }
    private native void allocate();
    public native @Name("operator =") @ByRef TensorTensorTensorTensorTensorTuple put(@ByRef TensorTensorTensorTensorTensorTuple x);

    public @ByRef Tensor get0() { return get0(this); }
    @Namespace @Name("std::get<0>") public static native @ByRef Tensor get0(@ByRef TensorTensorTensorTensorTensorTuple container);
    public @ByRef Tensor get1() { return get1(this); }
    @Namespace @Name("std::get<1>") public static native @ByRef Tensor get1(@ByRef TensorTensorTensorTensorTensorTuple container);
    public @ByRef Tensor get2() { return get2(this); }
    @Namespace @Name("std::get<2>") public static native @ByRef Tensor get2(@ByRef TensorTensorTensorTensorTensorTuple container);
    public @ByRef Tensor get3() { return get3(this); }
    @Namespace @Name("std::get<3>") public static native @ByRef Tensor get3(@ByRef TensorTensorTensorTensorTensorTuple container);
    public @ByRef Tensor get4() { return get4(this); }
    @Namespace @Name("std::get<4>") public static native @ByRef Tensor get4(@ByRef TensorTensorTensorTensorTensorTuple container);
}
