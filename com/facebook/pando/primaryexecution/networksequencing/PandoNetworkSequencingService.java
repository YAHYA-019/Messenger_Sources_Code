package com.facebook.pando.primaryexecution.networksequencing;

import X.C0il;
import X.HJm;
import com.facebook.jni.HybridData;
import com.facebook.pando.PandoPrimaryExecution;

/* loaded from: PandoNetworkSequencingService.class */
public final class PandoNetworkSequencingService extends PandoPrimaryExecution {
    public static final HJm Companion = new Object();

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, X.HJm] */
    static {
        C0il.A0B("pando-client-networksequencing-jni");
    }

    public static final native HybridData initHybridData(PandoPrimaryExecution pandoPrimaryExecution);
}
