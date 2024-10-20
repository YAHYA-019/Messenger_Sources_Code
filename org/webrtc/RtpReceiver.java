package org.webrtc;

/* loaded from: RtpReceiver.class */
public abstract class RtpReceiver {

    /* loaded from: RtpReceiver$Observer.class */
    public interface Observer {
    }

    public static native String nativeGetId(long j);

    public static native RtpParameters nativeGetParameters(long j);

    public static native long nativeGetTrack(long j);

    public static native void nativeSetFrameDecryptor(long j, long j2);

    public static native long nativeSetObserver(long j, Observer observer);

    public static native void nativeUnsetObserver(long j, long j2);
}
