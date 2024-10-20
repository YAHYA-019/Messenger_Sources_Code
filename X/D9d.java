package X;

import android.content.Context;
import com.facebook.interstitial.triggers.InterstitialTrigger;
import java.lang.ref.WeakReference;

/* loaded from: D9d.class */
public final class D9d implements Runnable {
    public static final String __redex_internal_original_name = "InterstitialStartHelper$maybeStartInterstitialAsync$1";
    public final /* synthetic */ InterfaceC04564bc A00;
    public final /* synthetic */ C05324dh A01;
    public final /* synthetic */ InterstitialTrigger A02;
    public final /* synthetic */ WeakReference A03;

    public D9d(InterfaceC04564bc interfaceC04564bc, C05324dh c05324dh, InterstitialTrigger interstitialTrigger, WeakReference weakReference) {
        this.A03 = weakReference;
        this.A00 = interfaceC04564bc;
        this.A01 = c05324dh;
        this.A02 = interstitialTrigger;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Context context = (Context) this.A03.get();
        if (context == null || !this.A00.Cyc()) {
            return;
        }
        C05324dh.A01(context, this.A01, this.A02, 2tJ.class, null, false);
    }
}
