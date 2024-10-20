package X;

import com.google.android.gms.internal.gtm.zzce;

/* loaded from: Lob.class */
public final class Lob implements Runnable {
    public static final String __redex_internal_original_name = "zzaw";
    public final /* synthetic */ LFj A00;
    public final /* synthetic */ zzce A01;

    public Lob(LFj lFj, zzce zzceVar) {
        this.A00 = lFj;
        this.A01 = zzceVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        K6i k6i = this.A00.A02;
        L0g.A00();
        k6i.A0I();
        if (k6i.A00 == null) {
            LCw.A0A(k6i, "Connected to service after a timeout", 3);
            zzce zzceVar = this.A01;
            L0g.A00();
            k6i.A00 = zzceVar;
            K6i.A00(k6i);
            K6c k6c = ((LCw) k6i).A00.A06;
            L9t.A02(k6c);
            L0g.A00();
            k6c.A00.A0J();
        }
    }
}
