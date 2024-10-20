package org.webrtc;

import java.util.List;

/* loaded from: RtpSender.class */
public abstract class RtpSender {
    public static native long nativeGetDtmfSender(long j);

    public static native String nativeGetId(long j);

    public static native RtpParameters nativeGetParameters(long j);

    public static native List nativeGetStreams(long j);

    public static native long nativeGetTrack(long j);

    public static native void nativeSetFrameEncryptor(long j, long j2);

    public static native boolean nativeSetParameters(long j, RtpParameters rtpParameters);

    public static native void nativeSetStreams(long j, List list);

    public static native boolean nativeSetTrack(long j, long j2);
}
