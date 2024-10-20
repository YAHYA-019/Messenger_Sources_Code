package X;

import android.app.PendingIntent;
import com.facebook.common.keyguard.KeyguardPendingIntentActivity;

/* loaded from: Ip2.class */
public final class Ip2 implements Runnable {
    public static final String __redex_internal_original_name = "KeyguardPendingIntentActivity$3";
    public final /* synthetic */ KeyguardPendingIntentActivity A00;

    public Ip2(KeyguardPendingIntentActivity keyguardPendingIntentActivity) {
        this.A00 = keyguardPendingIntentActivity;
    }

    /* JADX WARN: Type inference failed for: r0v34, types: [X.GYe, X.2J3] */
    @Override // java.lang.Runnable
    public void run() {
        KeyguardPendingIntentActivity keyguardPendingIntentActivity = this.A00;
        PendingIntent pendingIntent = keyguardPendingIntentActivity.A00;
        if (pendingIntent != null) {
            try {
                0fH.A07(KeyguardPendingIntentActivity.class, pendingIntent, "Launching intent: %s");
                PendingIntent pendingIntent2 = keyguardPendingIntentActivity.A00;
                keyguardPendingIntentActivity.A00 = null;
                pendingIntent2.send();
            } catch (PendingIntent.CanceledException unused) {
                C1kw A06 = 1BK.A06(keyguardPendingIntentActivity.A04);
                if (GYe.A00 == null) {
                    synchronized (GYe.class) {
                        if (GYe.A00 == null) {
                            GYe.A00 = new C2J3(A06);
                        }
                    }
                }
                AbstractC01593ro A0A = AbJ.A0A(GYe.A00, "keyguard_pi_cancelled");
                if (A0A.A0B()) {
                    A0A.A0A();
                }
            }
        }
        keyguardPendingIntentActivity.A01.postDelayed(new Ip1(this), 700L);
    }
}
