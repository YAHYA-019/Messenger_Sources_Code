package X;

import java.util.concurrent.Executor;

/* loaded from: AE0.class */
public final class AE0 implements Runnable {
    public static final String __redex_internal_original_name = "RpStores$finalizeStore$1";
    public final /* synthetic */ String A00;

    public AE0(String str) {
        this.A00 = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Executor A11 = 4YV.A11(((9T2) 1Br.A0B(9FS.A00)).A01);
        11T.A0D(A11);
        A11.execute(new ADz(this.A00));
    }
}
