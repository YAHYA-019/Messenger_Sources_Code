package com.facebook.cameracore.ardelivery.listener.xplatimpl;

import X.0fH;
import X.C0il;
import X.EUw;
import X.GEI;
import com.facebook.cameracore.ardelivery.listener.CancelableToken;
import com.facebook.jni.HybridData;

/* loaded from: CancelableTokenJNI.class */
public final class CancelableTokenJNI implements GEI, CancelableToken {
    public static final EUw Companion = new Object();
    public static final String TAG = "CancelableTokenJNI";
    public final HybridData mHybridData;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, X.EUw] */
    static {
        C0il.A0B("ard-android-listener");
    }

    public CancelableTokenJNI(HybridData hybridData) {
        this.mHybridData = hybridData;
    }

    private final native void nativeCancel();

    @Override // com.facebook.cameracore.ardelivery.listener.CancelableToken
    public boolean cancel() {
        0fH.A0l(TAG, "[ARD] CancelableTokenJNI#cancel()");
        nativeCancel();
        return true;
    }

    public void setPrefetch(boolean z) {
    }
}
