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


// this is a holder for c10 global state (similar to at GlobalContext)
// currently it's used to store cuda synchronization warning state,
// but can be expanded to hold other related global state, e.g. to
// record stream usage
@Namespace("c10::cuda") @Properties(inherit = org.bytedeco.pytorch.presets.torch_cuda.class)
public class WarningState extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public WarningState() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public WarningState(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public WarningState(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public WarningState position(long position) {
        return (WarningState)super.position(position);
    }
    @Override public WarningState getPointer(long i) {
        return new WarningState((Pointer)this).offsetAddress(i);
    }

  public native void set_sync_debug_mode(SyncDebugMode l);
  public native void set_sync_debug_mode(@Cast("c10::cuda::SyncDebugMode") int l);

  public native SyncDebugMode get_sync_debug_mode();
}