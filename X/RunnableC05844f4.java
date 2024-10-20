package X;

import com.facebook.distribgw.client.di.AppStateSyncerProvider;

/* renamed from: X.4f4, reason: invalid class name and case insensitive filesystem */
/* loaded from: 4f4.class */
public final /* synthetic */ class RunnableC05844f4 implements Runnable {
    public static final String __redex_internal_original_name = "AppStateSyncerProvider$$ExternalSyntheticLambda3";
    public final /* synthetic */ AppStateSyncerProvider A00;

    @Override // java.lang.Runnable
    public final void run() {
        AppStateSyncerProvider appStateSyncerProvider = this.A00;
        try {
            C00j.A05("DGWAppStateSyncerAppForegrounded", 840475751);
            ((1dW) appStateSyncerProvider.A01.get()).A00("onAppForegrounded");
            appStateSyncerProvider.A06.notifyForegroundStateChange(EnumC05854f5.A01);
            C00j.A01(883271094);
        } catch (Throwable th) {
            C00j.A01(897763692);
            throw th;
        }
    }
}
