package com.facebook.omnistore;

import X.C0il;
import com.facebook.jni.HybridData;

/* loaded from: StoredProcedureMetadata.class */
public class StoredProcedureMetadata {
    public final HybridData mHybridData;

    static {
        C0il.A0B("omnistore");
    }

    public StoredProcedureMetadata(HybridData hybridData) {
        this.mHybridData = hybridData;
    }

    public static native StoredProcedureMetadata makeStoredProcedureMetadata(int i);

    public native int getSendAttempts();
}
