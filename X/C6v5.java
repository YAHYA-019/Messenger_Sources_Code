package X;

import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: X.6v5, reason: invalid class name */
/* loaded from: 6v5.class */
public final class C6v5 implements C6v6 {
    public final InterfaceC07544k6 A00;
    public final C6v4 A01;
    public final Long A02;
    public final AtomicInteger A03;
    public final AtomicInteger A04;

    public C6v5(InterfaceC07544k6 interfaceC07544k6, C6v4 c6v4, Long l) {
        11T.A0F(interfaceC07544k6, 2);
        this.A01 = c6v4;
        this.A00 = interfaceC07544k6;
        this.A02 = l;
        this.A04 = new AtomicInteger(-1);
        this.A03 = new AtomicInteger(-1);
    }

    @Override // X.C6v7
    public boolean Ch1(5nV r302) {
        5nT r3022 = r302 instanceof 5nT ? (5nT) r302 : null;
        if (r3022 == null) {
            return false;
        }
        AtomicInteger atomicInteger = this.A03;
        int i = r3022.A01;
        if (atomicInteger.getAndSet(i) == i) {
            return false;
        }
        if (i == 0 || i == 1) {
            this.A00.Cgt(0);
            return true;
        }
        if (i != 2) {
            return false;
        }
        this.A01.BYv(r3022.A03);
        return true;
    }

    @Override // X.C6v7
    public boolean Ch3(5nV r302) {
        5nT r304 = r302 instanceof 5nT ? (5nT) r302 : null;
        if (r304 == null) {
            return false;
        }
        Long l = this.A02;
        if (l != null && ((5nT) r302).A04 < l.longValue()) {
            return false;
        }
        AtomicInteger atomicInteger = this.A04;
        int i = r304.A02;
        if (atomicInteger.getAndSet(i) == i) {
            return false;
        }
        if (i == 0 || i == 1) {
            this.A00.Cgt(1);
            return true;
        }
        if (i != 2) {
            return false;
        }
        this.A01.BYw(r304.A04);
        return true;
    }

    @Override // X.C6v6
    public void Chc() {
        this.A04.set(-1);
        this.A03.set(-1);
    }
}
