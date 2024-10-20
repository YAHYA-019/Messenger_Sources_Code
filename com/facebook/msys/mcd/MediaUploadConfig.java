package com.facebook.msys.mcd;

import X.1Vt;
import com.facebook.simplejni.NativeHolder;
import java.util.Map;

/* loaded from: MediaUploadConfig.class */
public class MediaUploadConfig {
    public final NativeHolder mNativeHolder;

    static {
        1Vt.A00();
    }

    public MediaUploadConfig(NativeHolder nativeHolder) {
        this.mNativeHolder = nativeHolder;
    }

    private native boolean equalsNative(long j, Object obj, long j2);

    private native Map getExtraHeadersNative(long j);

    private native Map getExtraLoggingDataNative(long j);

    private native String getFileNameNative(long j);

    private native String getJobIdNative(long j);

    private native String getMailboxUserIDNative(long j);

    private native String getMediaCreationRequestPathNative(long j);

    private native String getMimeTypeNative(long j);

    private native Map getOptionalConfigNative(long j);

    private native Map getParamsNative(long j);

    private native String getProtocolNative(long j);

    private native String getServerDedupeKeyNative(long j);

    private native Map getUrlParamsNative(long j);

    private native int hashCodeNative(long j);

    public static native NativeHolder initNativeHolder(String str, String str2, String str3, String str4, String str5, String str6, Map map, Map map2, Map map3, String str7, Map map4, Map map5);

    private native String toStringNative(long j);

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof MediaUploadConfig)) {
            return false;
        }
        return equalsNative(this.mNativeHolder.mNativePointer, obj, ((MediaUploadConfig) obj).mNativeHolder.mNativePointer);
    }

    public int hashCode() {
        return hashCodeNative(this.mNativeHolder.mNativePointer);
    }

    public String toString() {
        return toStringNative(this.mNativeHolder.mNativePointer);
    }
}
