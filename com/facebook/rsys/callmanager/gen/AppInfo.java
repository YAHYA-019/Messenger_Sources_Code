package com.facebook.rsys.callmanager.gen;

import X.2JQ;
import X.HMo;
import X.IR0;
import com.facebook.djinni.msys.infra.McfReference;
import com.facebook.simplejni.NativeHolder;

/* loaded from: AppInfo.class */
public class AppInfo {
    public static 2JQ CONVERTER = IR0.A00(41);
    public static long sMcfTypeId;
    public final NativeHolder mNativeHolder;

    static {
        HMo.A00();
    }

    public AppInfo(NativeHolder nativeHolder) {
        this.mNativeHolder = nativeHolder;
    }

    public AppInfo(String str, String str2) {
        str.getClass();
        str2.getClass();
        this.mNativeHolder = initNativeHolder(str, str2);
    }

    public static native AppInfo createFromMcfType(McfReference mcfReference);

    public static native NativeHolder initNativeHolder(String str, String str2);

    private native boolean nativeEquals(Object obj);

    public static native long nativeGetMcfTypeId();

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof AppInfo)) {
            return false;
        }
        return nativeEquals(obj);
    }

    public native String getAppId();

    public native String getDeviceId();

    public native int hashCode();

    public native String toString();
}
