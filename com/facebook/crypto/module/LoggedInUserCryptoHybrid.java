package com.facebook.crypto.module;

import X.C0il;
import com.facebook.cipher.jni.CipherHybrid;
import com.facebook.crypto.keychain.KeyChain;
import com.facebook.jni.HybridData;

/* loaded from: LoggedInUserCryptoHybrid.class */
public class LoggedInUserCryptoHybrid {
    public static LoggedInUserCryptoHybrid sInstance;
    public final HybridData mHybridData = initHybrid();

    static {
        C0il.A0B("cryptojni");
    }

    public static native HybridData initHybrid();

    public native CipherHybrid createCipher();

    public native void setKeyChain(KeyChain keyChain);

    public native void unsetKeyChain();
}
