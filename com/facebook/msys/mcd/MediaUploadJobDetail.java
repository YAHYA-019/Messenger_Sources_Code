package com.facebook.msys.mcd;

import X.1Vt;
import com.facebook.simplejni.NativeHolder;

/* loaded from: MediaUploadJobDetail.class */
public class MediaUploadJobDetail {
    public final NativeHolder mNativeHolder;

    static {
        1Vt.A00();
    }

    public MediaUploadJobDetail(NativeHolder nativeHolder) {
        this.mNativeHolder = nativeHolder;
    }

    private native boolean equalsNative(long j, Object obj, long j2);

    private native MediaUploadConfig getConfigNative(long j);

    private native MediaUploadContentSource getContentSourceNative(long j);

    private native String getTokenNative(long j);

    private native int hashCodeNative(long j);

    public static native NativeHolder initNativeHolder(MediaUploadContentSource mediaUploadContentSource, MediaUploadConfig mediaUploadConfig, String str);

    private native String toStringNative(long j);

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof MediaUploadJobDetail)) {
            return false;
        }
        return equalsNative(this.mNativeHolder.mNativePointer, obj, ((MediaUploadJobDetail) obj).mNativeHolder.mNativePointer);
    }

    public int hashCode() {
        return hashCodeNative(this.mNativeHolder.mNativePointer);
    }

    public String toString() {
        return toStringNative(this.mNativeHolder.mNativePointer);
    }
}
