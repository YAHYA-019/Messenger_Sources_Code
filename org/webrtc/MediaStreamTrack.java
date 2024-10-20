package org.webrtc;

/* loaded from: MediaStreamTrack.class */
public abstract class MediaStreamTrack {

    /* loaded from: MediaStreamTrack$MediaType.class */
    public enum MediaType {
        MEDIA_TYPE_AUDIO(0),
        MEDIA_TYPE_VIDEO(1);

        public final int nativeIndex;

        MediaType(int i) {
            this.nativeIndex = i;
        }
    }

    /* loaded from: MediaStreamTrack$State.class */
    public enum State {
        LIVE,
        ENDED
    }

    public static native boolean nativeGetEnabled(long j);

    public static native String nativeGetId(long j);

    public static native String nativeGetKind(long j);

    public static native State nativeGetState(long j);

    public static native boolean nativeSetEnabled(long j, boolean z);
}
