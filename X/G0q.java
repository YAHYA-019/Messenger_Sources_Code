package X;

import java.util.Timer;

/* loaded from: G0q.class */
public final class G0q implements Runnable {
    public static final String __redex_internal_original_name = "QuicksilverMatchPlayerController$initializeRetryViewV2$1$run$1";
    public final /* synthetic */ FJ0 A00;

    public G0q(FJ0 fj0) {
        this.A00 = fj0;
    }

    @Override // java.lang.Runnable
    public final void run() {
        FJ0 fj0 = this.A00;
        Timer timer = fj0.A0F;
        if (timer != null) {
            timer.cancel();
        }
        FJ0.A06(fj0);
        F5C.A00(fj0);
        FJ0.A07(fj0);
        GIa gIa = fj0.A05;
        if (gIa != null) {
            gIa.BxV();
        }
    }
}
