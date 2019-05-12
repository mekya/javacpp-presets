// Targeted by JavaCPP version 1.5.1-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.tensorflow;

import org.bytedeco.tensorflow.Allocator;
import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.tensorflow.global.tensorflow.*;

@Name("std::vector<std::vector<int> >") @Properties(inherit = org.bytedeco.tensorflow.presets.tensorflow.class)
public class IntIntVector extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public IntIntVector(Pointer p) { super(p); }
    public IntIntVector(int[] ... array) { this(array.length); put(array); }
    public IntIntVector()       { allocate();  }
    public IntIntVector(long n) { allocate(n); }
    private native void allocate();
    private native void allocate(@Cast("size_t") long n);
    public native @Name("operator=") @ByRef IntIntVector put(@ByRef IntIntVector x);

    public boolean empty() { return size() == 0; }
    public native long size();
    public void clear() { resize(0); }
    public native void resize(@Cast("size_t") long n);
    public boolean empty(@Cast("size_t") long i) { return size(i) == 0; }
    public native @Index(function = "at") long size(@Cast("size_t") long i);
    public void clear(@Cast("size_t") long i) { resize(i, 0); }
    public native @Index(function = "at") void resize(@Cast("size_t") long i, @Cast("size_t") long n);

    @Index(function = "at") public native int get(@Cast("size_t") long i, @Cast("size_t") long j);
    public native IntIntVector put(@Cast("size_t") long i, @Cast("size_t") long j, int value);

    public int[][] get() {
        int[][] array = new int[size() < Integer.MAX_VALUE ? (int)size() : Integer.MAX_VALUE][];
        for (int i = 0; i < array.length; i++) {
            array[i] = new int[size(i) < Integer.MAX_VALUE ? (int)size(i) : Integer.MAX_VALUE];
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = get(i, j);
            }
        }
        return array;
    }
    @Override public String toString() {
        return java.util.Arrays.deepToString(get());
    }

    public IntIntVector put(int[] ... array) {
        if (size() != array.length) { resize(array.length); }
        for (int i = 0; i < array.length; i++) {
            if (size(i) != array[i].length) { resize(i, array[i].length); }
            for (int j = 0; j < array[i].length; j++) {
                put(i, j, array[i][j]);
            }
        }
        return this;
    }
}
