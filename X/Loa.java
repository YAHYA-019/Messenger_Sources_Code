package X;

import com.google.android.gms.internal.gtm.zzcj;

/* loaded from: Loa.class */
public final class Loa implements Runnable {
    public static final String __redex_internal_original_name = "zzak";
    public final /* synthetic */ K6c A00;
    public final /* synthetic */ MD1 A01;

    public Loa(K6c k6c, MD1 md1) {
        this.A00 = k6c;
        this.A01 = md1;
    }

    @Override // java.lang.Runnable
    public final void run() {
        K6k k6k = this.A00.A00;
        LdM ldM = this.A01;
        long j = k6k.A00;
        L0g.A00();
        k6k.A0I();
        K6h k6h = ((LCw) k6k).A00.A0D;
        L9t.A02(k6h);
        long A0K = k6h.A0K();
        k6k.A0E("Dispatching local hits. Elapsed time since last dispatch (ms)", Long.valueOf(A0K != 0 ? Math.abs(System.currentTimeMillis() - A0K) : -1));
        K6k.A03(k6k);
        try {
            K6k.A04(k6k);
            L9t.A02(k6h);
            k6h.A0L();
            k6k.A0K();
            if (ldM != null) {
                LdM ldM2 = ldM;
                ldM2.A00.A01.post(ldM2.A01);
            }
            if (k6k.A00 != j) {
                zzcj.A00(k6k);
            }
        } catch (Exception e) {
            k6k.A0G("Local dispatch failed", e);
            L9t.A02(k6h);
            k6h.A0L();
            k6k.A0K();
            if (ldM != null) {
                LdM ldM3 = ldM;
                ldM3.A00.A01.post(ldM3.A01);
            }
        }
    }
}
