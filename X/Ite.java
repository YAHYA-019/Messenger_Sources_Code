package X;

import android.content.BroadcastReceiver;

/* loaded from: Ite.class */
public final class Ite implements Runnable {
    public static final String __redex_internal_original_name = "HDMIConnectionListenerGroot$registerHDMIPlugReceiver$1";
    public final /* synthetic */ Hgj A00;

    public Ite(Hgj hgj) {
        this.A00 = hgj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Hgj hgj = this.A00;
        GOo.A15((BroadcastReceiver) hgj.A03.get(), hgj.A00, "android.intent.action.HDMI_PLUGGED");
        0fH.A0j("HDMIConnectionListenerGroot", "Registered HDMI listener for DRM playback");
    }
}
