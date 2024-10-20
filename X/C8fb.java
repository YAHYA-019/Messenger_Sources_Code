package X;

import android.content.res.ColorStateList;
import android.graphics.Typeface;
import android.os.Handler;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.8fb, reason: invalid class name */
/* loaded from: 8fb.class */
public final class C8fb extends 1LH {
    public final 96X A00;
    public final List A01;
    public final ColorStateList A02;

    public C8fb(ColorStateList colorStateList, 96X r303, List list) {
        11T.A0F(r303, 3);
        this.A01 = list;
        this.A02 = colorStateList;
        this.A00 = r303;
    }

    private final 2KZ A01(C1rn c1rn, C1rn c1rn2, C2k6 c2k6, String str) {
        long A06 = 7zS.A06(16.0f);
        ColorStateList colorStateList = this.A02;
        int defaultColor = colorStateList != null ? colorStateList.getDefaultColor() : c2k6.B7k().A04(2132213831);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.MARQUEE;
        2lQ r0 = 2lO.A02;
        2lO A0W = 7zQ.A0W(c1rn2, 7zQ.A0W(c1rn, 7zS.A0h(0S2.A0Y, 2dP.A01, 0), 0S2.A03), 0S2.A00);
        Typeface typeface = Typeface.DEFAULT;
        long A08 = 7zP.A08();
        3yF A0v = 7zM.A0v(c2k6.AeS(), str, 0);
        A0v.A2x(defaultColor);
        7zQ.A1L(A0v, c2k6.B7k(), 0, A06);
        A0v.A34(typeface);
        7zV.A10(A0v, c2k6, A08);
        7zP.A1D(A0v);
        A0v.A2u(1);
        A0v.A2b();
        7zO.A1R(A0v, true, false);
        A0v.A36(truncateAt);
        A0v.A1w(null);
        return 7zQ.A0c(A0W, A0v);
    }

    public 1LI A0s(C2k5 c2k5) {
        11T.A0F(c2k5, 0);
        C1rn A01 = 4NN.A01(c2k5, Float.valueOf(this.A00.multiplier * (-1.0f)));
        Float A0f = 7zN.A0f();
        C1rn A012 = 4NN.A01(c2k5, A0f);
        C1rn A013 = 4NN.A01(c2k5, A0f);
        C1rn A014 = 4NN.A01(c2k5, 7zN.A0g());
        4NU A00 = 4NT.A00(c2k5, APR.A00);
        4NU A002 = 4NT.A00(c2k5, APO.A00);
        4NU A003 = 4NT.A00(c2k5, APP.A00);
        C2lh A004 = C2lc.A00(c2k5, APN.A00);
        C2lh A005 = C2lc.A00(c2k5, APQ.A00);
        List list = this.A01;
        2KZ A015 = A01(A01, A013, c2k5, (String) list.get(7zP.A01(A005)));
        Object obj = A004.A02;
        2KZ A016 = A01(A012, A014, c2k5, (String) list.get(AnonymousClass001.A03(obj)));
        int A03 = 7zR.A03(c2k5, AQu.A00(c2k5, this, A015, 13), new Object[0]);
        Handler A07 = AnonymousClass001.A07();
        4FL.A00(c2k5, new AKz(new 8BO(4, A012, this, A004), A07, A014, A013, A01, A012, A00, A002, A003, A005, this, A03), new Object[]{obj});
        C1rp c1rp = C1rp.CENTER;
        ArrayList A0s = AnonymousClass001.A0s();
        A0s.add(A015);
        A0s.add(A016);
        return new 2cL((C1ro) null, (C1ro) null, c1rp, (EnumC00743oh) null, A0s, false);
    }
}
