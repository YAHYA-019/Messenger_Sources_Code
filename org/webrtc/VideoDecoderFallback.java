package org.webrtc;

import X.J6S;

/* loaded from: VideoDecoderFallback.class */
public class VideoDecoderFallback extends J6S {
    public final VideoDecoder A00;
    public final VideoDecoder A01;

    public VideoDecoderFallback(VideoDecoder videoDecoder, VideoDecoder videoDecoder2) {
        this.A00 = videoDecoder;
        this.A01 = videoDecoder2;
    }

    public static native long nativeCreate(long j, VideoDecoder videoDecoder, VideoDecoder videoDecoder2);

    public long createNative(long j) {
        return nativeCreate(j, this.A00, this.A01);
    }
}
