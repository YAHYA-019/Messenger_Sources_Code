package X;

import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.mig.scheme.interfaces.MigColorScheme;

/* renamed from: X.8cx, reason: invalid class name */
/* loaded from: 8cx.class */
public final class C8cx extends 1LH {
    public final 06Z A00;
    public final FbUserSession A01;
    public final C65b A02;
    public final AnonymousClass622 A03;
    public final MigColorScheme A04;
    public final String A05;
    public final String A06;

    public C8cx(06Z r302, FbUserSession fbUserSession, C65b c65b, AnonymousClass622 anonymousClass622, MigColorScheme migColorScheme, String str, String str2) {
        this.A01 = fbUserSession;
        this.A06 = str;
        this.A02 = c65b;
        this.A03 = anonymousClass622;
        this.A00 = r302;
        this.A05 = str2;
        this.A04 = migColorScheme;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r315v4, types: [android.text.SpannableStringBuilder] */
    public 1LI A0s(C2k5 c2k5) {
        String str;
        11T.A0F(c2k5, 0);
        C65b c65b = this.A02;
        boolean z = c65b.isForSelfMessage;
        C1rp c1rp = z ? C1rp.FLEX_END : C1rp.FLEX_START;
        2lQ r0 = 2lO.A02;
        long A08 = z ? 7zP.A08() : 3yH.A06(c2k5, 2132279328);
        2lO A0L = 4YV.A0L(4YV.A0K(7zT.A0b((2lO) null, 7zL.A0i(0S2.A07, A08), 3yH.A03(c2k5)), 0S2.A09, c65b.isForSelfMessage ? 7zM.A08(c2k5) : 7zP.A08()), 0S2.A1G, 83U.A01(c2k5, this, 38), 1);
        C2sn A0L2 = 7zR.A0L(c2k5);
        String str2 = this.A05;
        if (str2 != null) {
            MigColorScheme migColorScheme = (MigColorScheme) 7zQ.A12(A0L2.A00, 16979);
            String str3 = this.A06;
            ?? append = new SpannableStringBuilder(str3).append((CharSequence) 0Pz.A0K(str2, ' '));
            StyleSpan styleSpan = new StyleSpan(1);
            int length = str3.length();
            append.setSpan(styleSpan, length, append.length(), 33);
            7zN.A10((SpannableStringBuilder) append, new ForegroundColorSpan(migColorScheme.AZc()), length);
            str = append;
        } else {
            str = this.A06;
        }
        2KD A0r = 7zL.A0r(A0L2, 0);
        A0r.A2i();
        A0r.A2c();
        A0r.A2x(this.A04);
        A0r.A2z(str);
        A0r.A2v(2K4.A03);
        7zN.A1Q(A0L2, A0r);
        return C2so.A0W(A0L2, c2k5, A0L, c1rp);
    }
}
