package X;

import java.util.Iterator;
import java.util.List;

/* renamed from: X.Awx, reason: case insensitive filesystem */
/* loaded from: Awx.class */
public final class C1932Awx extends 1LH {
    public final float A00;
    public final List A01;

    public C1932Awx(List list, float f) {
        this.A01 = list;
        this.A00 = f;
    }

    public 1LI A0s(C2k5 c2k5) {
        boolean A1W = 7zL.A1W(c2k5);
        Integer num = 0S2.A00;
        2lO A0K = 4YV.A0K(4YV.A0L(7zL.A0g((2lO) null, new C82m(num, 100.0f, A1W ? 1 : 0)), num, C1ro.CENTER, A1W ? 1 : 0), 0S2.A0A, Double.doubleToRawLongBits(this.A00));
        C2sn A0L = 7zR.A0L(c2k5);
        Iterator it = this.A01.iterator();
        while (it.hasNext()) {
            A0L.A00((1LI) it.next());
        }
        return C2so.A0M(A0L, c2k5, A0K);
    }
}
