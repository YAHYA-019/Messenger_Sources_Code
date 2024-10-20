package X;

import android.os.SystemClock;

/* loaded from: Lmc.class */
public final class Lmc implements Runnable {
    public static final String __redex_internal_original_name = "ModernAsyncTask$3";
    public final /* synthetic */ Lrb A00;
    public final /* synthetic */ Object A01;

    public Lmc(Lrb lrb, Object obj) {
        this.A00 = lrb;
        this.A01 = obj;
    }

    @Override // java.lang.Runnable
    public void run() {
        Lrb lrb = this.A00;
        Object obj = this.A01;
        boolean z = lrb.A01.get();
        AbstractC3042Jh7 abstractC3042Jh7 = lrb.A04;
        if (z || abstractC3042Jh7.A02 != lrb) {
            if (abstractC3042Jh7.A01 == lrb) {
                SystemClock.uptimeMillis();
                abstractC3042Jh7.A01 = null;
                abstractC3042Jh7.A07();
            }
        } else if (!((0Uf) abstractC3042Jh7).A02) {
            SystemClock.uptimeMillis();
            abstractC3042Jh7.A02 = null;
            abstractC3042Jh7.A05(obj);
        }
        lrb.A03 = 0S2.A0C;
    }
}
