package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import com.mapbox.mapboxsdk.R;
import java.util.EnumMap;

/* renamed from: X.8l4, reason: invalid class name */
/* loaded from: 8l4.class */
public final class C8l4 extends C1rj {
    public int A00;
    public C5j5 A01;
    public 6yT A02;
    public AYe A03;
    public 74X A04;
    public C5nC A05;
    public C5fv A06;
    public 5vW A07;
    public EnumMap A08;

    public C8l4() {
        super("ActionDrawerMenuComponent");
    }

    public final Object[] A0k() {
        return new Object[]{this.A08, this.A02, this.A03, Integer.valueOf(this.A00), this.A04, this.A06, this.A05, this.A07, this.A01};
    }

    @Override // X.C1rj
    public 1LI A0y(1Iw r302) {
        int i = this.A00;
        6yT r0 = this.A02;
        C5fv c5fv = this.A06;
        C5nC c5nC = this.A05;
        final String A0C = r302.A0C();
        final 5vW r02 = this.A07;
        final 74X r03 = this.A04;
        final EnumMap enumMap = this.A08;
        Object obj = new Object(r03, r02, A0C, enumMap) { // from class: X.9bi
            public final 74X A00;
            public final 5vW A01;
            public final String A02;
            public final EnumMap A03;

            {
                this.A02 = A0C;
                this.A01 = r02;
                this.A00 = r03;
                this.A03 = enumMap;
            }

            public boolean equals(Object obj2) {
                if (this != obj2) {
                    if (obj2 == null || !(obj2 instanceof C9bi)) {
                        return false;
                    }
                    C9bi c9bi = (C9bi) obj2;
                    if (!11T.A0O(this.A02, c9bi.A02)) {
                        return false;
                    }
                    5vW r04 = this.A01;
                    5vW r05 = c9bi.A01;
                    if (r04 != null) {
                        if (!r04.equals(r05)) {
                            return false;
                        }
                    } else if (r05 != null) {
                        return false;
                    }
                    74X r06 = this.A00;
                    74X r07 = c9bi.A00;
                    if (r06 != null) {
                        if (!r06.equals(r07)) {
                            return false;
                        }
                    } else if (r07 != null) {
                        return false;
                    }
                    EnumMap enumMap2 = this.A03;
                    EnumMap enumMap3 = c9bi.A03;
                    if (enumMap2 != null) {
                        if (!enumMap2.equals(enumMap3)) {
                            return false;
                        }
                    } else if (enumMap3 != null) {
                        return false;
                    }
                }
                return true;
            }

            public int hashCode() {
                return 7zS.A05(this, this.A02, this.A01, this.A00, this.A03);
            }
        };
        C7sa c7sa = (C7sa) r302.A0B(obj, A0C, 0);
        if (c7sa == null) {
            5vW r04 = this.A07;
            74X r05 = this.A04;
            EnumMap enumMap2 = this.A08;
            11T.A0F(r04, 0);
            1BL.A1F(r05, enumMap2);
            c7sa = r05.AKL(r04, enumMap2);
            r302.A0I(obj, c7sa, A0C, 0);
        }
        7zT.A1U(r0, c5fv, c5nC);
        Context A0A = 7zL.A0A(r302);
        2cM A0i = 7zM.A0i(r302);
        C1rq A01 = C1rg.A01(r302, null, 0);
        A01.A2i(C1rp.SPACE_AROUND);
        A01.A0e();
        C6bn.A01(A0i, R.dimen.mapbox_four_dp);
        C6bn.A00(A0i);
        if (c5nC.BRy(c5fv)) {
            A0i.A2e(c5nC.AjD(c5fv));
        }
        if (C5v6.A03(c5fv)) {
            i = 5;
        }
        for (C9c2 c9c2 : 0QD.A0Y(c7sa.A00, i)) {
            int i2 = c9c2.A01;
            int i3 = c9c2.A02;
            Drawable drawable = null;
            if (i3 != 0) {
                Drawable drawable2 = A0A.getDrawable(i3);
                if (drawable2 != null) {
                    if (7Sm.A00(A0A)) {
                        drawable2 = new JSr(drawable2, false, true);
                    }
                    drawable = drawable2;
                }
            }
            2cM A012 = 2cK.A01(r302, (String) null, 0);
            A012.A1G(c9c2.A00);
            A012.A1M(2132279329);
            A012.A0R();
            A012.A2b();
            A012.A2c();
            C2cm A00 = C2cl.A00(r302);
            A00.A2b(drawable);
            A00.A2X(i2 != 0 ? A0A.getColor(i2) : r0.Agp(A0A));
            A012.A2e(7zL.A0J(A00));
            3yF A0L = 2KZ.A0L(r302, 0);
            7zL.A1J(A0L);
            A0L.A2u(1);
            A0L.A2x(r0.AVH(A0A));
            A0L.A30(c9c2.A03);
            A0L.A32(2132279330);
            A0L.A34(2KU.A01(A0A, 0S2.A01));
            7zM.A1L(A012, A0L);
            7zM.A1N(A012, r302, C8l4.class, "ActionDrawerMenuComponent", new Object[]{c9c2});
            7zL.A1H(A012, A01);
        }
        7zL.A1I(A0i, A01);
        return A0i.A00;
    }

    @Override // X.C1rj
    public C1qp A14(1Iw r302, C1qp c1qp) {
        return 4YV.A0M(c1qp);
    }

    @Override // X.C1rj
    public Object A15(1Im r302, Object obj) {
        int i = r302.A01;
        if (i != -1351902487) {
            4YV.A1G(r302, obj, i);
            return null;
        }
        1Iv r0 = r302.A00;
        1Is r02 = r0.A01;
        1Iw r03 = r0.A00;
        C9c2 c9c2 = (C9c2) r302.A03[0];
        C8l4 c8l4 = (C8l4) r02;
        AYe aYe = c8l4.A03;
        5vW r04 = c8l4.A07;
        C5j5 c5j5 = c8l4.A01;
        11T.A0F(r03, 0);
        7zT.A1W(aYe, r04, c5j5, c9c2);
        aYe.onDismiss();
        c9c2.A04.C6e(r03, c5j5, c9c2, r04);
        return null;
    }
}
