package org.webrtc;

/* loaded from: CallSessionFileRotatingLogSink.class */
public abstract class CallSessionFileRotatingLogSink {
    public static native long nativeAddSink(String str, int i, int i2);

    public static native void nativeDeleteSink(long j);

    public static native byte[] nativeGetLogData(String str);
}
