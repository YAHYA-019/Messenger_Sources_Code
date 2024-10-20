package com.facebook.profilo.mmapbuf.reader;

import X.C0il;
import com.facebook.jni.HybridData;

/* loaded from: MmapBufferHeaderReader.class */
public class MmapBufferHeaderReader {
    public final HybridData mHybridData = initHybrid();

    static {
        C0il.A0B("profilo_mmapbuf_rdr");
    }

    public static native HybridData initHybrid();

    public native long readTraceId(String str);
}
