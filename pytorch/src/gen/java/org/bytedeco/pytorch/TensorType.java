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

// This type represents a single Tensor with a specific size
@Namespace("c10") @NoOffset @Properties(inherit = org.bytedeco.pytorch.presets.torch.class)
public class TensorType extends SharedType {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public TensorType(Pointer p) { super(p); }

  public static native @SharedPtr @ByVal TensorType create(@Const @ByRef Tensor t);

  // used by TensorType::create(size_t dim) which in turn used by
  // shape_analysis.cpp
  public static native @SharedPtr @ByVal TensorType create(
        @ByVal ScalarTypeOptional scalar_type,
        @ByVal DeviceOptional device,
        @Const @ByRef LongVaryingShape sizes,
        @Const @ByRef LongVaryingShape strides,
        @ByVal BoolOptional requires_grad,
        @ByVal(nullValue = "c10::optional<bool>(false)") BoolOptional undefined,
        @Cast("bool") boolean tensor_contiguity/*=false*/);
  public static native @SharedPtr @ByVal TensorType create(
        @ByVal ScalarTypeOptional scalar_type,
        @ByVal DeviceOptional device,
        @Const @ByRef LongVaryingShape sizes,
        @Const @ByRef LongVaryingShape strides,
        @ByVal BoolOptional requires_grad);

  public static native @SharedPtr @ByVal TensorType create(
        @ByVal ScalarTypeOptional scalar_type,
        @ByVal DeviceOptional device,
        @Const @ByRef SymbolicShape sizes,
        @Const @ByRef StrideVaryingShape stride_,
        @ByVal BoolOptional requires_grad,
        @ByVal(nullValue = "c10::optional<bool>(false)") BoolOptional undefined);
  public static native @SharedPtr @ByVal TensorType create(
        @ByVal ScalarTypeOptional scalar_type,
        @ByVal DeviceOptional device,
        @Const @ByRef SymbolicShape sizes,
        @Const @ByRef StrideVaryingShape stride_,
        @ByVal BoolOptional requires_grad);

  public static native @SharedPtr @ByVal TensorType create(
        @ByVal ScalarTypeOptional scalar_type,
        @ByVal DeviceOptional device,
        @ByVal SizeTOptional dim,
        @ByVal BoolOptional requires_grad);

  // overloaded create variadic template argument as it could not distinguish
  // initializer list
  public static native @SharedPtr @ByVal TensorType createContiguous(
        ScalarType scalar_type,
        @ByVal Device device,
        @ByVal @Cast("c10::ArrayRef<int64_t>*") LongArrayRef sizes);
  public static native @SharedPtr @ByVal TensorType createContiguous(
        ScalarType scalar_type,
        @ByVal Device device,
        @ByVal @Cast({"int64_t*", "c10::ArrayRef<int64_t>", "std::vector<int64_t>&"}) @StdVector long... sizes);

  public static native @ByVal Type.TypePtr fromNumberType(@Const @ByRef Type typ);
  public static native @ByVal Type.TypePtr fromBoolType();

  public native @ByVal SizeTOptional dim();

  public native @ByVal LongVaryingShape sizes();

  public native @ByVal LongVaryingShape strides();

  public native @Const @ByRef StrideVaryingShape stride_properties();

  public native @ByVal DeviceOptional device();
  public native @ByVal ScalarTypeOptional scalarType();
  public native @ByVal BoolOptional requiresGrad();
  public native @Cast("bool") boolean requires_grad();

  public native @Cast("bool") boolean equals(@Const @ByRef Type rhs);
  public native @Cast("bool") boolean isSubtypeOfExt(@Const @ByRef Type rhs, @Cast("std::ostream*") Pointer why_not);

  public native @StdString BytePointer str();

  public native @StdString BytePointer repr_str();

  public native @ByVal SizeTOptional numel();

  public native @SharedPtr @ByVal TensorType withRequiresGrad(@ByVal BoolOptional s);

  public native @SharedPtr @ByVal TensorType withScalarType(@ByVal ScalarTypeOptional st);

