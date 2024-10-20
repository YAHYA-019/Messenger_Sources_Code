package com.facebook.msys.mci;

import X.0fH;
import X.1BK;
import X.1SL;
import com.facebook.simplejni.NativeHolder;

/* loaded from: VideoSizeEstimatorCompletionCallback.class */
public class VideoSizeEstimatorCompletionCallback {
    public NativeHolder mNativeHolder;

    static {
        1SL.A00();
    }

    public VideoSizeEstimatorCompletionCallback(NativeHolder nativeHolder) {
        this.mNativeHolder = nativeHolder;
    }

    private native void failureNative(Throwable th);

    private native void successNative(long j);

    public void failure(long j, Throwable th) {
        0fH.A0z("VideoSizeEstimatorCompletionCallback", "Failed to estimate video size! maxVideoResolution=%s", th, 1BK.A1Z(j));
        failureNative(th);
    }

    public void success(long j) {
        successNative(j);
    }
}
