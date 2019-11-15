// Targeted by JavaCPP version 1.5.2: DO NOT EDIT THIS FILE

package org.bytedeco.tensorflow;

import org.bytedeco.tensorflow.Allocator;
import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.tensorflow.global.tensorflow.*;


@Namespace("tensorflow") @Properties(inherit = org.bytedeco.tensorflow.presets.tensorflow.class)
public class AsyncOpKernel extends OpKernel {
    static { Loader.load(); }

    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public AsyncOpKernel(Pointer p) { super(p); }
  // Lift OpKernel constructors.

  // Asynchronous compute.
  //
  // Implementations of ComputeAsync() must ensure that `done` is (eventually)
  // called exactly once to signal the completion of the computation. The
  // implementation of ComputeAsync() must not block on the execution of another
  // OpKernel. `done` may be called by the current thread, or by another thread
  // `context` is guaranteed to stay alive until the `done` callback starts.
  //
  // Since it is possible that the unblocking kernel may never run (due to an
  // error or cancellation), in most cases the AsyncOpKernel should implement
  // cancellation support via `ctx->cancellation_manager()`.
  //
  // WARNING: As soon as the `done` callback starts, `context` and `this` may be
  // deleted. No code depending on these objects should execute after the call
  // to `done`.
  public native void ComputeAsync(OpKernelContext context, @ByVal @Cast("tensorflow::AsyncOpKernel::DoneCallback*") Fn done);

  public native AsyncOpKernel AsAsync();

  public native void Compute(OpKernelContext context);
}