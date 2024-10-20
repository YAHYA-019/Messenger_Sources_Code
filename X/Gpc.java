package X;

import com.facebook.auth.usersession.FbUserSession;

/* loaded from: Gpc.class */
public final class Gpc extends HFi {
    public static final long A0C = GOq.A0G();
    public boolean A00;
    public boolean A01;
    public final FbUserSession A02;
    public final 1Br A03;
    public final 1Br A04;
    public final 1Br A05;
    public final 1Br A06;
    public final 1Br A07;
    public final 1Br A08;
    public final 1Br A09;
    public final 1Br A0A;
    public final 1De A0B;

    public Gpc(FbUserSession fbUserSession, 1De r303) {
        11T.A0F(fbUserSession, 2);
        this.A0B = r303;
        this.A02 = fbUserSession;
        1BY r0 = r303.A00;
        this.A04 = 1Lm.A03(fbUserSession, r0, 99475);
        this.A06 = 1Lm.A03(fbUserSession, r0, 99471);
        this.A09 = GOn.A0g(fbUserSession, r0);
        this.A0A = GOn.A0i(fbUserSession, r0);
        this.A03 = 1Lm.A03(fbUserSession, r0, 98492);
        this.A05 = 1Bu.A03(r0, 114982);
        this.A08 = 1Bu.A03(r0, 67677);
        this.A07 = 1Bu.A03(r0, 85227);
    }
}
