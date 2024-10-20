package X;

import java.util.concurrent.Executor;

/* loaded from: Hyp.class */
public final class Hyp {
    public 1ED A00;
    public Executor A01;
    public Executor A02;
    public final 1Br A03 = 7zM.A0O();

    public static final void A00(Hyp hyp) {
        if (hyp.A00 == null || hyp.A02 == null || hyp.A01 == null) {
            synchronized (hyp) {
                if (hyp.A00 == null || hyp.A02 == null || hyp.A01 == null) {
                    1ED r0 = (1ED) 1Bi.A03(16441);
                    hyp.A00 = r0;
                    hyp.A02 = r0;
                    hyp.A01 = 4YV.A11(hyp.A03);
                }
            }
        }
    }
}
