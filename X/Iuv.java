package X;

import java.util.concurrent.TimeUnit;

/* loaded from: Iuv.class */
public final class Iuv implements Runnable {
    public static final String __redex_internal_original_name = "CountdownTimerManager$2";
    public final /* synthetic */ I7X A00;

    public Iuv(I7X i7x) {
        this.A00 = i7x;
    }

    @Override // java.lang.Runnable
    public void run() {
        I7X i7x = this.A00;
        C5fv c5fv = (C5fv) i7x.A03.get();
        if (c5fv == null) {
            i7x.A04.A00(0L);
            I7X.A00(i7x);
            return;
        }
        C70i c70i = i7x.A05;
        i7x.A01.set(i7x.A06.schedule(this, c70i.A01(c5fv) ? 2147483647L : 1000L, TimeUnit.MILLISECONDS));
        long A00 = c70i.A00(c5fv);
        if (A00 <= 0) {
            I7X.A00(i7x);
            1Im r0 = (1Im) i7x.A02.get();
            if (r0 != null) {
                r0.A00(new Object());
            }
        }
        i7x.A04.A00(AnonymousClass002.A0H(A00));
    }
}
