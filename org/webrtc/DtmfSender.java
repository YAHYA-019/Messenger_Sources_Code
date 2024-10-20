package org.webrtc;

/* loaded from: DtmfSender.class */
public abstract class DtmfSender {
    public static native boolean nativeCanInsertDtmf(long j);

    public static native int nativeDuration(long j);

    public static native boolean nativeInsertDtmf(long j, String str, int i, int i2);

    public static native int nativeInterToneGap(long j);

    public static native String nativeTones(long j);
}
