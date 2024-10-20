package com.facebook.pando;

import X.C0il;
import X.C3ru;
import java.util.concurrent.Executor;

/* loaded from: PandoFlipperUtil.class */
public final class PandoFlipperUtil {
    public static final C3ru Companion = new Object();

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, X.3ru] */
    static {
        C0il.A0B("pando-flipper-jni");
    }

    public static final native PandoConsistencyStackJNI createConsistencyStack(PandoConsistencyStackJNI pandoConsistencyStackJNI, Executor executor);
}
