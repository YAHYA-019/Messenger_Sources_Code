package com.facebook.rsys.snapshot.gen;

import X.2JQ;
import X.LVi;
import X.N0D;
import com.facebook.djinni.msys.infra.McfReference;
import com.facebook.simplejni.NativeHolder;
import java.util.ArrayList;

/* loaded from: SnapshotPendingSnapshot.class */
public class SnapshotPendingSnapshot {
    public static 2JQ CONVERTER = LVi.A00(60);
    public static long sMcfTypeId;
    public final NativeHolder mNativeHolder;

    static {
        N0D.A00();
    }

    public SnapshotPendingSnapshot(NativeHolder nativeHolder) {
        this.mNativeHolder = nativeHolder;
    }

    public SnapshotPendingSnapshot(String str, ArrayList arrayList, float f, float f2) {
        str.getClass();
        arrayList.getClass();
        this.mNativeHolder = initNativeHolder(str, arrayList, f, f2);
    }

    public static native SnapshotPendingSnapshot createFromMcfType(McfReference mcfReference);

    public static native NativeHolder initNativeHolder(String str, ArrayList arrayList, float f, float f2);

    private native boolean nativeEquals(Object obj);

    public static native long nativeGetMcfTypeId();

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof SnapshotPendingSnapshot)) {
            return false;
        }
        return nativeEquals(obj);
    }

    public native ArrayList getSnapshotBuffers();

    public native float getSnapshotHeight();

    public native String getSnapshotId();

    public native float getSnapshotWidth();

    public native int hashCode();

    public native String toString();
}
