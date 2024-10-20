package com.facebook.distribgw.client.mns;

import X.C0il;
import X.C1c6;
import com.facebook.distribgw.client.DGWNetworkStackWrapperHolder;
import com.facebook.jni.HybridData;

/* loaded from: MNSDGWNetworkStackWrapperHolder.class */
public final class MNSDGWNetworkStackWrapperHolder extends DGWNetworkStackWrapperHolder {
    public static final C1c6 Companion = new Object();

    /* JADX WARN: Type inference failed for: r0v0, types: [X.1c6, java.lang.Object] */
    static {
        C0il.A0B("distribgw-mns-jni");
    }

    public static final native HybridData initHybrid(MNSDGWNetworkStackConfig mNSDGWNetworkStackConfig);
}
