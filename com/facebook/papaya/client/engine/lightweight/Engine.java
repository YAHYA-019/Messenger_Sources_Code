package com.facebook.papaya.client.engine.lightweight;

import X.11T;
import X.4YV;
import X.7zR;
import X.C0il;
import X.KX2;
import android.content.Context;
import com.facebook.jni.HybridClassBase;
import com.facebook.papaya.client.model_loader.IModelLoader;
import com.facebook.papaya.client.transport.ITransport;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.common.util.concurrent.SettableFuture;
import java.util.Set;
import java.util.concurrent.ScheduledExecutorService;

/* loaded from: Engine.class */
public final class Engine extends HybridClassBase {
    public static final KX2 Companion = new Object();

    /* JADX WARN: Type inference failed for: r0v0, types: [X.KX2, java.lang.Object] */
    static {
        C0il.A0B("papaya-lightweight-engine");
    }

    public Engine(ScheduledExecutorService scheduledExecutorService, String str, ImmutableMap immutableMap, ITransport iTransport, Context context, String str2, String str3, IModelLoader iModelLoader, ImmutableSet immutableSet) {
        7zR.A1N(scheduledExecutorService, immutableMap);
        4YV.A1M(str2, 6, str3);
        11T.A0F(immutableSet, 9);
        initHybrid(scheduledExecutorService, "m4a", immutableMap, iTransport, context, str2, str3, null, immutableSet);
    }

    private final native void initHybrid(ScheduledExecutorService scheduledExecutorService, String str, ImmutableMap immutableMap, ITransport iTransport, Context context, String str2, String str3, IModelLoader iModelLoader, Set set);

    private final native SettableFuture nativeRun();

    private final native void nativeStop();

    public final ListenableFuture run() {
        return nativeRun();
    }
}
