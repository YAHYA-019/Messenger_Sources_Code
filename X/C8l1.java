package X;

import android.content.Context;
import android.text.Layout;

/* renamed from: X.8l1, reason: invalid class name */
/* loaded from: 8l1.class */
public final class C8l1 extends C1rj {
    public int A00;
    public 1LI A01;
    public String A02;
    public C00m A03;
    public C00m A04;
    public boolean A05;
    public boolean A06;

    public C8l1() {
        super("MustacheComponent");
    }

    public final Object[] A0k() {
        return new Object[]{Integer.valueOf(this.A00), Boolean.valueOf(this.A05), Boolean.valueOf(this.A06), this.A03, this.A04, this.A01, this.A02, null};
    }

    public /* bridge */ /* synthetic */ 1LI A0l() {
        C8l1 c8l1 = (C8l1) super.A0l();
        c8l1.A01 = 4YV.A0J(c8l1.A01);
        return c8l1;
    }

    @Override // X.C1rj
    public 1LI A0y(1Iw r302) {
        C26z c26z;
        float f;
        String str = this.A02;
        boolean z = this.A05;
        1LI r0 = this.A01;
        int i = this.A00;
        boolean z2 = this.A06;
        11T.A0F(r302, 0);
        1BK.A1J(str, 1, r0);
        2cM A0L = 7zN.A0L(r0, r302);
        C1rq A01 = C1rg.A01(r302, null, 0);
        3yF A0v = 7zM.A0v(r302, str, 0);
        Context context = r302.A0D;
        A0v.A34(2KU.A00(context));
        A0v.A2S(str);
        A0v.A2Q(true);
        A0v.A1N(1);
        A0v.A2s(13.0f);
        A0v.A35(Layout.Alignment.ALIGN_NORMAL);
        A0v.A2x(context.getColor(i));
        A0v.A17(6.0f);
        A0v.A18(4.0f);
        if (z) {
            c26z = C26z.END;
            f = 26.0f;
        } else {
            c26z = C26z.START;
            f = 66.0f;
            if (z2) {
                f = 10.0f;
            }
        }
        A0v.A24(c26z, f);
        A01.A2f(A0v.A2W());
        7zN.A1C(A01, r302, C8l1.class, "MustacheComponent");
        A01.A1v(1LI.A05(r302, C8l1.class, "MustacheComponent"));
        A01.A0Q();
        A01.A2h(z ? C1ro.FLEX_END : C1ro.FLEX_START);
        7zL.A1I(A0L, A01);
        return A0L.A00;
    }

    @Override // X.C1rj
    public Object A15(1Im r302, Object obj) {
        C00m c00m;
        int i = r302.A01;
        if (i == -1351902487) {
            1Iv r0 = r302.A00;
            1Is r02 = r0.A01;
            1Iw r03 = r0.A00;
            c00m = ((C8l1) r02).A03;
            11T.A0F(r03, 0);
            if (c00m == null) {
                1Bi.A03(84011);
                return null;
            }
        } else {
            if (i == -1048037474) {
                1LI.A0J(r302, obj);
                return null;
            }
            if (i != 1803022739) {
                return null;
            }
            c00m = ((C8l1) r302.A00.A01).A04;
            if (c00m == null) {
                return null;
            }
        }
        c00m.invoke();
        return null;
    }
}
