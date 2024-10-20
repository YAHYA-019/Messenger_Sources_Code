package com.facebook.omnistore;

import X.C0il;
import com.facebook.jni.HybridData;
import java.io.Closeable;
import java.nio.ByteBuffer;

/* loaded from: SendQueueCursor.class */
public class SendQueueCursor implements Closeable {
    public final HybridData mHybridData;

    static {
        C0il.A0B("omnistore");
    }

    public SendQueueCursor(HybridData hybridData) {
        this.mHybridData = hybridData;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public native void close();

    public native long getClientVersionId();

    public native long getEnqueueTimestampMs();

    public native String getQueueName();

    public native long getSendAttempts();

    public native long getStoredProcedureId();

    public native ByteBuffer getStoredProcedureParams();

    public native String getUniqueKey();

    public native boolean step();
}
