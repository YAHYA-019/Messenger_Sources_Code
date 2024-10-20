package X;

import android.content.Context;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.inject.FbInjector;
import com.google.common.collect.ImmutableList;
import java.util.concurrent.ScheduledExecutorService;

/* loaded from: C4y.class */
public final class C4y {
    public 1BY A00;
    public final C00i A04 = 1BQ.A02(84491);
    public final C00i A03 = 1BQ.A02(16461);
    public final C00i A02 = 1BQ.A01();
    public final C00i A01 = 7zN.A0D(84752);

    public C4y(1BO r302) {
        this.A00 = 7zL.A0Q(r302);
    }

    public Cf4 A00(DF9 df9, long j) {
        FbUserSession A05 = 1Fw.A05(this.A00);
        C1F6 A0P = AbF.A0P(this.A01);
        Long valueOf = Long.valueOf(j);
        Context A01 = FbInjector.A01();
        AbL.A0y(A0P);
        try {
            AoE aoE = new AoE(A05, df9, valueOf);
            1Bn.A0K();
            FbInjector.A04(A01);
            BbS bbS = new BbS(AbG.A0z(ImmutableList.builder(), new BoE(aoE, CCu.A02, true)));
            return new Cf4(1BK.A09(this.A02), (C0dp) this.A04.get(), bbS, (ScheduledExecutorService) this.A03.get());
        } catch (Throwable th) {
            1Bn.A0K();
            FbInjector.A04(A01);
            throw th;
        }
    }
}
