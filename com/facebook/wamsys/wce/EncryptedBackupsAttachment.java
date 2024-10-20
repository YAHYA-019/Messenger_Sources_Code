package com.facebook.wamsys.wce;

import X.C0il;
import com.facebook.simplejni.NativeHolder;

/* loaded from: EncryptedBackupsAttachment.class */
public class EncryptedBackupsAttachment {
    public final NativeHolder mNativeHolder;

    static {
        C0il.A0B("wamsysjni");
    }

    public EncryptedBackupsAttachment(NativeHolder nativeHolder) {
        this.mNativeHolder = nativeHolder;
    }

    public static native NativeHolder initNativeHolder(String str, String str2, String str3, String str4, String str5, String str6);

    private native boolean nativeEquals(Object obj);

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof EncryptedBackupsAttachment)) {
            return false;
        }
        return nativeEquals(obj);
    }

    public native String getEncryptedFileSha();

    public native String getFileSha();

    public native String getMediaKey();

    public native String getMimeType();

    public native String getObjectId();

    public native String getPreviewObjectId();

    public native int hashCode();

    public native String toString();
}
