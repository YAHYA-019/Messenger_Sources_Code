package X;

import android.graphics.Typeface;

/* renamed from: X.8ft, reason: invalid class name */
/* loaded from: 8ft.class */
public final class C8ft extends 1LH {
    public static final long A03 = 7zQ.A08();
    public final long A00;
    public final 7yP A01;
    public final 6yJ A02;

    public C8ft(7yP r302, 6yJ r303, long j) {
        this.A00 = j;
        this.A01 = r302;
        this.A02 = r303;
    }

    public 1LI A0s(C2k5 c2k5) {
        int i;
        11T.A0F(c2k5, 0);
        C2lh A00 = C2lc.A00(c2k5, APg.A00);
        4FL.A00(c2k5, new AQf(A00, this, 30), new Object[]{Long.valueOf(this.A00)});
        1Iw r0 = c2k5.A05;
        int ordinal = ((AnonymousClass968) A00.A02).ordinal();
        if (ordinal == 1) {
            i = 2131960092;
        } else if (ordinal == 2) {
            i = 2131960091;
        } else {
            if (ordinal != 3) {
                return 7zL.A0Y();
            }
            i = 2131960090;
        }
        String A09 = 3yH.A09(c2k5, i);
        int BDv = ordinal != 1 ? ordinal != 3 ? this.A02.BDv(7zL.A0A(r0)) : c2k5.B7k().A04(2132214414) : this.A02.BDs(7zL.A0A(r0));
        long j = A03;
        Typeface typeface = Typeface.DEFAULT;
        long A08 = 7zP.A08();
        3yF A0v = 7zM.A0v(r0, A09, 0);
        7zS.A1N(c2k5, A0v, BDv, j);
        A0v.A33(0);
        7zU.A0y(typeface, c2k5, A0v, A08);
        A0v.A2Z();
        7zS.A1W(A0v, false);
        A0v.A2u(1);
        A0v.A2b();
        A0v.A3E(false);
        A0v.A3B(false);
        A0v.A3C(true);
        A0v.A2a();
        A0v.A1w(null);
        A0v.A37((2K8) null);
        return A0v.A2W();
    }
}
