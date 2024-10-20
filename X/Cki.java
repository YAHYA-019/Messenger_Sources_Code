package X;

import com.facebook.auth.usersession.FbUserSession;
import com.facebook.graphql.calls.GraphQlCallInput;
import com.facebook.graphql.query.GraphQlQueryParamSet;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.messaging.model.threads.ThreadSummary;
import com.google.common.util.concurrent.ListenableFuture;

/* loaded from: Cki.class */
public final class Cki implements DGs {
    public final /* synthetic */ FbUserSession A00;
    public final /* synthetic */ DGs A01;
    public final /* synthetic */ COo A02;
    public final /* synthetic */ RYg A03;

    public Cki(FbUserSession fbUserSession, DGs dGs, COo cOo, RYg rYg) {
        this.A02 = cOo;
        this.A00 = fbUserSession;
        this.A03 = rYg;
        this.A01 = dGs;
    }

    @Override // X.DGs
    public void BxT(Throwable th) {
        DGs dGs = this.A01;
        if (dGs != null) {
            dGs.BxT(th);
        }
    }

    @Override // X.DGs
    public void CL4(ThreadSummary threadSummary) {
        Bpc bpc = this.A02.A05;
        FbUserSession fbUserSession = this.A00;
        RYg rYg = this.A03;
        ThreadKey threadKey = rYg.A01;
        if (threadKey != null) {
            07S A0J = 4YU.A0J(GraphQlCallInput.A02, 1BK.A0w(threadKey), "thread_fbid");
            07S.A00(A0J, Integer.valueOf((int) rYg.A00), "mute_until");
            String str = rYg.A02;
            if (str != null && str.length() != 0) {
                07S.A00(A0J, str, "game_id");
            }
            GraphQlQueryParamSet A0M = 7zL.A0M();
            4YV.A1A(A0J, A0M, "data");
            ListenableFuture A0z = AbK.A0z(1VX.A05(bpc.A00, fbUserSession), AbO.A09(A0M, new C01643sd(AqP.class, "GamesPushNotificationSettingsMutation", null, "data", "fbandroid", -616809883, 384, 272672002L, 272672002L, false, true)), 184570512895732L);
            1Br.A0D(bpc.A01, new LfI(5), A0z);
        }
        DGs dGs = this.A01;
        if (dGs != null) {
            dGs.CL4(threadSummary);
        }
    }
}
