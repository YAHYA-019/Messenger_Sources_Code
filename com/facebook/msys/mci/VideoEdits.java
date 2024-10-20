package com.facebook.msys.mci;

import X.1SL;
import com.facebook.simplejni.NativeHolder;

/* loaded from: VideoEdits.class */
public class VideoEdits {
    public final NativeHolder mNativeHolder;

    static {
        1SL.A00();
    }

    public VideoEdits(NativeHolder nativeHolder) {
        this.mNativeHolder = nativeHolder;
    }

    public static native NativeHolder initNativeHolder(String str, Integer num, boolean z, Double d, Double d2, boolean z2);

    private native boolean nativeEquals(VideoEdits videoEdits);

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof VideoEdits) {
            return nativeEquals((VideoEdits) obj);
        }
        return false;
    }

    public native boolean getIsMuted();

    public native Integer getOverlayImageRotationInDegrees();

    public native String getOverlayImageUrl();

    public native Double getTrimEndTimeInSeconds();

    public native Double getTrimStartTimeInSeconds();

    public native boolean getWasTranscoded();

    public native int hashCode();

    public native String toString();
}
