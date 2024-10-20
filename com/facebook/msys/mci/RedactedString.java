package com.facebook.msys.mci;

import X.1XV;
import com.facebook.simplejni.NativeHolder;

/* loaded from: RedactedString.class */
public class RedactedString {
    public NativeHolder mNativeHolder;

    static {
        1XV.A00();
    }

    public RedactedString(NativeHolder nativeHolder) {
        this.mNativeHolder = nativeHolder;
    }

    private native boolean equalsNative(Object obj);

    public static native NativeHolder initNativeHolder(String str);

    public static native NativeHolder initNativeHolder(String str, int i);

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null || !(obj instanceof RedactedString)) {
            return false;
        }
        return equalsNative(obj);
    }

    public native String getOriginalString();

    public native int hashCode();

    public native int leakAllowance();

    public native String toString();
}
