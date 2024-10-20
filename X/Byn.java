package X;

import android.content.Context;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.inject.FbInjector;

/* loaded from: Byn.class */
public final class Byn {
    public final FbUserSession A00;
    public final 1I7 A01;
    public final C01s A02;
    public final 1GS A03;
    public final Bzq A04;
    public final CMX A05;
    public final C11614x0 A06;
    public final 2TT A07;
    public final C1676Api A08;
    public final C1675Aph A09;
    public final BR6 A0A;
    public final 1Rl A0B;
    public final C0dp A0C;
    public final 3qL A0D;

    public Byn(FbUserSession fbUserSession) {
        this.A00 = fbUserSession;
        C0dp A0B = AbI.A0B();
        2TT r0 = (2TT) 1Bn.A0E((Context) null, (1BY) null, 17026);
        CMX cmx = (CMX) 1Bi.A03(84837);
        C1676Api c1676Api = (C1676Api) 1Bn.A0E((Context) null, (1BY) null, 84797);
        C1675Aph c1675Aph = (C1675Aph) 1Bn.A0E((Context) null, (1BY) null, 84799);
        1I7 r02 = (1I7) 1Hv.A02(FbInjector.A00(), 65728);
        1Rl A0I = AbJ.A0I();
        1GS r03 = (1GS) 1Bi.A03(16504);
        C11614x0 c11614x0 = (C11614x0) 1Bi.A03(49370);
        C01s A0I2 = 1BL.A0I();
        BR6 br6 = (BR6) 1Bn.A0E((Context) null, (1BY) null, 82048);
        3qL r04 = (3qL) 1Bn.A0E((Context) null, (1BY) null, 32774);
        Bzq bzq = (Bzq) 1Lo.A04((Context) null, fbUserSession, (1BY) null, 84872);
        this.A0C = A0B;
        this.A04 = bzq;
        this.A07 = r0;
        this.A05 = cmx;
        this.A08 = c1676Api;
        this.A09 = c1675Aph;
        this.A01 = r02;
        this.A0B = A0I;
        this.A03 = r03;
        this.A06 = c11614x0;
        this.A02 = A0I2;
        this.A0A = br6;
        this.A0D = r04;
    }
}
