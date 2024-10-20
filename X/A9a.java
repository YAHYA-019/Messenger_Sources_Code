package X;

import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: A9a.class */
public final class A9a implements C6v6 {
    public final InterfaceC07544k6 A00;
    public final AtomicBoolean A01;

    public A9a(InterfaceC07544k6 interfaceC07544k6) {
        11T.A0F(interfaceC07544k6, 1);
        this.A00 = interfaceC07544k6;
        this.A01 = 7zO.A15();
    }

    @Override // X.C6v7
    public boolean Ch1(5nV r302) {
        this.A00.Cgt(0);
        return true;
    }

    @Override // X.C6v7
    public boolean Ch3(5nV r302) {
        if (this.A01.getAndSet(true)) {
            return false;
        }
        this.A00.Cgt(1);
        return true;
    }

    @Override // X.C6v6
    public void Chc() {
        this.A01.set(false);
    }
}
