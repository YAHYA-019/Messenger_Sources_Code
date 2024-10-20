package X;

import java.util.concurrent.atomic.AtomicReference;

/* loaded from: Hyq.class */
public final class Hyq {
    public final 1Br A00;
    public final 1K9 A01;
    public final AtomicReference A02 = new AtomicReference();
    public final 1De A03;

    public Hyq(1De r302, 1K9 r303) {
        this.A03 = r302;
        this.A01 = r303;
        this.A00 = 7zM.A0h(r302, 68126);
    }

    public static final void A00(Hyq hyq) {
        AtomicReference atomicReference = hyq.A02;
        if (atomicReference.get() != null) {
            ((4fF) 1Br.A0B(hyq.A00)).A0K(GOn.A1C(atomicReference));
        }
        atomicReference.set(null);
    }
}
