package X;

import android.content.res.Resources;
import com.facebook.mig.scheme.interfaces.MigColorScheme;

/* renamed from: X.9iQ, reason: invalid class name */
/* loaded from: 9iQ.class */
public abstract class C9iQ {
    public static final AnonymousClass544 A00(1Iw r301, C5ww c5ww, MigColorScheme migColorScheme) {
        4YV.A1N(r301, migColorScheme);
        Resources A0E = 4YU.A0E(r301);
        String A0t = 4YU.A0t(A0E, 2131965239);
        String string = A0E.getString(2131965240);
        C1u3 c1u3 = C1u3.A1a;
        C1u4 c1u4 = C1u4.SIZE_32;
        C1ut c1ut = C1ut.A0B;
        7zP.A1S(c1u3, c1u4, c1ut);
        return A02(c5ww, new 5AM(c1u3, c1u4, c1ut, migColorScheme, (CharSequence) null), migColorScheme, A0t, string, null);
    }

    public static final AnonymousClass544 A01(1Iw r301, C5ww c5ww, MigColorScheme migColorScheme) {
        4YV.A1N(r301, migColorScheme);
        Resources A0E = 4YU.A0E(r301);
        String A0t = 4YU.A0t(A0E, 2131965241);
        String string = A0E.getString(2131965242);
        C1u3 c1u3 = C1u3.A1a;
        C1u4 c1u4 = C1u4.SIZE_32;
        C1ut c1ut = C1ut.A0B;
        7zP.A1S(c1u3, c1u4, c1ut);
        return A02(c5ww, new 5AM(c1u3, c1u4, c1ut, migColorScheme, (CharSequence) null), migColorScheme, A0t, string, null);
    }

    public static final AnonymousClass544 A02(C5ww c5ww, AnonymousClass555 anonymousClass555, MigColorScheme migColorScheme, String str, String str2, String str3) {
        11T.A0F(migColorScheme, 5);
        AnonymousClass557 A0p = 7zL.A0p();
        A0p.A08(str);
        A0p.A04 = CJh.A00(str2);
        A0p.A0A = str3;
        A0p.A01 = c5ww;
        A0p.A05(migColorScheme);
        if (anonymousClass555 != null) {
            7zN.A1W(A0p, anonymousClass555);
        }
        AnonymousClass544 A00 = A0p.A00();
        11T.A0A(A00);
        return A00;
    }
}
