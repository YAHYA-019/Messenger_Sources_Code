package com.facebook.graphql.rtgql.sdk;

import X.11T;
import X.C0il;
import X.HHV;
import com.facebook.graphql.rtgql.sdk.base.RealtimeGraphQLSDKProviderBase;
import com.facebook.jni.HybridData;
import com.facebook.realtime.common.appstate.AppStateSyncer;
import java.util.concurrent.ScheduledExecutorService;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: RealtimeGraphQLSDKProvider.class */
public final class RealtimeGraphQLSDKProvider extends RealtimeGraphQLSDKProviderBase {
    public static final HHV Companion = new Object();

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, X.HHV] */
    static {
        C0il.A0B("rtgqlsdk");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RealtimeGraphQLSDKProvider(ScheduledExecutorService scheduledExecutorService, AppStateSyncer appStateSyncer) {
        super(initHybrid(scheduledExecutorService, appStateSyncer));
        11T.A0F(scheduledExecutorService, 1);
    }

    public /* synthetic */ RealtimeGraphQLSDKProvider(ScheduledExecutorService scheduledExecutorService, AppStateSyncer appStateSyncer, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(scheduledExecutorService, (i & 2) != 0 ? null : appStateSyncer);
    }

    public static final native HybridData initHybrid(ScheduledExecutorService scheduledExecutorService, AppStateSyncer appStateSyncer);
}
