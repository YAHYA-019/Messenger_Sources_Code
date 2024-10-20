package X;

import android.content.Context;
import com.facebook.auth.usersession.FbUserSession;
import java.util.concurrent.ScheduledExecutorService;

/* loaded from: Eqd.class */
public final class Eqd {
    public final EzC A00;
    public final 1Br A01;
    public final 1Br A02;
    public final 1Br A03;
    public final 1Br A04;
    public final 1Br A05;
    public final 1Br A06;
    public final FbUserSession A07;
    public final 1De A08;
    public Euq flmEffectsDeletionManager;

    public Eqd(FbUserSession fbUserSession, 1De r303) {
        11T.A0F(fbUserSession, 2);
        this.A08 = r303;
        this.A07 = fbUserSession;
        1BY r0 = r303.A00;
        this.A05 = 1Bu.A03(r0, 68126);
        this.A06 = 1Bq.A00(16462);
        this.A02 = 1Bu.A03(r0, 98883);
        this.A04 = 1Lm.A03(fbUserSession, r0, 100286);
        this.A03 = 1Lm.A03(fbUserSession, r0, 116135);
        this.A01 = AbG.A0M();
        Erc erc = new Erc((4fF) 1Br.A0B(this.A05));
        boolean AZk = ((C2051Daa) 1Br.A0B(this.A02)).A01.AZk(2342162343590377344L);
        EzC ezC = new EzC(erc, (ScheduledExecutorService) 1Br.A0B(this.A06), AZk);
        this.A00 = ezC;
        if (AZk) {
            F48 f48 = (F48) 1Br.A0B(this.A04);
            1Vd A00 = ((DKN) 1Bn.A0E((Context) null, r0, 68643)).A00();
            11T.A0A(A00);
            this.flmEffectsDeletionManager = new Euq(ezC, ((I3X) 1Br.A0B(this.A03)).A01(), f48, 1Br.A04(this.A01), A00);
        }
    }
}
