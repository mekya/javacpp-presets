// Targeted by JavaCPP version 1.5.11-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.sentencepiece;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.sentencepiece.global.sentencepiece.*;


// Wrapper class of SentencePieceText
// This wrapper only allows an immutable access to the proto and
// hides the actual implementation of protobuf.
// See sentencepiece.proto for the details of this class.
@Namespace("sentencepiece") @NoOffset @Properties(inherit = org.bytedeco.sentencepiece.presets.sentencepiece.class)
public class ImmutableNBestSentencePieceText extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public ImmutableNBestSentencePieceText(Pointer p) { super(p); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public ImmutableNBestSentencePieceText(long size) { super((Pointer)null); allocateArray(size); }
    private native void allocateArray(long size);
    @Override public ImmutableNBestSentencePieceText position(long position) {
        return (ImmutableNBestSentencePieceText)super.position(position);
    }
    @Override public ImmutableNBestSentencePieceText getPointer(long i) {
        return new ImmutableNBestSentencePieceText((Pointer)this).offsetAddress(i);
    }

  public ImmutableNBestSentencePieceText() { super((Pointer)null); allocate(); }
  private native void allocate();

  public native @StdVector ImmutableSentencePieceText nbests();

  public native @Cast("size_t") long nbests_size();
  public native @ByVal ImmutableSentencePieceText nbests(int index);

  public native @StdString String SerializeAsString();

  // Returns the actual mutable proto.
  // Do not use this outside of SentencePieceProcessor, as
  // it returns the raw pointer managed by the shared_ptr.
  public native NBestSentencePieceText mutable_proto();

  public native void ConvertToUnicodeSpans();
}