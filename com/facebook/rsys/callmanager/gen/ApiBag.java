package com.facebook.rsys.callmanager.gen;

import X.2JQ;
import X.HMo;
import X.IR0;
import com.facebook.djinni.msys.infra.McfReference;
import com.facebook.simplejni.NativeHolder;
import java.util.Map;

/* loaded from: ApiBag.class */
public class ApiBag {
    public static 2JQ CONVERTER = IR0.A00(40);
    public static long sMcfTypeId;
    public final NativeHolder mNativeHolder;

    static {
        HMo.A00();
    }

    public ApiBag(NativeHolder nativeHolder) {
        this.mNativeHolder = nativeHolder;
    }

    public ApiBag(Map map, CallApi callApi) {
        map.getClass();
        callApi.getClass();
        this.mNativeHolder = initNativeHolder(map, callApi);
    }

    public static native ApiBag createFromMcfType(McfReference mcfReference);

    public static native NativeHolder initNativeHolder(Map map, CallApi callApi);

    private native boolean nativeEquals(Object obj);

    public static native long nativeGetMcfTypeId();

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof ApiBag)) {
            return false;
        }
        return nativeEquals(obj);
    }

    public native Map getApis();

    public native CallApi getCall();

    public native int hashCode();

    public native String toString();
}
