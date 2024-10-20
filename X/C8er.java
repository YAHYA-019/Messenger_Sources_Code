package X;

import android.text.TextUtils;

/* renamed from: X.8er, reason: invalid class name */
/* loaded from: 8er.class */
public final class C8er extends 1LH {
    public final C00m A00;

    public C8er() {
        this(null);
    }

    public C8er(C00m c00m) {
        this.A00 = c00m;
    }

    public 1LI A0s(C2k5 c2k5) {
        boolean A1W = 7zL.A1W(c2k5);
        long A0G = 7zP.A0G();
        long A0F = 7zP.A0F();
        2lO A0T = 7zT.A0T(7zT.A0W((2lO) null, 7zL.A0i(0S2.A07, A0F), A0F), 7zL.A0i(0S2.A0A, A0G));
        C2sn A0L = 7zR.A0L(c2k5);
        String A09 = 3yH.A09(A0L, 2131960181);
        GBq gBq = new GBq(this, new GBr(A0L, 47), 47);
        CharSequence charSequence = new 8Bi(A0L);
        gBq.invoke(charSequence);
        CharSequence expandTemplate = TextUtils.expandTemplate(A09, charSequence);
        11T.A0A(expandTemplate);
        Integer num = 0S2.A0D;
        C97i c97i = C97i.A0Z;
        ELv eLv = ELv.A01;
        long A092 = 7zO.A09();
        A0L.A00(new Dw8(null, eLv, c97i, expandTemplate, num, A1W ? 1 : 0, A092, A092));
        return C2so.A0N(A0L, c2k5, A0T);
    }
}
