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


@Namespace("c10") @NoOffset @Properties(inherit = org.bytedeco.pytorch.presets.torch.class)
public class Argument extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public Argument(Pointer p) { super(p); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public Argument(long size) { super((Pointer)null); allocateArray(size); }
    private native void allocateArray(long size);
    @Override public Argument position(long position) {
        return (Argument)super.position(position);
    }
    @Override public Argument getPointer(long i) {
        return new Argument((Pointer)this).offsetAddress(i);
    }

  public Argument(
        @StdString BytePointer name/*=""*/,
        @ByVal(nullValue = "c10::TypePtr(nullptr)") Type.TypePtr type,
        @ByVal(nullValue = "c10::optional<int32_t>(c10::nullopt)") IntOptional N,
        @ByVal(nullValue = "c10::optional<c10::IValue>(c10::nullopt)") IValueOptional default_value,
        @Cast("bool") boolean kwarg_only/*=false*/,
        @ByVal(nullValue = "c10::optional<c10::AliasInfo>(c10::nullopt)") AliasInfoOptional alias_info) { super((Pointer)null); allocate(name, type, N, default_value, kwarg_only, alias_info); }
  private native void allocate(
        @StdString BytePointer name/*=""*/,
        @ByVal(nullValue = "c10::TypePtr(nullptr)") Type.TypePtr type,
        @ByVal(nullValue = "c10::optional<int32_t>(c10::nullopt)") IntOptional N,
        @ByVal(nullValue = "c10::optional<c10::IValue>(c10::nullopt)") IValueOptional default_value,
        @Cast("bool") boolean kwarg_only/*=false*/,
        @ByVal(nullValue = "c10::optional<c10::AliasInfo>(c10::nullopt)") AliasInfoOptional alias_info);
  public Argument() { super((Pointer)null); allocate(); }
  private native void allocate();
  public Argument(
        @StdString String name/*=""*/,
        @ByVal(nullValue = "c10::TypePtr(nullptr)") Type.TypePtr type,
        @ByVal(nullValue = "c10::optional<int32_t>(c10::nullopt)") IntOptional N,
        @ByVal(nullValue = "c10::optional<c10::IValue>(c10::nullopt)") IValueOptional default_value,
        @Cast("bool") boolean kwarg_only/*=false*/,
        @ByVal(nullValue = "c10::optional<c10::AliasInfo>(c10::nullopt)") AliasInfoOptional alias_info) { super((Pointer)null); allocate(name, type, N, default_value, kwarg_only, alias_info); }
  private native void allocate(
        @StdString String name/*=""*/,
        @ByVal(nullValue = "c10::TypePtr(nullptr)") Type.TypePtr type,
        @ByVal(nullValue = "c10::optional<int32_t>(c10::nullopt)") IntOptional N,
        @ByVal(nullValue = "c10::optional<c10::IValue>(c10::nullopt)") IValueOptional default_value,
        @Cast("bool") boolean kwarg_only/*=false*/,
        @ByVal(nullValue = "c10::optional<c10::AliasInfo>(c10::nullopt)") AliasInfoOptional alias_info);

