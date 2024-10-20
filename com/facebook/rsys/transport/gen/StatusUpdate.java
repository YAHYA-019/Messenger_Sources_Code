package com.facebook.rsys.transport.gen;

import X.2JQ;
import X.HNG;
import X.IQz;
import com.facebook.djinni.msys.infra.McfReference;
import com.facebook.simplejni.NativeHolder;

/* loaded from: StatusUpdate.class */
public class StatusUpdate {
    public static 2JQ CONVERTER = new IQz(2);
    public static long sMcfTypeId;
    public final NativeHolder mNativeHolder;

    static {
        HNG.A00();
    }

    public StatusUpdate(int i) {
        this.mNativeHolder = initNativeHolder(i);
    }

    public StatusUpdate(NativeHolder nativeHolder) {
        this.mNativeHolder = nativeHolder;
    }

    public static native StatusUpdate createFromMcfType(McfReference mcfReference);

    public static native NativeHolder initNativeHolder(int i);

    private native boolean nativeEquals(Object obj);

    public static native long nativeGetMcfTypeId();

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof StatusUpdate)) {
            return false;
        }
        return nativeEquals(obj);
    }

    public native int getSessionsCount();

    public native int hashCode();

    public native String toString();
}
