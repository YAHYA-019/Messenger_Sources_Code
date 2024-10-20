package X;

import android.widget.ImageView;

/* renamed from: X.8ho, reason: invalid class name */
/* loaded from: 8ho.class */
public final class C8ho extends 1LH {
    public static final long A06 = 7zQ.A06();
    public final 9Af A00;
    public final boolean A01;
    public final boolean A02;
    public final boolean A03;
    public final boolean A04;
    public final boolean A05;

    public C8ho(9Af r302, boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        11T.A0F(r302, 6);
        this.A03 = z;
        this.A01 = z2;
        this.A04 = z3;
        this.A05 = z4;
        this.A02 = z5;
        this.A00 = r302;
    }

    public static final C2cl A01(C1u3 c1u3, C1u2 c1u2, C2k6 c2k6, String str, boolean z) {
        int i = -1081700711;
        if (z) {
            i = -16089857;
        }
        C2cm A00 = C2cl.A00(c2k6.AeS());
        A00.A2X(i);
        A00.A2b(c1u2.A08(c1u3, i));
        A00.A0S();
        A00.A2c(ImageView.ScaleType.FIT_END);
        7zL.A1J(A00);
        A00.A2S(str);
        return 7zN.A09(A00);
    }

    public 1LI A0s(C2k5 c2k5) {
        long j;
        Integer num;
        1Iw AeS;
        C1u3 c1u3;
        int i;
        C1rh A0R;
        C1u3 c1u32;
        int i2;
        C1u3 c1u33;
        int i3;
        C1u2 c1u2 = (C1u2) 2rO.A00(c2k5, ALV.A00, 7zL.A1Z(c2k5));
        C1ro c1ro = C1ro.CENTER;
        2lQ r0 = 2lO.A02;
        2lO A0g = 7zL.A0g((2lO) null, 7zL.A0u(0S2.A00, c1ro, 0));
        C2sn A0L = 7zR.A0L(c2k5);
        if (this.A04) {
            boolean z = this.A05;
            j = A06;
            2lO A0K = 4YV.A0K((2lO) null, 0S2.A09, j);
            84V r02 = new 84V(1, this, A0L, z);
            num = 0S2.A1G;
            2lO A0L2 = 4YV.A0L(A0K, num, r02, 1);
            AeS = A0L.AeS();
            C2sn A0U = 7zQ.A0U(AeS);
            if (z) {
                c1u33 = C1u3.A1D;
                i3 = 2131960296;
            } else {
                c1u33 = C1u3.A1C;
                i3 = 2131960295;
            }
            A0R = 7zN.A0R(A01(c1u33, c1u2, A0U, 3yH.A09(A0U, i3), true), A0U, A0L, A0L2);
        } else {
            boolean z2 = this.A03;
            boolean z3 = this.A02;
            j = A06;
            2lO A0K2 = 4YV.A0K((2lO) null, 0S2.A09, j);
            ARJ arj = new ARJ(0, this, A0L, z3, z2);
            num = 0S2.A1G;
            2lO A0b = 7zS.A0b(A0K2, num, arj);
            AeS = A0L.AeS();
            C2sn A0U2 = 7zQ.A0U(AeS);
            if (z2) {
                c1u3 = C1u3.A0b;
                i = 2131960319;
            } else {
                c1u3 = C1u3.A0d;
                i = 2131960303;
            }
            A0R = 7zN.A0R(A01(c1u3, c1u2, A0U2, 3yH.A09(A0U2, i), z3), A0U2, A0L, A0b);
        }
        A0L.A00(A0R);
        boolean z4 = this.A01;
        boolean z5 = this.A02;
        2lO A0L3 = 4YV.A0L((2lO) null, num, new ARJ(1, this, A0L, z5, z4), 1);
        C2sn A0U3 = 7zQ.A0U(AeS);
        if (z4) {
            c1u32 = C1u3.A4Q;
            i2 = 2131960318;
        } else {
            c1u32 = C1u3.A4P;
            i2 = 2131960302;
        }
        7zQ.A1F(A01(c1u32, c1u2, A0U3, 3yH.A09(A0U3, i2), z5), A0U3, A0L, A0L3);
        2lO A0L4 = 4YV.A0L(4YV.A0K((2lO) null, 0S2.A07, j), num, AV1.A00(this, 36), 1);
        C2sn A0U4 = 7zQ.A0U(AeS);
        7zQ.A1F(A01(C1u3.A4K, c1u2, A0U4, 3yH.A09(A0U4, 2131960317), true), A0U4, A0L, A0L4);
        return C2so.A0P(A0L, c2k5, A0g);
    }
}
