package com.facebook.mobileconfig;

import X.1EP;
import X.C0gh;
import com.facebook.jni.HybridData;
import java.nio.ByteBuffer;

/* loaded from: MobileConfigMmapHandleHolder.class */
public class MobileConfigMmapHandleHolder extends 1EP {
    public final HybridData mHybridData;

    static {
        C0gh.A02("mobileconfig-jni");
    }

    public MobileConfigMmapHandleHolder(HybridData hybridData) {
        this.mHybridData = hybridData;
    }

    public native String getFilename();

    public ByteBuffer getJavaByteBuffer() {
        return 1EP.A00(getFilename());
    }
}
