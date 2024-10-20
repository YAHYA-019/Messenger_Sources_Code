package X;

import android.text.Layout;
import com.facebook.common.callercontext.CallerContext;
import com.facebook.mig.scheme.interfaces.MigColorScheme;

/* renamed from: X.8hr, reason: invalid class name */
/* loaded from: 8hr.class */
public final class C8hr extends 1LH {
    public static final CallerContext A06 = CallerContext.A0B("MigXmaThreeColumnListItemLayoutSpec");
    public final MigColorScheme A00;
    public final String A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final boolean A05;

    public C8hr(MigColorScheme migColorScheme, String str, String str2, String str3, String str4, boolean z) {
        11T.A0F(str, 1);
        this.A02 = str;
        this.A01 = str2;
        this.A03 = str3;
        this.A04 = str4;
        this.A00 = migColorScheme;
        this.A05 = z;
    }

    private final QMh A01(Layout.Alignment alignment, C2k6 c2k6, MigColorScheme migColorScheme, CharSequence charSequence, boolean z, boolean z2) {
        if (charSequence == null) {
            return null;
        }
        QFM A00 = QMh.A00(c2k6.AeS());
        A00.A2a(charSequence);
        QMh qMh = A00.A01;
        qMh.A01 = 1;
        A00.A0L();
        qMh.A02 = alignment;
        A00.A2Z(z ? 2KE.A0E : 2KE.A02);
        A00.A2X(z ? C1u7.A08 : C1u7.A0A);
        A00.A2Y(migColorScheme);
        float f = 25.0f;
        if (z2) {
            f = 40.0f;
        }
        A00.A10(f);
        A00.A0T();
        return A00.A2W();
    }

    public 1LI A0s(C2k5 c2k5) {
        boolean A1W = 7zL.A1W(c2k5);
        2lO A00 = C82m.A00(4YV.A0K((2lO) null, 0S2.A0F, 7zO.A09()), A1W ? 1 : 0);
        C2sn A0L = 7zR.A0L(c2k5);
        String str = this.A02;
        5BH A0N = 7zO.A0N(A0L);
        C07004ik A0I = 7zR.A0I();
        A0I.A03(2132213834);
        ((C07014il) A0I).A04 = 5BK.A05;
        C06984ii.A01(A0N, A0I);
        7zN.A1A(A0N, str);
        A0N.A2b(A06);
        A0N.A0z(28.0f);
        A0N.A0l(28.0f);
        A0N.A16(12.0f);
        A0N.A0L();
        7zO.A1A(A0N, A0L);
        2lO A0T = 7zT.A0T((2lO) null, 7zL.A0i(0S2.A09, 7zP.A0A()));
        C2sn A0K = 7zS.A0K(A0L);
        CharSequence charSequence = this.A01;
        MigColorScheme migColorScheme = this.A00;
        boolean z = this.A05;
        A0K.A00(A01(Layout.Alignment.ALIGN_NORMAL, A0K, migColorScheme, charSequence, z, true));
        A0K.A00(A01(Layout.Alignment.ALIGN_CENTER, A0K, migColorScheme, this.A03, z, A1W));
        A0K.A00(A01(Layout.Alignment.ALIGN_OPPOSITE, A0K, migColorScheme, this.A04, z, A1W));
        return 7zN.A0R(C2so.A0O(A0K, A0L, A0T), A0L, c2k5, A00);
    }
}
