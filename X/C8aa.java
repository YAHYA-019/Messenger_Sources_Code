package X;

import android.text.InputFilter;
import com.facebook.mig.scheme.interfaces.MigColorScheme;

/* renamed from: X.8aa, reason: invalid class name */
/* loaded from: 8aa.class */
public final class C8aa extends 1LH {
    public final int A00;
    public final 1Iw A01;
    public final 1Im A02;
    public final MigColorScheme A03;
    public final String A04;

    public C8aa(1Iw r302, 1Im r303, MigColorScheme migColorScheme, String str) {
        11T.A0F(migColorScheme, 2);
        this.A01 = r302;
        this.A03 = migColorScheme;
        this.A02 = r303;
        this.A00 = 2131958881;
        this.A04 = str;
    }

    public 1LI A0s(C2k5 c2k5) {
        11T.A0F(c2k5, 0);
        C2lh A00 = C2lc.A00(c2k5, ALq.A00);
        8TS A002 = 8oX.A00(this.A01);
        AnonymousClass961 anonymousClass961 = AnonymousClass961.A02;
        8oX r0 = A002.A01;
        r0.A0I = anonymousClass961;
        A002.A2Z(this.A03);
        r0.A04 = 16385;
        A002.A2Y(new InputFilter.LengthFilter(75));
        r0.A05 = 75;
        r0.A0T = true;
        A002.A2U(true);
        A002.A21(C26z.HORIZONTAL);
        r0.A0U = true;
        A002.A2X(this.A00);
        r0.A0C = this.A02;
        A002.A1w((C2iw) A00.A02);
        r0.A0N = this.A04;
        return A002.A2W();
    }
}
