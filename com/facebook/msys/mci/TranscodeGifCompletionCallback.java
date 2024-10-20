package com.facebook.msys.mci;

import X.1SL;
import com.facebook.simplejni.NativeHolder;

/* loaded from: TranscodeGifCompletionCallback.class */
public class TranscodeGifCompletionCallback {
    public NativeHolder mNativeHolder;

    static {
        1SL.A00();
    }

    public TranscodeGifCompletionCallback(NativeHolder nativeHolder) {
        this.mNativeHolder = nativeHolder;
    }

    private native void failureNative(Throwable th);

    private native void successNative(String str);

    public void success(String str) {
        successNative(null);
    }
}
