package org.webrtc;

import X.J6S;

/* loaded from: LibvpxVp9Decoder.class */
public class LibvpxVp9Decoder extends J6S {
    public static native long nativeCreateDecoder();

    public static native boolean nativeIsSupported();

    public long createNative(long j) {
        return nativeCreateDecoder();
    }
}
