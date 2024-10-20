package X;

import com.facebook.auth.usersession.FbUserSession;

/* renamed from: X.5cc, reason: invalid class name */
/* loaded from: 5cc.class */
public final class C5cc {
    public final FbUserSession A00;
    public final 1Br A01;
    public final 1Br A02;
    public final 1Br A03;
    public final 1Br A04;
    public final 1Br A05;
    public final 1G9 A06;
    public final 1G9 A07;
    public final 1De A08;
    public final 1Br A09;

    public C5cc(FbUserSession fbUserSession, 1De r303) {
        11T.A0F(fbUserSession, 2);
        this.A08 = r303;
        this.A00 = fbUserSession;
        this.A02 = 1Bq.A00(33013);
        this.A01 = 1Bq.A00(66417);
        this.A04 = 1Bq.A00(6);
        1BY r0 = r303.A00;
        this.A03 = 1Lm.A03(fbUserSession, r0, 68338);
        this.A05 = 1Bu.A03(r0, 65920);
        this.A09 = 1Bu.A03(r0, 17010);
        1G2 r02 = 1NK.A05;
        String str = ((1G1) fbUserSession).A02;
        this.A07 = AbstractC03303xn.A0C(str);
        this.A06 = 1G9.A05(1NK.A4J.A0F("nux_displayed"), str);
    }
}
