package com.facebook.profilo.logger;

import X.C0il;
import com.facebook.profilo.mmapbuf.core.Buffer;
import com.facebook.profilo.writer.NativeTraceWriter;

/* loaded from: BufferLogger.class */
public final class BufferLogger {
    static {
        C0il.A0B("profilo");
    }

    public static native int writeAndWakeupTraceWriter(NativeTraceWriter nativeTraceWriter, Buffer buffer, long j, int i, int i2, int i3, long j2);

    public static native int writeBytesEntry(Buffer buffer, int i, int i2, int i3, String str);

    public static native int writeStandardEntry(Buffer buffer, int i, int i2, long j, int i3, int i4, int i5, long j2);
}
