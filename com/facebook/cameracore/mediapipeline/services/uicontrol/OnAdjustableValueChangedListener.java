package com.facebook.cameracore.mediapipeline.services.uicontrol;

import com.facebook.jni.HybridData;

/* loaded from: OnAdjustableValueChangedListener.class */
public class OnAdjustableValueChangedListener {
    public HybridData mHybridData;

    public OnAdjustableValueChangedListener(HybridData hybridData) {
        this.mHybridData = hybridData;
    }

    public native void onAdjustableValueChanged(float f);
}
