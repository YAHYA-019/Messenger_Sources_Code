package X;

import android.os.Handler;
import java.util.Random;
import java.util.concurrent.TimeUnit;

/* renamed from: X.52Y, reason: invalid class name */
/* loaded from: 52Y.class */
public final class C52Y implements 52Z {
    public 5Qr A00;
    public volatile boolean A07;
    public final 1Br A02 = 1Bq.A00(16634);
    public final 1Br A03 = 1Bq.A00(17093);
    public final 1Br A05 = 1Bu.A00(16430);
    public final 1Br A06 = 1Bu.A00(99898);
    public final 1Br A01 = 1Bu.A00(131168);
    public final 1Br A04 = 1Bu.A00(116395);

    public void BjB() {
        this.A07 = false;
        Runnable runnable = this.A00;
        if (runnable != null) {
            ((Handler) 1Br.A0B(((5Qr) runnable).A01.A05)).removeCallbacks(runnable);
        }
        this.A00 = null;
    }

    public void BjD() {
        this.A07 = true;
        C00i c00i = this.A01.A00;
        if (((2yD) ((52X) c00i.get()).A01.A00.get()).AZk(36324209164570115L)) {
            long A00 = ((52X) c00i.get()).A00();
            if (A00 <= 0 || A00 > 2147483647L || ((Random) this.A04.A00.get()).nextInt((int) A00) != 0) {
                return;
            }
            Runnable runnable = null;
            if (1Br.A07(((52X) c00i.get()).A01).Auy(36605684141333744L) > 0 && 1Br.A07(((52X) c00i.get()).A01).Auy(36605684141399281L) > 0) {
                2R2 r0 = new 2R2(1BK.A08(1Br.A02(this.A02), "mobile_uitracker_events"), 234);
                if (4YU.A1X(r0)) {
                    C29b.A00 = true;
                    runnable = new 5Qr(r0, this);
                    ((Handler) 1Br.A0B(((5Qr) runnable).A01.A05)).postDelayed(runnable, TimeUnit.SECONDS.toMillis(1Br.A07(((52X) c00i.get()).A01).Auy(36605684141333744L)));
                }
            }
            this.A00 = runnable;
        }
    }
}
