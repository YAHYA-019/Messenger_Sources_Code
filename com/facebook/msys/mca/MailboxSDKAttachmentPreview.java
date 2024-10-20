package com.facebook.msys.mca;

import X.1Vt;
import com.facebook.simplejni.NativeHolder;

/* loaded from: MailboxSDKAttachmentPreview.class */
public class MailboxSDKAttachmentPreview {
    public static final MailboxSDKAttachmentPreview $redex_init_class = null;
    public final NativeHolder mNativeHolder;

    static {
        1Vt.A00();
    }

    public MailboxSDKAttachmentPreview(NativeHolder nativeHolder) {
        this.mNativeHolder = nativeHolder;
    }

    public MailboxSDKAttachmentPreview(String str, String str2, Number number, Number number2) {
        this.mNativeHolder = initNativeHolder(str, str2, number, number2);
    }

    private native boolean equalsNative(long j, Object obj, long j2);

    private native Number getPreviewHeightNative(long j);

    private native String getPreviewImagePathNative(long j);

    private native String getPreviewMimeTypeNative(long j);

    private native Number getPreviewWidthNative(long j);

    private native int hashCodeNative(long j);

    public static native NativeHolder initNativeHolder(String str, String str2, Number number, Number number2);

    private native String toStringNative(long j);

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof MailboxSDKAttachmentPreview)) {
            return false;
        }
        return equalsNative(this.mNativeHolder.mNativePointer, obj, ((MailboxSDKAttachmentPreview) obj).mNativeHolder.mNativePointer);
    }

    public int hashCode() {
        return hashCodeNative(this.mNativeHolder.mNativePointer);
    }

    public String toString() {
        return toStringNative(this.mNativeHolder.mNativePointer);
    }
}
