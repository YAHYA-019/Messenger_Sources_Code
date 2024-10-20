package X;

import com.facebook.auth.usersession.FbUserSession;
import java.util.concurrent.atomic.AtomicLong;

/* loaded from: L10.class */
public final class L10 {
    public final long A00;
    public final Ks4 A01;
    public final RPy A02;
    public final 1Br A03;
    public final 1Br A04;
    public final 1Br A05;
    public final 1Br A06;
    public final 1Br A07;
    public final 1Br A08;
    public final 1Br A09;
    public final String A0A;
    public final AtomicLong A0B;
    public final AtomicLong A0C;
    public final boolean A0D;
    public final boolean A0E;
    public final boolean A0F;
    public final boolean A0G;
    public final 1De A0H;
    public static final C01i A0J = C01g.A01(M2Q.A00);
    public static final C01i A0K = C01g.A01(M2R.A00);
    public static final C01i A0I = C01g.A01(M2P.A00);

    public L10(FbUserSession fbUserSession, 1De r303) {
        11T.A0F(fbUserSession, 2);
        this.A0H = r303;
        this.A02 = new RPy();
        1BY r0 = r303.A00;
        this.A07 = 1Lm.A03(fbUserSession, r0, 131127);
        this.A05 = 1Lm.A03(fbUserSession, r0, 131125);
        this.A09 = 1Bq.A00(68406);
        this.A08 = 1BK.A0C();
        1Br A0d = 7zM.A0d();
        this.A04 = A0d;
        this.A03 = 1Bq.A00(67199);
        long A00 = 1Br.A00(A0d);
        this.A00 = A00;
        this.A0B = new AtomicLong(A00);
        this.A0C = new AtomicLong(A00);
        boolean AZk = 1Br.A07(this.A08).AZk(36321877000536966L);
        this.A0E = AZk;
        this.A01 = AZk ? (Ks4) 1Lo.A09(fbUserSession, r0, 131126) : null;
        this.A0F = 1Br.A07(this.A08).AZk(36321876998177652L);
        1Br.A07(this.A08).AZk(36321876997325677L);
        this.A0D = 1Br.A07(this.A08).AZk(36321876997391214L);
        this.A0G = 1Br.A07(this.A08).AZk(36321876999488380L);
        this.A06 = 1Bq.A00(16496);
        this.A0A = 0Pz.A0W("DARTS_FEED_HEAD_LOAD_", ((1G1) fbUserSession).A05);
    }
}
