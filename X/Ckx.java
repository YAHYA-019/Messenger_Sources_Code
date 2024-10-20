package X;

import android.content.Context;
import com.facebook.common.callercontext.CallerContextable;

/* loaded from: Ckx.class */
public final class Ckx implements DF9, CallerContextable {
    public static final String __redex_internal_original_name = "ThreadWhitelistAudienceFetcher";
    public 1BY A00;
    public final C00i A01 = 1BV.A01((1BY) null, 83719);
    public final CQ3 A03 = (CQ3) 1Bi.A03(84374);
    public final Cb9 A05 = (Cb9) 1Bn.A0E((Context) null, (1BY) null, 83056);
    public final C00i A02 = AbH.A0L();
    public final DGy A04 = new Ckz(this);

    public Ckx(1BO r302) {
        this.A00 = 7zL.A0Q(r302);
    }

    @Override // X.DF9
    public 2eH AS7(String str, long j) {
        AbJ.A1P(this.A00);
        return this.A05.A00(this.A04, str, j);
    }
}
