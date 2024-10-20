package com.facebook.cameracore.ardelivery.effectasyncassetfetcher.listener;

import X.11T;
import X.C0il;
import X.Qyq;
import com.facebook.jni.HybridData;

/* loaded from: OnAsyncAssetFetchCompletedListener.class */
public abstract class OnAsyncAssetFetchCompletedListener {
    public static final Qyq Companion = new Object();
    public final HybridData mHybridData;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, X.Qyq] */
    static {
        C0il.A0B("ard-android-async-asset-fetcher-listener");
    }

    public OnAsyncAssetFetchCompletedListener(HybridData hybridData) {
        11T.A0F(hybridData, 1);
        this.mHybridData = hybridData;
    }

    public abstract void onAsyncAssetFetchCompleted(String str, String str2);
}
