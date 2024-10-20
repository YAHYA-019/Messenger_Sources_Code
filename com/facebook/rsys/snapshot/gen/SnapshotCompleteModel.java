package com.facebook.rsys.snapshot.gen;

import X.2JQ;
import X.N0D;
import X.N6e;
import com.facebook.djinni.msys.infra.McfReference;
import com.facebook.simplejni.NativeHolder;
import java.util.ArrayList;

/* loaded from: SnapshotCompleteModel.class */
public class SnapshotCompleteModel {
    public static 2JQ CONVERTER = N6e.A00(51);
    public static long sMcfTypeId;
    public final NativeHolder mNativeHolder;

    static {
        N0D.A00();
    }

    public SnapshotCompleteModel(NativeHolder nativeHolder) {
        this.mNativeHolder = nativeHolder;
    }

    public SnapshotCompleteModel(String str, String str2, ArrayList arrayList, ArrayList arrayList2) {
        str.getClass();
        arrayList.getClass();
        this.mNativeHolder = initNativeHolder(str, str2, arrayList, arrayList2);
    }

    public static native SnapshotCompleteModel createFromMcfType(McfReference mcfReference);

    public static native NativeHolder initNativeHolder(String str, String str2, ArrayList arrayList, ArrayList arrayList2);

    private native boolean nativeEquals(Object obj);

    public static native long nativeGetMcfTypeId();

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof SnapshotCompleteModel)) {
            return false;
        }
        return nativeEquals(obj);
    }

    public native ArrayList getCapturedParticipants();

    public native ArrayList getRequestedCaptureParticipants();

    public native String getSnapshotId();

    public native String getSnapshotURI();

    public native int hashCode();

    public native String toString();
}