  public native @SharedPtr @ByVal TensorType withDim(@ByVal SizeTOptional d);

  public native @SharedPtr @ByVal TensorType withStrides(@ByVal StrideVaryingShape sstrides);

  public native @SharedPtr @ByVal TensorType withSizesStrides(
        @ByVal @Cast("c10::ArrayRef<int64_t>*") LongArrayRef sizes,
        @ByVal @Cast("c10::ArrayRef<int64_t>*") LongArrayRef strides);
  public native @SharedPtr @ByVal TensorType withSizesStrides(
        @ByVal @Cast({"int64_t*", "c10::ArrayRef<int64_t>", "std::vector<int64_t>&"}) @StdVector long[] sizes,
        @ByVal @Cast({"int64_t*", "c10::ArrayRef<int64_t>", "std::vector<int64_t>&"}) @StdVector long... strides);

  public native @SharedPtr @ByVal TensorType withSymbolicShapes(@ByVal SymbolicShape ssizes);

  public native @SharedPtr @ByVal TensorType withSizes(@ByVal @Cast("c10::ArrayRef<int64_t>*") LongArrayRef sizes);
  public native @SharedPtr @ByVal TensorType withSizes(@ByVal @Cast({"int64_t*", "c10::ArrayRef<int64_t>", "std::vector<int64_t>&"}) @StdVector long... sizes);

  public native @SharedPtr @ByVal TensorType withDevice(@Const @ByVal DeviceOptional device);

  public native @SharedPtr @ByVal TensorType dimensionedOnly();

  public native @SharedPtr @ByVal TensorType contiguous();

  public native @Const @ByRef SymbolicShape symbolic_sizes();

  public native @SharedPtr @ByVal TensorType merge(@Const @ByRef TensorType other, @Cast("bool") boolean merge_sizes/*=true*/);
  public native @SharedPtr @ByVal TensorType merge(@Const @ByRef TensorType other);

  public native @Cast("bool") boolean matchTensor(@Const @ByRef Tensor t);

  // is all information about the type specified except for autograd?
  // This replaces the notion of a 'CompleteTensorType' that used to exist
  // in the type-hierarchy. Excluding require_grad and undefined allows
  // this to match the old behavior.
  public native @Cast("bool") boolean isComplete();

  public native @Cast("bool") boolean isInferredType();

  public static native @SharedPtr @ByVal TensorType getInferred();

  // this property is used by GuardElimination
  // please see `checkInputs` for more details
  public native @Cast("bool") boolean isSummarized();

  public native @SharedPtr @ByVal TensorType withUndefined();

  public native @SharedPtr @ByVal TensorType withPossiblyUndefined();

  public native @ByVal BoolOptional undefined();

  public static native @Const @SharedPtr @ByRef TensorType get();

  @MemberGetter public static native TypeKind Kind();

  public static native @ByVal @Cast("std::vector<int64_t>*") LongVector contiguousStridesOf(
        @ByVal @Cast("c10::ArrayRef<int64_t>*") LongArrayRef in_sizes,
        @ByVal(nullValue = "at::MemoryFormat(c10::MemoryFormat::Contiguous)") MemoryFormat memory_format);
  public static native @ByVal @Cast("std::vector<int64_t>*") LongVector contiguousStridesOf(
        @ByVal @Cast("c10::ArrayRef<int64_t>*") LongArrayRef in_sizes);
  public static native @ByVal @Cast("std::vector<int64_t>*") LongVector contiguousStridesOf(
        @ByVal @Cast({"int64_t*", "c10::ArrayRef<int64_t>", "std::vector<int64_t>&"}) @StdVector long[] in_sizes,
        @ByVal(nullValue = "at::MemoryFormat(c10::MemoryFormat::Contiguous)") MemoryFormat memory_format);
  public static native @ByVal @Cast("std::vector<int64_t>*") LongVector contiguousStridesOf(
        @ByVal @Cast({"int64_t*", "c10::ArrayRef<int64_t>", "std::vector<int64_t>&"}) @StdVector long... in_sizes);
}