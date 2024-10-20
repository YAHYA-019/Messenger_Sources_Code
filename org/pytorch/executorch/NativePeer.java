package org.pytorch.executorch;

import X.C0gh;
import com.facebook.jni.HybridData;
import com.facebook.rtc.fbwebrtc.pytorchmodelloader.RpVoltronManager;

/* loaded from: NativePeer.class */
public abstract class NativePeer {
    public final HybridData mHybridData;

    static {
        C0gh.A02(RpVoltronManager.RP_EXECUTORCH_MODULE_NAME);
    }

    public static native HybridData initHybrid(String str, int i);

    public native EValue[] execute(String str, EValue... eValueArr);

    public native EValue[] forward(EValue... eValueArr);

    public native int loadMethod(String str);
}
