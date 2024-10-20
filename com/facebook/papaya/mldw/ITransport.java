package com.facebook.papaya.mldw;

import X.C0il;
import com.facebook.jni.HybridData;

/* loaded from: ITransport.class */
public abstract class ITransport {
    public HybridData mHybridData;

    static {
        C0il.A0B("papaya-mldw");
    }

    public ITransport(HybridData hybridData) {
        this.mHybridData = hybridData;
    }
}
