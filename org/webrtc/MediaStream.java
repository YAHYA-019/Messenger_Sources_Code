package org.webrtc;

/* loaded from: MediaStream.class */
public abstract class MediaStream {
    public static native boolean nativeAddAudioTrackToNativeStream(long j, long j2);

    public static native boolean nativeAddVideoTrackToNativeStream(long j, long j2);

    public static native String nativeGetId(long j);

    public static native boolean nativeRemoveAudioTrack(long j, long j2);

    public static native boolean nativeRemoveVideoTrack(long j, long j2);
}
