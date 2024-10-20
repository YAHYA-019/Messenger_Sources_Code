package com.facebook.pando;

import X.C0il;
import X.C3s8;
import com.facebook.jni.HybridClassBase;
import java.util.List;
import java.util.concurrent.Executor;

/* loaded from: PandoConsistencyServiceJNI.class */
public final class PandoConsistencyServiceJNI extends HybridClassBase {
    public static final C3s8 Companion = new Object();

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, X.3s8] */
    static {
        C0il.A0B("pando-jni");
    }

    public static final native PandoConsistencyServiceJNI create(PandoConsistencyStackJNI pandoConsistencyStackJNI, Executor executor, int i, boolean z, int i2, boolean z2, int i3, boolean z3, boolean z4);

    public final native boolean hasSubscribersRacey();

    public final native void publishTreeUpdaters(List list, boolean z);

    public final native void setPublishPostProcessor(PandoPublishPostProcessorProvider pandoPublishPostProcessorProvider);
}
