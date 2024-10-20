package X;

import com.facebook.common.callercontext.CallerContext;
import kotlin.jvm.functions.Function1;

/* loaded from: Dus.class */
public final class Dus extends 1LH {
    public final String A00;
    public final Function1 A01;

    public Dus(String str, Function1 function1) {
        this.A00 = str;
        this.A01 = function1;
    }

    public 1LI A0s(C2k5 c2k5) {
        11T.A0F(c2k5, 0);
        C2lh A00 = C2lc.A00(c2k5, G9Y.A00);
        C2sn A0L = 7zR.A0L(c2k5);
        1Iw r0 = A0L.A00;
        DfW A002 = EVZ.A00(r0);
        A002.A0g(this.A00);
        A002.A07 = true;
        A002.A05 = false;
        AbstractC2159Dfn abstractC2159Dfn = new AbstractC2159Dfn(r0);
        boolean A1V = 7zP.A1V(A00);
        abstractC2159Dfn.A0f(A1V ? 3Eh.A4x : 3Eh.A53);
        abstractC2159Dfn.A06 = A1V ? "Open" : "Close";
        abstractC2159Dfn.A05 = 7zO.A0U(new GAa(A00, 20));
        abstractC2159Dfn.A0g(EN9.A03);
        abstractC2159Dfn.A02 = ENa.A02;
        abstractC2159Dfn.A0X(C26z.VERTICAL, (-ENa.A08.iconSize.mSizeDp) / 2);
        A002.A00 = new RXu(abstractC2159Dfn);
        A002.A0X(C26z.BOTTOM, 8.0f);
        AbstractC2178Dg6.A08(CallerContext.A0B("CollapsableColumn"), A002, A0L);
        if (!A1V) {
            this.A01.invoke(A0L);
        }
        return new 2cL((C1ro) null, (C1ro) null, (C1rp) null, (EnumC00743oh) null, A0L.A01, false);
    }
}
