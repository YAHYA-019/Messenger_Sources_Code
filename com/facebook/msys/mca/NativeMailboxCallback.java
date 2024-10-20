package com.facebook.msys.mca;

import X.1Vt;
import com.facebook.simplejni.NativeHolder;

/* loaded from: NativeMailboxCallback.class */
public final class NativeMailboxCallback implements MailboxCallback {
    public NativeHolder mNativeHolder;

    static {
        1Vt.A00();
    }

    public NativeMailboxCallback(NativeHolder nativeHolder) {
        this.mNativeHolder = nativeHolder;
    }

    @Override // com.facebook.msys.mca.MailboxCallback
    public native void onCompletion(Object obj);
}
