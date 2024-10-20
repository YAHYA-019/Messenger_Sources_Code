package com.facebook.ffmpeg;

import X.0FI;
import X.5Hg;
import java.nio.ByteBuffer;

/* loaded from: FFMpegMediaDemuxer.class */
public class FFMpegMediaDemuxer {
    public final 5Hg mFFMpegLib;
    public boolean mIsInitialized;
    public long mNativeContext;
    public final Options mOptions;
    public final String mPath;

    /* loaded from: FFMpegMediaDemuxer$Options.class */
    public class Options {
        public boolean ensureSafeFileNames = false;
        public boolean autoConvertPacketData = false;
    }

    public FFMpegMediaDemuxer(5Hg r302, String str) {
        this(r302, str, null);
    }

    public FFMpegMediaDemuxer(5Hg r302, String str, Options options) {
        this.mFFMpegLib = r302;
        this.mPath = str;
        this.mOptions = options;
    }

    private native boolean nativeAdvance();

    private native void nativeFinalize();

    private native long nativeGetSampleDuration();

    private native int nativeGetSampleFlags();

    private native long nativeGetSampleTime();

    private native int nativeGetSampleTrackIndex();

    private native int nativeGetTrackCount();

    private native FFMpegMediaFormat nativeGetTrackFormat(int i);

    private native void nativeInit(String str, Options options);

    private native int nativeReadSampleData(ByteBuffer byteBuffer, int i);

    private native void nativeRelease();

    private native void nativeSeekTo(int i, long j, int i2);

    private native void nativeSelectTrack(int i);

    private native void nativeUnselectTrack(int i);

    public boolean advance() {
        return nativeAdvance();
    }

    public void finalize() {
        int A03 = 0FI.A03(2144027563);
        nativeFinalize();
        0FI.A09(-23450213, A03);
    }

    public long getSampleDuration() {
        return nativeGetSampleDuration();
    }

    public int getSampleFlags() {
        return nativeGetSampleFlags();
    }

    public long getSampleTime() {
        return nativeGetSampleTime();
    }

    public int getSampleTrackIndex() {
        return nativeGetSampleTrackIndex();
    }

    public int getTrackCount() {
        return nativeGetTrackCount();
    }

    public FFMpegMediaFormat getTrackFormat(int i) {
        return nativeGetTrackFormat(i);
    }

    public FFMpegMediaDemuxer initialize() {
        this.mFFMpegLib.A00();
        nativeInit(this.mPath, this.mOptions);
        this.mIsInitialized = true;
        return this;
    }

    public int readSampleData(ByteBuffer byteBuffer, int i) {
        byteBuffer.getClass();
        return nativeReadSampleData(byteBuffer, 0);
    }

    public void release() {
        if (this.mIsInitialized) {
            nativeRelease();
            this.mIsInitialized = false;
        }
    }

    public void seekTo(int i, long j, int i2) {
        nativeSeekTo(i, j, i2);
    }

    public void selectTrack(int i) {
        nativeSelectTrack(i);
    }
}
