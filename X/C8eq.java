package X;

import com.facebook.acra.constants.ActionId;

/* renamed from: X.8eq, reason: invalid class name */
/* loaded from: 8eq.class */
public final class C8eq extends 1LH {
    public final 2lO A00;

    public C8eq() {
        this(2lO.A02);
    }

    public C8eq(2lO r302) {
        this.A00 = r302;
    }

    public 1LI A0s(C2k5 c2k5) {
        11T.A0F(c2k5, 0);
        String A09 = 3yH.A09(c2k5, 2131960222);
        String A092 = 3yH.A09(c2k5, 2131960221);
        2lO r308 = this.A00;
        Integer num = 0S2.A00;
        C82m A093 = C82m.A09(num, 0);
        if (r308 == 2lO.A02) {
            r308 = null;
        }
        2lO A0g = 7zL.A0g(r308, A093);
        C2sn A0L = 7zR.A0L(c2k5);
        A0L.A00(new 8Yi(7zT.A0i((2lO) null, num, Double.doubleToRawLongBits(100.0d)), ACW.A00, false));
        C97i c97i = C97i.A0Z;
        Integer num2 = 0S2.A0J;
        ELv eLv = ELv.A01;
        long A07 = 7zQ.A07();
        Integer num3 = 0S2.A0A;
        2lO A0K = 4YV.A0K((2lO) null, num3, A07);
        long doubleToRawLongBits = Double.doubleToRawLongBits(262.0d);
        2lO A0K2 = 4YV.A0K(A0K, num, doubleToRawLongBits);
        long A0C = 7zP.A0C();
        Integer num4 = 0S2.A06;
        A0L.A00(new Dw8(4YV.A0K(A0K2, num4, A0C), eLv, c97i, A09, num2, 0, ActionId.ACTION_BAR_COMPLETE));
        return 7zM.A0k(new Dw8(7zS.A0V(4YV.A0K((2lO) null, num, doubleToRawLongBits), 7zL.A0i(num3, 7zP.A0A()), num4, A0C), eLv, C97i.A0i, A092, 0S2.A0j, 0, ActionId.ACTION_BAR_COMPLETE), A0L, c2k5, A0g);
    }
}
