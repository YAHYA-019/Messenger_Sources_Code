package org.webrtc.legacy;

import X.0Pz;
import X.1BL;
import X.AbF;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.GOn;
import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.SystemClock;
import android.view.Surface;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.List;
import java.util.Queue;
import java.util.concurrent.CountDownLatch;
import org.webrtc.Logging;
import org.webrtc.legacy.SurfaceTextureHelper;

/* loaded from: MediaCodecVideoDecoder.class */
public class MediaCodecVideoDecoder {
    public static final int COLOR_QCOM_FORMATYUV420PackedSemiPlanar32m = 2141391876;
    public static final int DEQUEUE_INPUT_TIMEOUT = 500000;
    public static final String FORMAT_KEY_CROP_BOTTOM = "crop-bottom";
    public static final String FORMAT_KEY_CROP_RIGHT = "crop-right";
    public static final String FORMAT_KEY_SLICE_HEIGHT = "slice-height";
    public static final String FORMAT_KEY_STRIDE = "stride";
    public static final String H264_MIME_TYPE = "video/avc";
    public static final String H265_MIME_TYPE = "video/hevc";
    public static final int MAX_FATAL_CODEC_ERRORS = 3;
    public static final int MAX_QUEUED_OUTPUTBUFFERS = 3;
    public static final int MEDIA_CODEC_RELEASE_TIMEOUT_MS = 5000;
    public static final String TAG = "MediaCodecVideoDecoder";
    public static final String VP8_MIME_TYPE = "video/x-vnd.on2.vp8";
    public static final String VP9_MIME_TYPE = "video/x-vnd.on2.vp9";
    public static MediaCodecVideoDecoderErrorCallback errorCallback;
    public static int sCodecErrors;
    public int colorFormat;
    public int droppedFrames;
    public boolean hasDecodedFirstFrame;
    public int height;
    public ByteBuffer[] inputBuffers;
    public MediaCodec mediaCodec;
    public Thread mediaCodecThread;
    public ByteBuffer[] outputBuffers;
    public int sliceHeight;
    public int stride;
    public SurfaceTextureHelper surfaceTextureHelper;
    public TextureListener textureListener;
    public boolean useSurface;
    public int width;
    public static final float[] EMPTY_TRANSFORM_MATRIX = new float[0];
    public static final String[] SUPPORTED_VP8_HW_CODEC_PREFIXES = {"OMX.qcom.", "OMX.Nvidia.", "OMX.Exynos.", "OMX.Intel."};
    public static final String[] SUPPORTED_VP8_SW_CODEC_PREFIXES = {"OMX.google."};
    public static final String[] SUPPORTED_VP9_HW_CODEC_PREFIXES = {"OMX.qcom.", "OMX.Exynos.", "OMX.MTK."};
    public static final String[] SUPPORTED_H264_HW_CODEC_PREFIXES = {"OMX.qcom.", "OMX.Exynos.", "OMX.Intel.", "OMX.MTK.", "OMX.SEC.", "OMX.IMG.MSVDX.Decoder."};
    public static final String[] SUPPORTED_H264_SW_CODEC_PREFIXES = {"OMX.google."};
    public static final String[] SUPPORTED_H265_HW_CODEC_PREFIXES = {"OMX.qcom."};
    public static final int COLOR_QCOM_FORMATYVU420PackedSemiPlanar32m4ka = 2141391873;
    public static final int COLOR_QCOM_FORMATYVU420PackedSemiPlanar16m4ka = 2141391874;
    public static final int COLOR_QCOM_FORMATYVU420PackedSemiPlanar64x32Tile2m8ka = 2141391875;
    public static final List SUPPORTED_COLOR_LIST = Arrays.asList(19, 21, 2141391872, Integer.valueOf(COLOR_QCOM_FORMATYVU420PackedSemiPlanar32m4ka), Integer.valueOf(COLOR_QCOM_FORMATYVU420PackedSemiPlanar16m4ka), Integer.valueOf(COLOR_QCOM_FORMATYVU420PackedSemiPlanar64x32Tile2m8ka), 2141391876);
    public Queue decodeStartTimeMs = AbF.A1F();
    public Surface surface = null;
    public final Queue dequeuedSurfaceOutputBuffers = AbF.A1F();
    public boolean isInitialized = false;
    public DecoderProperties decoderProperties = null;
    public boolean isResolutionOverridden = false;

