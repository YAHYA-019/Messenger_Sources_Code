package X;

import com.facebook.messaging.analytics.ttrc.surface.appstart.events.StartupMarkerComplete;
import com.facebook.messenger.platform_logger.MPLTracker;

/* renamed from: X.3vv, reason: invalid class name and case insensitive filesystem */
/* loaded from: 3vv.class */
public final class RunnableC02683vv implements Runnable {
    public static final String __redex_internal_original_name = "AppStartSurfaceTTRCTracker$onStartupMarkerCompletion$1$1";
    public final /* synthetic */ 1Pu A00;
    public final /* synthetic */ 1QI A01;
    public final /* synthetic */ StartupMarkerComplete A02;

    public RunnableC02683vv(1Pu r302, 1QI r303, StartupMarkerComplete startupMarkerComplete) {
        this.A00 = r302;
        this.A01 = r303;
        this.A02 = startupMarkerComplete;
    }

    @Override // java.lang.Runnable
    public final void run() {
        1QI r0 = this.A01;
        StartupMarkerComplete startupMarkerComplete = this.A02;
        MPLTracker.recordPoint(r0.A00, 0, startupMarkerComplete.A01, startupMarkerComplete.A00);
    }
}
