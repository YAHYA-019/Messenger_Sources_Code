package com.facebook.papaya.client.engine.batch;

import X.1BL;
import X.7zS;
import X.C0il;
import X.KX0;
import android.content.Context;
import com.facebook.jni.HybridClassBase;
import com.facebook.papaya.client.transport.batch.ITransport;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.common.util.concurrent.SettableFuture;
import java.util.Set;
import java.util.concurrent.ScheduledExecutorService;

/* loaded from: Engine.class */
public final class Engine extends HybridClassBase {
    public static final KX0 Companion = new Object();

    /* JADX WARN: Type inference failed for: r0v0, types: [X.KX0, java.lang.Object] */
    static {
        C0il.A0B("papaya-batch-engine");
    }

    public Engine(ScheduledExecutorService scheduledExecutorService, String str, ImmutableSet immutableSet, String str2, ImmutableMap immutableMap, ITransport iTransport, Context context, String str3, String str4) {
        1BL.A11(1, scheduledExecutorService, immutableSet, str2);
        7zS.A18(5, immutableMap, str3, str4);
        initHybrid(scheduledExecutorService, "m4a", immutableSet, str2, immutableMap, iTransport, context, str3, str4);
    }

    private final native void initHybrid(ScheduledExecutorService scheduledExecutorService, String str, Set set, String str2, ImmutableMap immutableMap, ITransport iTransport, Context context, String str3, String str4);

    private final native SettableFuture nativeRun();

    private final native void nativeStop();

    public final ListenableFuture run() {
        return nativeRun();
    }
}
