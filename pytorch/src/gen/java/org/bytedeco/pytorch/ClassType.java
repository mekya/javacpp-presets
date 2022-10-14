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


// This represents a class in TorchScript.
@Namespace("c10") @NoOffset @Properties(inherit = org.bytedeco.pytorch.presets.torch.class)
public class ClassType extends NamedType {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public ClassType(Pointer p) { super(p); }

  // This represents an attribute of a class; a name associated with an attribute, and a
  // getter and (optional) setter for that attribute.
  public static class Property extends Pointer {
      static { Loader.load(); }
      /** Default native constructor. */
      public Property() { super((Pointer)null); allocate(); }
      /** Native array allocator. Access with {@link Pointer#position(long)}. */
      public Property(long size) { super((Pointer)null); allocateArray(size); }
      /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
      public Property(Pointer p) { super(p); }
      private native void allocate();
      private native void allocateArray(long size);
      @Override public Property position(long position) {
          return (Property)super.position(position);
      }
      @Override public Property getPointer(long i) {
          return new Property((Pointer)this).offsetAddress(i);
      }
  
    public native @StdString BytePointer name(); public native Property name(BytePointer setter);
    public native Function getter(); public native Property getter(Function setter);
    public native Function setter(); public native Property setter(Function setter);
  }

  // Create a class type with name `name` and its methods stored in `cu`.

  public native @Cast("bool") boolean equals(@Const @ByRef Type rhs);

  public native @StdString BytePointer str();

  public native @StdString BytePointer repr_str();

  public native @Const @ByRef FunctionVector methods();

  public native @ByVal Type.TypePtr findAttribute(@StdString BytePointer name);
  public native @ByVal Type.TypePtr findAttribute(@StdString String name);

  public native @Const @ByRef Type.TypePtr getAttribute(@StdString BytePointer name);
  public native @Const @ByRef Type.TypePtr getAttribute(@StdString String name);

  public native @Cast("size_t") long numAttributes();

  public native @Const @ByRef Type.TypePtr getAttribute(@Cast("size_t") long slot);

  public native @StdString BytePointer getAttributeName(@Cast("size_t") long slot);

  public native void checkNotExist(@StdString BytePointer name, @StdString BytePointer what);
  public native void checkNotExist(@StdString String name, @StdString String what);

  // Attributes are stored in a specific slot at runtime for effiency.
  // When emitting instructions we specify the slot so that attribute access is
  // a constant lookup
  public native @ByVal SizeTOptional findAttributeSlot(@StdString BytePointer name);
  public native @ByVal SizeTOptional findAttributeSlot(@StdString String name);
  public native @Cast("size_t") long getAttributeSlot(@StdString BytePointer name);
  public native @Cast("size_t") long getAttributeSlot(@StdString String name);

  public native @Cast("bool") boolean hasAttribute(@StdString BytePointer name);
  public native @Cast("bool") boolean hasAttribute(@StdString String name);

  public native @Cast("bool") boolean isUnresolvedClassAttribute(@StdString BytePointer name);
  public native @Cast("bool") boolean isUnresolvedClassAttribute(@StdString String name);

  public native @ByVal TypeArrayRef containedTypes();

  public native @Cast("size_t") long addAttribute(
        @StdString BytePointer name,
        @ByVal Type.TypePtr type,
        @Cast("bool") boolean is_parameter/*=false*/,
        @Cast("bool") boolean is_buffer/*=false*/);
  public native @Cast("size_t") long addAttribute(
        @StdString BytePointer name,
        @ByVal Type.TypePtr type);
  public native @Cast("size_t") long addAttribute(
        @StdString String name,
        @ByVal Type.TypePtr type,
        @Cast("bool") boolean is_parameter/*=false*/,
        @Cast("bool") boolean is_buffer/*=false*/);
  public native @Cast("size_t") long addAttribute(
        @StdString String name,
        @ByVal Type.TypePtr type);

  // [Internal Only] Remove attribute from the ClassType,
  // caller is responsible to make sure the modification is safe:
  // it is unsafe to having existing allocations
  // of this object around anymore, and any code that works on
  // the attribute is now invalid. Only newly created code is
  // valid again.
  public native void unsafeRemoveAttribute(@StdString BytePointer name);
  public native void unsafeRemoveAttribute(@StdString String name);

  // [Internal Only] Change the type of an attribute of the ClassType,
  // The caller is responsible to make sure the modification is safe:
  // it is unsafe to maintain uses of the old type of the attribute,
  // and any code that works on the attribute is now invalid.
  // Only newly created code is valid again.
  public native void unsafeChangeAttributeType(@StdString BytePointer name, @ByVal Type.TypePtr new_ty);
  public native void unsafeChangeAttributeType(@StdString String name, @ByVal Type.TypePtr new_ty);

  // Add attribute \p NAME if it doesn't exist or verify that it has a
  // compatible type otherwise.
  public native @Cast("size_t") long addOrCheckAttribute(
        @StdString BytePointer name,
        @ByVal Type.TypePtr ty,
        @Cast("bool") boolean is_parameter/*=false*/,
        @Cast("bool") boolean is_buffer/*=false*/);
  public native @Cast("size_t") long addOrCheckAttribute(
        @StdString BytePointer name,
        @ByVal Type.TypePtr ty);
  public native @Cast("size_t") long addOrCheckAttribute(
        @StdString String name,
        @ByVal Type.TypePtr ty,
        @Cast("bool") boolean is_parameter/*=false*/,
        @Cast("bool") boolean is_buffer/*=false*/);
  public native @Cast("size_t") long addOrCheckAttribute(
        @StdString String name,
        @ByVal Type.TypePtr ty);

