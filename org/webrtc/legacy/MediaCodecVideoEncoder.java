package org.webrtc.legacy;

import X.0Pz;
import X.1BK;
import X.AnonymousClass001;
import android.media.MediaCodec;
import android.opengl.GLES20;
import android.os.Build;
import android.os.Bundle;
import android.view.Surface;
import com.facebook.acra.util.JavaProcFileReader;
import com.facebook.common.dextricks.Constants;
import java.nio.ByteBuffer;
import java.util.Set;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import org.webrtc.Logging;
import org.webrtc.legacy.EglBase14;
import org.webrtc.legacy.opengl.GlRectDrawer;

/* loaded from: MediaCodecVideoEncoder.class */
public class MediaCodecVideoEncoder {
    public static final int BITRATE_ADJUSTMENT_FPS = 30;
    public static final int COLOR_QCOM_FORMATYUV420PackedSemiPlanar32m = 2141391876;
    public static final int DEQUEUE_TIMEOUT = 0;
    public static final int EXYNOS_OMX = 2;
    public static final String[] H264_HW_EXCEPTION_MODELS;
    public static final String H264_MIME_TYPE = "video/avc";
    public static final String H265_MIME_TYPE = "video/hevc";
    public static final int INTEL_OMX = 4;
    public static final int MEDIA_CODEC_RELEASE_TIMEOUT_MS = 5000;
    public static final int MTK_OMX = 8;
    public static final int QCOM_OMX = 1;
    public static final String TAG = "MediaCodecVideoEncoder";
    public static final String VP8_MIME_TYPE = "video/x-vnd.on2.vp8";
    public static final String VP9_MIME_TYPE = "video/x-vnd.on2.vp9";
    public static volatile int bitrateKbps;
    public static int codecErrors;
    public static MediaCodecVideoEncoderErrorCallback errorCallback;
    public static final MediaCodecProperties exynosH264HwProperties;
    public static final MediaCodecProperties exynosVp8HwProperties;
    public static final MediaCodecProperties exynosVp9HwProperties;
    public static final MediaCodecProperties[] h264HwList;
    public static final MediaCodecProperties[] h265HwList;
    public static Set hwEncoderDisabledTypes = AnonymousClass001.A0v();
    public static final MediaCodecProperties imgH264HwProperties;
    public static final MediaCodecProperties intelVp8HwProperties;
    public static final MediaCodecProperties mtekH264HwProperties;
    public static final MediaCodecProperties qcomH264HwProperties;
    public static final MediaCodecProperties qcomH265HwProperties;
    public static final MediaCodecProperties qcomVp8HwProperties;
    public static final MediaCodecProperties qcomVp9HwProperties;
    public static MediaCodecVideoEncoder runningInstance;
    public static final MediaCodecProperties secH264HwProperties;
    public static final int[] supportedColorList;
    public static final int[] supportedSurfaceColorList;
    public static final MediaCodecProperties[] vp8HwList;
    public static final MediaCodecProperties[] vp9HwList;
    public boolean bitrateAdjustmentRequired;
    public int colorFormat;
    public ByteBuffer configData = null;
    public GlRectDrawer drawer;
    public EglBase14 eglBase;
    public int height;
    public Surface inputSurface;
    public MediaCodec mediaCodec;
    public Thread mediaCodecThread;
    public ByteBuffer[] outputBuffers;
    public VideoCodecMimeType type;
    public int width;

    /* loaded from: MediaCodecVideoEncoder$EncoderProperties.class */
    public class EncoderProperties {
        public final boolean bitrateAdjustment;
        public final String codecName;
        public final int colorFormat;

        public EncoderProperties(String str, int i, boolean z) {
            this.codecName = str;
            this.colorFormat = i;
            this.bitrateAdjustment = z;
        }
    }

    /* loaded from: MediaCodecVideoEncoder$MediaCodecProperties.class */
    public class MediaCodecProperties {
        public final boolean bitrateAdjustmentRequired;
        public final String codecPrefix;
        public boolean enabled;
        public final int minSdk;

        public MediaCodecProperties(String str, int i, boolean z, boolean z2) {
            this.codecPrefix = str;
            this.minSdk = i;
            this.bitrateAdjustmentRequired = z;
            this.enabled = z2;
        }
    }

