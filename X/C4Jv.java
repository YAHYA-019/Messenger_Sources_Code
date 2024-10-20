package X;

import java.util.LinkedHashMap;
import java.util.concurrent.TimeUnit;

/* renamed from: X.4Jv, reason: invalid class name */
/* loaded from: 4Jv.class */
public final class C4Jv {
    public final long A00;
    public final C4Ig A01;
    public final C4Jr A02;
    public final Object A03;
    public final java.util.Map A04;

    public C4Jv(C4Ig c4Ig, C4Jr c4Jr) {
        11T.A0F(c4Ig, 1);
        long millis = TimeUnit.MINUTES.toMillis(90);
        this.A01 = c4Ig;
        this.A02 = c4Jr;
        this.A00 = millis;
        this.A03 = new Object();
        this.A04 = new LinkedHashMap();
    }

    public final void A00(C4Km c4Km) {
        Runnable runnable;
        11T.A0F(c4Km, 0);
        synchronized (this.A03) {
            runnable = (Runnable) this.A04.remove(c4Km);
        }
        if (runnable != null) {
            this.A01.ADy(runnable);
        }
    }

    public final void A01(final C4Km c4Km) {
        11T.A0F(c4Km, 0);
        Runnable runnable = new Runnable() { // from class: X.4Ob
            public static final String __redex_internal_original_name = "TimeLimiter$$ExternalSyntheticLambda0";

            @Override // java.lang.Runnable
            public final void run() {
                C4Jv c4Jv = this;
                c4Jv.A02.D31(c4Km, 3);
            }
        };
        synchronized (this.A03) {
            this.A04.put(c4Km, runnable);
        }
        this.A01.Cjo(runnable, this.A00);
    }
}
