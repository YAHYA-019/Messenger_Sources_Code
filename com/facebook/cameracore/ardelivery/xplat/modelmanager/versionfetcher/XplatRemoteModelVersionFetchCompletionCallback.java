package com.facebook.cameracore.ardelivery.xplat.modelmanager.versionfetcher;

import X.C0il;
import X.EV2;
import com.facebook.jni.HybridData;

/* loaded from: XplatRemoteModelVersionFetchCompletionCallback.class */
public final class XplatRemoteModelVersionFetchCompletionCallback {
    public static final EV2 Companion = new Object();
    public HybridData mHybridData;

    /* JADX WARN: Type inference failed for: r0v0, types: [X.EV2, java.lang.Object] */
    static {
        C0il.A0B("ard-remote-model-fetch-callback");
    }

    public XplatRemoteModelVersionFetchCompletionCallback(HybridData hybridData) {
        this.mHybridData = hybridData;
    }

    public final native void onFailure(String str);

    public final native void onSuccess(XplatModelVersionResponse xplatModelVersionResponse);
}
