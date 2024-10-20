package X;

import java.util.concurrent.Executor;

/* renamed from: X.4i5, reason: invalid class name and case insensitive filesystem */
/* loaded from: 4i5.class */
public final class C06864i5 {
    public InterfaceC06194g7 A00;
    public 4iD A01 = null;
    public 2Cb A02;
    public final 2Dk A03;
    public final C06734hr A04;
    public final 4iB A05;
    public final 4hO A06;
    public final InterfaceC06154g3 A07;
    public final Executor A08;
    public final Executor A09;

    public C06864i5(2Dk r302, C06734hr c06734hr, 4hO r304, InterfaceC06154g3 interfaceC06154g3, Executor executor, Executor executor2) {
        this.A03 = r302;
        this.A06 = r304;
        this.A09 = executor;
        this.A07 = interfaceC06154g3;
        this.A08 = executor2;
        this.A04 = c06734hr;
        this.A05 = new 4iB(c06734hr);
    }

    public 2Ff A00() {
        2Cb r302 = this.A02;
        if (r302 == null) {
            r302 = 2Cb.A01();
            this.A02 = r302;
        }
        return r302.A0B();
    }
}
