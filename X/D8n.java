package X;

import com.google.common.util.concurrent.ListenableFuture;

/* loaded from: D8n.class */
public final class D8n implements Runnable {
    public static final String __redex_internal_original_name = "AccountLoginSplashFragment$6";
    public final /* synthetic */ C00i A00;
    public final /* synthetic */ B2c A01;
    public final /* synthetic */ 1K9 A02;

    public D8n(C00i c00i, B2c b2c, 1K9 r304) {
        this.A01 = b2c;
        this.A00 = c00i;
        this.A02 = r304;
    }

    @Override // java.lang.Runnable
    public void run() {
        ListenableFuture A04 = ((FHQ) this.A00.get()).A04();
        1K9 r0 = this.A02;
        B2c b2c = this.A01;
        1G2 r02 = B2c.A0X;
        1Kd.A0D(b2c.A0I, r0, A04);
    }
}
