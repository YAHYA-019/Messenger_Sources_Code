package X;

import java.util.Set;

/* renamed from: X.3tN, reason: invalid class name and case insensitive filesystem */
/* loaded from: 3tN.class */
public final class C01943tN {
    public final 1Br A00 = 1Bq.A00(16385);
    public final C01i A03 = C01g.A01(new C4O0(this, 4));
    public final C01i A01 = C01g.A01(new C4O0(this, 2));
    public final C01i A02 = C01g.A01(new C4O0(this, 3));

    public boolean A00(C3s4 c3s4) {
        boolean z = false;
        11T.A0F(c3s4, 0);
        2Jf query = c3s4.getQuery();
        11T.A0A(query);
        if (!((Boolean) this.A02.getValue()).booleanValue()) {
            String str = query.A08;
            11T.A0A(str);
            if (!((Set) this.A03.getValue()).contains(str)) {
                if (!(c3s4 instanceof C3sa) || !((C3sa) c3s4).A04) {
                    z = ((Set) this.A01.getValue()).contains(str);
                }
            }
            return z;
        }
        return true;
    }
}
