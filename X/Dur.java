package X;

import com.facebook.common.callercontext.CallerContext;

/* loaded from: Dur.class */
public final class Dur extends 1LH {
    public final String A00;
    public final String A01;

    public Dur(String str, String str2) {
        11T.A0F(str, 1);
        this.A00 = str;
        this.A01 = str2;
    }

    public 1LI A0s(C2k5 c2k5) {
        boolean A1W = 7zL.A1W(c2k5);
        2lO A0g = 7zS.A0g(0S2.A0A, 7zQ.A07());
        C2sn A0L = 7zR.A0L(c2k5);
        1Iw r0 = A0L.A00;
        C2152Dfg A04 = AbstractC2178Dg6.A04(r0, A1W ? 1 : 0);
        String A0W = 0Pz.A0W(this.A00, ": ");
        if (A0W == null) {
            ((ESq) A04).A00 = true;
        }
        A04.A05 = A0W;
        A04.A03 = EP4.A08;
        CallerContext callerContext = CallerContext.A08;
        AbstractC2178Dg6.A08(callerContext, A04, A0L);
        String str = this.A01;
        if (str != null) {
            C2152Dfg A042 = AbstractC2178Dg6.A04(r0, A1W ? 1 : 0);
            A042.A05 = str;
            AbstractC2178Dg6.A0C(2MR.A0M, A042, AbstractC2178Dg6.A05(A042, EP4.A09));
            AbstractC2178Dg6.A08(callerContext, A042, A0L);
        }
        return C2so.A0I(A0L, c2k5, A0g);
    }
}