  public Argument(
        @StdString BytePointer name,
        @ByVal Type.TypePtr fake_type,
        @ByVal Type.TypePtr real_type,
        @ByVal(nullValue = "c10::optional<int32_t>(c10::nullopt)") IntOptional N,
        @ByVal(nullValue = "c10::optional<c10::IValue>(c10::nullopt)") IValueOptional default_value,
        @Cast("bool") boolean kwarg_only/*=false*/,
        @ByVal(nullValue = "c10::optional<c10::AliasInfo>(c10::nullopt)") AliasInfoOptional alias_info) { super((Pointer)null); allocate(name, fake_type, real_type, N, default_value, kwarg_only, alias_info); }
  private native void allocate(
        @StdString BytePointer name,
        @ByVal Type.TypePtr fake_type,
        @ByVal Type.TypePtr real_type,
        @ByVal(nullValue = "c10::optional<int32_t>(c10::nullopt)") IntOptional N,
        @ByVal(nullValue = "c10::optional<c10::IValue>(c10::nullopt)") IValueOptional default_value,
        @Cast("bool") boolean kwarg_only/*=false*/,
        @ByVal(nullValue = "c10::optional<c10::AliasInfo>(c10::nullopt)") AliasInfoOptional alias_info);
  public Argument(
        @StdString BytePointer name,
        @ByVal Type.TypePtr fake_type,
        @ByVal Type.TypePtr real_type) { super((Pointer)null); allocate(name, fake_type, real_type); }
  private native void allocate(
        @StdString BytePointer name,
        @ByVal Type.TypePtr fake_type,
        @ByVal Type.TypePtr real_type);
  public Argument(
        @StdString String name,
        @ByVal Type.TypePtr fake_type,
        @ByVal Type.TypePtr real_type,
        @ByVal(nullValue = "c10::optional<int32_t>(c10::nullopt)") IntOptional N,
        @ByVal(nullValue = "c10::optional<c10::IValue>(c10::nullopt)") IValueOptional default_value,
        @Cast("bool") boolean kwarg_only/*=false*/,
        @ByVal(nullValue = "c10::optional<c10::AliasInfo>(c10::nullopt)") AliasInfoOptional alias_info) { super((Pointer)null); allocate(name, fake_type, real_type, N, default_value, kwarg_only, alias_info); }
  private native void allocate(
        @StdString String name,
        @ByVal Type.TypePtr fake_type,
        @ByVal Type.TypePtr real_type,
        @ByVal(nullValue = "c10::optional<int32_t>(c10::nullopt)") IntOptional N,
        @ByVal(nullValue = "c10::optional<c10::IValue>(c10::nullopt)") IValueOptional default_value,
        @Cast("bool") boolean kwarg_only/*=false*/,
        @ByVal(nullValue = "c10::optional<c10::AliasInfo>(c10::nullopt)") AliasInfoOptional alias_info);
  public Argument(
        @StdString String name,
        @ByVal Type.TypePtr fake_type,
        @ByVal Type.TypePtr real_type) { super((Pointer)null); allocate(name, fake_type, real_type); }
  private native void allocate(
        @StdString String name,
        @ByVal Type.TypePtr fake_type,
        @ByVal Type.TypePtr real_type);

  public Argument(@ByRef(true) Argument rhs) { super((Pointer)null); allocate(rhs); }
  @NoException(true) private native void allocate(@ByRef(true) Argument rhs);

  public native @ByRef @Name("operator =") Argument put(@ByRef(true) Argument rhs);

  public native @StdString BytePointer name();
  public native @Const @ByRef Type.TypePtr type();
  public native @Const @ByRef Type.TypePtr real_type();
  public native @ByVal IntOptional N();
  public native @Const @ByRef IValueOptional default_value();
  public native @Cast("bool") boolean kwarg_only();

  public native @Cast("bool") boolean is_out();

  public native @Const AliasInfo alias_info();

  public native @Cast("bool") boolean is_inferred_type();

  public native @StdString BytePointer formatTypeMismatchMsg(@StdString BytePointer actual_type);
  public native @StdString String formatTypeMismatchMsg(@StdString String actual_type);

  public native @ByVal Argument cloneWithType(@ByVal Type.TypePtr new_type);

  // this function checks whether this Argument is backward compatible with
  // the old one. we consider the following cases are backward compatible:
  //   1) two arguments are equal
  //   2) this arg's type should be subtype of old
  //   3) this arg must provide the same default value if old arg has one,
  public native @Cast("bool") boolean isBackwardCompatibleWith(
        @Const @ByRef Argument old,
        @Cast("std::ostream*") Pointer why_not/*=nullptr*/);
  public native @Cast("bool") boolean isBackwardCompatibleWith(
        @Const @ByRef Argument old);

  // this function checks whether this Argument is forward compatible with
  // the old one. we consider the following cases are forward compatible:
  //   1) two arguments are equal
  //   2) this arg's type should be subtype of old
  //   3) this arg must provide the same default value if old arg has one,
  public native @Cast("bool") boolean isForwardCompatibleWith(
        @Const @ByRef Argument old,
        @Cast("std::ostream*") Pointer why_not/*=nullptr*/);
  public native @Cast("bool") boolean isForwardCompatibleWith(
        @Const @ByRef Argument old);
}