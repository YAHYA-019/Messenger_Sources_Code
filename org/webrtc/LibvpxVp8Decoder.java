package org.webrtc;

import X.J6S;

/* loaded from: LibvpxVp8Decoder.class */
public class LibvpxVp8Decoder extends J6S {
    public static native long nativeCreateDecoder();

    public long createNative(long j) {
        return nativeCreateDecoder();
    }
}
