package com.facebook.rsys.callmanager.gen;

import X.2JQ;
import X.HMo;
import X.N6e;
import com.facebook.djinni.msys.infra.McfReference;
import com.facebook.simplejni.NativeHolder;

/* loaded from: CodecInfo.class */
public class CodecInfo {
    public static 2JQ CONVERTER = N6e.A00(12);
    public static long sMcfTypeId;
    public final NativeHolder mNativeHolder;

    static {
        HMo.A00();
    }

    public CodecInfo(int i, int i2, long j, long j2) {
        this.mNativeHolder = initNativeHolder(i, i2, j, j2);
    }

    public CodecInfo(NativeHolder nativeHolder) {
        this.mNativeHolder = nativeHolder;
    }

    public static native CodecInfo createFromMcfType(McfReference mcfReference);

    public static native NativeHolder initNativeHolder(int i, int i2, long j, long j2);

    private native boolean nativeEquals(Object obj);

    public static native long nativeGetMcfTypeId();

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof CodecInfo)) {
            return false;
        }
        return nativeEquals(obj);
    }

    public native int getCodecName();

    public native int getContentType();

    public native long getMaxVersion();

    public native long getMinVersion();

    public native int hashCode();

    public native String toString();
}
