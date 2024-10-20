package com.facebook.cipher.jni;

import com.facebook.jni.HybridData;

/* loaded from: DecryptHybrid.class */
public class DecryptHybrid {
    public final HybridData mHybridData;

    public DecryptHybrid(HybridData hybridData) {
        this.mHybridData = hybridData;
    }

    public DecryptHybrid(byte[] bArr, byte[] bArr2) {
        this.mHybridData = initHybrid(bArr, bArr2);
    }

    public static native HybridData initHybrid(byte[] bArr, byte[] bArr2);

    public native boolean end(byte[] bArr);

    public native void read(byte[] bArr, int i, byte[] bArr2, int i2, int i3);

    public native void start(byte[] bArr);
}
