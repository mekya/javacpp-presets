// Targeted by JavaCPP version 1.5.11-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.pytorch;

import org.bytedeco.pytorch.Allocator;
import org.bytedeco.pytorch.Function;
import org.bytedeco.pytorch.Module;
import org.bytedeco.javacpp.annotation.Cast;
import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import static org.bytedeco.openblas.global.openblas_nolapack.*;
import static org.bytedeco.openblas.global.openblas.*;
import org.bytedeco.javacpp.chrono.*;
import static org.bytedeco.javacpp.global.chrono.*;

import static org.bytedeco.pytorch.global.torch.*;

@NoOffset @Name("std::variant<torch::enumtype::kLSTM,torch::enumtype::kGRU,torch::enumtype::kRNN_TANH,torch::enumtype::kRNN_RELU>") @Properties(inherit = org.bytedeco.pytorch.presets.torch.class)
public class RNNBaseMode extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public RNNBaseMode(Pointer p) { super(p); }
    public RNNBaseMode(kLSTM value) { this(); put(value); }
    public RNNBaseMode(kGRU value) { this(); put(value); }
    public RNNBaseMode(kRNN_TANH value) { this(); put(value); }
    public RNNBaseMode(kRNN_RELU value) { this(); put(value); }
    public RNNBaseMode()       { allocate();  }
    private native void allocate();
    public native @Name("operator =") @ByRef RNNBaseMode put(@ByRef RNNBaseMode x);

    public @ByRef kLSTM get0() { return get0(this); }
    @Namespace @Name("std::get<0>") public static native @ByRef kLSTM get0(@ByRef RNNBaseMode container);
    @ValueSetter public native RNNBaseMode put(@ByRef kLSTM value);
    public @ByRef kGRU get1() { return get1(this); }
    @Namespace @Name("std::get<1>") public static native @ByRef kGRU get1(@ByRef RNNBaseMode container);
    @ValueSetter public native RNNBaseMode put(@ByRef kGRU value);
    public @ByRef kRNN_TANH get2() { return get2(this); }
    @Namespace @Name("std::get<2>") public static native @ByRef kRNN_TANH get2(@ByRef RNNBaseMode container);
    @ValueSetter public native RNNBaseMode put(@ByRef kRNN_TANH value);
    public @ByRef kRNN_RELU get3() { return get3(this); }
    @Namespace @Name("std::get<3>") public static native @ByRef kRNN_RELU get3(@ByRef RNNBaseMode container);
    @ValueSetter public native RNNBaseMode put(@ByRef kRNN_RELU value);
}
