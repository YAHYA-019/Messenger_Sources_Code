package com.facebook.cameracore.mediapipeline.services.captureevent;

import X.IP0;
import X.JCk;
import com.facebook.jni.HybridData;

/* loaded from: CaptureEventInputWrapper.class */
public class CaptureEventInputWrapper {
    public final JCk mCaptureEventInput;
    public final HybridData mHybridData;

    public CaptureEventInputWrapper(JCk jCk) {
        this.mCaptureEventInput = jCk;
        IP0 ip0 = (IP0) jCk;
        this.mHybridData = initHybrid(ip0.A04, ip0.A02, ip0.A01, ip0.A03, ip0.A00);
        ip0.A06.add(this);
    }

    public static native HybridData initHybrid(int i, int i2, int i3, int i4, float f);

    public native void capturePhoto();

    public native void finishCapturePhoto();

    public native void setCaptureContext(int i);

    public native void setCaptureDevicePosition(int i);

    public native void setCaptureDeviceSize(int i, int i2);

    public native void setEffectSafeAreaInsets(int i, int i2, int i3, int i4);

    public native void setPreviewViewInfo(int i, int i2, float f);

    public native void setRotation(int i);

    public native void setZoomFactor(float f);

    public native void startRecording();

    public native void stopRecording();
}
