package com.facebook.cameracore.mediapipeline.services.uicontrol;

import com.facebook.jni.HybridData;

/* loaded from: RawEditableTextListener.class */
public class RawEditableTextListener {
    public HybridData mHybridData;

    public RawEditableTextListener(HybridData hybridData) {
        this.mHybridData = hybridData;
    }

    public native void onExit();

    public native void onTextChanged(String str);
}