    /* loaded from: MediaCodecVideoEncoder$MediaCodecVideoEncoderErrorCallback.class */
    public interface MediaCodecVideoEncoderErrorCallback {
        void onMediaCodecVideoEncoderCriticalError(int i);
    }

    /* loaded from: MediaCodecVideoEncoder$OutputBufferInfo.class */
    public class OutputBufferInfo {
        public final ByteBuffer buffer;
        public final int index;
        public final boolean isKeyFrame;
        public final long presentationTimestampUs;

        public OutputBufferInfo(int i, ByteBuffer byteBuffer, boolean z, long j) {
            this.index = i;
            this.buffer = byteBuffer;
            this.isKeyFrame = z;
            this.presentationTimestampUs = j;
        }
    }

    /* loaded from: MediaCodecVideoEncoder$VideoCodecMimeType.class */
    public enum VideoCodecMimeType {
        VIDEO_CODEC_VP8,
        VIDEO_CODEC_VP9,
        VIDEO_CODEC_H264,
        VIDEO_CODEC_I420,
        VIDEO_CODEC_RED,
        VIDEO_CODEC_ULPFEC,
        VIDEO_CODEC_FLEXFEC,
        VIDEO_CODEC_GENERIC,
        VIDEO_CODEC_H265
    }

    static {
        MediaCodecProperties mediaCodecProperties = new MediaCodecProperties("OMX.qcom.", 19, false, true);
        qcomVp8HwProperties = mediaCodecProperties;
        MediaCodecProperties mediaCodecProperties2 = new MediaCodecProperties("OMX.Exynos.", 23, false, true);
        exynosVp8HwProperties = mediaCodecProperties2;
        MediaCodecProperties mediaCodecProperties3 = new MediaCodecProperties("OMX.Intel.", 21, false, true);
        intelVp8HwProperties = mediaCodecProperties3;
        vp8HwList = new MediaCodecProperties[]{mediaCodecProperties, mediaCodecProperties2, mediaCodecProperties3};
        MediaCodecProperties mediaCodecProperties4 = new MediaCodecProperties("OMX.qcom.", 23, false, true);
        qcomVp9HwProperties = mediaCodecProperties4;
        MediaCodecProperties mediaCodecProperties5 = new MediaCodecProperties("OMX.Exynos.", 23, false, true);
        exynosVp9HwProperties = mediaCodecProperties5;
        vp9HwList = new MediaCodecProperties[]{mediaCodecProperties4, mediaCodecProperties5};
        MediaCodecProperties mediaCodecProperties6 = new MediaCodecProperties("OMX.qcom.", 19, false, true);
        qcomH264HwProperties = mediaCodecProperties6;
        MediaCodecProperties mediaCodecProperties7 = new MediaCodecProperties("OMX.Exynos.", 21, true, true);
        exynosH264HwProperties = mediaCodecProperties7;
        MediaCodecProperties mediaCodecProperties8 = new MediaCodecProperties("OMX.SEC.AVC.Encoder", 19, true, true);
        secH264HwProperties = mediaCodecProperties8;
        MediaCodecProperties mediaCodecProperties9 = new MediaCodecProperties("OMX.IMG.TOPAZ.VIDEO.Encoder", 19, false, true);
        imgH264HwProperties = mediaCodecProperties9;
        MediaCodecProperties mediaCodecProperties10 = new MediaCodecProperties("OMX.MTK.", 19, false, false);
        mtekH264HwProperties = mediaCodecProperties10;
        h264HwList = new MediaCodecProperties[]{mediaCodecProperties6, mediaCodecProperties7, mediaCodecProperties8, mediaCodecProperties10, mediaCodecProperties9};
        MediaCodecProperties mediaCodecProperties11 = new MediaCodecProperties("OMX.qcom.", 19, false, true);
        qcomH265HwProperties = mediaCodecProperties11;
        h265HwList = new MediaCodecProperties[]{mediaCodecProperties11};
        H264_HW_EXCEPTION_MODELS = new String[]{"SAMSUNG-SGH-I337", "Nexus 7", "Nexus 4"};
        supportedColorList = new int[]{19, 21, 2141391872, 2141391876};
        supportedSurfaceColorList = new int[]{2130708361};
    }

