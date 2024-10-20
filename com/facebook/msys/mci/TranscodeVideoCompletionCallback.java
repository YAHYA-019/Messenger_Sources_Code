package com.facebook.msys.mci;

import X.0fH;
import X.1SL;
import com.facebook.simplejni.NativeHolder;

/* loaded from: TranscodeVideoCompletionCallback.class */
public class TranscodeVideoCompletionCallback {
    public NativeHolder mNativeHolder;

    static {
        1SL.A00();
    }

    public TranscodeVideoCompletionCallback(NativeHolder nativeHolder) {
        this.mNativeHolder = nativeHolder;
    }

    private native void failureNative(Throwable th);

    private native void successNative(String str, double d, double d2, double d3, double d4, double d5, double d6, double d7, double d8);

    public void failure(double d, double d2, Throwable th) {
        0fH.A0z("TranscodeVideoCompletionCallback", "Failed to transcode video! originalWidth=%s, originalHeight=%s", th, new Object[]{Double.valueOf(d), Double.valueOf(d2)});
        failureNative(th);
    }

    public void success(String str, double d, double d2, double d3, double d4, double d5, double d6, double d7, double d8) {
        successNative(str, d, d2, d3, d4, 0.0d, d6, d7, d8);
    }
}
