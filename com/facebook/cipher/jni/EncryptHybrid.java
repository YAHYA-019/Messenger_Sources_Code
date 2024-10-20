package com.facebook.cipher.jni;

import com.facebook.jni.HybridData;

/* loaded from: EncryptHybrid.class */
public class EncryptHybrid {
    public final HybridData mHybridData;

    public EncryptHybrid(HybridData hybridData) {
        this.mHybridData = hybridData;
    }

    public EncryptHybrid(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        this.mHybridData = initHybrid(bArr, bArr2, bArr3);
    }

    public static native HybridData initHybrid(byte[] bArr, byte[] bArr2, byte[] bArr3);

    public native byte[] end();

    public native byte[] start();

    public native void write(byte[] bArr, int i, byte[] bArr2, int i2, int i3);
}
