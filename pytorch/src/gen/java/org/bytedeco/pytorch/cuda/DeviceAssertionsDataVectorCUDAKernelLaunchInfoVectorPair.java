// Targeted by JavaCPP version 1.5.11-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.pytorch.cuda;

import org.bytedeco.pytorch.Allocator;
import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import static org.bytedeco.openblas.global.openblas_nolapack.*;
import static org.bytedeco.openblas.global.openblas.*;
import org.bytedeco.javacpp.chrono.*;
import static org.bytedeco.javacpp.global.chrono.*;
import org.bytedeco.pytorch.*;
import static org.bytedeco.pytorch.global.torch.*;
import org.bytedeco.cuda.cudart.*;
import static org.bytedeco.cuda.global.cudart.*;
import org.bytedeco.cuda.cublas.*;
import static org.bytedeco.cuda.global.cublas.*;
import org.bytedeco.cuda.cudnn.*;
import static org.bytedeco.cuda.global.cudnn.*;
import org.bytedeco.cuda.cusparse.*;
import static org.bytedeco.cuda.global.cusparse.*;
import org.bytedeco.cuda.cusolver.*;
import static org.bytedeco.cuda.global.cusolver.*;
import org.bytedeco.cuda.cupti.*;
import static org.bytedeco.cuda.global.cupti.*;

import static org.bytedeco.pytorch.global.torch_cuda.*;

@NoOffset @Name("std::pair<std::vector<c10::cuda::DeviceAssertionsData>,std::vector<c10::cuda::CUDAKernelLaunchInfo> >") @Properties(inherit = org.bytedeco.pytorch.presets.torch_cuda.class)
public class DeviceAssertionsDataVectorCUDAKernelLaunchInfoVectorPair extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public DeviceAssertionsDataVectorCUDAKernelLaunchInfoVectorPair(Pointer p) { super(p); }
    public DeviceAssertionsDataVectorCUDAKernelLaunchInfoVectorPair(DeviceAssertionsDataVector firstValue, CUDAKernelLaunchInfoVector secondValue) { this(); put(firstValue, secondValue); }
    public DeviceAssertionsDataVectorCUDAKernelLaunchInfoVectorPair()       { allocate();  }
    private native void allocate();
    public native @Name("operator =") @ByRef DeviceAssertionsDataVectorCUDAKernelLaunchInfoVectorPair put(@ByRef DeviceAssertionsDataVectorCUDAKernelLaunchInfoVectorPair x);


    @MemberGetter public native @ByRef DeviceAssertionsDataVector first(); public native DeviceAssertionsDataVectorCUDAKernelLaunchInfoVectorPair first(DeviceAssertionsDataVector first);
    @MemberGetter public native @ByRef CUDAKernelLaunchInfoVector second();  public native DeviceAssertionsDataVectorCUDAKernelLaunchInfoVectorPair second(CUDAKernelLaunchInfoVector second);

    public DeviceAssertionsDataVectorCUDAKernelLaunchInfoVectorPair put(DeviceAssertionsDataVector firstValue, CUDAKernelLaunchInfoVector secondValue) {
        first(firstValue);
        second(secondValue);
        return this;
    }
}
