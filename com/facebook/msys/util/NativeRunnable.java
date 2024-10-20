package com.facebook.msys.util;

import X.1SL;
import com.facebook.simplejni.NativeHolder;

/* loaded from: NativeRunnable.class */
public final class NativeRunnable implements Runnable {
    public NativeHolder mNativeHolder;

    static {
        1SL.A00();
    }

    public NativeRunnable(NativeHolder nativeHolder) {
        this.mNativeHolder = nativeHolder;
    }

    @Override // java.lang.Runnable
    public native void run();
}
