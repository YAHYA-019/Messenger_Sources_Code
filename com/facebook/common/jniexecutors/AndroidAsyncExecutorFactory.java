package com.facebook.common.jniexecutors;

import X.C0gh;
import com.facebook.jni.HybridData;
import java.util.concurrent.ScheduledExecutorService;

/* loaded from: AndroidAsyncExecutorFactory.class */
public class AndroidAsyncExecutorFactory {
    public static final AndroidAsyncExecutorFactory $redex_init_class = null;
    public final HybridData mHybridData;

    static {
        C0gh.A02("jniexecutors");
    }

    public AndroidAsyncExecutorFactory(ScheduledExecutorService scheduledExecutorService) {
        this.mHybridData = initHybrid(scheduledExecutorService);
    }

    public static native HybridData initHybrid(ScheduledExecutorService scheduledExecutorService);
}
