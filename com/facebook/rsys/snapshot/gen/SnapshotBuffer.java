package com.facebook.rsys.snapshot.gen;

import X.2JQ;
import X.N0D;
import X.N6e;
import com.facebook.djinni.msys.infra.McfReference;
import com.facebook.rsys.rtc.RSVideoFrame;
import com.facebook.simplejni.NativeHolder;

/* loaded from: SnapshotBuffer.class */
public class SnapshotBuffer {
    public static 2JQ CONVERTER = N6e.A00(50);
    public static long sMcfTypeId;
    public final NativeHolder mNativeHolder;

    static {
        N0D.A00();
    }

    public SnapshotBuffer(NativeHolder nativeHolder) {
        this.mNativeHolder = nativeHolder;
    }

    public SnapshotBuffer(String str, RSVideoFrame rSVideoFrame, int i, int i2, int i3, int i4) {
        str.getClass();
        this.mNativeHolder = initNativeHolder(str, rSVideoFrame, i, i2, i3, i4);
    }

    public static native SnapshotBuffer createFromMcfType(McfReference mcfReference);

    public static native NativeHolder initNativeHolder(String str, RSVideoFrame rSVideoFrame, int i, int i2, int i3, int i4);

    private native boolean nativeEquals(Object obj);

    public static native long nativeGetMcfTypeId();

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof SnapshotBuffer)) {
            return false;
        }
        return nativeEquals(obj);
    }

    public native int getHeight();

    public native String getUserId();

    public native RSVideoFrame getVideoFrame();

    public native int getWidth();

    public native int getX();

    public native int getY();

    public native int hashCode();

    public native String toString();
}
