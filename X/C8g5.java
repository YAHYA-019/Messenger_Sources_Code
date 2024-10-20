package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import com.facebook.foa.session.FbMetaSessionImpl;
import kotlin.jvm.functions.Function1;

/* renamed from: X.8g5, reason: invalid class name */
/* loaded from: 8g5.class */
public final class C8g5 extends 1LH {
    public final FbMetaSessionImpl A00;
    public final Function1 A01;
    public final boolean A02;
    public final C9i5 A03;

    public C8g5(FbMetaSessionImpl fbMetaSessionImpl, C9i5 c9i5, Function1 function1, boolean z) {
        11T.A0F(c9i5, 2);
        this.A00 = fbMetaSessionImpl;
        this.A03 = c9i5;
        this.A02 = z;
        this.A01 = function1;
    }

    public static final C1rh A01(C2k6 c2k6, C97h c97h, String str, String str2) {
        C1rp c1rp = C1rp.SPACE_AROUND;
        2lQ r0 = 2lO.A02;
        2lO A0K = 4YV.A0K((2lO) null, 0S2.A0E, 7zQ.A09());
        C2sn A0L = 7zS.A0L(c2k6);
        C97i c97i = C97i.A0Y;
        Drawable A03 = FGN.A03(A0L, c97h, (C97h) null, Integer.valueOf(FGN.A00(A0L, c97i)));
        long A06 = 7zQ.A06();
        Integer num = 0S2.A00;
        2lO A0K2 = 4YV.A0K(7zT.A0i((2lO) null, num, A06), 0S2.A09, 7zQ.A08());
        1Iw r02 = A0L.A00;
        7zT.A17(A03, r02, A0L, A0K2, 0);
        long A0F = 7zP.A0F();
        2lO A0Z = 7zT.A0Z((2lO) null, 7zM.A0r(A0F), A0F);
        C2sn A0U = 7zQ.A0U(r02);
        C1ro c1ro = C1ro.FLEX_START;
        2lO A04 = C82m.A04(null, num, 100.0f, 0);
        1Iw r03 = A0U.A00;
        C2sn A0U2 = 7zQ.A0U(r03);
        C97i c97i2 = C97i.A0Z;
        Integer num2 = 0S2.A0I;
        long A09 = 7zO.A09();
        ELv eLv = ELv.A07;
        A0U2.A00(new Dw8(null, eLv, c97i2, str, num2, 2, A09, A09));
        A0U.A00(C2so.A0S(A0U2, A0U, A04, c1ro));
        2lO A042 = C82m.A04(null, num, 100.0f, 0);
        C2sn A0U3 = 7zQ.A0U(r03);
        A0U3.A00(new Dw8(null, eLv, c97i, str2, 0S2.A04, 2, A09, A09));
        7zU.A1F(C2so.A0S(A0U3, A0U, A042, c1ro), A0U, A0L, A0Z, c1rp);
        return C2so.A0X(A0L, c2k6, A0K, c1rp);
    }

