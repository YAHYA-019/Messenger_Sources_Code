package com.facebook.msys.mci;

import X.0fH;
import X.1SL;
import com.facebook.simplejni.NativeHolder;
import java.util.Map;

/* loaded from: TranscodeImageCompletionCallback.class */
public class TranscodeImageCompletionCallback {
    public NativeHolder mNativeHolder;

    static {
        1SL.A00();
    }

    public TranscodeImageCompletionCallback(NativeHolder nativeHolder) {
        this.mNativeHolder = nativeHolder;
    }

    private native void failureNative(Throwable th);

    private native void successNative(String str, String str2, Map map, Map map2);

    public void failure(double d, double d2, double d3, double d4, Throwable th) {
        0fH.A0z("TranscodeImageCompletionCallback", "Failed to transcode image! primaryOriginalWidth=%s, primaryOriginalHeight=%s, secondaryOriginalWidth=%s, secondaryOriginalHeight=%s", th, new Object[]{Double.valueOf(d), Double.valueOf(d2), Double.valueOf(d3), Double.valueOf(d4)});
        failureNative(th);
    }

    public void success(String str, String str2, Map map, Map map2) {
        successNative(str, str2, map, map2);
    }
}
