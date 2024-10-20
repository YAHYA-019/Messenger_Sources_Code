package com.facebook.ffmpeg;

import X.0FI;
import X.5Hg;

/* loaded from: FFMpegMediaMetadataRetriever.class */
public class FFMpegMediaMetadataRetriever {
    public final 5Hg mFFMpegLib;
    public long mNativeContext;
    public final String mPath;

    public FFMpegMediaMetadataRetriever(5Hg r302, String str) {
        this.mFFMpegLib = r302;
        this.mPath = str;
    }

    private native void nativeFinalize();

    private native int nativeGetAudioBitRate();

    private native String nativeGetAudioCodecType();

    private native int nativeGetBitRate();

    private native String nativeGetCodecType();

    private native String nativeGetColorTransferType();

    private native String nativeGetComment();

    private native String nativeGetComposer();

    private native String nativeGetCopyright();

    private native String nativeGetCreationTime();

    private native long nativeGetDurationMs();

    private native int nativeGetHeight();

    private native int nativeGetRotation();

    private native String nativeGetSphericalMetadataXml();

    private native int nativeGetWidth();

    private native void nativeInit(String str);

    private native void nativeRelease();

    public void finalize() {
        int A03 = 0FI.A03(1868787395);
        nativeFinalize();
        0FI.A09(1652690267, A03);
    }

    public int getAudioBitRate() {
        return nativeGetAudioBitRate();
    }

    public String getAudioCodecType() {
        return nativeGetAudioCodecType();
    }

    public int getBitRate() {
        return nativeGetBitRate();
    }

    public String getCodecType() {
        return nativeGetCodecType();
    }

    public String getColorTransferType() {
        return nativeGetColorTransferType();
    }

    public String getComment() {
        return nativeGetComment();
    }

    public String getComposer() {
        return nativeGetComposer();
    }

    public String getCopyright() {
        return nativeGetCopyright();
    }

    public String getCreationTime() {
        return nativeGetCreationTime();
    }

    public long getDurationMs() {
        return nativeGetDurationMs();
    }

    public int getHeight() {
        return nativeGetHeight();
    }

    public int getRotation() {
        return nativeGetRotation();
    }

    public String getSphericalMetadataXml() {
        return nativeGetSphericalMetadataXml();
    }

    public int getWidth() {
        return nativeGetWidth();
    }

    public FFMpegMediaMetadataRetriever initialize() {
        this.mFFMpegLib.A00();
        nativeInit(this.mPath);
        return this;
    }

    public void release() {
        nativeRelease();
    }
}
