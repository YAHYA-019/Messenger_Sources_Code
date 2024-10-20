package com.facebook.profilo.mmapbuf.writer;

import X.C0il;
import com.facebook.jni.HybridData;
import com.facebook.profilo.writer.NativeTraceWriterCallbacks;

/* loaded from: MmapBufferTraceWriter.class */
public class MmapBufferTraceWriter {
    public final HybridData mHybridData = initHybrid();

    static {
        C0il.A0B("profilo_mmap_file_writer");
    }

    public static native HybridData initHybrid();

    public native long nativeInitAndVerify(String str);

    public native void nativeWriteTrace(String str, boolean z, String str2, String str3, int i, NativeTraceWriterCallbacks nativeTraceWriterCallbacks, String[] strArr);
}
