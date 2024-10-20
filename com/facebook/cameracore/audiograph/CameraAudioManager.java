package com.facebook.cameracore.audiograph;

import X.0fH;
import X.7zO;
import X.C0il;
import X.HrU;
import com.facebook.jni.HybridData;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: CameraAudioManager.class */
public class CameraAudioManager {
    public HrU mCallback;
    public final AtomicBoolean mDestroyed = 7zO.A15();
    public HybridData mHybridData;

    static {
        C0il.A0B("audiograph-native");
    }

    public CameraAudioManager(float f) {
        this.mHybridData = initHybrid(f);
    }

    private native HybridData initHybrid(float f);

    public native AudioGraphClientProvider getAudioGraphClientProvider();

    public native int getNumSamples();

    public native float getSampleRate();

    public native boolean getSpeakers();

    public native int getState();

    public native String getStateStr(int i);

    public void onAudioData(byte[] bArr, long j) {
        0fH.A0j("CameraAudioManager", "onAudioData");
        if (this.mCallback != null) {
            0fH.A0j("CameraAudioManager", "onAudioData");
            this.mCallback.A01(bArr, (int) getSampleRate(), 2, 1, j, 0L);
        }
    }

    public native void setSpeakers(boolean z);

    public native int setState(int i);

    public native int setStateSync(int i);
}
