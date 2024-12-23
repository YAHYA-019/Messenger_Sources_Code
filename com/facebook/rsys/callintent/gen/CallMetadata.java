package com.facebook.rsys.callintent.gen;

import X.2JQ;
import X.HMl;
import X.N6e;
import com.facebook.djinni.msys.infra.McfReference;
import com.facebook.simplejni.NativeHolder;

/* loaded from: CallMetadata.class */
public class CallMetadata {
    public static 2JQ CONVERTER = N6e.A00(9);
    public static long sMcfTypeId;
    public final NativeHolder mNativeHolder;

    static {
        HMl.A00();
    }

    public CallMetadata(NativeHolder nativeHolder) {
        this.mNativeHolder = nativeHolder;
    }

    public CallMetadata(String str, String str2, boolean z, String str3) {
        str.getClass();
        this.mNativeHolder = initNativeHolder(str, str2, z, str3);
    }

    public static native CallMetadata createFromMcfType(McfReference mcfReference);

    public static native NativeHolder initNativeHolder(String str, String str2, boolean z, String str3);

    private native boolean nativeEquals(Object obj);

    public static native long nativeGetMcfTypeId();

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof CallMetadata)) {
            return false;
        }
        return nativeEquals(obj);
    }

    public native String getBackingIdentifier();

    public native String getCallerName();

    public native String getCallerProfile();

    public native boolean getIsVideo();

    public native int hashCode();

    public native String toString();
}
