package X;

import android.content.BroadcastReceiver;
import android.content.IntentFilter;

/* renamed from: X.81a, reason: invalid class name */
/* loaded from: 81a.class */
public final class C81a implements Runnable {
    public static final String __redex_internal_original_name = "HDMIConnectionListener$3";
    public final /* synthetic */ 81Z A00;

    public C81a(81Z r302) {
        this.A00 = r302;
    }

    @Override // java.lang.Runnable
    public void run() {
        81Z r0 = this.A00;
        AnonymousClass023.A00((BroadcastReceiver) r0.A02.get(), r0.A00, new IntentFilter("android.intent.action.HDMI_PLUGGED"));
        0fH.A0j("HDMIConnectionListener", "Registered HDMI listener for DRM playback");
    }
}
