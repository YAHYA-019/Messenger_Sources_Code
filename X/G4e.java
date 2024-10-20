package X;

import android.app.Activity;

/* loaded from: G4e.class */
public final class G4e implements Runnable {
    public static final String __redex_internal_original_name = "PeriodicZeroBalanceUpsellController$2";
    public final /* synthetic */ Activity A00;
    public final /* synthetic */ 67O A01;
    public final /* synthetic */ C07364jo A02;

    public G4e(Activity activity, 67O r303, C07364jo c07364jo) {
        this.A02 = c07364jo;
        this.A00 = activity;
        this.A01 = r303;
    }

    @Override // java.lang.Runnable
    public void run() {
        C07364jo c07364jo = this.A02;
        ((FIP) c07364jo.A05.get()).A06(this.A00, this.A01, (Object) null, "zero_balance_detection_reminder");
        C07364jo.A00(c07364jo, Long.MAX_VALUE);
    }
}
