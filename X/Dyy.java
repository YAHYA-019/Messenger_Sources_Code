package X;

import android.app.Dialog;
import android.content.res.TypedArray;

/* loaded from: Dyy.class */
public final class Dyy extends C1rj {
    public static final int A09;
    public static final int A0A;
    public static final int A0B;
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public int A05;
    public Dialog A06;
    public FHC A07;
    public boolean A08;

    static {
        int i = 2MR.A06.attr;
        A0B = i;
        A09 = 2MR.A01.attr;
        A0A = i;
    }

    public Dyy() {
        super("SurveyHeaderComponent");
        this.A00 = A09;
        this.A01 = A0A;
        this.A02 = 2132345158;
        this.A03 = A0B;
        this.A04 = 2131964136;
        this.A05 = 0;
    }

    public final Object[] A0k() {
        return new Object[]{Integer.valueOf(this.A00), this.A06, Boolean.valueOf(this.A08), Integer.valueOf(this.A01), Integer.valueOf(this.A02), Integer.valueOf(this.A03), Integer.valueOf(this.A04), Integer.valueOf(this.A05), this.A07};
    }

    @Override // X.C1rj
    public 1LI A0y(1Iw r302) {
        C2cl c2cl;
        FHC fhc = this.A07;
        Dialog dialog = this.A06;
        boolean z = this.A08;
        int i = this.A04;
        int i2 = this.A03;
        int i3 = this.A05;
        int i4 = this.A00;
        int i5 = this.A02;
        int i6 = this.A01;
        C1rq A01 = C1rg.A01(r302, null, 0);
        A01.A0S();
        A01.A1G(i4);
        A01.A2d();
        A01.A2h(C1ro.FLEX_START);
        C1rq A012 = C1rg.A01(r302, null, 0);
        A012.A2i(C1rp.FLEX_START);
        A012.A2b();
        C2cm A00 = C2cl.A00(r302);
        A00.A2a(i5);
        A00.A2Y(i6);
        A00.A0l(24.0f);
        A00.A0z(24.0f);
        C26z c26z = C26z.ALL;
        A00.A24(c26z, 12.0f);
        A00.A0J();
        A012.A2f(A00.A00);
        3yF A0L = 2KZ.A0L(r302, 0);
        A0L.A30(i);
        A0L.A2y(i2);
        A0L.A2g();
        A0L.A33(i3);
        A012.A2f(A0L.A2W());
        A01.A2f(A012.A00);
        if (z) {
            C2cm A002 = C2cl.A00(r302);
            A002.A2a(2132345301);
            A002.A0l(16.0f);
            A002.A0z(16.0f);
            A002.A24(c26z, 12.0f);
            A002.A2T(1LI.A0C(r302, Dyy.class, "SurveyHeaderComponent", new Object[]{fhc, dialog}, 842544598));
            A002.A1J(2131964124);
            A002.A0J();
            c2cl = A002.A00;
        } else {
            c2cl = null;
        }
        A01.A2f(c2cl);
        return A01.A00;
    }

    @Override // X.C1rj
    public C1qp A14(1Iw r302, C1qp c1qp) {
        C1qp A00 = 1sK.A00(c1qp);
        A00.A03(1iF.class, AbL.A0A());
        return A00;
    }

    @Override // X.C1rj
    public Object A15(1Im r302, Object obj) {
        int i = r302.A01;
        if (i == -1048037474) {
            1LI.A0J(r302, obj);
            return null;
        }
        if (i != 842544598) {
            return null;
        }
        Object[] objArr = r302.A03;
        FHC fhc = (FHC) objArr[0];
        Dialog dialog = (Dialog) objArr[1];
        try {
            try {
                fhc.A02(HB6.A03);
            } catch (HCx e) {
                0fH.A12("Survey Remix: ", "%s: Cancelling the survey violated the state machine. PLEASE FIX.", e, new Object[]{"Survey Remix: "});
            }
            dialog.dismiss();
            return null;
        } catch (Throwable th) {
            dialog.dismiss();
            throw th;
        }
    }

    @Override // X.C1rj
    public void A1E(1Iw r302) {
        Integer num = null;
        Integer num2 = null;
        Integer num3 = null;
        Integer num4 = null;
        Integer num5 = null;
        Integer num6 = null;
        TypedArray A02 = r302.A02(0, C1oo.A2H);
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 >= A02.getIndexCount()) {
                break;
            }
            int index = A02.getIndex(i2);
            if (index == 3) {
                num = DKG.A11(A02, index, 2131964136);
            } else if (index == 0) {
                num2 = DKG.A11(A02, index, A0B);
            } else if (index == 4) {
                num3 = Integer.valueOf(A02.getInt(index, 0));
            } else if (index == 1) {
                num4 = DKG.A11(A02, index, A09);
            } else if (index == 14) {
                num5 = DKG.A11(A02, index, 2132345158);
            } else if (index == 2) {
                num6 = DKG.A11(A02, index, A0A);
            }
            i = i2 + 1;
        }
        A02.recycle();
        if (num != null) {
            this.A04 = num.intValue();
        }
        if (num2 != null) {
            this.A03 = num2.intValue();
        }
        if (num3 != null) {
            this.A05 = num3.intValue();
        }
        if (num4 != null) {
            this.A00 = num4.intValue();
        }
        if (num5 != null) {
            this.A02 = num5.intValue();
        }
        if (num6 != null) {
            this.A01 = num6.intValue();
        }
    }
}
