package com.facebook.privacy.policyawareencryption;

import X.11T;
import X.C0il;
import X.EXT;
import com.facebook.jni.HybridData;
import java.util.List;

/* loaded from: PAEUtilsJNI.class */
public final class PAEUtilsJNI {
    public static final EXT Companion = new Object();
    public final HybridData mHybridData;

    /* JADX WARN: Type inference failed for: r0v0, types: [X.EXT, java.lang.Object] */
    static {
        C0il.A0B("policyawareencryption");
    }

    public PAEUtilsJNI() {
        this(initHybrid0());
    }

    public PAEUtilsJNI(HybridData hybridData) {
        11T.A0F(hybridData, 1);
        this.mHybridData = hybridData;
    }

    public static final native KeyPair genKeyPair();

    public static final native List genSealToken(List list, List list2);

    public static final native HybridData initHybrid0();

    public static final native List seal(List list, List list2, List list3);

    public static final native void sealFile(String str, String str2, List list, List list2);

    public static final native void sealFileWithToken(String str, String str2, List list);

    public static final native List unseal(List list, List list2, List list3);

    public static final native void unsealFile(String str, String str2, List list, List list2);
}
