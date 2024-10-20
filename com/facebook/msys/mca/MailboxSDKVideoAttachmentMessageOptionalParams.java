package com.facebook.msys.mca;

import X.1Vt;
import com.facebook.msys.mci.VideoEdits;
import com.facebook.simplejni.NativeHolder;

/* loaded from: MailboxSDKVideoAttachmentMessageOptionalParams.class */
public class MailboxSDKVideoAttachmentMessageOptionalParams {
    public static final MailboxSDKVideoAttachmentMessageOptionalParams $redex_init_class = null;
    public final NativeHolder mNativeHolder;

    static {
        1Vt.A00();
    }

    public MailboxSDKVideoAttachmentMessageOptionalParams(NativeHolder nativeHolder) {
        this.mNativeHolder = nativeHolder;
    }

    public MailboxSDKVideoAttachmentMessageOptionalParams(String str, VideoEdits videoEdits, Number number) {
        this.mNativeHolder = initNativeHolder(str, videoEdits, number);
    }

    private native boolean equalsNative(long j, Object obj, long j2);

    private native Number getSenderFbIdNative(long j);

    private native String getTextNative(long j);

    private native VideoEdits getVideoEditsNative(long j);

    private native int hashCodeNative(long j);

    public static native NativeHolder initNativeHolder(String str, VideoEdits videoEdits, Number number);

    private native String toStringNative(long j);

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof MailboxSDKVideoAttachmentMessageOptionalParams)) {
            return false;
        }
        return equalsNative(this.mNativeHolder.mNativePointer, obj, ((MailboxSDKVideoAttachmentMessageOptionalParams) obj).mNativeHolder.mNativePointer);
    }

    public int hashCode() {
        return hashCodeNative(this.mNativeHolder.mNativePointer);
    }

    public String toString() {
        return toStringNative(this.mNativeHolder.mNativePointer);
    }
}
