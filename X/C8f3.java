package X;

import kotlin.jvm.functions.Function1;

/* renamed from: X.8f3, reason: invalid class name */
/* loaded from: 8f3.class */
public final class C8f3 extends 1LH {
    public final Function1 A00;
    public final int A01;

    public C8f3() {
        this(null, 2132279327);
    }

    public C8f3(Function1 function1, int i) {
        this.A01 = i;
        this.A00 = function1;
    }

    public 1LI A0s(C2k5 c2k5) {
        boolean z = false;
        2lO A0L = 4YV.A0L(7zT.A0U((2lO) null, 7zL.A0i(0S2.A00, 3yH.A06(c2k5, this.A01))), 0S2.A0u, Boolean.valueOf(7zL.A1W(c2k5)), 1);
        if (this.A00 != null) {
            z = true;
        }
        AVC A01 = AVC.A01(this, 30);
        Integer num = 0S2.A1G;
        if (!z) {
            A01 = null;
        }
        return C2so.A0E(c2k5, 4YV.A0L(A0L, num, A01, 1));
    }
}
