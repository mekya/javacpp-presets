// Targeted by JavaCPP version 1.5.8-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.pytorch;

import org.bytedeco.pytorch.Allocator;
import org.bytedeco.pytorch.Function;
import org.bytedeco.pytorch.Module;
import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import static org.bytedeco.openblas.global.openblas_nolapack.*;
import static org.bytedeco.openblas.global.openblas.*;

import static org.bytedeco.pytorch.global.torch.*;


// Source represents a code segment. It keeps track of:
//  - text_view : the view into text of the code segment
//  - filename (optional) : if present, represents the name of the file from
//                          which the code segment originated.
//  - starting_line_no : represents the line in the original file where the
//                       code segment started.
@Namespace("torch::jit") @NoOffset @Properties(inherit = org.bytedeco.pytorch.presets.torch.class)
public class Source extends Pointer {
    static { Loader.load(); }

  // Whether or not Source should copy the string passed in the constructor.
  public enum CopiesString { COPIES_STRING(0), DONT_COPY(1);

      public final int value;
      private CopiesString(int v) { this.value = v; }
      private CopiesString(CopiesString e) { this.value = e.value; }
      public CopiesString intern() { for (CopiesString e : values()) if (e.value == value) return e; return this; }
      @Override public String toString() { return intern().name(); }
  }

  public Source(
        @ByVal @Cast("c10::string_view*") Pointer text_view,
        @ByVal(nullValue = "c10::optional<std::string>(c10::nullopt)") StringOptional filename,
        @Cast("size_t") long starting_line_no/*=0*/,
        @SharedPtr SourceRangeUnpickler gen_ranges/*=nullptr*/,
        CopiesString copies_str/*=torch::jit::Source::COPIES_STRING*/) { super((Pointer)null); allocate(text_view, filename, starting_line_no, gen_ranges, copies_str); }
  private native void allocate(
        @ByVal @Cast("c10::string_view*") Pointer text_view,
        @ByVal(nullValue = "c10::optional<std::string>(c10::nullopt)") StringOptional filename,
        @Cast("size_t") long starting_line_no/*=0*/,
        @SharedPtr SourceRangeUnpickler gen_ranges/*=nullptr*/,
        CopiesString copies_str/*=torch::jit::Source::COPIES_STRING*/);
  public Source(
        @ByVal @Cast("c10::string_view*") Pointer text_view) { super((Pointer)null); allocate(text_view); }
  private native void allocate(
        @ByVal @Cast("c10::string_view*") Pointer text_view);
  public Source(
        @ByVal @Cast("c10::string_view*") Pointer text_view,
        @ByVal(nullValue = "c10::optional<std::string>(c10::nullopt)") StringOptional filename,
        @Cast("size_t") long starting_line_no/*=0*/,
        @SharedPtr SourceRangeUnpickler gen_ranges/*=nullptr*/,
        @Cast("torch::jit::Source::CopiesString") int copies_str/*=torch::jit::Source::COPIES_STRING*/) { super((Pointer)null); allocate(text_view, filename, starting_line_no, gen_ranges, copies_str); }
  private native void allocate(
        @ByVal @Cast("c10::string_view*") Pointer text_view,
        @ByVal(nullValue = "c10::optional<std::string>(c10::nullopt)") StringOptional filename,
        @Cast("size_t") long starting_line_no/*=0*/,
        @SharedPtr SourceRangeUnpickler gen_ranges/*=nullptr*/,
        @Cast("torch::jit::Source::CopiesString") int copies_str/*=torch::jit::Source::COPIES_STRING*/);

  public Source(
        @ByVal StringCordView str,
        @ByVal(nullValue = "c10::optional<std::string>(c10::nullopt)") StringOptional filename,
        @Cast("size_t") long starting_line_no/*=0*/,
        @SharedPtr SourceRangeUnpickler gen_ranges/*=nullptr*/) { super((Pointer)null); allocate(str, filename, starting_line_no, gen_ranges); }
  private native void allocate(
        @ByVal StringCordView str,
        @ByVal(nullValue = "c10::optional<std::string>(c10::nullopt)") StringOptional filename,
        @Cast("size_t") long starting_line_no/*=0*/,
        @SharedPtr SourceRangeUnpickler gen_ranges/*=nullptr*/);
  public Source(
        @ByVal StringCordView str) { super((Pointer)null); allocate(str); }
  private native void allocate(
        @ByVal StringCordView str);
  // Given a line number (within source_), return the byte offset of the
  // beginning of that line.
  public native @Cast("size_t") long offset_for_line(@Cast("size_t") long line);

  // Returns number of lines present.
  public native @Cast("size_t") long num_lines();

  // Calculate the line (within the code segment) on which `offset` resides.
  public native @Cast("size_t") long lineno_for_offset(@Cast("size_t") long offset);

  // Calculate the line (within the original source file, if present) on which
  // `lineno` resides.
  public native @Cast("size_t") long lineno_to_source_lineno(@Cast("size_t") long lineno);

  public native @ByVal StringCordView get_line(@Cast("size_t") long lineno);

  public native @Const @ByRef StringCordView text_str();

  public native @Cast("char") byte char_at(@Cast("size_t") long index);

  public native @Cast("size_t") long size();

  public native @ByRef StringOptional filename();

  public native @Cast("size_t") long starting_line_no();

  
}