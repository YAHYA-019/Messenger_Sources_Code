package X;

import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: X.GiM, reason: case insensitive filesystem */
/* loaded from: GiM.class */
public final class C2585GiM extends 4bA {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public C2585GiM(Object obj, Object obj2, int i) {
        this.A00 = i;
        this.A01 = obj;
        this.A02 = obj2;
    }

    public void A00() {
        switch (this.A00) {
            case 2:
                ((AtomicBoolean) this.A02).set(true);
                return;
            case 3:
                C2587GiP c2587GiP = (C2587GiP) this.A01;
                if (C2587GiP.A01(c2587GiP)) {
                    ((AbstractC04664bm) c2587GiP).A00.Bn2();
                    return;
                }
                return;
            default:
                ((AbstractRunnableC04534b9) this.A02).A02();
                return;
        }
    }
}
