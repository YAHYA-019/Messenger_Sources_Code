package com.facebook.common.miputil;

import X.C0il;
import com.facebook.jni.HybridData;

/* loaded from: MIPUtils.class */
public class MIPUtils {
    public final HybridData mHybridData = initHybrid();

    static {
        C0il.A0B("mip_utils_jni");
    }

    private native byte[] getProfileRawData(boolean z, byte b);

    public static native HybridData initHybrid();

    public native void dumpProfileInfoToFile(String str, boolean z, byte b);

    public native void resetProfileRawData(byte b);
}
