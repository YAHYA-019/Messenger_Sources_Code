package X;

import android.app.Activity;

/* loaded from: G3b.class */
public final class G3b implements Runnable {
    public static final String __redex_internal_original_name = "BKBloksActionPrivacyConsentLogoutImpl$evaluate$1";
    public final /* synthetic */ Activity A00;
    public final /* synthetic */ 1Br A01;
    public final /* synthetic */ 1Br A02;

    public G3b(Activity activity, 1Br r303, 1Br r304) {
        this.A00 = activity;
        this.A01 = r303;
        this.A02 = r304;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ((Fck) 1Br.A0B(this.A01)).A1y(null, true);
        20O r0 = (20O) 1Br.A0B(this.A02);
        Activity activity = this.A00;
        r0.A00(activity);
        if (activity != null) {
            activity.finishAffinity();
        }
    }
}
