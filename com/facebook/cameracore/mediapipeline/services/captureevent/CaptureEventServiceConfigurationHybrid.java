package com.facebook.cameracore.mediapipeline.services.captureevent;

import X.GdX;
import com.facebook.cameracore.mediapipeline.arengineservices.interfaces.ServiceConfiguration;
import com.facebook.jni.HybridData;

/* loaded from: CaptureEventServiceConfigurationHybrid.class */
public class CaptureEventServiceConfigurationHybrid extends ServiceConfiguration {
    public final CaptureEventInputWrapper mCaptureEventInputWrapper;
    public final GdX mConfiguration;

    public CaptureEventServiceConfigurationHybrid(GdX gdX) {
        this.mConfiguration = gdX;
        CaptureEventInputWrapper captureEventInputWrapper = new CaptureEventInputWrapper(gdX.A00);
        this.mCaptureEventInputWrapper = captureEventInputWrapper;
        this.mHybridData = initHybrid(captureEventInputWrapper);
    }

    public static native HybridData initHybrid(CaptureEventInputWrapper captureEventInputWrapper);
}
