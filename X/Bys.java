package X;

import android.content.Context;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.inject.FbInjector;
import java.util.concurrent.ExecutorService;

/* loaded from: Bys.class */
public final class Bys {
    public final Context A00;
    public final FbUserSession A01;
    public final 1Br A02;
    public final 1Br A03;
    public final 1Br A04;
    public final 1Br A05;
    public final 1Br A06;
    public final 1Br A07;
    public final 1Br A08;
    public final 1Br A09;
    public final 1Br A0A;
    public final 5oU A0B;
    public final ExecutorService A0C;
    public final 1BP A0D;

    public Bys(Context context, FbUserSession fbUserSession) {
        11T.A0F(context, 1);
        this.A00 = context;
        this.A01 = fbUserSession;
        this.A05 = 1Lm.A00(context, fbUserSession, 65962);
        this.A06 = 1Lm.A00(context, fbUserSession, 65961);
        this.A0D = FbInjector.A00;
        this.A0C = (ExecutorService) 1Bi.A03(16477);
        this.A07 = 1Lm.A00(context, fbUserSession, 84173);
        this.A0B = (5oU) 1Bn.A0A(66684);
        this.A03 = 1Bu.A00(66137);
        this.A0A = 1Bq.A00(66136);
        this.A02 = AbG.A0M();
        this.A09 = 1Bq.A00(68077);
        this.A04 = 1Bu.A00(68925);
        this.A08 = 1BK.A0C();
    }
}
