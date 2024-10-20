package X;

import com.facebook.mig.scheme.interfaces.MigColorScheme;

/* renamed from: X.8ap, reason: invalid class name */
/* loaded from: 8ap.class */
public final class C8ap extends 1LH {
    public final C2629Gje A00;
    public final 8KR A01;
    public final 9Is A02;
    public final C9It A03;
    public final MigColorScheme A04;

    public C8ap(C2629Gje c2629Gje, 8KR r303, 9Is r304, C9It c9It, MigColorScheme migColorScheme) {
        7zT.A1W(c2629Gje, c9It, r304, r303);
        this.A00 = c2629Gje;
        this.A03 = c9It;
        this.A02 = r304;
        this.A01 = r303;
        this.A04 = migColorScheme;
    }

    public 1LI A0s(C2k5 c2k5) {
        C2sn A0I;
        8iI r305;
        boolean A1W = 7zL.A1W(c2k5);
        C1ro c1ro = C1ro.CENTER;
        Integer num = 0S2.A00;
        2lO A0h = 7zS.A0h(num, c1ro, A1W ? 1 : 0);
        MigColorScheme migColorScheme = this.A04;
        2lO A0T = 7zT.A0T(A0h, 7zS.A0o(num, migColorScheme.BDl()));
        if (this.A00.A02) {
            A0I = 7zQ.A0U(c2k5.AeS());
            C5yw A00 = C5yv.A00(A0I.AeS());
            A00.A2a(2131956529);
            A00.A2b(migColorScheme);
            A00.A2i(false);
            C9zj.A04(A00, this, 64);
            A00.A2Y();
            7zM.A1W(migColorScheme, A00);
            A0I.A00(A00.A2V());
            C2sn A0K = 7zS.A0K(A0I);
            C2sn A0J = 7zS.A0J(A0K);
            8Tj A0q = 7zL.A0q(A0J);
            A0q.A2X(25.0f);
            A0q.A2Y(migColorScheme.AZc());
            8Tj.A07(A0J, A0q, migColorScheme);
            7zU.A1G(A0J, A0K, (2lO) null);
            r305 = C2so.A06(A0K, A0I, A0T);
        } else {
            A0I = 7zS.A0I(c2k5);
            C5yw A002 = C5yv.A00(A0I.AeS());
            A002.A2a(2131956529);
            A002.A2b(migColorScheme);
            A002.A2i(false);
            C9zj.A04(A002, this, 64);
            A002.A2Y();
            7zM.A1W(migColorScheme, A002);
            A0I.A00(A002.A2V());
            r305 = new 8iI(this.A01, this.A02, migColorScheme);
        }
        return 7zM.A0l(r305, A0I, c2k5, A0T);
    }
}
