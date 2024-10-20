package X;

import java.util.concurrent.Executor;

/* renamed from: X.5q5, reason: invalid class name */
/* loaded from: 5q5.class */
public final class C5q5 implements 4aT {
    public final 2DX A00;
    public final Executor A01;
    public final 4aT A02;

    public C5q5(2DX r302, 4aT r303, Executor executor) {
        r303.getClass();
        this.A02 = r303;
        this.A00 = r302;
        executor.getClass();
        this.A01 = executor;
    }

    public void CZW(InterfaceC04444az interfaceC04444az, InterfaceC04374as interfaceC04374as) {
        C04364ar c04364ar = (C04364ar) interfaceC04374as;
        2IU r0 = c04364ar.A05;
        3xX r02 = c04364ar.A07.A0F;
        r02.getClass();
        5qA r03 = new 5qA(interfaceC04444az, this, interfaceC04374as, r0, r02);
        this.A02.CZW(r02 instanceof C5q8 ? new C2587GiP(r03, this, interfaceC04374as, (C5q8) r02) : new 5qB(r03, this), interfaceC04374as);
    }
}
