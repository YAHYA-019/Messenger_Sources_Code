package com.facebook.omnistore;

import X.C0il;
import com.facebook.jni.HybridData;

/* loaded from: QueueIdentifier.class */
public class QueueIdentifier {
    public final HybridData mHybridData;

    static {
        C0il.A0B("omnistore");
    }

    public QueueIdentifier(HybridData hybridData) {
        this.mHybridData = hybridData;
    }

    public static native HybridData initHybrid(String str, String str2);

    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof QueueIdentifier)) {
            return false;
        }
        return this == obj || equalsNative((QueueIdentifier) obj);
    }

    public native boolean equalsNative(QueueIdentifier queueIdentifier);

    public native String getDomain();

    public native String getTopic();

    public int hashCode() {
        return toString().hashCode();
    }

    public native String toString();
}
