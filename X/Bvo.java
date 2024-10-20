package X;

import com.facebook.auth.usersession.FbUserSession;
import com.facebook.inject.FbInjector;

/* loaded from: Bvo.class */
public final class Bvo {
    public final 1Br A00;
    public final 1Br A01;
    public final 1Br A02;
    public final C1yc A03;
    public final 1BP A04;
    public final 1De A05;

    public Bvo(FbUserSession fbUserSession, 1De r303) {
        11T.A0F(fbUserSession, 2);
        this.A05 = r303;
        this.A04 = FbInjector.A00;
        this.A01 = AbG.A0Q();
        1BY r0 = r303.A00;
        this.A00 = 1Lm.A03(fbUserSession, r0, 67394);
        1Br A03 = 1Lm.A03(fbUserSession, r0, 16886);
        this.A02 = A03;
        C1yc A00 = ((C1ya) 1Br.A0B(A03)).A00(0);
        11T.A0A(A00);
        this.A03 = A00;
    }
}
