// Targeted by JavaCPP version 1.5.7: DO NOT EDIT THIS FILE

package org.bytedeco.nvcodec.nvcuvid;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import org.bytedeco.cuda.cudart.*;
import static org.bytedeco.cuda.global.cudart.*;

import static org.bytedeco.nvcodec.global.nvcuvid.*;

// #endif /* __cplusplus */

@Namespace @Name("void") @Opaque @Properties(inherit = org.bytedeco.nvcodec.presets.nvcuvid.class)
public class CUvideodecoder extends Pointer {
    /** Empty constructor. Calls {@code super((Pointer)null)}. */
    public CUvideodecoder() { super((Pointer)null); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public CUvideodecoder(Pointer p) { super(p); }
}