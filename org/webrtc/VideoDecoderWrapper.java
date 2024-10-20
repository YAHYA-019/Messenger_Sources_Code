package org.webrtc;

import org.webrtc.VideoDecoder;
import org.webrtc.VideoDecoderWrapper;
import org.webrtc.VideoFrame;

/* loaded from: VideoDecoderWrapper.class */
public class VideoDecoderWrapper {
    public static VideoDecoder.Callback createDecoderCallback(final long j) {
        return new VideoDecoder.Callback() { // from class: X.N94
            @Override // org.webrtc.VideoDecoder.Callback
            public final void onDecodedFrame(VideoFrame videoFrame, Integer num, Integer num2) {
                VideoDecoderWrapper.nativeOnDecodedFrame(j, videoFrame, num, num2);
            }
        };
    }

    public static native void nativeOnDecodedFrame(long j, VideoFrame videoFrame, Integer num, Integer num2);
}
