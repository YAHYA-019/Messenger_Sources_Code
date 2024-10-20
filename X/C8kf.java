package X;

import com.facebook.mig.scheme.interfaces.MigColorScheme;
import com.google.common.collect.ImmutableList;

/* renamed from: X.8kf, reason: invalid class name */
/* loaded from: 8kf.class */
public final class C8kf extends C1rj {
    public int A00;
    public int A01;
    public RGE A02;
    public MigColorScheme A03;
    public ImmutableList A04;
    public CharSequence A05;
    public boolean A06;

    public C8kf() {
        super("SearchInChatMessagesNavigationHeader");
        this.A06 = true;
    }

    public final Object[] A0k() {
        return new Object[]{this.A04, this.A03, Integer.valueOf(this.A00), Boolean.valueOf(this.A06), this.A02, this.A05, Integer.valueOf(this.A01)};
    }

    @Override // X.C1rj
    public 1LI A0y(1Iw r302) {
        MigColorScheme migColorScheme = this.A03;
        CharSequence charSequence = this.A05;
        int i = this.A00;
        int i2 = this.A01;
        RGE rge = this.A02;
        ImmutableList immutableList = this.A04;
        boolean z = this.A06;
        C83r A00 = C5yy.A00(r302);
        C5yy c5yy = A00.A01;
        c5yy.A0H = false;
        A00.A2N(true);
        A00.A2Y(migColorScheme);
        c5yy.A0E = z;
        C1rq A0P = 7zN.A0P(r302, 0);
        2KD A0Y = 7zN.A0Y(r302, false);
        A0Y.A2l();
        A0Y.A2b();
        A0Y.A2z(charSequence);
        A0Y.A2x(migColorScheme);
        A0Y.A2q(1);
        A0Y.A2Z();
        7zN.A1D(A0Y, r302, C8kf.class, "SearchInChatMessagesNavigationHeader", -23680578);
        7zO.A1K(A0Y, 2RH.A04);
        A0Y.A17(-1.0f);
        A0Y.A0Q();
        A0P.A2e(A0Y);
        2KD A0Y2 = 7zN.A0Y(r302, false);
        int i3 = i + 1;
        if (i2 == 0) {
            i3 = 0;
        }
        A0Y2.A2z(0Pz.A0B(i3, i2, "/"));
        A0Y2.A2l();
        A0Y2.A2c();
        A0Y2.A2S(4YU.A0E(r302).getString(2131959876, AnonymousClass001.A1b(Integer.valueOf(i3), i2)));
        A0Y2.A2Q(true);
        A0Y2.A2x(migColorScheme);
        A0Y2.A0S();
        7zO.A1L(A0Y2, 2RH.A05);
        A00.A2X(7zL.A0c(A0Y2, A0P));
        c5yy.A08 = 2MG.A02;
        C9zj.A03(A00, rge, 92);
        A00.A2b(immutableList);
        return A00.A2V();
    }

    @Override // X.C1rj
    public Object A15(1Im r302, Object obj) {
        RGE rge;
        int i = r302.A01;
        if (i == -1048037474) {
            1LI.A0J(r302, obj);
            return null;
        }
        if (i != -23680578 || (rge = ((C8kf) r302.A00.A01).A02) == null) {
            return null;
        }
        6Jk.A08(rge.A00, false);
        return null;
    }
}