    public 1LI A0s(C2k5 c2k5) {
        11T.A0F(c2k5, 0);
        Esz A01 = F1o.A01(c2k5, "android.permission.CAMERA", 4FN.A01(c2k5, new GBr(this, 23)));
        C1rp c1rp = C1rp.SPACE_AROUND;
        2lQ r0 = 2lO.A02;
        Integer num = 0S2.A00;
        2lO A0g = 7zL.A0g((2lO) null, C82m.A08(num, 100.0f, 0));
        Integer num2 = 0S2.A01;
        2lO A04 = C82m.A04(A0g, num2, 100.0f, 0);
        C2sn A0L = 7zR.A0L(c2k5);
        long A08 = 7zP.A08();
        1Iw r02 = A0L.A00;
        Dud A012 = Dzc.A01(r02);
        C2sn A0U = 7zQ.A0U(r02);
        A0U.A00(new QG9(7zS.A0Z(7zS.A0Z((2lO) null, num, 257.0d), num2, 163.0d), C97h.A08));
        long A09 = 7zP.A09();
        Integer num3 = 0S2.A0G;
        2lO A0K = 4YV.A0K((2lO) null, num3, A09);
        String A092 = 3yH.A09(A0U, 2131959456);
        C97i c97i = C97i.A0Z;
        Integer num4 = 0S2.A05;
        long A093 = 7zO.A09();
        ELv eLv = ELv.A01;
        A0U.A00(new Dw8(A0K, eLv, c97i, A092, num4, 0, A093, A093));
        boolean z = this.A02;
        A0U.A00(z ? new Dw8(4YV.A0K((2lO) null, num3, A09), eLv, c97i, 3yH.A09(A0U, 2131959463), 0S2.A0H, 0, A093, A093) : null);
        A0U.A00(!z ? A01(A0U, C97h.A0c, 3yH.A09(A0U, 2131959458), 3yH.A09(A0U, 2131959457)) : null);
        A0U.A00(!z ? A01(A0U, C97h.A0b, 3yH.A09(A0U, 2131959462), 3yH.A09(A0U, 2131959461)) : null);
        A0U.A00(!z ? A01(A0U, C97h.A04, 3yH.A09(A0U, 2131959460), 3yH.A09(A0U, 2131959459)) : null);
        A012.A2c(C2so.A0D(A0U, A0L, null, c1rp));
        A0L.B7k();
        A012.A2a(C2lu.A00());
        A012.A2g(false);
        A012.A2X();
        A012.A2h(false);
        A012.A2f(true);
        7zU.A1M(A012, A0L.B7k(), A08, false);
        A012.A2d(null);
        Dzc A2V = A012.A2V();
        11T.A0D(A2V);
        A0L.A00(A2V);
        C1rp c1rp2 = C1rp.FLEX_END;
        2lO A0K2 = 7zT.A0K(C82m.A02(7zQ.A0X((2lO) null, num2, 1.0f), 7zL.A0k(0S2.A0C, 0.0f), num, 100.0f, 0), 24.0d);
        C2sn A0U2 = 7zQ.A0U(r02);
        2lO A0K3 = 4YV.A0K((2lO) null, num3, A09);
        String A094 = 3yH.A09(A0U2, 2131959465);
        Context A00 = 3vP.A00(A0U2);
        C9i5 c9i5 = this.A03;
        AV9 av9 = new AV9(A00, this, new GBr(A0U2, 20), c9i5.A01, 26);
        CharSequence charSequence = new 8Bi(A0U2);
        av9.invoke(charSequence);
        AV9 av92 = new AV9(3vP.A00(A0U2), this, new GBr(A0U2, 21), c9i5.A02, 26);
        CharSequence charSequence2 = new 8Bi(A0U2);
        av92.invoke(charSequence2);
        AV9 av93 = new AV9(3vP.A00(A0U2), this, new GBr(A0U2, 22), c9i5.A03, 26);
        CharSequence charSequence3 = new 8Bi(A0U2);
        av93.invoke(charSequence3);
        CharSequence expandTemplate = TextUtils.expandTemplate(A094, charSequence, charSequence2, charSequence3);
        C97i c97i2 = C97i.A0i;
        Integer num5 = 0S2.A0N;
        11T.A0D(expandTemplate);
        A0U2.A00(new Dw8(A0K3, eLv, c97i2, expandTemplate, num5, 0, A093, A093));
        long A0B = 7zP.A0B();
        Integer num6 = 0S2.A0E;
        2lO A0K4 = 4YV.A0K((2lO) null, num6, A0B);
        long A07 = 7zP.A07();
        2lO A02 = C82m.A02(A0K4, 7zL.A0i(num2, A07), num, 100.0f, 0);
        2lO A022 = C82m.A02(7zT.A0b((2lO) null, 7zL.A0i(num6, A0B), 7zP.A0A()), 7zL.A0i(num2, A07), num, 100.0f, 0);
        1Iw AeS = A0U2.AeS();
        C2sn A0U3 = 7zQ.A0U(AeS);
        2lO A0K5 = 4YV.A0K((2lO) null, num6, A09);
        String A095 = 3yH.A09(A0U3, 2131959454);
        C97i c97i3 = C97i.A0Q;
        A0U3.A00(new 8eN(A0K5, c97i3, C97i.A0T, (C97i) null, A095, num2, num, num, num3, new G9H(A01, this, 8)));
        A0U2.A00(C2so.A0X(A0U3, A0U2, A02, c1rp));
        C2sn A0U4 = 7zQ.A0U(AeS);
        A0U4.A00(new 8eN(4YV.A0K((2lO) null, num3, A09), C97i.A0A, c97i, c97i3, 3yH.A09(A0U4, 2131959455), num2, num2, num, num3, new G9D(this, 38)));
        7zU.A1F(C2so.A0X(A0U4, A0U2, A022, c1rp), A0U2, A0L, A0K2, c1rp2);
        return C2so.A0D(A0L, c2k5, A04, c1rp);
    }
}
