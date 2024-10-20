package X;

import com.facebook.mqtt.service.XplatServiceDelegate;

/* renamed from: X.3fl, reason: invalid class name */
/* loaded from: 3fl.class */
public final class C3fl implements Runnable {
    public static final String __redex_internal_original_name = "XplatServiceDelegate$LocalClient$updateRegionPreference$1";
    public final /* synthetic */ String A00;

    public C3fl(String str) {
        this.A00 = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        1nK r0 = XplatServiceDelegate.A08;
        if (r0 != null) {
            r0.updateRegionPreference(this.A00);
        }
    }
}