    private void checkOnMediaCodecThread() {
    }

    public static MediaCodec createByCodecName(String str) {
        try {
            return MediaCodec.createByCodecName(str);
        } catch (Exception unused) {
            return null;
        }
    }

    public static void disableH264HwCodec() {
        Logging.w(TAG, "H.264 encoding is disabled by application.");
        hwEncoderDisabledTypes.add("video/avc");
    }

    public static void disableVp8HwCodec() {
        Logging.w(TAG, "VP8 encoding is disabled by application.");
        hwEncoderDisabledTypes.add("video/x-vnd.on2.vp8");
    }

    public static void disableVp9HwCodec() {
        Logging.w(TAG, "VP9 encoding is disabled by application.");
        hwEncoderDisabledTypes.add("video/x-vnd.on2.vp9");
    }

    public static void enableH264MTKCodec() {
        Logging.w(TAG, "H.264 encoding is enabled by application for Mediatek codec");
        mtekH264HwProperties.enabled = true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x00a5, code lost:
    
        r0 = r0.getName();
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x00ae, code lost:
    
        if (r0 == null) goto L81;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00b1, code lost:
    
        org.webrtc.Logging.v(org.webrtc.legacy.MediaCodecVideoEncoder.TAG, X.0Pz.A0W("Found candidate encoder ", r0));
        r0 = r302.length;
        r0 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00c9, code lost:
    
        r317 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00d0, code lost:
    
        if (r317 >= r0) goto L82;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00d3, code lost:
    
        r0 = r302[r317];
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00e2, code lost:
    
        if (r0.enabled == false) goto L87;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00f7, code lost:
    
        if (r0.startsWith(r0.codecPrefix) == false) goto L88;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00fa, code lost:
    
        r0 = android.os.Build.VERSION.SDK_INT;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x010f, code lost:
    
        if (r0 >= r0.minSdk) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0112, code lost:
    
        org.webrtc.Logging.w(org.webrtc.legacy.MediaCodecVideoEncoder.TAG, X.0Pz.A0F(r0, "Codec ", r0, " is disabled due to SDK version "));
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0127, code lost:
    
        r0 = r317 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0142, code lost:
    
        if (r0.bitrateAdjustmentRequired == false) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0145, code lost:
    
        org.webrtc.Logging.w(org.webrtc.legacy.MediaCodecVideoEncoder.TAG, X.0Pz.A0j("Codec ", r0, " does not use frame timestamps."));
        r316 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0163, code lost:
    
        r0 = r0.getCapabilitiesForType(r301);
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x016a, code lost:
    
        r0 = r0.getEncoderCapabilities();
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0173, code lost:
    
        if (r0 == null) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0176, code lost:
    
        r0 = X.AnonymousClass001.A0k();
        r0.append("Bitrate modes supported CBR:");
        r0.append(r0.isBitrateModeSupported(2));
        r0.append(" VBR:");
        r0.append(r0.isBitrateModeSupported(1));
        r0.append(" CQ:");
        r0.append(r0.isBitrateModeSupported(0));
        org.webrtc.Logging.d(org.webrtc.legacy.MediaCodecVideoEncoder.TAG, r0.toString());
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x01d5, code lost:
    
        r0 = r0.colorFormats;
        r0 = r0.length;
        r320 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x01eb, code lost:
    
        if (r320 >= r0) goto L89;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x01ee, code lost:
    
        org.webrtc.Logging.v(org.webrtc.legacy.MediaCodecVideoEncoder.TAG, X.0Pz.A0W("   Color: 0x", java.lang.Integer.toHexString(r0[r320])));
        r320 = r320 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x021a, code lost:
    
        r0 = r303.length;
        r0 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0224, code lost:
    
        r317 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0228, code lost:
    
        if (r317 >= r0) goto L83;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x022b, code lost:
    
        r0 = r303[r317];
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0234, code lost:
    
        if (r0 != 19) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0246, code lost:
    
        if ("OMX.IMG.TOPAZ.VIDEO.Encoder".equalsIgnoreCase(r0) == false) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0249, code lost:
    
        r0 = r317 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0252, code lost:
    
        r0 = r0.colorFormats;
        r0 = r0.length;
        r307 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0268, code lost:
    
        if (r307 >= r0) goto L91;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x026b, code lost:
    
        r0 = r0[r307];
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0276, code lost:
    
        if (r0 != r0) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x02ae, code lost:
    
        r307 = r307 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x0279, code lost:
    
        org.webrtc.Logging.d(org.webrtc.legacy.MediaCodecVideoEncoder.TAG, X.0Pz.A10("Found target encoder for mime ", r301, " : ", r0, ". Color: 0x", java.lang.Integer.toHexString(r0)));
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x02ad, code lost:
    
        return new org.webrtc.legacy.MediaCodecVideoEncoder.EncoderProperties(r0, r0, r316);
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x02d1, code lost:
    
        continue;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x02b7, code lost:
    
        r310 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x02b9, code lost:
    
        r305 = "Cannot retrieve encoder capabilities";
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x02c8, code lost:
    
        org.webrtc.Logging.e(org.webrtc.legacy.MediaCodecVideoEncoder.TAG, r305, r310);
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x015e, code lost:
    
        r316 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x02d1, code lost:
    
        continue;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x02d1, code lost:
    
        continue;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x02d1, code lost:
    
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static org.webrtc.legacy.MediaCodecVideoEncoder.EncoderProperties findHwEncoder(java.lang.String r301, org.webrtc.legacy.MediaCodecVideoEncoder.MediaCodecProperties[] r302, int[] r303) {
        /*
            Method dump skipped, instructions count: 730
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: org.webrtc.legacy.MediaCodecVideoEncoder.findHwEncoder(java.lang.String, org.webrtc.legacy.MediaCodecVideoEncoder$MediaCodecProperties[], int[]):org.webrtc.legacy.MediaCodecVideoEncoder$EncoderProperties");
    }

    public static int getBitrateKbps() {
        int i;
        synchronized (MediaCodecVideoEncoder.class) {
            i = runningInstance != null ? bitrateKbps : 0;
        }
        return i;
    }

    public static String getBuildHardware() {
        String str = Build.HARDWARE;
        Logging.w(TAG, 0Pz.A0W("Build.HARDWARE = ", str));
        return str;
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0025, code lost:
    
        if (findHwEncoder("video/avc", org.webrtc.legacy.MediaCodecVideoEncoder.h264HwList, org.webrtc.legacy.MediaCodecVideoEncoder.supportedColorList) == null) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean isH264HwSupported() {
        /*
            java.util.Set r0 = org.webrtc.legacy.MediaCodecVideoEncoder.hwEncoderDisabledTypes
            r301 = r0
            java.lang.String r0 = "video/avc"
            r302 = r0
            r0 = r301
            r1 = r302
            boolean r0 = r0.contains(r1)
            r303 = r0
            r0 = r303
            if (r0 != 0) goto L28
            org.webrtc.legacy.MediaCodecVideoEncoder$MediaCodecProperties[] r0 = org.webrtc.legacy.MediaCodecVideoEncoder.h264HwList
            r304 = r0
            int[] r0 = org.webrtc.legacy.MediaCodecVideoEncoder.supportedColorList
            r301 = r0
            r0 = r302
            r1 = r304
            r2 = r301
            org.webrtc.legacy.MediaCodecVideoEncoder$EncoderProperties r0 = findHwEncoder(r0, r1, r2)
            r304 = r0
            r0 = 1
            r303 = r0
            r0 = r304
            if (r0 != 0) goto L2c
        L28:
            r0 = 0
            r303 = r0
            r0 = 0
            r301 = r0
        L2c:
            r0 = r303
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: org.webrtc.legacy.MediaCodecVideoEncoder.isH264HwSupported():boolean");
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0025, code lost:
    
        if (findHwEncoder("video/avc", org.webrtc.legacy.MediaCodecVideoEncoder.h264HwList, org.webrtc.legacy.MediaCodecVideoEncoder.supportedSurfaceColorList) == null) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean isH264HwSupportedUsingTextures() {
        /*
            java.util.Set r0 = org.webrtc.legacy.MediaCodecVideoEncoder.hwEncoderDisabledTypes
            r301 = r0
            java.lang.String r0 = "video/avc"
            r302 = r0
            r0 = r301
            r1 = r302
            boolean r0 = r0.contains(r1)
            r303 = r0
            r0 = r303
            if (r0 != 0) goto L28
            org.webrtc.legacy.MediaCodecVideoEncoder$MediaCodecProperties[] r0 = org.webrtc.legacy.MediaCodecVideoEncoder.h264HwList
            r304 = r0
            int[] r0 = org.webrtc.legacy.MediaCodecVideoEncoder.supportedSurfaceColorList
            r301 = r0
            r0 = r302
            r1 = r304
            r2 = r301
            org.webrtc.legacy.MediaCodecVideoEncoder$EncoderProperties r0 = findHwEncoder(r0, r1, r2)
            r304 = r0
            r0 = 1
            r303 = r0
            r0 = r304
            if (r0 != 0) goto L2c
        L28:
            r0 = 0
            r303 = r0
            r0 = 0
            r301 = r0
        L2c:
            r0 = r303
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: org.webrtc.legacy.MediaCodecVideoEncoder.isH264HwSupportedUsingTextures():boolean");
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0025, code lost:
    
        if (findHwEncoder("video/hevc", org.webrtc.legacy.MediaCodecVideoEncoder.h265HwList, org.webrtc.legacy.MediaCodecVideoEncoder.supportedColorList) == null) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean isH265HwSupported() {
        /*
            java.util.Set r0 = org.webrtc.legacy.MediaCodecVideoEncoder.hwEncoderDisabledTypes
            r301 = r0
            java.lang.String r0 = "video/hevc"
            r302 = r0
            r0 = r301
            r1 = r302
            boolean r0 = r0.contains(r1)
            r303 = r0
            r0 = r303
            if (r0 != 0) goto L28
            org.webrtc.legacy.MediaCodecVideoEncoder$MediaCodecProperties[] r0 = org.webrtc.legacy.MediaCodecVideoEncoder.h265HwList
            r304 = r0
            int[] r0 = org.webrtc.legacy.MediaCodecVideoEncoder.supportedColorList
            r301 = r0
            r0 = r302
            r1 = r304
            r2 = r301
            org.webrtc.legacy.MediaCodecVideoEncoder$EncoderProperties r0 = findHwEncoder(r0, r1, r2)
            r304 = r0
            r0 = 1
            r303 = r0
            r0 = r304
            if (r0 != 0) goto L2c
        L28:
            r0 = 0
            r303 = r0
            r0 = 0
            r301 = r0
        L2c:
            r0 = r303
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: org.webrtc.legacy.MediaCodecVideoEncoder.isH265HwSupported():boolean");
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0025, code lost:
    
        if (findHwEncoder("video/x-vnd.on2.vp8", org.webrtc.legacy.MediaCodecVideoEncoder.vp8HwList, org.webrtc.legacy.MediaCodecVideoEncoder.supportedColorList) == null) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean isVp8HwSupported() {
        /*
            java.util.Set r0 = org.webrtc.legacy.MediaCodecVideoEncoder.hwEncoderDisabledTypes
            r301 = r0
            java.lang.String r0 = "video/x-vnd.on2.vp8"
            r302 = r0
            r0 = r301
            r1 = r302
            boolean r0 = r0.contains(r1)
            r303 = r0
            r0 = r303
            if (r0 != 0) goto L28
            org.webrtc.legacy.MediaCodecVideoEncoder$MediaCodecProperties[] r0 = org.webrtc.legacy.MediaCodecVideoEncoder.vp8HwList
            r304 = r0
            int[] r0 = org.webrtc.legacy.MediaCodecVideoEncoder.supportedColorList
            r301 = r0
            r0 = r302
            r1 = r304
            r2 = r301
            org.webrtc.legacy.MediaCodecVideoEncoder$EncoderProperties r0 = findHwEncoder(r0, r1, r2)
            r304 = r0
            r0 = 1
            r303 = r0
            r0 = r304
            if (r0 != 0) goto L2c
        L28:
            r0 = 0
            r303 = r0
            r0 = 0
            r301 = r0
        L2c:
            r0 = r303
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: org.webrtc.legacy.MediaCodecVideoEncoder.isVp8HwSupported():boolean");
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0025, code lost:
    
        if (findHwEncoder("video/x-vnd.on2.vp8", org.webrtc.legacy.MediaCodecVideoEncoder.vp8HwList, org.webrtc.legacy.MediaCodecVideoEncoder.supportedSurfaceColorList) == null) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean isVp8HwSupportedUsingTextures() {
        /*
            java.util.Set r0 = org.webrtc.legacy.MediaCodecVideoEncoder.hwEncoderDisabledTypes
            r301 = r0
            java.lang.String r0 = "video/x-vnd.on2.vp8"
            r302 = r0
            r0 = r301
            r1 = r302
            boolean r0 = r0.contains(r1)
            r303 = r0
            r0 = r303
            if (r0 != 0) goto L28
            org.webrtc.legacy.MediaCodecVideoEncoder$MediaCodecProperties[] r0 = org.webrtc.legacy.MediaCodecVideoEncoder.vp8HwList
            r304 = r0
            int[] r0 = org.webrtc.legacy.MediaCodecVideoEncoder.supportedSurfaceColorList
            r301 = r0
            r0 = r302
            r1 = r304
            r2 = r301
            org.webrtc.legacy.MediaCodecVideoEncoder$EncoderProperties r0 = findHwEncoder(r0, r1, r2)
            r304 = r0
            r0 = 1
            r303 = r0
            r0 = r304
            if (r0 != 0) goto L2c
        L28:
            r0 = 0
            r303 = r0
            r0 = 0
            r301 = r0
        L2c:
            r0 = r303
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: org.webrtc.legacy.MediaCodecVideoEncoder.isVp8HwSupportedUsingTextures():boolean");
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0025, code lost:
    
        if (findHwEncoder("video/x-vnd.on2.vp9", org.webrtc.legacy.MediaCodecVideoEncoder.vp9HwList, org.webrtc.legacy.MediaCodecVideoEncoder.supportedColorList) == null) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean isVp9HwSupported() {
        /*
            java.util.Set r0 = org.webrtc.legacy.MediaCodecVideoEncoder.hwEncoderDisabledTypes
            r301 = r0
            java.lang.String r0 = "video/x-vnd.on2.vp9"
            r302 = r0
            r0 = r301
            r1 = r302
            boolean r0 = r0.contains(r1)
            r303 = r0
            r0 = r303
            if (r0 != 0) goto L28
            org.webrtc.legacy.MediaCodecVideoEncoder$MediaCodecProperties[] r0 = org.webrtc.legacy.MediaCodecVideoEncoder.vp9HwList
            r304 = r0
            int[] r0 = org.webrtc.legacy.MediaCodecVideoEncoder.supportedColorList
            r301 = r0
            r0 = r302
            r1 = r304
            r2 = r301
            org.webrtc.legacy.MediaCodecVideoEncoder$EncoderProperties r0 = findHwEncoder(r0, r1, r2)
            r304 = r0
            r0 = 1
            r303 = r0
            r0 = r304
            if (r0 != 0) goto L2c
        L28:
            r0 = 0
            r303 = r0
            r0 = 0
            r301 = r0
        L2c:
            r0 = r303
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: org.webrtc.legacy.MediaCodecVideoEncoder.isVp9HwSupported():boolean");
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0025, code lost:
    
        if (findHwEncoder("video/x-vnd.on2.vp9", org.webrtc.legacy.MediaCodecVideoEncoder.vp9HwList, org.webrtc.legacy.MediaCodecVideoEncoder.supportedSurfaceColorList) == null) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean isVp9HwSupportedUsingTextures() {
        /*
            java.util.Set r0 = org.webrtc.legacy.MediaCodecVideoEncoder.hwEncoderDisabledTypes
            r301 = r0
            java.lang.String r0 = "video/x-vnd.on2.vp9"
            r302 = r0
            r0 = r301
            r1 = r302
            boolean r0 = r0.contains(r1)
            r303 = r0
            r0 = r303
            if (r0 != 0) goto L28
            org.webrtc.legacy.MediaCodecVideoEncoder$MediaCodecProperties[] r0 = org.webrtc.legacy.MediaCodecVideoEncoder.vp9HwList
            r304 = r0
            int[] r0 = org.webrtc.legacy.MediaCodecVideoEncoder.supportedSurfaceColorList
            r301 = r0
            r0 = r302
            r1 = r304
            r2 = r301
            org.webrtc.legacy.MediaCodecVideoEncoder$EncoderProperties r0 = findHwEncoder(r0, r1, r2)
            r304 = r0
            r0 = 1
            r303 = r0
            r0 = r304
            if (r0 != 0) goto L2c
        L28:
            r0 = 0
            r303 = r0
            r0 = 0
            r301 = r0
        L2c:
            r0 = r303
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: org.webrtc.legacy.MediaCodecVideoEncoder.isVp9HwSupportedUsingTextures():boolean");
    }

    public static void printStackTrace() {
        Thread thread;
        StackTraceElement[] stackTrace;
        int length;
        MediaCodecVideoEncoder mediaCodecVideoEncoder = runningInstance;
        if (mediaCodecVideoEncoder == null || (thread = mediaCodecVideoEncoder.mediaCodecThread) == null || (length = (stackTrace = thread.getStackTrace()).length) <= 0) {
            return;
        }
        Logging.d(TAG, "MediaCodecVideoEncoder stacks trace:");
        int i = 0;
        do {
            Logging.d(TAG, stackTrace[i].toString());
            i++;
        } while (i < length);
    }

    public static void setErrorCallback(MediaCodecVideoEncoderErrorCallback mediaCodecVideoEncoderErrorCallback) {
        Logging.d(TAG, "Set error callback");
        errorCallback = mediaCodecVideoEncoderErrorCallback;
    }

    private boolean setRates(int i, int i2) {
        StringBuilder A0n;
        bitrateKbps = i;
        int i3 = i * 1000;
        if (!this.bitrateAdjustmentRequired || i2 <= 0) {
            A0n = AnonymousClass001.A0n("setRates: ");
            A0n.append(i);
        } else {
            i3 = (i3 * 30) / i2;
            A0n = AnonymousClass001.A0n("setRates: ");
            A0n.append(i);
            A0n.append(JavaProcFileReader.LS_SYMLINK_ARROW);
            A0n.append(i3 / 1000);
            A0n.append(" kbps. Fps: ");
            A0n.append(i2);
        }
        Logging.v(TAG, A0n.toString());
        try {
            Bundle A05 = 1BK.A05();
            A05.putInt("video-bitrate", i3);
            this.mediaCodec.setParameters(A05);
            return true;
        } catch (IllegalStateException e) {
            Logging.e(TAG, "setRates failed", e);
            return false;
        }
    }

    public int dequeueInputBuffer() {
        try {
            return this.mediaCodec.dequeueInputBuffer(0L);
        } catch (IllegalStateException e) {
            Logging.e(TAG, "dequeueIntputBuffer failed", e);
            return -2;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:58:0x00ef, code lost:
    
        if (r308 >= 0) goto L59;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public org.webrtc.legacy.MediaCodecVideoEncoder.OutputBufferInfo dequeueOutputBuffer() {
        /*
            Method dump skipped, instructions count: 630
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: org.webrtc.legacy.MediaCodecVideoEncoder.dequeueOutputBuffer():org.webrtc.legacy.MediaCodecVideoEncoder$OutputBufferInfo");
    }

    public boolean encodeBuffer(boolean z, int i, int i2, long j) {
        if (z) {
            try {
                Logging.d(TAG, "rtcengine encodeBuffer Sync frame request");
                Bundle A05 = 1BK.A05();
                A05.putInt("request-sync", 0);
                this.mediaCodec.setParameters(A05);
            } catch (IllegalStateException e) {
                Logging.e(TAG, "encodeBuffer failed", e);
                return false;
            }
        }
        this.mediaCodec.queueInputBuffer(i, 0, i2, j, 0);
        return true;
    }

    public boolean encodeTexture(boolean z, int i, float[] fArr, long j) {
        if (z) {
            try {
                Logging.d(TAG, "rtcengine encodeTexture Sync frame request");
                Bundle A05 = 1BK.A05();
                A05.putInt("request-sync", 0);
                this.mediaCodec.setParameters(A05);
            } catch (RuntimeException e) {
                Logging.e(TAG, "encodeTexture failed", e);
                return false;
            }
        }
        this.eglBase.makeCurrent();
        GLES20.glClear(Constants.LOAD_RESULT_DEX2OAT_CLASSPATH_SET);
        this.drawer.drawOes(i, fArr, 0, 0, this.width, this.height);
        this.eglBase.swapBuffers(TimeUnit.MICROSECONDS.toNanos(j));
        return true;
    }

    public ByteBuffer[] getInputBuffers() {
        ByteBuffer[] inputBuffers = this.mediaCodec.getInputBuffers();
        Logging.d(TAG, 0Pz.A0T("Input buffers: ", inputBuffers.length));
        return inputBuffers;
    }

    public boolean initEncode(VideoCodecMimeType videoCodecMimeType, int i, int i2, int i3, int i4, int i5, EglBase14.Context context) {
        return initEncode(videoCodecMimeType, i, i2, i3, i4, i5, context, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00e7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean initEncode(org.webrtc.legacy.MediaCodecVideoEncoder.VideoCodecMimeType r302, int r303, int r304, int r305, int r306, int r307, org.webrtc.legacy.EglBase14.Context r308, org.webrtc.legacy.ExtendedSettings r309) {
        /*
            Method dump skipped, instructions count: 858
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: org.webrtc.legacy.MediaCodecVideoEncoder.initEncode(org.webrtc.legacy.MediaCodecVideoEncoder$VideoCodecMimeType, int, int, int, int, int, org.webrtc.legacy.EglBase14$Context, org.webrtc.legacy.ExtendedSettings):boolean");
    }

    public void release() {
        Logging.d(TAG, "Java releaseEncoder");
        boolean z = false;
        if (this.mediaCodec != null) {
            final CountDownLatch countDownLatch = new CountDownLatch(1);
            new Thread(new Runnable() { // from class: org.webrtc.legacy.MediaCodecVideoEncoder.1
                @Override // java.lang.Runnable
                public void run() {
                    Logging.d(MediaCodecVideoEncoder.TAG, "Java releaseEncoder on release thread");
                    try {
                        MediaCodecVideoEncoder.this.mediaCodec.stop();
                    } catch (Exception e) {
                        Logging.e(MediaCodecVideoEncoder.TAG, "Media encoder stop failed", e);
                    }
                    try {
                        MediaCodecVideoEncoder.this.mediaCodec.release();
                    } catch (Exception e2) {
                        Logging.e(MediaCodecVideoEncoder.TAG, "Media encoder release failed", e2);
                    }
                    Logging.d(MediaCodecVideoEncoder.TAG, "Java releaseEncoder on release thread done");
                    countDownLatch.countDown();
                }
            }).start();
            if (!ThreadUtils.awaitUninterruptibly(countDownLatch, 5000L)) {
                Logging.e(TAG, "Media encoder release timeout");
                z = true;
            }
            this.mediaCodec = null;
        }
        this.mediaCodecThread = null;
        GlRectDrawer glRectDrawer = this.drawer;
        if (glRectDrawer != null) {
            glRectDrawer.release();
            this.drawer = null;
        }
        EglBase14 eglBase14 = this.eglBase;
        if (eglBase14 != null) {
            eglBase14.release();
            this.eglBase = null;
        }
        Surface surface = this.inputSurface;
        if (surface != null) {
            surface.release();
            this.inputSurface = null;
        }
        synchronized (MediaCodecVideoEncoder.class) {
            runningInstance = null;
        }
        if (z) {
            int i = codecErrors + 1;
            codecErrors = i;
            if (errorCallback != null) {
                Logging.e(TAG, 0Pz.A0T("Invoke codec error callback. Errors: ", i));
                errorCallback.onMediaCodecVideoEncoderCriticalError(codecErrors);
            }
        }
        Logging.d(TAG, "Java releaseEncoder done");
    }

    public boolean releaseOutputBuffer(int i) {
        try {
            this.mediaCodec.releaseOutputBuffer(i, false);
            return true;
        } catch (IllegalStateException e) {
            Logging.e(TAG, "releaseOutputBuffer failed", e);
            return false;
        }
    }
}
