package com.facebook.mobileconfig;

import X.C0gh;
import com.facebook.jni.HybridData;

/* loaded from: MobileConfigCoreParams.class */
public class MobileConfigCoreParams {
    public final HybridData mHybridData = initHybrid();

    static {
        C0gh.A02("mobileconfig-jni");
    }

    public static native HybridData initHybrid();

    public native boolean isMCListEnabled();

    public native void setMCListEnabled(boolean z);

    public native void setSkipBufferVerification(boolean z);

    public native boolean skipBufferVerification();
}
