package X;

import com.facebook.common.callercontext.CallerContext;
import java.util.Arrays;

/* loaded from: Dut.class */
public final class Dut extends 1LH {
    public final long A00;
    public final String A01;

    public Dut(long j, String str) {
        this.A00 = j;
        this.A01 = str;
    }

    public 1LI A0s(C2k5 c2k5) {
        boolean A1W = 7zL.A1W(c2k5);
        2lO A0g = 7zS.A0g(0S2.A08, 7zQ.A07());
        C2sn A0L = 7zR.A0L(c2k5);
        1Iw r0 = A0L.A00;
        C2152Dfg A04 = AbstractC2178Dg6.A04(r0, A1W ? 1 : 0);
        String format = String.format("%6s: ", Arrays.copyOf(new Object[]{EVG.A00(this.A00)}, 1));
        11T.A0A(format);
        A04.A05 = format;
        A04.A03 = EP4.A0Q;
        A04.A0R(0.0f);
        FAa A00 = FAa.A00();
        A00.A02();
        AbstractC2178Dg6.A0G(A04, A00);
        CallerContext callerContext = CallerContext.A08;
        AbstractC2178Dg6.A08(callerContext, A04, A0L);
        C2152Dfg A042 = AbstractC2178Dg6.A04(r0, A1W ? 1 : 0);
        String str = this.A01;
        if (str == null) {
            ((ESq) A042).A00 = true;
        }
        A042.A05 = str;
        A042.A03 = EP4.A08;
        AbstractC2178Dg6.A08(callerContext, A042, A0L);
        return C2so.A0I(A0L, c2k5, A0g);
    }
}
