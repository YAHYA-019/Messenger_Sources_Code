package X;

import android.content.Context;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.inject.FbInjector;

/* loaded from: I0U.class */
public final class I0U {
    public JZj A00;
    public String[] A01;
    public final 1EZ A02;
    public final 1De A03;
    public final 1Br A04;
    public final 1Br A05;
    public final 1Br A06;
    public final 1Br A07;
    public final 1Br A08;
    public final 1Br A09;
    public final 1Br A0A;
    public final 1Br A0B;
    public final 1Br A0C;
    public final 1Br A0D;
    public final 1Br A0E;
    public final 2Qn A0F;
    public final 1BP A0G;

    public I0U(1De r302) {
        this.A03 = r302;
        1BY r0 = r302.A00;
        this.A02 = (1EZ) 1Bn.A0E((Context) null, r0, 16428);
        this.A0B = 1Bq.A00(83598);
        this.A04 = 1Bq.A00(49736);
        this.A05 = 1Bu.A03(r0, 99983);
        this.A06 = 1Bu.A03(r0, 115471);
        this.A0A = 1Bu.A03(r0, 16453);
        this.A08 = 1Bu.A03(r0, 68120);
        this.A09 = 1Bu.A03(r0, 85086);
        this.A0C = 1Bu.A03(r0, 67527);
        this.A0D = 1Bu.A03(r0, 16980);
        this.A0G = FbInjector.A00;
        this.A0E = GOq.A0W();
        this.A07 = 1Bu.A03(r0, 114832);
        this.A0F = IYv.A00(this, 1);
        this.A01 = new String[0];
    }

    public static final void A00(FbUserSession fbUserSession, I0U i0u) {
        i0u.A00 = null;
        ((2Qa) 4YU.A0n(fbUserSession, i0u.A03, 33089)).A03(i0u.A0F);
    }
}
