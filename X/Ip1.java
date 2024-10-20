package X;

import com.facebook.common.keyguard.KeyguardPendingIntentActivity;

/* loaded from: Ip1.class */
public final class Ip1 implements Runnable {
    public static final String __redex_internal_original_name = "KeyguardPendingIntentActivity$3$1";
    public final /* synthetic */ Ip2 A00;

    public Ip1(Ip2 ip2) {
        this.A00 = ip2;
    }

    @Override // java.lang.Runnable
    public void run() {
        KeyguardPendingIntentActivity keyguardPendingIntentActivity = this.A00.A00;
        keyguardPendingIntentActivity.finish();
        keyguardPendingIntentActivity.overridePendingTransition(0, 0);
    }
}
