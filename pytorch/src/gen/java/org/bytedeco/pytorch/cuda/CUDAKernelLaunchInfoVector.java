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

@Name("std::vector<c10::cuda::CUDAKernelLaunchInfo>") @Properties(inherit = org.bytedeco.pytorch.presets.torch_cuda.class)
public class CUDAKernelLaunchInfoVector extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public CUDAKernelLaunchInfoVector(Pointer p) { super(p); }
    public CUDAKernelLaunchInfoVector(CUDAKernelLaunchInfo value) { this(1); put(0, value); }
    public CUDAKernelLaunchInfoVector(CUDAKernelLaunchInfo ... array) { this(array.length); put(array); }
    public CUDAKernelLaunchInfoVector()       { allocate();  }
    public CUDAKernelLaunchInfoVector(long n) { allocate(n); }
    private native void allocate();
    private native void allocate(@Cast("size_t") long n);
    public native @Name("operator =") @ByRef CUDAKernelLaunchInfoVector put(@ByRef CUDAKernelLaunchInfoVector x);

    public boolean empty() { return size() == 0; }
    public native long size();
    public void clear() { resize(0); }
    public native void resize(@Cast("size_t") long n);

    public CUDAKernelLaunchInfo front() { return get(0); }
    public CUDAKernelLaunchInfo back() { return get(size() - 1); }
    @Index(function = "at") public native @ByRef CUDAKernelLaunchInfo get(@Cast("size_t") long i);
    public native CUDAKernelLaunchInfoVector put(@Cast("size_t") long i, CUDAKernelLaunchInfo value);

    public native @ByVal Iterator insert(@ByVal Iterator pos, @ByRef CUDAKernelLaunchInfo value);
    public native @ByVal Iterator erase(@ByVal Iterator pos);
    public native @ByVal Iterator begin();
    public native @ByVal Iterator end();
    @NoOffset @Name("iterator") public static class Iterator extends Pointer {
        public Iterator(Pointer p) { super(p); }
        public Iterator() { }

        public native @Name("operator ++") @ByRef Iterator increment();
        public native @Name("operator ==") boolean equals(@ByRef Iterator it);
        public native @Name("operator *") @ByRef @Const CUDAKernelLaunchInfo get();
    }

    public CUDAKernelLaunchInfo[] get() {
        CUDAKernelLaunchInfo[] array = new CUDAKernelLaunchInfo[size() < Integer.MAX_VALUE ? (int)size() : Integer.MAX_VALUE];
        for (int i = 0; i < array.length; i++) {
            array[i] = get(i);
        }
        return array;
    }
    @Override public String toString() {
        return java.util.Arrays.toString(get());
    }

    public CUDAKernelLaunchInfo pop_back() {
        long size = size();
        CUDAKernelLaunchInfo value = get(size - 1);
        resize(size - 1);
        return value;
    }
    public CUDAKernelLaunchInfoVector push_back(CUDAKernelLaunchInfo value) {
        long size = size();
        resize(size + 1);
        return put(size, value);
    }
    public CUDAKernelLaunchInfoVector put(CUDAKernelLaunchInfo value) {
        if (size() != 1) { resize(1); }
        return put(0, value);
    }
    public CUDAKernelLaunchInfoVector put(CUDAKernelLaunchInfo ... array) {
        if (size() != array.length) { resize(array.length); }
        for (int i = 0; i < array.length; i++) {
            put(i, array[i]);
        }
        return this;
    }
}
