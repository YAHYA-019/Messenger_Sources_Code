package com.meta.vm;

import X.0FI;
import java.io.Closeable;

/* loaded from: OpusRecorder.class */
public class OpusRecorder implements Closeable {
    public OpusRecorder(String str) {
        allocateNative(str);
    }

    private native void allocateNative(String str);

    private native void freeNative();

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        freeNative();
    }

    public void finalize() {
        0FI.A09(-1089532991, 0FI.A03(2061257772));
    }

    public native long getPageNumber();

    public native boolean isRecording();

    public native void pause();

    public native void prepare();

    public native void setInitialVariablesForResume(long j, long j2);

    public native void start();

    public native void stop();
}
