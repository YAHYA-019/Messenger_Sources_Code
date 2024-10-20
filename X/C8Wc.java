package X;

import android.text.TextUtils;

/* renamed from: X.8Wc, reason: invalid class name */
/* loaded from: 8Wc.class */
public final class C8Wc extends 1LH {
    public final 2lO A00;
    public final String A01;

    public C8Wc(2lO r302, String str) {
        11T.A0F(str, 1);
        this.A01 = str;
        this.A00 = r302;
    }

    public 1LI A0s(C2k5 c2k5) {
        boolean A1W = 7zL.A1W(c2k5);
        Integer num = 0S2.A00;
        2lO A0g = 7zL.A0g((2lO) null, C82m.A08(num, 100.0f, A1W ? 1 : 0));
        Integer num2 = 0S2.A01;
        2lO A00 = C82m.A04(A0g, num2, 100.0f, A1W ? 1 : 0).A00(this.A00);
        C2sn A0U = 7zQ.A0U(c2k5.A05);
        2lO A0Y = 7zS.A0Y((2lO) null, num2);
        1Iw r0 = A0U.A00;
        C2sn A0U2 = 7zQ.A0U(r0);
        long A09 = 7zP.A09();
        long A0B = 7zQ.A0B();
        Integer num3 = 0S2.A0E;
        2lO A0b = 7zT.A0b((2lO) null, 7zL.A0i(num3, A09), A0B);
        CharSequence expandTemplate = TextUtils.expandTemplate(3yH.A09(A0U2, 2131959447), this.A01);
        C97i c97i = C97i.A0Z;
        Integer num4 = 0S2.A05;
        ELv eLv = ELv.A01;
        long A092 = 7zO.A09();
        11T.A0D(expandTemplate);
        A0U2.A00(new Dw8(A0b, eLv, c97i, expandTemplate, num4, A1W ? 1 : 0, A092, A092));
        7zQ.A1G(new Dw8(4YV.A0K(7zS.A0Z((2lO) null, num3, 25.0d), 0S2.A0F, A09), eLv, C97i.A0i, 3yH.A09(A0U2, 2131959446), num, A1W ? 1 : 0, A092, A092), A0U2, A0U, A0Y);
        2lO A02 = C82m.A02(7zT.A0Z((2lO) null, 7zL.A0i(num3, 7zP.A0B()), A0B), 7zL.A0i(num2, 7zP.A07()), num, 100.0f, A1W ? 1 : 0);
        C2sn A0U3 = 7zQ.A0U(r0);
        A0U3.A00(new 8eN(4YV.A0K((2lO) null, 0S2.A0G, A09), (C97i) null, (C97i) null, (C97i) null, 3yH.A09(A0U3, 2131959491), num, num, num, (Integer) null, new G9H(A0U3, this, 7)));
        7zU.A1G(A0U3, A0U, A02);
        return C2so.A06(A0U, c2k5, A00);
    }
}
