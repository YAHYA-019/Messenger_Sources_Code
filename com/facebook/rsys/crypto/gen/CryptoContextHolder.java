package com.facebook.rsys.crypto.gen;

import X.2JQ;
import X.HMv;
import X.IR0;
import com.facebook.djinni.msys.infra.McfReference;
import com.facebook.simplejni.NativeHolder;

/* loaded from: CryptoContextHolder.class */
public class CryptoContextHolder {
    public static 2JQ CONVERTER = IR0.A00(93);
    public static long sMcfTypeId;
    public final NativeHolder mNativeHolder;

    static {
        HMv.A00();
    }

    public CryptoContextHolder(McfReference mcfReference) {
        mcfReference.getClass();
        this.mNativeHolder = initNativeHolder(mcfReference);
    }

    public CryptoContextHolder(NativeHolder nativeHolder) {
        this.mNativeHolder = nativeHolder;
    }

    public static native CryptoContextHolder createFromMcfType(McfReference mcfReference);

    public static native NativeHolder initNativeHolder(McfReference mcfReference);

    private native boolean nativeEquals(Object obj);

    public static native long nativeGetMcfTypeId();

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof CryptoContextHolder)) {
            return false;
        }
        return nativeEquals(obj);
    }

    public native McfReference getContext();

    public native int hashCode();

    public native String toString();
}
