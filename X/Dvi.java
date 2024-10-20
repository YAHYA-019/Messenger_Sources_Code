package X;

import com.facebook.common.callercontext.CallerContext;

/* loaded from: Dvi.class */
public final class Dvi extends 1LH {
    public final 3Eh A00;
    public final 8Hm A01;
    public final Ehq A02;
    public final Integer A03;
    public final Integer A04;
    public final Integer A05;
    public final boolean A06;

    public Dvi(3Eh r302, 8Hm r303, Ehq ehq, Integer num, Integer num2, Integer num3, boolean z) {
        11T.A0F(r302, 1);
        this.A00 = r302;
        this.A03 = num;
        this.A05 = num2;
        this.A06 = z;
        this.A04 = num3;
        this.A02 = ehq;
        this.A01 = r303;
    }

    public 1LI A0s(C2k5 c2k5) {
        Integer num;
        ENa eNa;
        EN9 en9;
        11T.A0F(c2k5, 0);
        AbstractC2159Dfn abstractC2159Dfn = new AbstractC2159Dfn(c2k5.A05);
        abstractC2159Dfn.A0f(this.A00);
        Ehq ehq = this.A02;
        abstractC2159Dfn.A06 = ehq.A00;
        abstractC2159Dfn.A05 = 7zO.A0U(ehq.A01);
        Integer num2 = this.A04;
        11T.A0F(num2, 0);
        switch (num2.intValue()) {
            case 0:
                num = 0S2.A00;
                break;
            case 1:
                num = 0S2.A01;
                break;
            case 2:
                num = 0S2.A0C;
                break;
            case 3:
                num = 0S2.A0N;
                break;
            case 4:
                num = 0S2.A0Y;
                break;
            case 5:
                num = 0S2.A0j;
                break;
            default:
                throw 1BK.A1F();
        }
        11T.A0F(num, 0);
        abstractC2159Dfn.A07 = num;
        abstractC2159Dfn.A08 = this.A06;
        Integer num3 = this.A03;
        11T.A0F(num3, 0);
        switch (num3.intValue()) {
            case 0:
                eNa = ENa.A04;
                break;
            case 1:
                eNa = ENa.A02;
                break;
            case 2:
                eNa = ENa.A08;
                break;
            case 3:
                eNa = ENa.A03;
                break;
            case 4:
                eNa = ENa.A07;
                break;
            case 5:
                eNa = ENa.A06;
                break;
            default:
                throw 1BK.A1F();
        }
        abstractC2159Dfn.A02 = eNa;
        Integer num4 = this.A05;
        11T.A0F(num4, 0);
        switch (num4.intValue()) {
            case 0:
                en9 = EN9.A03;
                break;
            case 1:
                en9 = EN9.A06;
                break;
            case 2:
                en9 = EN9.A05;
                break;
            case 3:
                en9 = EN9.A08;
                break;
            case 4:
                en9 = EN9.A04;
                break;
            case 5:
                en9 = EN9.A07;
                break;
            case 6:
                en9 = EN9.A02;
                break;
            default:
                throw 1BK.A1F();
        }
        abstractC2159Dfn.A0g(en9);
        8Hm r0 = this.A01;
        abstractC2159Dfn.A0V(r0 != null ? r0.A01 : null);
        return abstractC2159Dfn.A0O(CallerContext.A08);
    }
}
