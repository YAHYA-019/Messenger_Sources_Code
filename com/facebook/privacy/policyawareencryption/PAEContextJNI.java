package com.facebook.privacy.policyawareencryption;

import X.11T;
import X.C0il;
import X.EXS;
import com.facebook.jni.HybridData;
import java.util.List;

/* loaded from: PAEContextJNI.class */
public final class PAEContextJNI {
    public static final EXS Companion = new Object();
    public final HybridData mHybridData;

    /* JADX WARN: Type inference failed for: r0v0, types: [X.EXS, java.lang.Object] */
    static {
        C0il.A0B("policyawareencryption");
    }

    public PAEContextJNI() {
        this(initHybrid0());
    }

    public PAEContextJNI(HybridData hybridData) {
        11T.A0F(hybridData, 1);
        this.mHybridData = hybridData;
    }

    public static final native List getPLEMetadata();

    public static final native HybridData initHybrid0();

    public static final native List initReceiverContext(PAEContextJNI pAEContextJNI, List list, List list2, List list3);

    public static final native void initSenderContext(PAEContextJNI pAEContextJNI, List list, List list2);

    public final native List seal(List list);

    public final native List unseal(List list);
}
