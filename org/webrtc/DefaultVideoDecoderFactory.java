package org.webrtc;

import X.7zL;
import X.AnonymousClass001;
import X.J6W;
import X.JCC;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Map;

/* loaded from: DefaultVideoDecoderFactory.class */
public class DefaultVideoDecoderFactory implements VideoDecoderFactory {
    public final VideoDecoderFactory hardwareVideoDecoderFactory;
    public final VideoDecoderFactory platformSoftwareVideoDecoderFactory;
    public final VideoDecoderFactory softwareVideoDecoderFactory;

    /* JADX WARN: Type inference failed for: r0v1, types: [org.webrtc.VideoDecoderFactory, java.lang.Object] */
    public DefaultVideoDecoderFactory(EglBase$Context eglBase$Context) {
        this.softwareVideoDecoderFactory = new Object();
        this.hardwareVideoDecoderFactory = new HardwareVideoDecoderFactory(eglBase$Context);
        this.platformSoftwareVideoDecoderFactory = new J6W(eglBase$Context, JCC.A00);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [org.webrtc.VideoDecoderFactory, java.lang.Object] */
    public DefaultVideoDecoderFactory(EglBase$Context eglBase$Context, Map map) {
        this.softwareVideoDecoderFactory = new Object();
        this.hardwareVideoDecoderFactory = new HardwareVideoDecoderFactory(eglBase$Context, map);
        this.platformSoftwareVideoDecoderFactory = new J6W(eglBase$Context, JCC.A00);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [org.webrtc.VideoDecoderFactory, java.lang.Object] */
    public DefaultVideoDecoderFactory(VideoDecoderFactory videoDecoderFactory) {
        this.softwareVideoDecoderFactory = new Object();
        this.hardwareVideoDecoderFactory = videoDecoderFactory;
        this.platformSoftwareVideoDecoderFactory = null;
    }

    public /* synthetic */ VideoDecoder createDecoder(String str) {
        throw AnonymousClass001.A0q("Deprecated and not implemented.");
    }

    @Override // org.webrtc.VideoDecoderFactory
    public VideoDecoder createDecoder(VideoCodecInfo videoCodecInfo) {
        VideoDecoderFactory videoDecoderFactory;
        VideoDecoder createDecoder = this.softwareVideoDecoderFactory.createDecoder(videoCodecInfo);
        VideoDecoder createDecoder2 = this.hardwareVideoDecoderFactory.createDecoder(videoCodecInfo);
        if (createDecoder == null && (videoDecoderFactory = this.platformSoftwareVideoDecoderFactory) != null) {
            createDecoder = videoDecoderFactory.createDecoder(videoCodecInfo);
        }
        return createDecoder2 != null ? createDecoder != null ? new VideoDecoderFallback(createDecoder, createDecoder2) : createDecoder2 : createDecoder;
    }

    @Override // org.webrtc.VideoDecoderFactory
    public VideoCodecInfo[] getSupportedCodecs() {
        LinkedHashSet A15 = 7zL.A15();
        A15.addAll(Arrays.asList(this.softwareVideoDecoderFactory.getSupportedCodecs()));
        A15.addAll(Arrays.asList(this.hardwareVideoDecoderFactory.getSupportedCodecs()));
        VideoDecoderFactory videoDecoderFactory = this.platformSoftwareVideoDecoderFactory;
        if (videoDecoderFactory != null) {
            A15.addAll(Arrays.asList(videoDecoderFactory.getSupportedCodecs()));
        }
        return (VideoCodecInfo[]) A15.toArray(new VideoCodecInfo[A15.size()]);
    }
}
