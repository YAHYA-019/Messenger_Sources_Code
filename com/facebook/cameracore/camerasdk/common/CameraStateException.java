package com.facebook.cameracore.camerasdk.common;

import X.Gtz;
import android.util.Log;

/* loaded from: CameraStateException.class */
public final class CameraStateException extends Gtz {
    public final boolean mIsCameraClosed;

    public CameraStateException(String str, Throwable th, int i, boolean z) {
        super(str, th, i);
        Log.e("com.facebook.cameracore.camerasdk.common.CameraStateException", str, th);
        this.mIsCameraClosed = z;
    }
}
