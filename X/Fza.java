package X;

import android.os.SystemClock;

/* loaded from: Fza.class */
public final class Fza implements Runnable {
    public static final String __redex_internal_original_name = "BrowserLiteIntentServiceHelperSelector$2";
    public final /* synthetic */ F6F A00;

    public Fza(F6F f6f) {
        this.A00 = f6f;
    }

    @Override // java.lang.Runnable
    public void run() {
        long uptimeMillis = SystemClock.uptimeMillis();
        F6F f6f = this.A00;
        if (uptimeMillis - f6f.A00 > 3000) {
            f6f.A00 = uptimeMillis;
            F6F.A00(f6f);
        }
    }
}
