package X;

import java.util.concurrent.TimeUnit;

/* renamed from: X.3f1, reason: invalid class name */
/* loaded from: 3f1.class */
public final class C3f1 implements Runnable {
    public static final String __redex_internal_original_name = "AccountLoginSplashFragment$14";
    public final /* synthetic */ B2c A00;

    public C3f1(B2c b2c) {
        this.A00 = b2c;
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            C10214sr A00 = C10214sr.A00();
            A00.A00.await(3000L, TimeUnit.MILLISECONDS);
        } catch (InterruptedException unused) {
        }
        B2c.A0A(this.A00);
    }
}
