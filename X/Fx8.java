package X;

import android.content.Context;
import com.facebook.graphql.calls.GraphQlCallInput;
import com.facebook.graphql.query.GraphQlQueryParamSet;
import com.google.common.util.concurrent.SettableFuture;
import java.util.concurrent.Executor;
import org.json.JSONObject;

/* loaded from: Fx8.class */
public final class Fx8 implements GH7 {
    public final 1De A00;

    public Fx8(1De r302) {
        this.A00 = r302;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v18, types: [com.google.common.util.concurrent.ListenableFuture] */
    @Override // X.GH7
    public void AS8(ELh eLh, ExN exN, String str, java.util.Map map, Executor executor) {
        SettableFuture A0j;
        int i = 1;
        String A00 = 1BJ.A00(11);
        GraphQlCallInput A0Q = DKC.A0Q();
        A0Q.A09("app_id", str);
        A0Q.A09("bloks_versioning_id", A00);
        if (!map.isEmpty()) {
            A0Q.A09("params", 11T.A02(AnonymousClass001.A12().put("params", new JSONObject(map))));
        }
        C3t8 c3t8 = (C3t8) 1Bi.A03(32817);
        GraphQlQueryParamSet A0M = 7zL.A0M();
        A0M.A01(A0Q, "params");
        DKD.A1H(A0M, c3t8);
        2Jf r0 = new 2Jf(C2212Dh4.class, (Class) null, "FbBloksAsyncComponentsQuery", (String) null, "fbandroid", -385992091, 0, 1105030459L, 1105030459L, false, true);
        DKF.A1P(A0M, r0);
        C3sa A002 = C3sa.A00(r0);
        11T.A0D(A002);
        11T.A0I(A002, "null cannot be cast to non-null type com.facebook.graphql.executor.GraphQLRequest<com.facebook.bloks.facebook.graphql.FbBloksAsyncComponentsQueryResponse>");
        DKD.A1G(A002);
        A002.A07 = 0Pz.A0Y(A002.A07, str, '-');
        4YU.A1J(A002, 305674757130471L);
        if (eLh != ELh.A05) {
            i = 2;
        }
        ((C3sb) A002).A00 = i;
        FwL A003 = FwL.A00(exN, 1);
        1Ew r02 = (1Ew) 1Bi.A03(65755);
        1BY r03 = this.A00.A00;
        1G1 A0D = AbK.A0D(r03);
        if (!r02.BNC() || A0D.A07) {
            3XZ r04 = (3XZ) 1Bn.A0E((Context) null, r03, 116400);
            A0j = 4YU.A0j();
            3XZ.A00(r04, new FfP(A0j, 10), new FfR(A0j, 4), A002, (Executor) null);
        } else {
            A0j = ((DKN) 1Bn.A0E((Context) null, r03, 68643)).A00().A09(A002);
        }
        1Kd.A0F(A003, A0j, executor);
    }
}
