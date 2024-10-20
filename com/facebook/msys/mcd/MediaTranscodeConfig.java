package com.facebook.msys.mcd;

import X.1Vt;
import com.facebook.simplejni.NativeHolder;

/* loaded from: MediaTranscodeConfig.class */
public class MediaTranscodeConfig {
    public final NativeHolder mNativeHolder;

    static {
        1Vt.A00();
    }

    public MediaTranscodeConfig(NativeHolder nativeHolder) {
        this.mNativeHolder = nativeHolder;
    }

    private native boolean equalsNative(long j, Object obj, long j2);

    private native Integer getMaxVideoResolutionNative(long j);

    private native boolean getPreserveOriginalSizeNative(long j);

    private native byte[] getVideoEditsNative(long j);

    private native int hashCodeNative(long j);

    public static native NativeHolder initNativeHolder(Integer num, byte[] bArr, boolean z);

    private native String toStringNative(long j);

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof MediaTranscodeConfig)) {
            return false;
        }
        return equalsNative(this.mNativeHolder.mNativePointer, obj, ((MediaTranscodeConfig) obj).mNativeHolder.mNativePointer);
    }

    public int hashCode() {
        return hashCodeNative(this.mNativeHolder.mNativePointer);
    }

    public String toString() {
        return toStringNative(this.mNativeHolder.mNativePointer);
    }
}
