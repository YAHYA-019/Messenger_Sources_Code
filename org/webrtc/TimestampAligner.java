package org.webrtc;

/* loaded from: TimestampAligner.class */
public class TimestampAligner {
    public TimestampAligner() {
        nativeCreateTimestampAligner();
    }

    public static native long nativeCreateTimestampAligner();

    public static native void nativeReleaseTimestampAligner(long j);

    public static native long nativeRtcTimeNanos();

    public static native long nativeTranslateTimestamp(long j, long j2);
}
