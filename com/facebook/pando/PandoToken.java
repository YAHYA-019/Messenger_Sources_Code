package com.facebook.pando;

import X.C0il;
import X.R2Z;
import com.facebook.jni.HybridData;
import com.facebook.pando.IPandoGraphQLService;

/* loaded from: PandoToken.class */
public final class PandoToken implements IPandoGraphQLService.Token {
    public static final R2Z Companion = new Object();
    public final HybridData mHybridData;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, X.R2Z] */
    static {
        C0il.A0B("pando-graphql-jni");
    }

    public PandoToken(HybridData hybridData) {
        this.mHybridData = hybridData;
    }

    @Override // X.C3rz
    public native void cancel();
}
