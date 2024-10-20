package X;

import kotlin.jvm.functions.Function1;

/* renamed from: X.2ll, reason: invalid class name */
/* loaded from: 2ll.class */
public final class C2ll {
    public final long A00;
    public final C1rk A01;
    public final C2lm A02;
    public final C00m A03;
    public final Function1 A04;

    public C2ll(C1rk c1rk, C00m c00m, Function1 function1, long j) {
        this.A00 = j;
        this.A03 = c00m;
        this.A01 = c1rk;
        this.A04 = function1;
        C2ln c2ln = new C2ln();
        function1.invoke(c2ln);
        this.A02 = new C2lm(this, c1rk.B6x(), c2ln.A02, c2ln.A01);
    }

    public C2ll(C1rk c1rk, Function1 function1, long j) {
        this(c1rk, null, function1, j);
    }
}
