package X;

import com.facebook.auth.usersession.FbUserSession;

/* loaded from: Hq9.class */
public final class Hq9 {
    public boolean A00;
    public boolean A01;
    public final 1Br A02;
    public final 1Br A03;
    public final 1Br A04;
    public final FbUserSession A05;
    public final 1De A06;

    public Hq9(FbUserSession fbUserSession, 1De r303) {
        11T.A0F(fbUserSession, 2);
        this.A06 = r303;
        this.A05 = fbUserSession;
        1BY r0 = r303.A00;
        this.A02 = 1Bu.A03(r0, 83955);
        this.A04 = GOn.A0i(fbUserSession, r0);
        this.A03 = 1BK.A0C();
    }

    public final boolean A00() {
        boolean z;
        synchronized (this) {
            if (!this.A00) {
                this.A01 = ((C88) 1Br.A0B(this.A02)).A01(this.A05);
            }
            z = this.A01;
        }
        return z;
    }
}
