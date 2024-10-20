package X;

import com.facebook.distribgw.client.di.AppStateSyncerProvider;
import com.facebook.realtime.common.appstate.AppStateGetter;

/* renamed from: X.3eq, reason: invalid class name */
/* loaded from: 3eq.class */
public final /* synthetic */ class C3eq implements Runnable {
    public static final String __redex_internal_original_name = "AppStateSyncerProvider$DozeActionReceiver$$ExternalSyntheticLambda0";
    public final /* synthetic */ 3cO A00;

    @Override // java.lang.Runnable
    public final void run() {
        3cO r0 = this.A00;
        try {
            C00j.A05("DGWAppStateSyncerDozeActionReceiverOnReceive", -1322407520);
            AppStateSyncerProvider appStateSyncerProvider = r0.A00;
            AppStateGetter appStateGetter = appStateSyncerProvider.A05;
            if (appStateGetter.mAppForegroundStateGetter.isAppForegrounded()) {
                appStateSyncerProvider.A06.notifyForegroundStateChange(EnumC05854f5.A01);
            } else if (appStateGetter.mAppForegroundStateGetter.isAppSuspended()) {
                appStateSyncerProvider.A06.notifyForegroundStateChange(EnumC05854f5.A02);
            } else {
                appStateSyncerProvider.A06.notifyForegroundStateChange(EnumC05854f5.A00);
            }
            C00j.A01(1692413582);
        } catch (Throwable th) {
            C00j.A01(-339096910);
            throw th;
        }
    }
}
