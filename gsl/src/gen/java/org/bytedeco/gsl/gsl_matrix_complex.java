// Targeted by JavaCPP version 1.5.2: DO NOT EDIT THIS FILE

package org.bytedeco.gsl;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.openblas.global.openblas_nolapack.*;
import static org.bytedeco.openblas.global.openblas.*;

import static org.bytedeco.gsl.global.gsl.*;

// #else
// #endif

 @Properties(inherit = org.bytedeco.gsl.presets.gsl.class)
public class gsl_matrix_complex extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public gsl_matrix_complex() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public gsl_matrix_complex(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public gsl_matrix_complex(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public gsl_matrix_complex position(long position) {
        return (gsl_matrix_complex)super.position(position);
    }

  public native @Cast("size_t") long size1(); public native gsl_matrix_complex size1(long setter);
  public native @Cast("size_t") long size2(); public native gsl_matrix_complex size2(long setter);
  public native @Cast("size_t") long tda(); public native gsl_matrix_complex tda(long setter);
  public native DoublePointer data(); public native gsl_matrix_complex data(DoublePointer setter);
  public native gsl_block_complex block(); public native gsl_matrix_complex block(gsl_block_complex setter);
  public native int owner(); public native gsl_matrix_complex owner(int setter);
} 