package com.facebook.rp.platform.metaai.rsys.pregeneratesdp.gen;

import X.11T;
import X.C0il;
import X.HK0;
import com.facebook.jni.HybridData;

/* loaded from: PregenerateSdp.class */
public final class PregenerateSdp {
    public static final HK0 Companion = new Object();
    public final HybridData mHybridData;

    /* JADX WARN: Type inference failed for: r0v0, types: [X.HK0, java.lang.Object] */
    static {
        C0il.A0B("pregensdp");
    }

    public PregenerateSdp(HybridData hybridData) {
        11T.A0F(hybridData, 1);
        this.mHybridData = hybridData;
    }

    public static final native HybridData initHybrid0(int i, long j);

    public final native boolean equals(PregenerateSdp pregenerateSdp);

    public final native PregenerateSdpData getData();
}
