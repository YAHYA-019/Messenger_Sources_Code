package com.facebook.wamsys.wcc;

import X.C0il;
import com.facebook.simplejni.NativeHolder;

/* loaded from: XMPPStats.class */
public class XMPPStats {
    public final NativeHolder mNativeHolder;

    static {
        C0il.A0B("wamsysjni");
    }

    public XMPPStats(NativeHolder nativeHolder) {
        this.mNativeHolder = nativeHolder;
    }

    public native int getCompressedBytes();

    public native int getEncodedBytes();

    public native int getEncryptedBytes();
}
