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

@Name("torch::data::StatelessDataLoader<JavaCPP_javacpp_0003a_0003aStreamDataset_0003ctorch_0003a_0003aTensor_0002ctorch_0003a_0003adata_0003a_0003aexample_0003a_0003aNoTarget_0003e,torch::data::samplers::StreamSampler>") @NoOffset @Properties(inherit = org.bytedeco.pytorch.presets.torch.class)
public class JavaStreamTensorDataLoader extends JavaStreamTensorDataLoaderBase {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public JavaStreamTensorDataLoader(Pointer p) { super(p); }


  /** Constructs the {@code StatelessDataLoader} from a {@code dataset}, a {@code sampler} and
   *  some {@code options}. */
  public JavaStreamTensorDataLoader(
        @ByVal @Cast("JavaCPP_javacpp_0003a_0003aStreamDataset_0003ctorch_0003a_0003aTensor_0002ctorch_0003a_0003adata_0003a_0003aexample_0003a_0003aNoTarget_0003e*") JavaStreamTensorDataset dataset,
        @ByVal StreamSampler sampler,
        @ByVal DataLoaderOptions options) { super((Pointer)null); allocate(dataset, sampler, options); }
  private native void allocate(
        @ByVal @Cast("JavaCPP_javacpp_0003a_0003aStreamDataset_0003ctorch_0003a_0003aTensor_0002ctorch_0003a_0003adata_0003a_0003aexample_0003a_0003aNoTarget_0003e*") JavaStreamTensorDataset dataset,
        @ByVal StreamSampler sampler,
        @ByVal DataLoaderOptions options);
}