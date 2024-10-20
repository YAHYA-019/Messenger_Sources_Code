package com.facebook.wamsys.wcc;

import X.C0il;
import com.facebook.simplejni.NativeHolder;

/* loaded from: TransferStats.class */
public class TransferStats {
    public final NativeHolder mNativeHolder;

    static {
        C0il.A0B("wamsysjni");
    }

    public TransferStats(NativeHolder nativeHolder) {
        this.mNativeHolder = nativeHolder;
    }

    public static native NativeHolder initNativeHolder(int i, int i2, XMPPStats xMPPStats, double d);

    private native boolean nativeEquals(Object obj);

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof TransferStats)) {
            return false;
        }
        return nativeEquals(obj);
    }

    public native int getConnectionId();

    public native int getNetworkConnectionType();

    public native double getTimestamp();

    public native XMPPStats getXmppStats();

    public native int hashCode();

    public native String toString();
}
