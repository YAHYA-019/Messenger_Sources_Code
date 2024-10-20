package com.facebook.msys.mci;

import X.1SL;
import com.facebook.simplejni.NativeHolder;

/* loaded from: NetworkMultiPartParam.class */
public class NetworkMultiPartParam {
    public final NativeHolder mNativeHolder;

    static {
        1SL.A00();
    }

    public NetworkMultiPartParam(NativeHolder nativeHolder) {
        this.mNativeHolder = nativeHolder;
    }

    private native boolean equalsNative(long j, Object obj, long j2);

    private native byte[] getDataNative(long j);

    private native String getFileNameNative(long j);

    private native String getMimeTypeNative(long j);

    private native int hashCodeNative(long j);

    public static native NativeHolder initNativeHolder(String str, String str2, byte[] bArr);

    private native String toStringNative(long j);

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof NetworkMultiPartParam)) {
            return false;
        }
        return equalsNative(this.mNativeHolder.mNativePointer, obj, ((NetworkMultiPartParam) obj).mNativeHolder.mNativePointer);
    }

    public int hashCode() {
        return hashCodeNative(this.mNativeHolder.mNativePointer);
    }

    public String toString() {
        return toStringNative(this.mNativeHolder.mNativePointer);
    }
}
