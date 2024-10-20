package org.webrtc;

/* loaded from: MediaSource.class */
public abstract class MediaSource {

    /* loaded from: MediaSource$State.class */
    public enum State {
        INITIALIZING,
        LIVE,
        ENDED,
        MUTED
    }

    public static native State nativeGetState(long j);
}
