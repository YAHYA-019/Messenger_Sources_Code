package X;

import com.facebook.auth.usersession.FbUserSession;

/* loaded from: Gpa.class */
public final class Gpa extends HFi {
    public boolean A00;
    public final FbUserSession A01;
    public final 1Br A02;
    public final 1Br A03;
    public final 1Br A04;
    public final 1Br A05;
    public final 1De A06;

    public Gpa(FbUserSession fbUserSession, 1De r303) {
        11T.A0F(fbUserSession, 2);
        this.A06 = r303;
        this.A01 = fbUserSession;
        1BY r0 = r303.A00;
        this.A05 = 1Bu.A03(r0, 115285);
        this.A04 = GOn.A0i(fbUserSession, r0);
        this.A03 = 1Lm.A03(fbUserSession, r0, 100047);
        this.A02 = GOn.A0h(fbUserSession, r0);
    }
}
