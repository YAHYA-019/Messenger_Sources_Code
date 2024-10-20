package com.facebook.mantle.messenger;

import X.C0il;
import com.facebook.jni.HybridData;
import com.facebook.models.ModelLoader;
import com.facebook.msys.mca.Mailbox;
import com.google.common.collect.ImmutableMap;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.common.util.concurrent.SettableFuture;
import java.util.concurrent.ScheduledExecutorService;

/* loaded from: MessengerMantle.class */
public class MessengerMantle {
    public static final MessengerMantle $redex_init_class = null;
    public final HybridData mHybridData;

    static {
        C0il.A0B("mantle");
    }

    public MessengerMantle(Mailbox mailbox, ScheduledExecutorService scheduledExecutorService, ScheduledExecutorService scheduledExecutorService2, String str, ModelLoader modelLoader) {
        this.mHybridData = initHybrid(mailbox, scheduledExecutorService, scheduledExecutorService2, str, modelLoader);
    }

    public static native HybridData initHybrid(Object obj, ScheduledExecutorService scheduledExecutorService, ScheduledExecutorService scheduledExecutorService2, String str, ModelLoader modelLoader);

    private native SettableFuture nativeRunMantleWithConfigId(String str, ImmutableMap immutableMap);

    private native SettableFuture nativeRunMantleWithConfigStr(String str, String str2, ImmutableMap immutableMap);

    public ListenableFuture runMantleWithConfigStr(String str, String str2, ImmutableMap immutableMap) {
        return nativeRunMantleWithConfigStr(str, str2, immutableMap);
    }
}
