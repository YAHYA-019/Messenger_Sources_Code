package com.facebook.cameracore.ardelivery.xplat.modelmanager;

import X.C0il;
import X.EV1;
import com.facebook.jni.HybridData;
import java.util.List;

/* loaded from: XplatModelMetadataCompletionCallback.class */
public final class XplatModelMetadataCompletionCallback {
    public static final EV1 Companion = new Object();
    public final HybridData mHybridData;

    /* JADX WARN: Type inference failed for: r0v0, types: [X.EV1, java.lang.Object] */
    static {
        C0il.A0B("ard-android-model-metadata-manager");
    }

    public XplatModelMetadataCompletionCallback(HybridData hybridData) {
        this.mHybridData = hybridData;
    }

    public final native void onFailure(String str);

    public final native void onSuccess(List list);
}
