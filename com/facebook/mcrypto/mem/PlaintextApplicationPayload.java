package com.facebook.mcrypto.mem;

import X.C0il;
import com.facebook.simplejni.NativeHolder;

/* loaded from: PlaintextApplicationPayload.class */
public class PlaintextApplicationPayload {
    public final NativeHolder mNativeHolder;

    static {
        C0il.A0B("mcryptojni");
    }

    public PlaintextApplicationPayload(NativeHolder nativeHolder) {
        this.mNativeHolder = nativeHolder;
    }

    public static native NativeHolder initNativeHolder(byte[] bArr, Number number);

    private native boolean nativeEquals(Object obj);

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof PlaintextApplicationPayload)) {
            return false;
        }
        return nativeEquals(obj);
    }

    public native Number getPlaintextApplicationVersion();

    public native byte[] getPlaintextPayload();

    public native int hashCode();

    public native String toString();
}
