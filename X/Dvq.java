package X;

import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.style.StyleSpan;
import java.util.Iterator;
import kotlin.jvm.functions.Function1;

/* loaded from: Dvq.class */
public final class Dvq extends 1LH {
    public final int A00;
    public final C1ro A01;
    public final CharSequence A02;
    public final C00m A03;
    public final Function1 A04;
    public final 2lO A05;
    public final C00m A06;

    public Dvq(2lO r302, C1ro c1ro, CharSequence charSequence, C00m c00m, C00m c00m2, Function1 function1, int i) {
        C3o5.A0k(c00m, 4, c00m2);
        11T.A0F(r302, 7);
        this.A00 = i;
        this.A02 = charSequence;
        this.A01 = c1ro;
        this.A03 = c00m;
        this.A06 = c00m2;
        this.A04 = function1;
        this.A05 = r302;
    }

    public 1LI A0s(C2k5 c2k5) {
        11T.A0F(c2k5, 0);
        int A00 = FGN.A00(c2k5, C97i.A07);
        int A01 = FGN.A01(c2k5, 0S2.A0M);
        int A012 = FGN.A01(c2k5, 0S2.A0O);
        int A013 = FGN.A01(c2k5, 0S2.A0P);
        Object A002 = 2rO.A00(c2k5, new G9L(this, A01, c2k5, A00, 3), AnonymousClass001.A1a(A00));
        Function1 A014 = 4FN.A01(c2k5, new GBo(this, 11));
        2lO r320 = this.A05;
        Integer num = 0S2.A00;
        C2xi c2xi = new C2xi(num, A002, 1);
        2lO r0 = 2lO.A02;
        if (r320 == r0) {
            r320 = null;
        }
        2lO A0Z = 7zQ.A0Z(7zQ.A0X(7zT.A0P(7zL.A0g(r320, c2xi), 7zL.A08(A012), 7zL.A08(A013)), 0S2.A0C, 1.0f), num, A014);
        CharSequence charSequence = this.A02;
        9cN r02 = (9cN) 2rO.A00(c2k5, new G9E(this, 0), new Object[]{charSequence});
        C1ro c1ro = this.A01;
        C1rp c1rp = C1rp.SPACE_BETWEEN;
        C2sn A0I = 7zS.A0I(c2k5);
        Object A0A = A0I.A00.A0A(C6tP.class);
        if (A0A == null) {
            throw 1BK.A0h();
        }
        C6tP c6tP = (C6tP) A0A;
        11T.A0F(charSequence, 0);
        11T.A0F(c6tP, 1);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(charSequence);
        Integer num2 = C9kH.A00(c6tP).CiA(0S2.A1G).A03;
        Iterator it = new C04t("#[\\p{L}\\p{Mn}\\p{Mc}\\p{Nd}_]{1,30}").A04(charSequence, 0).iterator();
        while (it.hasNext()) {
            0PH r03 = (0PH) it.next();
            int i = 1;
            if (num2.intValue() == 0) {
                i = 0;
            }
            spannableStringBuilder.setSpan(new StyleSpan(i), ((07F) r03.A01()).A00, ((07F) r03.A01()).A01 + 1, 17);
        }
        for (RU7 ru7 : 0QD.A0T(R4K.A00(charSequence))) {
            int i2 = ru7.A01;
            int i3 = ru7.A00 + 1;
            String str = ru7.A02;
            spannableStringBuilder.replace(i2, i3, (CharSequence) str);
            int i4 = 1;
            if (num2.intValue() == 0) {
                i4 = 0;
            }
            spannableStringBuilder.setSpan(new StyleSpan(i4), i2, str.length() + i2, 17);
        }
        SpannableString valueOf = SpannableString.valueOf(spannableStringBuilder);
        Integer num3 = 0S2.A0u;
        C97i c97i = C97i.A0Z;
        ELv eLv = ELv.A07;
        long A09 = 7zO.A09();
        A0I.A00(new Dw8(null, eLv, c97i, valueOf, num3, 0, A09, A09));
        Function1 function1 = this.A04;
        if (function1 != null) {
            C2iw c2iw = r02.A00;
            String str2 = r02.A01;
            Dvv dvv = new Dvv(4YV.A0L(7zT.A0L(7zT.A0i((2lO) null, num, 7zQ.A0B()), 12.0d), 0S2.A0D, str2, 1), C97h.A0X, null, null, Integer.valueOf(FGN.A00(A0I, c97i)), 3yH.A09(A0I, 2131960336), new G9H(r02, function1, 33), 12, true);
            85X.A00(dvv, c2iw);
            A0I.A00(dvv);
        }
        C1rh A0V = C2so.A0V(A0I, c2k5, A0Z, c1ro, c1rp);
        Integer num4 = 0S2.A01;
        return new DvW(A0V, r0, new ACE(num4, num4, num4), this.A06, (C00m) null);
    }
}