    /* loaded from: MediaCodecVideoDecoder$DecodedOutputBuffer.class */
    public class DecodedOutputBuffer {
        public final long decStartTimeMs;
        public final long decodeTimeMs;
        public final long firstPacketTimeMs;
        public final int index;
        public final long ntpTimeStampMs;
        public final int offset;
        public ByteBuffer outputBuffer;
        public final long presentationTimeStampMs;
        public final int size;
        public final long timeStampMs;

        public DecodedOutputBuffer(int i, int i2, int i3, long j, long j2, long j3, long j4, long j5, long j6) {
            this.index = i;
            this.offset = i2;
            this.size = i3;
            this.presentationTimeStampMs = j;
            this.timeStampMs = j2;
            this.ntpTimeStampMs = j5;
            this.decodeTimeMs = j6;
            this.firstPacketTimeMs = j3;
            this.decStartTimeMs = j4;
        }
    }

    /* loaded from: MediaCodecVideoDecoder$DecodedTextureBuffer.class */
    public class DecodedTextureBuffer {
        public final long decStartTimeMs;
        public final long decodeTimeMs;
        public final long firstPacketTimeMs;
        public final long ntpTimeStampMs;
        public final long presentationTimeStampMs;
        public final int textureID;
        public final long timeStampMs;
        public final float[] transformMatrix;

        public DecodedTextureBuffer(int i, float[] fArr, long j, long j2, long j3, long j4, long j5, long j6) {
            this.textureID = i;
            this.transformMatrix = fArr;
            this.presentationTimeStampMs = j;
            this.timeStampMs = j2;
            this.ntpTimeStampMs = j3;
            this.decodeTimeMs = j4;
            this.firstPacketTimeMs = j5;
            this.decStartTimeMs = j6;
        }

