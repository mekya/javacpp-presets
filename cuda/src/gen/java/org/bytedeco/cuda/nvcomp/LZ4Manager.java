// Targeted by JavaCPP version 1.5.11-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.cuda.nvcomp;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import org.bytedeco.cuda.cudart.*;
import static org.bytedeco.cuda.global.cudart.*;

import static org.bytedeco.cuda.global.nvcomp.*;


/**
 * \brief High-level interface class for LZ4 compressor
 *
 * \note Any uncompressed data buffer to be compressed MUST be a size that is a
 * multiple of the data type size, else compression may crash or result in
 * invalid output.
 */
@Namespace("nvcomp") @Properties(inherit = org.bytedeco.cuda.presets.nvcomp.class)
public class LZ4Manager extends PimplManager {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public LZ4Manager(Pointer p) { super(p); }


  // If user_stream is specified, the lifetime of the LZ4Manager must
  // extend beyond that of the user_stream
  public LZ4Manager(
      @Cast("size_t") long uncomp_chunk_size, @Const @ByRef(nullValue = "nvcompBatchedLZ4Opts_t(nvcompBatchedLZ4DefaultOpts)") nvcompBatchedLZ4Opts_t format_opts,
      CUstream_st user_stream/*=0*/, @Cast("nvcomp::ChecksumPolicy") int checksum_policy/*=nvcomp::NoComputeNoVerify*/,
      @Cast("nvcomp::BitstreamKind") int bitstream_kind/*=nvcomp::BitstreamKind::NVCOMP_NATIVE*/) { super((Pointer)null); allocate(uncomp_chunk_size, format_opts, user_stream, checksum_policy, bitstream_kind); }
  private native void allocate(
      @Cast("size_t") long uncomp_chunk_size, @Const @ByRef(nullValue = "nvcompBatchedLZ4Opts_t(nvcompBatchedLZ4DefaultOpts)") nvcompBatchedLZ4Opts_t format_opts,
      CUstream_st user_stream/*=0*/, @Cast("nvcomp::ChecksumPolicy") int checksum_policy/*=nvcomp::NoComputeNoVerify*/,
      @Cast("nvcomp::BitstreamKind") int bitstream_kind/*=nvcomp::BitstreamKind::NVCOMP_NATIVE*/);
  public LZ4Manager(
      @Cast("size_t") long uncomp_chunk_size) { super((Pointer)null); allocate(uncomp_chunk_size); }
  private native void allocate(
      @Cast("size_t") long uncomp_chunk_size);

  // This signature is deprecated, in favour of the one that does not accept a
  // device_id, and instead gets the device from the stream.
  @Deprecated public LZ4Manager(
      @Cast("size_t") long uncomp_chunk_size, @Const @ByRef nvcompBatchedLZ4Opts_t format_opts,
      CUstream_st user_stream, int device_id, @Cast("nvcomp::ChecksumPolicy") int checksum_policy/*=nvcomp::NoComputeNoVerify*/,
      @Cast("nvcomp::BitstreamKind") int bitstream_kind/*=nvcomp::BitstreamKind::NVCOMP_NATIVE*/) { super((Pointer)null); allocate(uncomp_chunk_size, format_opts, user_stream, device_id, checksum_policy, bitstream_kind); }
  @Deprecated private native void allocate(
      @Cast("size_t") long uncomp_chunk_size, @Const @ByRef nvcompBatchedLZ4Opts_t format_opts,
      CUstream_st user_stream, int device_id, @Cast("nvcomp::ChecksumPolicy") int checksum_policy/*=nvcomp::NoComputeNoVerify*/,
      @Cast("nvcomp::BitstreamKind") int bitstream_kind/*=nvcomp::BitstreamKind::NVCOMP_NATIVE*/);
  @Deprecated public LZ4Manager(
      @Cast("size_t") long uncomp_chunk_size, @Const @ByRef nvcompBatchedLZ4Opts_t format_opts,
      CUstream_st user_stream, int device_id) { super((Pointer)null); allocate(uncomp_chunk_size, format_opts, user_stream, device_id); }
  @Deprecated private native void allocate(
      @Cast("size_t") long uncomp_chunk_size, @Const @ByRef nvcompBatchedLZ4Opts_t format_opts,
      CUstream_st user_stream, int device_id);
}