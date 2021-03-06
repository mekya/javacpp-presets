// Targeted by JavaCPP version 1.5.4: DO NOT EDIT THIS FILE

package org.bytedeco.arrow_dataset;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import org.bytedeco.arrow.*;
import static org.bytedeco.arrow.global.arrow.*;
import org.bytedeco.parquet.*;
import static org.bytedeco.arrow.global.parquet.*;

import static org.bytedeco.arrow.global.arrow_dataset.*;


/** \brief Shared state for a Scan operation */
@Namespace("arrow::dataset") @Properties(inherit = org.bytedeco.arrow.presets.arrow_dataset.class)
public class ScanContext extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public ScanContext() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public ScanContext(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public ScanContext(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public ScanContext position(long position) {
        return (ScanContext)super.position(position);
    }
    @Override public ScanContext getPointer(long i) {
        return new ScanContext(this).position(position + i);
    }

  /** A pool from which materialized and scanned arrays will be allocated. */
  public native MemoryPool pool(); public native ScanContext pool(MemoryPool setter);

  /** Indicate if the Scanner should make use of a ThreadPool. */
  public native @Cast("bool") boolean use_threads(); public native ScanContext use_threads(boolean setter);

  /** Return a threaded or serial TaskGroup according to use_threads. */
  public native @SharedPtr TaskGroup TaskGroup();
}
