package com.facebook.rsys.callintent.gen;

import X.2JQ;
import X.HMl;
import X.IR0;
import com.facebook.djinni.msys.infra.McfReference;
import com.facebook.simplejni.NativeHolder;

/* loaded from: CallIntentCreationResult.class */
public class CallIntentCreationResult {
    public static 2JQ CONVERTER = IR0.A00(31);
    public static long sMcfTypeId;
    public final NativeHolder mNativeHolder;

    static {
        HMl.A00();
    }

    public CallIntentCreationResult(CallIntent callIntent, int i, String str) {
        this.mNativeHolder = initNativeHolder(callIntent, i, str);
    }

    public CallIntentCreationResult(NativeHolder nativeHolder) {
        this.mNativeHolder = nativeHolder;
    }

    public static native CallIntentCreationResult createFromMcfType(McfReference mcfReference);

    public static native NativeHolder initNativeHolder(CallIntent callIntent, int i, String str);

    private native boolean nativeEquals(Object obj);

    public static native long nativeGetMcfTypeId();

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof CallIntentCreationResult)) {
            return false;
        }
        return nativeEquals(obj);
    }

    public native CallIntent getCallIntent();

    public native String getCollidedLocalCallId();

    public native int getStatusCode();

    public native int hashCode();

    public native String toString();
}
