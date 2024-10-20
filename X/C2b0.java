package X;

import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: X.2b0, reason: invalid class name */
/* loaded from: 2b0.class */
public final class C2b0 implements C2b1 {
    public final C2b2 A00 = new C2b2();

    public final void A00() {
        this.A00.A00.getAndSet(0);
    }

    @Override // X.C2b1
    public Object ABs(C2b6 c2b6) {
        11T.A0F(c2b6, 1);
        if (c2b6 instanceof C2b5) {
            Cal(((C2b5) c2b6).A00);
            throw 0Q8.createAndThrow();
        }
        if (c2b6 instanceof JjV) {
            return ((JjV) c2b6).A00;
        }
        throw 1BK.A1F();
    }

    @Override // X.C2b1
    public Void Cal(Object obj) {
        AtomicInteger atomicInteger = this.A00.A00;
        11T.A0F(atomicInteger, 0);
        if (atomicInteger.get() != 0) {
            throw new C2az(this, obj);
        }
        throw new 3FA();
    }
}
