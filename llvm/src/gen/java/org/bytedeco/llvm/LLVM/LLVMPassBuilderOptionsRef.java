// Targeted by JavaCPP version 1.5.8-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.llvm.LLVM;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.llvm.global.LLVM.*;


/**
 * \defgroup LLVMCCoreNewPM New Pass Manager
 * \ingroup LLVMCCore
 *
 * \{
 */

/**
 * A set of options passed which are attached to the Pass Manager upon run.
 *
 * This corresponds to an llvm::LLVMPassBuilderOptions instance
 *
 * The details for how the different properties of this structure are used can
 * be found in the source for LLVMRunPasses
 */
@Name("LLVMOpaquePassBuilderOptions") @Opaque @Properties(inherit = org.bytedeco.llvm.presets.LLVM.class)
public class LLVMPassBuilderOptionsRef extends Pointer {
    /** Empty constructor. Calls {@code super((Pointer)null)}. */
    public LLVMPassBuilderOptionsRef() { super((Pointer)null); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public LLVMPassBuilderOptionsRef(Pointer p) { super(p); }
}