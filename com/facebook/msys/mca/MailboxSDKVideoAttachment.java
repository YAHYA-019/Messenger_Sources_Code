package com.facebook.msys.mca;

import X.1Vt;
import com.facebook.simplejni.NativeHolder;

/* loaded from: MailboxSDKVideoAttachment.class */
public class MailboxSDKVideoAttachment {
    public static final MailboxSDKVideoAttachment $redex_init_class = null;
    public final NativeHolder mNativeHolder;

    static {
        1Vt.A00();
    }

    public MailboxSDKVideoAttachment(NativeHolder nativeHolder) {
        this.mNativeHolder = nativeHolder;
    }

    public MailboxSDKVideoAttachment(String str, Number number, Number number2, Number number3, String str2, MailboxSDKVideoSource mailboxSDKVideoSource, MailboxSDKAttachmentPreview mailboxSDKAttachmentPreview) {
        this.mNativeHolder = initNativeHolder(str, number, number2, number3, str2, mailboxSDKVideoSource, mailboxSDKAttachmentPreview);
    }

    private native boolean equalsNative(long j, Object obj, long j2);

    private native Number getDurationMsNative(long j);

    private native Number getHeightNative(long j);

    private native String getPlayableUrlNative(long j);

    private native MailboxSDKAttachmentPreview getPreviewNative(long j);

    private native String getVideoMimeTypeNative(long j);

    private native MailboxSDKVideoSource getVideoSourceNative(long j);

    private native Number getWidthNative(long j);

    private native int hashCodeNative(long j);

    public static native NativeHolder initNativeHolder(String str, Number number, Number number2, Number number3, String str2, MailboxSDKVideoSource mailboxSDKVideoSource, MailboxSDKAttachmentPreview mailboxSDKAttachmentPreview);

    private native String toStringNative(long j);

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof MailboxSDKVideoAttachment)) {
            return false;
        }
        return equalsNative(this.mNativeHolder.mNativePointer, obj, ((MailboxSDKVideoAttachment) obj).mNativeHolder.mNativePointer);
    }

    public int hashCode() {
        return hashCodeNative(this.mNativeHolder.mNativePointer);
    }

    public String toString() {
        return toStringNative(this.mNativeHolder.mNativePointer);
    }
}
