package X;

import android.content.Context;
import com.facebook.graphql.query.GraphQlQueryParamSet;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: Ev1.class */
public final class Ev1 {
    public final C00i A03 = 1BQ.A02(32817);
    public final C00i A02 = DKD.A0N();
    public final C00i A01 = DKD.A0R();
    public final C00i A04 = DKF.A0M();
    public AtomicBoolean A00 = 7zO.A15();

    public void A00(Context context, Ejo ejo, String str) {
        if (this.A00.getAndSet(true)) {
            return;
        }
        DKG.A1D(context);
        GraphQlQueryParamSet A0M = 7zL.A0M();
        A0M.A05("feature", str);
        DKD.A1H(A0M, (C3t8) this.A03.get());
        2Jf r0 = new 2Jf(2JX.class, (Class) null, "FetchOlympusFbTransitionNuxQuery", (String) null, "fbandroid", -1427263140, 0, 3191516647L, 3191516647L, false, true);
        DKF.A1Q(A0M, r0);
        C3sa A00 = C3sa.A00(r0);
        1Vd A002 = ((DKN) 1Bn.A0E(context, (1BY) null, 68643)).A00();
        4YU.A1J(A00, 453586272481763L);
        1Kd.A0F(new Fw6(context, this, ejo, str, 2), A002.A09(A00), (Executor) 1Bi.A03(16467));
    }
}