  // Get the property with the given \p name, if it exists on the class.
  public native @ByVal ClassTypePropertyOptional getProperty(@StdString BytePointer name);
  public native @ByVal ClassTypePropertyOptional getProperty(@StdString String name);
  // Add a property named \p name with \p getter and \p setter as its getter and setter.
  public native void addProperty(@StdString BytePointer name, Function getter, Function setter);
  public native void addProperty(@StdString String name, Function getter, Function setter);
  // Get a list of all properties.
  public native @StdVector Property properties();

  public native @Cast("bool") boolean hasConstant(@StdString BytePointer name);
  public native @Cast("bool") boolean hasConstant(@StdString String name);

  public native @Cast("size_t") long addConstant(@StdString BytePointer name, @Const @ByRef IValue value);
  public native @Cast("size_t") long addConstant(@StdString String name, @Const @ByRef IValue value);

  public native @ByVal SizeTOptional findConstantSlot(@StdString BytePointer name);
  public native @ByVal SizeTOptional findConstantSlot(@StdString String name);

  public native @Cast("size_t") long getConstantSlot(@StdString BytePointer name);
  public native @Cast("size_t") long getConstantSlot(@StdString String name);

  public native @StdString BytePointer getConstantName(@Cast("size_t") long slot);

  public native @StdString BytePointer doc_string();

  public native @ByVal IValue getConstant(@StdString BytePointer name);
  public native @ByVal IValue getConstant(@StdString String name);

  public native @ByVal IValue getConstant(@Cast("size_t") long slot);

  public native @ByVal IValueOptional findConstant(@StdString BytePointer name);
  public native @ByVal IValueOptional findConstant(@StdString String name);

  public native @Cast("size_t") long numConstants();

  public native @ByVal StringArrayRef constantNames();

  public native @ByVal @Cast("at::ArrayRef<c10::IValue>*") IValueArrayRef constantValues();

  // [Internal Only] Remove constant from the ClassType
  // caller is responsible to make sure the modification is safe:
  // it is unsafe to having existing allocations
  // of this object around anymore, and any code that works on
  // the attribute is now invalid. Only newly created code is
  // valid again.
  public native void unsafeRemoveConstant(@StdString BytePointer name);
  public native void unsafeRemoveConstant(@StdString String name);

  public native @ByVal Type.TypePtr createWithContained(@ByVal TypeVector contained_types);

  public native @Cast("bool") boolean is_module();

  public native @StdVector ClassAttribute getAttributes();

  public native @Cast("bool") boolean is_parameter(@Cast("size_t") long slot);

  public native @Cast("bool") boolean is_buffer(@Cast("size_t") long slot);

  public native void addForwardPreHook(Function pre_hook_ptr);
  public native void addForwardHook(Function hook_ptr);
  public native Function findForwardPreHook(@StdString BytePointer name);
  public native Function findForwardPreHook(@StdString String name);
  public native Function findForwardHook(@StdString BytePointer name);
  public native Function findForwardHook(@StdString String name);
  public native @Const @ByRef FunctionVector getForwardHooks();
  public native @Const @ByRef FunctionVector getForwardPreHooks();

  public native void checkForwardPreHookSchema(
        int pre_hook_idx,
        @Const @ByRef FunctionSchema pre_hook_schema);
  public native void checkForwardHookSchema(
        int hook_idx,
        @Const @ByRef FunctionSchema hook_schema);

  public native void addMethod(Function method);
  public native Function findMethod(@StdString BytePointer name);
  public native Function findMethod(@StdString String name);
  public native @ByRef Function getMethod(@StdString BytePointer name);
  public native @ByRef Function getMethod(@StdString String name);
  public native Function findHook(@StdString BytePointer name);
  public native Function findHook(@StdString String name);
  public native @ByRef Function getHook(@StdString BytePointer name);
  public native @ByRef Function getHook(@StdString String name);
  public native @Cast("bool") boolean hasMethod(@StdString BytePointer name);
  public native @Cast("bool") boolean hasMethod(@StdString String name);

  public native Function findStaticMethod(@StdString BytePointer name);
  public native Function findStaticMethod(@StdString String name);
  public native void addStaticMethod(Function method);

  // [Internal Only] Remove method from the ClassType
  // caller is responsible to make sure the modification is safe:
  // it is unsafe to having existing allocations
  // of this object around anymore, and any code that works on
  // the attribute is now invalid. Only newly created code is
  // valid again.
  // Note this method is intended for freezing only.
  public native void unsafeRemoveMethod(@StdString BytePointer name);
  public native void unsafeRemoveMethod(@StdString String name);

  public native @SharedPtr CompilationUnit compilation_unit();

  // generate a refined version of this class.
  // It has the same name but the slot Types are subtypes of
  // the original slots. It is only valid to refine a class type in a context
  // where it is know that there are not assignments to the objects slots
  // that would invalidate the refinement.
  // These variants are not registered in the global class table.
  public native @SharedPtr @ByVal ClassType refine(@ByVal TypeArrayRef refined_slots);

  public native @Cast("bool") boolean isSubtypeOfExt(@Const @ByRef Type rhs, @Cast("std::ostream*") Pointer why_not);

  @MemberGetter public static native @Const @ByRef TypeKind Kind();
}