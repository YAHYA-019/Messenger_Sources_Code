package com.facebook.spherical.video.spatialaudio;

import X.6VJ;
import X.C0il;
import X.Kff;
import X.Qo1;
import com.facebook.jni.HybridData;
import java.nio.ByteBuffer;

/* loaded from: AudioSpatializer.class */
public class AudioSpatializer {
    public static final AudioSpatializer $redex_init_class = null;
    public 6VJ mAudioChannelLayout;
    public final Kff mEventListener;
    public float mGain = 1.0f;
    public Qo1 mPlayState = Qo1.A02;
    public final HybridData mHybridData = initHybridData();
    public final int mSpatQueueSamplesPerChannel = 8192;
    public final int mEngineBufferSamplesPerChannel = 1024;

    static {
        C0il.A0B("spatialaudio");
    }

    public AudioSpatializer(6VJ r302, int i, int i2, Kff kff) {
        this.mAudioChannelLayout = 6VJ.A0A;
        this.mAudioChannelLayout = r302;
        this.mEventListener = kff;
    }

    public static native HybridData initHybridData();

    private native void nativeConfigure(float f, int i, int i2, boolean z, boolean z2);

    private native void nativeDestroy();

    private native void nativeEnableFocus(boolean z);

    private native int nativeGetAudioMix(ByteBuffer byteBuffer);

    private native int nativeGetBufferSize();

    private native int nativeGetBufferUnderrunCount();

    private native long nativeGetPlaybackHeadPosition();

    private native void nativeHandleEndOfStream();

    private native boolean nativeInitialize();

    private native boolean nativeIsInitialized();

    private native void nativePause();

    private native void nativePlay();

    private native void nativeReset();

    private native void nativeSetFocusWidthDegrees(float f);

    private native void nativeSetListenerOrientation(float[] fArr);

    private native void nativeSetOffFocusLeveldB(float f);

    private native void nativeSetVolume(float f);

    private native int nativeWrite(ByteBuffer byteBuffer, int i, int i2, String str);
}
