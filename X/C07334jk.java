package X;

import android.content.Context;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.graphql.query.GraphQlQueryParamSet;
import com.facebook.zero.zerobalance.ping.ZeroBalancePingController;
import java.util.Collections;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;

/* renamed from: X.4jk, reason: invalid class name and case insensitive filesystem */
/* loaded from: 4jk.class */
public final class C07334jk {
    public final C00i A01 = new 1BQ(33013);
    public final C00i A00 = new 1BQ(16511);
    public final C00i A03 = new 1BQ(16449);
    public final Set A02 = Collections.newSetFromMap(new ConcurrentHashMap());

    public static void A00(C07334jk c07334jk) {
        Iterator it = c07334jk.A02.iterator();
        while (it.hasNext()) {
            ((ZeroBalancePingController) ((C07324jj) it.next()).A0A.get()).A04(JQw.A00(78));
        }
    }

    public void A01(Context context, FbUserSession fbUserSession, Integer num) {
        GraphQlQueryParamSet graphQlQueryParamSet = new GraphQlQueryParamSet();
        2Jf r0 = new 2Jf(2JX.class, (Class) null, "FetchZeroBalanceConfigsQuery", (String) null, "fbandroid", -1298108437, 0, 2830716720L, 2830716720L, false, true);
        r0.A00 = graphQlQueryParamSet;
        C3sa A00 = C3sa.A00(r0);
        ((C3sb) A00).A03 = 0L;
        A00.A0B = false;
        AbstractC05414dq A0A = 1VX.A0A(context, fbUserSession);
        A00.A05 = new 1iF(453586272481763L);
        1Kd.A0F(new 8HJ(this, num, 4), A0A.A03(A00), (Executor) this.A03.get());
    }
}
