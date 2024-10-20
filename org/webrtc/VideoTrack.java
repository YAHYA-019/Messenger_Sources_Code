package org.webrtc;

/* loaded from: VideoTrack.class */
public abstract class VideoTrack extends MediaStreamTrack {
    public static native void nativeAddSink(long j, long j2);

    public static native void nativeFreeSink(long j);

    public static native void nativeRemoveSink(long j, long j2);

    public static native long nativeWrapSink(VideoSink videoSink);
}
