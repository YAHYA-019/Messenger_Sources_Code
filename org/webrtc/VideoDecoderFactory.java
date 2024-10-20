package org.webrtc;

/* loaded from: VideoDecoderFactory.class */
public interface VideoDecoderFactory {
    VideoDecoder createDecoder(VideoCodecInfo videoCodecInfo);

    VideoCodecInfo[] getSupportedCodecs();
}
