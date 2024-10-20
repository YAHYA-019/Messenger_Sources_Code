package com.facebook.cryptopub;

import X.C0il;

/* loaded from: CryptoPubNative.class */
public class CryptoPubNative {
    static {
        C0il.A0B("cryptopub-jni");
    }

    private native String decryptNative(int i, String str, String str2, String str3, String str4);

    private native byte[] encryptNative(int i, String str, String str2, String str3);

    public byte[] encrypt(int i, String str, String str2, String str3) {
        return encryptNative(i, str, str2, str3);
    }
}
