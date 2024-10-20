package X;

import com.facebook.auth.usersession.FbUserSession;
import com.google.common.collect.ImmutableList;
import java.util.Set;
import java.util.concurrent.Future;

/* loaded from: I2x.class */
public final class I2x {
    public int A00;
    public ImmutableList A01;
    public ImmutableList A02;
    public Future A03;
    public final C04r A04;
    public final FbUserSession A05;
    public final JI7 A06;
    public final 1Br A07;
    public final 1Br A08;
    public final 1Br A09;
    public final 1Br A0A;
    public final 1Br A0B;
    public final 1Br A0C;
    public final 1Br A0D;
    public final 1Br A0E;
    public final 1Br A0F;
    public final 1Br A0G;
    public final 1Br A0H;
    public final 1Br A0I;
    public final 2JM A0J;
    public final 2Qe A0K;
    public final 2QY A0L;
    public final Set A0M;
    public final 1De A0N;

    /* JADX WARN: Type inference failed for: r0v54, types: [X.0QO, X.04r] */
    public I2x(FbUserSession fbUserSession, 1De r303) {
        11T.A0F(fbUserSession, 2);
        this.A0N = r303;
        this.A05 = fbUserSession;
        1BY r0 = r303.A00;
        this.A0F = 1Bu.A03(r0, 114889);
        this.A0A = 1Bu.A03(r0, 99980);
        this.A0B = 1Lm.A03(fbUserSession, r0, 98491);
        this.A0E = 1Lm.A03(fbUserSession, r0, 114790);
        this.A09 = GOn.A0k(fbUserSession, r0);
        this.A0G = GOn.A0j(fbUserSession, r0);
        this.A07 = GOn.A0g(fbUserSession, r0);
        this.A08 = AbG.A0J();
        this.A0H = 7zM.A0P();
        this.A0I = 1Lm.A03(fbUserSession, r0, 114831);
        this.A0C = 1Bu.A03(r0, 114909);
        this.A0D = 1Bu.A03(r0, 114745);
        this.A0L = Gys.A00(this, 0);
        this.A0J = IY8.A01(this, 0);
        this.A0K = new Gyx(this, 0);
        this.A06 = new C2525Gg9(this, 0);
        this.A0M = GOn.A1J();
        this.A04 = new 0QO(0);
    }

    public static final void A00(I2x i2x, ImmutableList immutableList) {
        if (!((53C) 1Br.A0B(i2x.A0D)).A01(false) && (immutableList == null || !immutableList.isEmpty())) {
            i2x.A01 = ImmutableList.of();
            4YV.A11(i2x.A0H).execute(new IpK(i2x));
            return;
        }
        Future future = i2x.A03;
        if (future == null || future.isDone()) {
            i2x.A03 = GOp.A1G(i2x.A08).submit(new Ivl(i2x, immutableList));
        }
    }

    public void A01() {
        IPz iPz = (IPz) 1Br.A0B(this.A0I);
        JI7 ji7 = this.A06;
        11T.A0F(ji7, 0);
        iPz.A0X.remove(ji7);
        GOp.A0s(this.A0G).A0k(this.A0K);
        GOp.A0O(this.A07).A02(this.A0J);
        GOp.A0u(this.A09).CeZ(this.A0L);
    }
}
