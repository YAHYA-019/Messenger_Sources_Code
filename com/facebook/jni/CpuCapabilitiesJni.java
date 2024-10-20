package com.facebook.jni;

import X.C0gh;
import java.util.ArrayList;

/* loaded from: CpuCapabilitiesJni.class */
public class CpuCapabilitiesJni {
    static {
        C0gh.A03("fb");
    }

    public static native boolean nativeDeviceSupportsNeon();

    public static native boolean nativeDeviceSupportsVFPFP16();

    public static native boolean nativeDeviceSupportsX86();

    public static native ArrayList nativeGetArmFeatures();
}
