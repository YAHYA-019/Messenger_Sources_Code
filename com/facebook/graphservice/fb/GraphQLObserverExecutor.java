package com.facebook.graphservice.fb;

import X.C00j;
import X.C0gh;
import com.facebook.jni.HybridData;
import java.util.concurrent.ScheduledExecutorService;

/* loaded from: GraphQLObserverExecutor.class */
public class GraphQLObserverExecutor {
    public final HybridData mHybridData;

    static {
        C0gh.A02("graphservice-jni-facebook");
    }

    public GraphQLObserverExecutor(ScheduledExecutorService scheduledExecutorService) {
        C00j.A05("GraphQLObserverExecutor.tracedInitHybridData", -956427266);
        try {
            HybridData initHybridData = initHybridData(scheduledExecutorService);
            C00j.A01(-1434319050);
            this.mHybridData = initHybridData;
        } catch (Throwable th) {
            C00j.A01(-336477475);
            throw th;
        }
    }

    public static native HybridData initHybridData(ScheduledExecutorService scheduledExecutorService);
}
