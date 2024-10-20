package X;

import android.content.Context;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.graphql.executor.GraphQLResult;
import com.facebook.quicklog.QuickPerformanceLogger;
import com.facebook.zero.common.ZeroToken;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* loaded from: Fsl.class */
public final class Fsl implements 2BS {
    public final /* synthetic */ GraphQLResult A00;
    public final /* synthetic */ FwH A01;

    public Fsl(GraphQLResult graphQLResult, FwH fwH) {
        this.A01 = fwH;
        this.A00 = graphQLResult;
    }

    public void ByR(1QE r302, String str, Throwable th) {
        FwH fwH = this.A01;
        F8I f8i = (F8I) fwH.A01;
        DKG.A1O(f8i.A03, this);
        ((GIl) fwH.A03).BxV();
        String A00 = F8I.A00(this.A00);
        if (A00 == null || !A00.equals("in")) {
            return;
        }
        int i = 238955355;
        if (ED7.A02((Context) fwH.A02, f8i.A02)) {
            i = 238953673;
        }
        C00i c00i = f8i.A04;
        1BK.A0U(c00i).markerPoint(i, "token_fetch_failed");
        DKE.A1O(c00i, i);
    }

    public void ByS(FbUserSession fbUserSession, ZeroToken zeroToken, 1QE r304, String str) {
        QuickPerformanceLogger A0U;
        short s;
        FwH fwH = this.A01;
        F8I f8i = (F8I) fwH.A01;
        DKG.A1O(f8i.A03, this);
        GIl gIl = (GIl) fwH.A03;
        GraphQLResult graphQLResult = this.A00;
        gIl.onSuccess(F8I.A00(graphQLResult));
        ((ScheduledExecutorService) f8i.A05.get()).schedule((Runnable) new G1E(f8i), 3, TimeUnit.SECONDS);
        String A00 = F8I.A00(graphQLResult);
        if (A00 == null || !A00.equals("in")) {
            return;
        }
        int i = 238955355;
        if (ED7.A02((Context) fwH.A02, f8i.A02)) {
            i = 238953673;
        }
        boolean equals = r304.toString().equals("DIALTONE");
        C00i c00i = f8i.A04;
        QuickPerformanceLogger A0U2 = 1BK.A0U(c00i);
        if (equals) {
            A0U2.markerPoint(i, "dialtone_token_fetched_succesfully");
            A0U = 1BK.A0U(c00i);
            s = 2;
        } else {
            A0U2.markerPoint(i, "wrong_token_fetched");
            A0U = 1BK.A0U(c00i);
            s = 3;
        }
        A0U.markerEnd(i, s);
    }
}
