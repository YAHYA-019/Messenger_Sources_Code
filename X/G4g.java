package X;

import android.app.Activity;

/* loaded from: G4g.class */
public final class G4g implements Runnable {
    public static final String __redex_internal_original_name = "ZeroBalanceResultForFlexController$4";
    public final /* synthetic */ Activity A00;
    public final /* synthetic */ 67O A01;
    public final /* synthetic */ C07304jh A02;

    public G4g(Activity activity, 67O r303, C07304jh c07304jh) {
        this.A02 = c07304jh;
        this.A00 = activity;
        this.A01 = r303;
    }

    @Override // java.lang.Runnable
    public void run() {
        0fH.A0j("ZeroBalanceResultForFlexController.ZeroOptin", "showFlexZbdDialog: show zbd dialog");
        ((FIP) this.A02.A06.get()).A05(this.A00, this.A01, (Long) null);
    }
}
