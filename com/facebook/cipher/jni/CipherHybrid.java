package com.facebook.cipher.jni;

import com.facebook.crypto.keychain.KeyChain;
import com.facebook.jni.HybridData;

/* loaded from: CipherHybrid.class */
public class CipherHybrid {
    public final HybridData mHybridData;

    public CipherHybrid(byte b, KeyChain keyChain) {
        this.mHybridData = initHybrid((byte) 2, keyChain);
    }

    public CipherHybrid(HybridData hybridData) {
        this.mHybridData = hybridData;
    }

    public static native HybridData initHybrid(byte b, KeyChain keyChain);

    public native DecryptHybrid createDecrypt(byte[] bArr, int i, int i2);

    public native EncryptHybrid createEncrypt(byte[] bArr, int i, int i2);
}
