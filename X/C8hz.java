package X;

import android.graphics.drawable.Drawable;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* renamed from: X.8hz, reason: invalid class name */
/* loaded from: 8hz.class */
public final class C8hz extends 1LH {
    public final FGg A00;
    public final Function1 A01;
    public final boolean A02;
    public final 2lO A03;
    public final ESJ A04;
    public final EMg A05;
    public final boolean A06;
    public final boolean A07;
    public final boolean A08;
    public final boolean A09;

    public C8hz(2lO r302, FGg fGg, ESJ esj, EMg eMg, Function1 function1, boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        1BK.A1K(esj, 1, eMg);
        11T.A0F(fGg, 11);
        this.A04 = esj;
        this.A02 = z;
        this.A07 = z2;
        this.A05 = eMg;
        this.A09 = z3;
        this.A08 = z4;
        this.A01 = function1;
        this.A03 = r302;
        this.A06 = z5;
        this.A00 = fGg;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void A01(C2k5 c2k5, Function1 function1, Object[] objArr) {
        Object obj = c2k5.A03;
        if (obj == null) {
            obj = new Object();
        }
        String A0C = c2k5.A05.A0C();
        List list = obj.A01;
        C9ss c9ss = new C9ss(new C66s(A0C, list != null ? list.size() : 0), function1, objArr);
        1tH r0 = c2k5.A02;
        if (r0 == null) {
            throw 1BK.A0h();
        }
        obj.A00((3lE) r0.BH3().A03.A01.get(c9ss.A01), c9ss);
        c2k5.A03 = obj;
    }

    public static final void A0L(C2k6 c2k6, Esz esz, C8hz c8hz, EzU ezU, 9cN r305, C00m c00m, Function1 function1, int i, int i2, int i3, boolean z) {
        C9cV A00 = 9Ei.A00(ezU, c8hz.A05.value);
        G9G g9g = new G9G(ezU, function1, 36);
        if (!z) {
            g9g = null;
        }
        EZ9.A00(c2k6, r305, new G9G(ezU, function1, 34), new G9G(function1, A00, 35), new G9J(30, function1, ezU, esz), g9g, c00m, i2, i3, i);
    }

    public 1LI A0s(C2k5 c2k5) {
        1LI qHd;
        Integer num;
        11T.A0F(c2k5, 0);
        Esz A01 = F1o.A01(c2k5, AnonymousClass000.A00(7), null);
        EJX ejx = this.A04;
        A01(c2k5, AUp.A00, new Object[]{ejx});
        A01(c2k5, AUq.A00, new Object[]{ejx});
        A01(c2k5, AUr.A00, new Object[]{ejx});
        2lO r314 = this.A03;
        Integer num2 = 0S2.A00;
        C82m A08 = C82m.A08(num2, 100.0f, 0);
        if (r314 == 2lO.A02) {
            r314 = null;
        }
        2lO A0g = 7zL.A0g(r314, A08);
        Integer num3 = 0S2.A01;
        final 2lO A04 = C82m.A04(A0g, num3, 100.0f, 0);
        if (ejx instanceof EJX) {
            qHd = new C8bc(7zQ.A0Z((2lO) null, num2, new GBn(this, 42)).A00(7zR.A0P(c2k5.A05, A04, 5Rn.A01, "suggestions_visibility")), ejx, this.A05, this.A01, this.A09);
        } else if (ejx instanceof EJb) {
            qHd = new C8eq(7zR.A0P(c2k5.A05, A04, 5Rn.A01, "suggestions_search_visibility"));
        } else if (ejx instanceof C94u) {
            final Eyh eyh = ((C94u) ejx).A00;
            final boolean z = this.A02;
            final boolean z2 = this.A07;
            final EMg eMg = this.A05;
            final boolean z3 = this.A08;
            final AVX avx = new AVX(16, c2k5, this, A01);
            final Function1 function1 = this.A01;
            qHd = new 1LH(A04, eMg, eyh, function1, avx, z, z2, z3) { // from class: X.8df
                public final Eyh A00;
                public final Function1 A01;
                public final Function2 A02;
                public final boolean A03;
                public final boolean A04;
                public final boolean A05;
                public final 2lO A06;
                public final EMg A07;

                {
                    4YV.A1M(eMg, 4, function1);
                    this.A00 = eyh;
                    this.A03 = z;
                    this.A04 = z2;
                    this.A07 = eMg;
                    this.A05 = z3;
                    this.A02 = avx;
                    this.A01 = function1;
                    this.A06 = A04;
                }

                public 1LI A0s(C2k5 c2k52) {
                    11T.A0F(c2k52, 0);
                    Eyh eyh2 = this.A00;
                    Drawable drawable = (Drawable) 2rO.A00(c2k52, new G9G(this, c2k52, 31), new Object[]{eyh2 != null ? eyh2.A01 : null});
                    9cN r0 = (9cN) 2rO.A00(c2k52, AQE.A00, new Object[]{eyh2 != null ? eyh2.A02.A04 : null});
                    2lQ r02 = 2lO.A02;
                    long A0F = 7zP.A0F();
                    2lO A00 = 7zT.A0Z((2lO) null, 7zM.A0r(A0F), A0F).A00(this.A06);
                    C2sn A0L = 7zR.A0L(c2k52);
                    C2sn A0K = 7zS.A0K(A0L);
                    long A06 = 7zU.A06(A0K, 0S2.A0X);
                    2lO A0O = 7zT.A0O((2lO) null, 16.0d);
                    float f = this.A07.value;
                    Integer num4 = 0S2.A0Y;
                    2lO A0X = 7zQ.A0X(A0O, num4, f);
                    Integer num5 = 0S2.A01;
                    A0K.A00(new Dvn(drawable, C82m.A04(A0X, num5, 100.0f, 0), new AKK(this, 35), AUg.A00, A06));
                    C1rp c1rp = C1rp.FLEX_END;
                    C1ro c1ro = C1ro.FLEX_END;
                    2lO A0l = 7zT.A0l(4YV.A0L(7zS.A0Z((2lO) null, num5, 100.0d), num4, 2dP.A01, 0), 0S2.A0N, num4, 7zQ.A06());
                    C2sn A0K2 = 7zS.A0K(A0K);
                    C2iw c2iw = r0.A00;
                    String str = r0.A01;
                    Dvv dvv = new Dvv(4YV.A0L(7zT.A0k((2lO) null, 0S2.A00, num5, 7zP.A0B()), 0S2.A0D, str, 1), C97h.A0X, null, Integer.valueOf(FGN.A00(A0K2, C97i.A0l)), Integer.valueOf(C9kH.A00(F2c.A00(A0K2)).Chy(C97i.A0R, false)), 3yH.A09(A0K2, 2131960223), new G9G(this, r0, 30), 40, true);
                    85X.A00(dvv, c2iw);
                    A0K2.A00(dvv);
                    7zQ.A1D(C2so.A0T(A0K2, A0K, A0l, c1ro, null, c1rp), A0K, A0L);
                    return C2so.A0M(A0L, c2k52, A00);
                }
            };
        } else if (ejx instanceof EJY) {
            EJY ejy = (EJY) ejx;
            if (ejy.A04) {
                num = 0S2.A0C;
            } else {
                num = num2;
                if (this.A08) {
                    num = num3;
                }
            }
            qHd = new 8hP(7zQ.A0Z((2lO) null, num2, new GBn(this, 43)).A00(7zR.A0P(c2k5.A05, A04, 5Rn.A01, "results_visibility")), ejy, this.A05, num, this.A01, new AVX(17, c2k5, this, A01), new GC9(1, this, A01, c2k5), this.A02, this.A07, this.A06);
        } else {
            qHd = ejx instanceof EJZ ? new QHd(A04) : 7zL.A0Y();
        }
        return qHd;
    }
}
