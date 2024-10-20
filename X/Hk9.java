package X;

import com.facebook.auth.usersession.FbUserSession;
import com.facebook.inject.FbInjector;

/* loaded from: Hk9.class */
public final class Hk9 {
    public 1Gz A00;
    public String A01;
    public boolean A02;
    public final FbUserSession A03;
    public final 1Br A04;
    public final 1Br A05;
    public final 1Br A06;
    public final 1Br A07;
    public final 1Br A08;
    public final C02l A09;
    public final 1BP A0A;
    public final 1De A0B;

    public Hk9(FbUserSession fbUserSession, 1De r303) {
        11T.A0F(fbUserSession, 2);
        this.A0B = r303;
        this.A03 = fbUserSession;
        1BY r0 = r303.A00;
        this.A06 = 1Bu.A03(r0, 82592);
        this.A04 = 1Bu.A03(r0, 98416);
        this.A0A = FbInjector.A00;
        this.A08 = GOq.A0W();
        this.A07 = 1Bu.A03(r0, 85151);
        this.A05 = 1Lm.A03(fbUserSession, r0, 98491);
        this.A09 = new IgR(this, 11);
    }
}