        public static DecodedTextureBuffer fromOutputBuffer(int i, float[] fArr, DecodedOutputBuffer decodedOutputBuffer) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            long j = decodedOutputBuffer.decStartTimeMs;
            return new DecodedTextureBuffer(i, fArr, decodedOutputBuffer.presentationTimeStampMs, decodedOutputBuffer.timeStampMs, decodedOutputBuffer.ntpTimeStampMs, elapsedRealtime - j, decodedOutputBuffer.firstPacketTimeMs, j);
        }
    }

    /* loaded from: MediaCodecVideoDecoder$DecoderProperties.class */
    public class DecoderProperties {
        public final String codecName;
        public final int colorFormat;

        public DecoderProperties(String str, int i) {
            this.codecName = str;
            this.colorFormat = i;
        }
    }

    /* loaded from: MediaCodecVideoDecoder$MediaCodecVideoDecoderErrorCallback.class */
    public interface MediaCodecVideoDecoderErrorCallback {
        void onMediaCodecVideoDecoderCriticalError(int i);
    }

    /* loaded from: MediaCodecVideoDecoder$TextureListener.class */
    public class TextureListener implements SurfaceTextureHelper.OnTextureFrameAvailableListener {
        public DecodedOutputBuffer bufferToRender;
        public final Object newFrameLock = AnonymousClass001.A0R();
        public DecodedTextureBuffer renderedBuffer;
        public final SurfaceTextureHelper surfaceTextureHelper;

        public TextureListener(SurfaceTextureHelper surfaceTextureHelper) {
            this.surfaceTextureHelper = surfaceTextureHelper;
            surfaceTextureHelper.startListening(this);
        }

        public void addBufferToRender(DecodedOutputBuffer decodedOutputBuffer) {
            if (this.bufferToRender == null) {
                this.bufferToRender = decodedOutputBuffer;
            } else {
                Logging.e(MediaCodecVideoDecoder.TAG, "Unexpected addBufferToRender() called while waiting for a texture.");
                throw AnonymousClass001.A0N("Waiting for a texture.");
            }
        }

        public DecodedTextureBuffer dequeueTextureBuffer(int i) {
            DecodedTextureBuffer decodedTextureBuffer;
            synchronized (this.newFrameLock) {
                if (this.renderedBuffer == null && i > 0 && isWaitingForTexture()) {
                    try {
                        this.newFrameLock.wait(i);
                    } catch (InterruptedException unused) {
                        AnonymousClass001.A13();
                    }
                }
                decodedTextureBuffer = this.renderedBuffer;
                this.renderedBuffer = null;
            }
            return decodedTextureBuffer;
        }

        public boolean isWaitingForTexture() {
            boolean A1T;
            synchronized (this.newFrameLock) {
                A1T = AnonymousClass001.A1T(this.bufferToRender);
            }
            return A1T;
        }

        @Override // org.webrtc.legacy.SurfaceTextureHelper.OnTextureFrameAvailableListener
        public void onTextureFrameAvailable(int i, float[] fArr, long j) {
            synchronized (this.newFrameLock) {
                if (this.renderedBuffer != null) {
                    Logging.e(MediaCodecVideoDecoder.TAG, "Unexpected onTextureFrameAvailable() called while already holding a texture.");
                    throw AnonymousClass001.A0N("Already holding a texture.");
                }
                this.renderedBuffer = DecodedTextureBuffer.fromOutputBuffer(i, fArr, this.bufferToRender);
                this.bufferToRender = null;
                this.newFrameLock.notifyAll();
            }
        }

        public void release() {
            this.surfaceTextureHelper.stopListening();
            synchronized (this.newFrameLock) {
                if (this.renderedBuffer != null) {
                    this.surfaceTextureHelper.returnTextureFrame();
                    this.renderedBuffer = null;
                }
            }
        }
    }

    /* loaded from: MediaCodecVideoDecoder$TimeStamps.class */
    public class TimeStamps {
        public final long decStartTimeMs;
        public final long firstPacketTimeMs;
        public final long ntpTimeStampMs;
        public final long timestampMs;

        public TimeStamps(long j, long j2, long j3, long j4) {
            this.timestampMs = j;
            this.firstPacketTimeMs = j2;
            this.decStartTimeMs = j3;
            this.ntpTimeStampMs = j4;
        }
    }

    /* loaded from: MediaCodecVideoDecoder$VideoCodecMimeType.class */
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

    public MediaCodecVideoDecoder() {
        Logging.d(TAG, "java MediaCodecVideoDecoder ctor called");
    }

    private void MaybeRenderDecodedTextureBuffer() {
        if (this.dequeuedSurfaceOutputBuffers.isEmpty() || this.textureListener.isWaitingForTexture()) {
            return;
        }
        DecodedOutputBuffer decodedOutputBuffer = (DecodedOutputBuffer) this.dequeuedSurfaceOutputBuffers.remove();
        this.textureListener.addBufferToRender(decodedOutputBuffer);
        this.mediaCodec.releaseOutputBuffer(decodedOutputBuffer.index, true);
    }

    private void checkOnMediaCodecThread() {
        long id = this.mediaCodecThread.getId();
        Thread currentThread = Thread.currentThread();
        if (id == currentThread.getId()) {
            return;
        }
        StringBuilder A0k = AnonymousClass001.A0k();
        A0k.append("MediaCodecVideoDecoder previously operated on ");
        A0k.append(this.mediaCodecThread);
        throw 1BL.A0h(currentThread, " but is now called on ", A0k);
    }

    private int dequeueInputBuffer() {
        MediaCodec mediaCodec = this.mediaCodec;
        if (mediaCodec == null) {
            return -3;
        }
        try {
            return mediaCodec.dequeueInputBuffer(500000L);
        } catch (IllegalStateException e) {
            Logging.e(TAG, "dequeueIntputBuffer failed", e);
            return -2;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:58:0x02e9, code lost:
    
        r0 = X.AnonymousClass001.A0k();
        r0.append("Unexpected size change. Configured ");
        r0.append(r0);
        r0.append("*");
        r0.append(r301.height);
        X.1BL.A1L(". New ", "*", r0, r315, r314);
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0330, code lost:
    
        throw X.AnonymousClass001.A0T(r0.toString());
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private org.webrtc.legacy.MediaCodecVideoDecoder.DecodedOutputBuffer dequeueOutputBuffer(int r302) {
        /*
            Method dump skipped, instructions count: 817
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: org.webrtc.legacy.MediaCodecVideoDecoder.dequeueOutputBuffer(int):org.webrtc.legacy.MediaCodecVideoDecoder$DecodedOutputBuffer");
    }

    private DecodedTextureBuffer dequeueTextureBuffer(int i) {
        String str;
        if (!this.useSurface) {
            throw AnonymousClass001.A0N("dequeueTexture() called for byte buffer decoding.");
        }
        DecodedOutputBuffer dequeueOutputBuffer = dequeueOutputBuffer(i);
        if (dequeueOutputBuffer != null) {
            this.dequeuedSurfaceOutputBuffers.add(dequeueOutputBuffer);
        }
        MaybeRenderDecodedTextureBuffer();
        DecodedTextureBuffer dequeueTextureBuffer = this.textureListener.dequeueTextureBuffer(i);
        if (dequeueTextureBuffer != null) {
            MaybeRenderDecodedTextureBuffer();
            return dequeueTextureBuffer;
        }
        if (this.dequeuedSurfaceOutputBuffers.size() < Math.min(3, this.outputBuffers.length) && (i <= 0 || this.dequeuedSurfaceOutputBuffers.isEmpty())) {
            return null;
        }
        this.droppedFrames++;
        DecodedOutputBuffer decodedOutputBuffer = (DecodedOutputBuffer) this.dequeuedSurfaceOutputBuffers.remove();
        StringBuilder A0k = AnonymousClass001.A0k();
        if (i > 0) {
            str = "Draining decoder. Dropping frame with TS: ";
        } else {
            A0k.append("Too many output buffers ");
            A0k.append(this.dequeuedSurfaceOutputBuffers.size());
            str = ". Dropping frame with TS: ";
        }
        A0k.append(str);
        A0k.append(decodedOutputBuffer.presentationTimeStampMs);
        A0k.append(". Total number of dropped frames: ");
        Logging.w(TAG, GOn.A1B(A0k, this.droppedFrames));
        this.mediaCodec.releaseOutputBuffer(decodedOutputBuffer.index, false);
        return DecodedTextureBuffer.fromOutputBuffer(0, EMPTY_TRANSFORM_MATRIX, decodedOutputBuffer);
    }

    private DecodedOutputBuffer dequeueTextureBufferAndConvert(int i) {
        DecodedTextureBuffer dequeueTextureBuffer = dequeueTextureBuffer(i);
        if (dequeueTextureBuffer == null || dequeueTextureBuffer.textureID == 0) {
            return null;
        }
        long j = dequeueTextureBuffer.presentationTimeStampMs;
        long j2 = dequeueTextureBuffer.timeStampMs;
        long j3 = -1;
        DecodedOutputBuffer decodedOutputBuffer = new DecodedOutputBuffer(-1, -1, -1, j, j2, j3, j3, dequeueTextureBuffer.ntpTimeStampMs, dequeueTextureBuffer.decodeTimeMs);
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(((this.stride * this.height) * 3) / 2);
        decodedOutputBuffer.outputBuffer = allocateDirect;
        this.surfaceTextureHelper.textureToYUV(allocateDirect, this.width, this.height, this.stride, dequeueTextureBuffer.textureID, dequeueTextureBuffer.transformMatrix);
        this.surfaceTextureHelper.returnTextureFrame();
        return decodedOutputBuffer;
    }

    /* JADX WARN: Code restructure failed: missing block: B:50:0x0177, code lost:
    
        continue;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0177, code lost:
    
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static org.webrtc.legacy.MediaCodecVideoDecoder.DecoderProperties findDecoder(java.lang.String r301, java.lang.String[] r302) {
        /*
            Method dump skipped, instructions count: 399
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: org.webrtc.legacy.MediaCodecVideoDecoder.findDecoder(java.lang.String, java.lang.String[]):org.webrtc.legacy.MediaCodecVideoDecoder$DecoderProperties");
    }

    private boolean initDecode(VideoCodecMimeType videoCodecMimeType, int i, int i2, boolean z, boolean z2, SurfaceTextureHelper surfaceTextureHelper) {
        return initDecode(videoCodecMimeType, i, i2, z, z2, surfaceTextureHelper, null);
    }

    private boolean initDecode(VideoCodecMimeType videoCodecMimeType, int i, int i2, boolean z, boolean z2, SurfaceTextureHelper surfaceTextureHelper, ExtendedSettings extendedSettings) {
        String[] strArr;
        String str;
        StringBuilder A0k;
        String str2;
        if (this.mediaCodecThread != null) {
            throw AnonymousClass001.A0T("initDecode: Forgot to release()?");
        }
        this.useSurface = z2;
        if (extendedSettings != null) {
            this.isResolutionOverridden = extendedSettings.mIsResolutionOverriden;
        }
        StringBuilder A0k2 = AnonymousClass001.A0k();
        A0k2.append("Java initDecode: ");
        A0k2.append(videoCodecMimeType.name());
        A0k2.append(" : ");
        A0k2.append(i);
        A0k2.append(" x ");
        A0k2.append(i2);
        A0k2.append(" useSurface: ");
        A0k2.append(z2);
        A0k2.append(", override resolution: ");
        A0k2.append(this.isResolutionOverridden);
        Logging.d(TAG, A0k2.toString());
        int i3 = sCodecErrors;
        if (i3 > 3) {
            A0k = AnonymousClass001.A0k();
            A0k.append("MediaCodec has irrecoverably failed too many times: ");
            A0k.append(i3);
        } else {
            if (this.isInitialized) {
                str2 = "Already inited, forgot to release?";
                Logging.e(TAG, str2);
                return false;
            }
            if (videoCodecMimeType == VideoCodecMimeType.VIDEO_CODEC_VP8) {
                strArr = z ? SUPPORTED_VP8_SW_CODEC_PREFIXES : SUPPORTED_VP8_HW_CODEC_PREFIXES;
                str = "video/x-vnd.on2.vp8";
            } else if (videoCodecMimeType == VideoCodecMimeType.VIDEO_CODEC_H264) {
                strArr = z ? SUPPORTED_H264_SW_CODEC_PREFIXES : SUPPORTED_H264_HW_CODEC_PREFIXES;
                str = "video/avc";
            } else if (videoCodecMimeType == VideoCodecMimeType.VIDEO_CODEC_H265) {
                strArr = SUPPORTED_H265_HW_CODEC_PREFIXES;
                str = "video/hevc";
            } else {
                if (videoCodecMimeType != VideoCodecMimeType.VIDEO_CODEC_VP9 || z) {
                    throw AnonymousClass002.A0C(videoCodecMimeType, "Non supported codec ", AnonymousClass001.A0k());
                }
                strArr = SUPPORTED_VP9_HW_CODEC_PREFIXES;
                str = "video/x-vnd.on2.vp9";
            }
            DecoderProperties findDecoder = findDecoder(str, strArr);
            this.decoderProperties = findDecoder;
            if (findDecoder != null) {
                this.mediaCodecThread = Thread.currentThread();
                try {
                    this.width = i;
                    this.height = i2;
                    this.stride = i;
                    this.sliceHeight = i2;
                    if (z2) {
                        this.surfaceTextureHelper = surfaceTextureHelper;
                        if (surfaceTextureHelper == null) {
                            return false;
                        }
                        this.surface = new Surface(surfaceTextureHelper.surfaceTexture);
                        this.textureListener = new TextureListener(this.surfaceTextureHelper);
                    }
                    MediaFormat createVideoFormat = MediaFormat.createVideoFormat(str, i, i2);
                    if (!z2) {
                        createVideoFormat.setInteger("color-format", this.decoderProperties.colorFormat);
                    }
                    MediaCodec createByCodecName = MediaCodec.createByCodecName(this.decoderProperties.codecName);
                    this.mediaCodec = createByCodecName;
                    if (createByCodecName == null) {
                        return false;
                    }
                    if (extendedSettings != null) {
                        extendedSettings.applySettingsTo(createVideoFormat);
                    }
                    this.mediaCodec.configure(createVideoFormat, this.surface, (MediaCrypto) null, 0);
                    this.mediaCodec.start();
                    this.colorFormat = this.decoderProperties.colorFormat;
                    this.outputBuffers = this.mediaCodec.getOutputBuffers();
                    this.inputBuffers = this.mediaCodec.getInputBuffers();
                    this.decodeStartTimeMs.clear();
                    this.hasDecodedFirstFrame = false;
                    this.isInitialized = true;
                    return true;
                } catch (IOException | IllegalStateException e) {
                    Logging.e(TAG, "initDecode failed", e);
                    return false;
                }
            }
            A0k = AnonymousClass001.A0k();
            A0k.append("Cannot find HW decoder for .");
            A0k.append(videoCodecMimeType);
        }
        str2 = A0k.toString();
        Logging.e(TAG, str2);
        return false;
    }

    public static boolean isH264HwSupported() {
        return AnonymousClass001.A1T(findDecoder("video/avc", SUPPORTED_H264_HW_CODEC_PREFIXES));
    }

    public static boolean isH265HwSupported() {
        return AnonymousClass001.A1T(findDecoder("video/hevc", SUPPORTED_H265_HW_CODEC_PREFIXES));
    }

    public static boolean isVp8HwSupported() {
        return AnonymousClass001.A1T(findDecoder("video/x-vnd.on2.vp8", SUPPORTED_VP8_HW_CODEC_PREFIXES));
    }

    public static boolean isVp9HwSupported() {
        return AnonymousClass001.A1T(findDecoder("video/x-vnd.on2.vp9", SUPPORTED_VP9_HW_CODEC_PREFIXES));
    }

    private boolean queueInputBuffer(int i, int i2, long j, long j2, long j3, long j4) {
        try {
            this.inputBuffers[i].position(0);
            this.inputBuffers[i].limit(i2);
            this.decodeStartTimeMs.add(new TimeStamps(j2, j3, SystemClock.elapsedRealtime(), j4));
            this.mediaCodec.queueInputBuffer(i, 0, i2, j, 0);
            return true;
        } catch (IllegalStateException e) {
            Logging.e(TAG, "decode failed", e);
            return false;
        }
    }

    private void release() {
        final CountDownLatch A11 = AnonymousClass001.A11();
        new Thread(new Runnable() { // from class: org.webrtc.legacy.MediaCodecVideoDecoder.1
            @Override // java.lang.Runnable
            public void run() {
                try {
                    Logging.d(MediaCodecVideoDecoder.TAG, "Java releaseDecoder on release thread");
                    MediaCodecVideoDecoder.this.mediaCodec.stop();
                    MediaCodecVideoDecoder.this.mediaCodec.release();
                    Logging.d(MediaCodecVideoDecoder.TAG, "Java releaseDecoder on release thread done");
                } catch (Exception e) {
                    Logging.e(MediaCodecVideoDecoder.TAG, "Media decoder release failed", e);
                }
                A11.countDown();
            }
        }).start();
        if (!ThreadUtils.awaitUninterruptibly(A11, 5000L)) {
            Logging.e(TAG, "Media decoder release timeout");
            int i = sCodecErrors + 1;
            sCodecErrors = i;
            if (errorCallback != null) {
                Logging.e(TAG, 0Pz.A0T("Invoke codec error callback. Errors: ", i));
                errorCallback.onMediaCodecVideoDecoderCriticalError(sCodecErrors);
            }
        }
        this.mediaCodec = null;
        this.mediaCodecThread = null;
        this.isInitialized = false;
        if (this.useSurface) {
            this.textureListener.release();
            this.textureListener = null;
            this.surface.release();
            this.surface = null;
            this.surfaceTextureHelper = null;
        }
    }

    private boolean releaseOutputBuffer(int i) {
        MediaCodec mediaCodec = this.mediaCodec;
        if (mediaCodec == null) {
            Logging.e(TAG, "mediaCodec is null when release.");
            return false;
        }
        try {
            mediaCodec.releaseOutputBuffer(i, false);
            return true;
        } catch (IllegalStateException e) {
            Logging.e(TAG, "releaseOutputBuffer failed", e);
            return false;
        }
    }

    private void reset(int i, int i2) {
        if (this.mediaCodecThread == null || this.mediaCodec == null) {
            throw AnonymousClass001.A0T("Incorrect reset call for non-initialized decoder.");
        }
        Logging.d(TAG, 0Pz.A0C(i, i2, "Java reset: ", " x "));
        this.mediaCodec.flush();
        this.width = i;
        this.height = i2;
        this.decodeStartTimeMs.clear();
        this.dequeuedSurfaceOutputBuffers.clear();
        this.hasDecodedFirstFrame = false;
        this.droppedFrames = 0;
    }

    private void returnDecodedOutputBuffer(int i) {
        checkOnMediaCodecThread();
        if (this.useSurface) {
            throw AnonymousClass001.A0N("returnDecodedOutputBuffer() called for surface decoding.");
        }
        this.mediaCodec.releaseOutputBuffer(i, false);
    }

    public static void setErrorCallback(MediaCodecVideoDecoderErrorCallback mediaCodecVideoDecoderErrorCallback) {
        Logging.d(TAG, "Set error callback");
        errorCallback = mediaCodecVideoDecoderErrorCallback;
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x00a9, code lost:
    
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean isAdaptivePlaybackSupported(org.webrtc.legacy.MediaCodecVideoDecoder.VideoCodecMimeType r302) {
        /*
            Method dump skipped, instructions count: 247
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: org.webrtc.legacy.MediaCodecVideoDecoder.isAdaptivePlaybackSupported(org.webrtc.legacy.MediaCodecVideoDecoder$VideoCodecMimeType):boolean");
    }
}
