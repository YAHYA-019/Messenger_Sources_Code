package X;

import com.facebook.distribgw.client.DGWClient;
import com.facebook.distribgw.client.msys.DgwNetworkSessionPluginImpl;
import com.facebook.jni.HybridData;
import java.util.concurrent.ScheduledExecutorService;

/* renamed from: X.1eS, reason: invalid class name */
/* loaded from: 1eS.class */
public final class C1eS {
    private final HybridData initHybrid(DGWClient dGWClient, ScheduledExecutorService scheduledExecutorService) {
        return DgwNetworkSessionPluginImpl.initHybrid(dGWClient, scheduledExecutorService);
    }
}
