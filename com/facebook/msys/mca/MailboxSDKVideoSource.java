package com.facebook.msys.mca;

import X.1Vt;
import com.facebook.simplejni.NativeHolder;

/* loaded from: MailboxSDKVideoSource.class */
public class MailboxSDKVideoSource {
    public static final MailboxSDKVideoSource $redex_init_class = null;
    public final NativeHolder mNativeHolder;

    static {
        1Vt.A00();
    }

    public MailboxSDKVideoSource(NativeHolder nativeHolder) {
        this.mNativeHolder = nativeHolder;
    }

    public MailboxSDKVideoSource(String str, byte[] bArr) {
        this.mNativeHolder = initNativeHolder(str, null);
    }

    private native boolean equalsNative(long j, Object obj, long j2);

    private native byte[] getVideoDataNative(long j);

    private native String getVideoFilePathNative(long j);

    private native int hashCodeNative(long j);

    public static native NativeHolder initNativeHolder(String str, byte[] bArr);

    private native String toStringNative(long j);

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof MailboxSDKVideoSource)) {
            return false;
        }
        return equalsNative(this.mNativeHolder.mNativePointer, obj, ((MailboxSDKVideoSource) obj).mNativeHolder.mNativePointer);
    }

    public int hashCode() {
        return hashCodeNative(this.mNativeHolder.mNativePointer);
    }

    public String toString() {
        return toStringNative(this.mNativeHolder.mNativePointer);
    }
}
