package org.webrtc;

import org.webrtc.VideoFrame;

/* loaded from: NativeAndroidVideoTrackSource.class */
public abstract class NativeAndroidVideoTrackSource {
    public static native VideoProcessor$FrameAdaptationParameters nativeAdaptFrame(long j, int i, int i2, int i3, long j2);

    public static native void nativeAdaptOutputFormat(long j, int i, int i2, Integer num, int i3, int i4, Integer num2, Integer num3);

    public static native void nativeOnFrameCaptured(long j, int i, long j2, VideoFrame.Buffer buffer);

    public static native void nativeSetIsScreencast(long j, boolean z);

    public static native void nativeSetState(long j, boolean z);
}
