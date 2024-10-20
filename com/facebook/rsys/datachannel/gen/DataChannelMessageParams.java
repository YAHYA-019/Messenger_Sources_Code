package com.facebook.rsys.datachannel.gen;

import X.2JQ;
import X.HMw;
import X.IR0;
import com.facebook.djinni.msys.infra.McfReference;
import com.facebook.simplejni.NativeHolder;
import java.util.ArrayList;

/* loaded from: DataChannelMessageParams.class */
public class DataChannelMessageParams {
    public static 2JQ CONVERTER = IR0.A00(100);
    public static long sMcfTypeId;
    public final NativeHolder mNativeHolder;

    static {
        HMw.A00();
    }

    public DataChannelMessageParams(NativeHolder nativeHolder) {
        this.mNativeHolder = nativeHolder;
    }

    public DataChannelMessageParams(ArrayList arrayList, int i, ArrayList arrayList2) {
        this.mNativeHolder = initNativeHolder(arrayList, i, arrayList2);
    }

    public static native DataChannelMessageParams createFromMcfType(McfReference mcfReference);

    public static native NativeHolder initNativeHolder(ArrayList arrayList, int i, ArrayList arrayList2);

    private native boolean nativeEquals(Object obj);

    public static native long nativeGetMcfTypeId();

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof DataChannelMessageParams)) {
            return false;
        }
        return nativeEquals(obj);
    }

    public native ArrayList getRecipientNodeIds();

    public native ArrayList getRecipients();

    public native int getServiceRecipients();

    public native int hashCode();

    public native String toString();
}
