package com.facebook.distribgw.client;

import X.C0il;
import com.facebook.jni.HybridData;
import com.facebook.realtime.common.appstate.AppStateSyncer;
import java.util.Collections;
import java.util.Map;
import java.util.concurrent.ScheduledExecutorService;

/* loaded from: DGWClient.class */
public class DGWClient {
    public static final DGWClient $redex_init_class = null;
    public final HybridData mHybridData;

    static {
        C0il.A0B("distribgw-jni");
    }

    public DGWClient(DGWNetworkStackWrapperHolder dGWNetworkStackWrapperHolder, ScheduledExecutorService scheduledExecutorService, AppStateSyncer appStateSyncer, DGWClientConfig dGWClientConfig) {
        this(dGWNetworkStackWrapperHolder, scheduledExecutorService, appStateSyncer, dGWClientConfig, Collections.emptyMap());
    }

    public DGWClient(DGWNetworkStackWrapperHolder dGWNetworkStackWrapperHolder, ScheduledExecutorService scheduledExecutorService, AppStateSyncer appStateSyncer, DGWClientConfig dGWClientConfig, Map map) {
        this.mHybridData = initHybrid(dGWNetworkStackWrapperHolder, scheduledExecutorService, appStateSyncer, dGWClientConfig, map);
    }

    public static native HybridData initHybrid(DGWNetworkStackWrapperHolder dGWNetworkStackWrapperHolder, ScheduledExecutorService scheduledExecutorService, AppStateSyncer appStateSyncer, DGWClientConfig dGWClientConfig, Map map);

    public native void abortAllPendingStreamsOnDomainSwitch(String str);

    public native int getConnectionState();

    public native boolean isConnected();
}
