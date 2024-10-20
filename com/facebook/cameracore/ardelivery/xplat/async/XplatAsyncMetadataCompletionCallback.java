package com.facebook.cameracore.ardelivery.xplat.async;

import X.C0il;
import X.Qyv;
import com.facebook.jni.HybridData;

/* loaded from: XplatAsyncMetadataCompletionCallback.class */
public final class XplatAsyncMetadataCompletionCallback {
    public static final Qyv Companion = new Object();
    public final HybridData mHybridData;

    /* JADX WARN: Type inference failed for: r0v0, types: [X.Qyv, java.lang.Object] */
    static {
        C0il.A0B("ard-async-downloader");
    }

    public XplatAsyncMetadataCompletionCallback(HybridData hybridData) {
        this.mHybridData = hybridData;
    }

    public final native void onFailure(String str);

    public final native void onSuccess(XplatAsyncMetadataResponse xplatAsyncMetadataResponse);
}
