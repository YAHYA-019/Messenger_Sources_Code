package X;

import com.facebook.mig.scheme.interfaces.MigColorScheme;

/* renamed from: X.8aq, reason: invalid class name */
/* loaded from: 8aq.class */
public final class C8aq extends 1LH {
    public final C87p A00;
    public final RFU A01;
    public final MigColorScheme A02;
    public final 8Lr A03;
    public final RFT A04;

    public C8aq(C87p c87p, 8Lr r303, RFT rft, RFU rfu, MigColorScheme migColorScheme) {
        7zR.A1O(rfu, rft);
        this.A00 = c87p;
        this.A01 = rfu;
        this.A04 = rft;
        this.A03 = r303;
        this.A02 = migColorScheme;
    }

    public 1LI A0s(C2k5 c2k5) {
        boolean A1W = 7zL.A1W(c2k5);
        MigColorScheme migColorScheme = this.A02;
        2lO A0g = 7zL.A0g((2lO) null, 7zV.A0U(migColorScheme));
        C2sn A0L = 7zR.A0L(c2k5);
        1Iw AeS = A0L.AeS();
        C5yw A00 = C5yv.A00(AeS);
        A00.A2a(2131956550);
        A00.A2b(migColorScheme);
        A00.A2i(A1W);
        C9zj.A01(A0L, migColorScheme, A00, this, 65);
        C1rh c1rh = null;
        if (this.A00.A00) {
            C2sn A0U = 7zQ.A0U(AeS);
            8Tj A0q = 7zL.A0q(A0U);
            A0q.A2X(25.0f);
            8Tj.A07(A0U, A0q, migColorScheme);
            c1rh = C2so.A0M(A0U, A0L, null);
        }
        A0L.A00(c1rh);
        return 7zM.A0l(new QIE(this.A03, this.A04, migColorScheme), A0L, c2k5, A0g);
    }
}
