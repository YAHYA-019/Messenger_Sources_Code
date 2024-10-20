package org.webrtc;

/* loaded from: VideoEncoderFactory.class */
public interface VideoEncoderFactory {

    /* renamed from: org.webrtc.VideoEncoderFactory$-CC, reason: invalid class name */
    /* loaded from: VideoEncoderFactory$-CC.class */
    public abstract /* synthetic */ class CC {
        public static VideoEncoderSelector $default$getEncoderSelector(VideoEncoderFactory videoEncoderFactory) {
            return null;
        }
    }

    /* loaded from: VideoEncoderFactory$VideoEncoderSelector.class */
    public interface VideoEncoderSelector {

        /* renamed from: org.webrtc.VideoEncoderFactory$VideoEncoderSelector$-CC, reason: invalid class name */
        /* loaded from: VideoEncoderFactory$VideoEncoderSelector$-CC.class */
        public abstract /* synthetic */ class CC {
            public static VideoCodecInfo $default$onResolutionChange(VideoEncoderSelector videoEncoderSelector, int i, int i2) {
                return null;
            }
        }

        VideoCodecInfo onAvailableBitrate(int i);

        void onCurrentEncoder(VideoCodecInfo videoCodecInfo);

        VideoCodecInfo onEncoderBroken();

        VideoCodecInfo onResolutionChange(int i, int i2);
    }

    VideoEncoder createEncoder(VideoCodecInfo videoCodecInfo);

    VideoEncoderSelector getEncoderSelector();

    VideoCodecInfo[] getImplementations();

    VideoCodecInfo[] getSupportedCodecs();
}
