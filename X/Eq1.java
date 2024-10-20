package X;

import com.facebook.auth.usersession.FbUserSession;
import com.facebook.msys.mca.MailboxCallback;

/* loaded from: Eq1.class */
public final class Eq1 {
    public Edy A00;
    public boolean A01;
    public final 1Br A02;
    public final 1Br A03;
    public final Gs9 A04;
    public final MailboxCallback A05;
    public final 1De A06;

    public Eq1(FbUserSession fbUserSession, 1De r303) {
        11T.A0F(fbUserSession, 2);
        this.A06 = r303;
        1BY r0 = r303.A00;
        this.A03 = 1Bu.A03(r0, 99795);
        this.A02 = 1Lm.A03(fbUserSession, r0, 16686);
        this.A05 = new FkL(this, 1);
        this.A04 = new Gs9(this);
    }
}
