package X;

import android.content.Context;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.graphql.calls.GraphQlCallInput;
import com.facebook.graphql.query.GraphQlQueryParamSet;
import com.facebookpay.logging.FBPayLoggerData;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;

/* loaded from: F7s.class */
public final class F7s {
    public static final long A03 = TimeUnit.DAYS.toSeconds(30);
    public final Context A00;
    public final GKt A01;
    public final C15h A02;

    public F7s(Context context, GKt gKt) {
        11T.A0F(gKt, 2);
        this.A00 = context;
        this.A01 = gKt;
        this.A02 = G7K.A01(this, 23);
    }

    public final S4s A00(0R3 r302, FbUserSession fbUserSession, FBPayLoggerData fBPayLoggerData, String str, boolean z) {
        String str2;
        11T.A0F(fbUserSession, 0);
        07S A0J = 4YU.A0J(GraphQlCallInput.A02, str, "payment_type");
        07S.A00(A0J, this.A02.get(), "actor_id");
        GraphQlQueryParamSet A0N = 4YU.A0N(A0J, "fixed_client_mutation_id", "client_mutation_id");
        4YV.A1A(A0J, A0N, "input");
        C3sa A0L = 7zM.A0L(A0N, new 2Jf(Q7M.class, QQf.class, "FBFBPayAuthFlowsContentQuery", (String) null, "fbandroid", -1752997221, 0, 1687859379L, 1687859379L, false, true));
        4YV.A1B(A0L);
        long j = A03;
        A0L.A0A(j);
        if (z) {
            A0L.A09(j);
            A0L.A08(0);
            str2 = "fetch_auth_flows_cached_content_init";
        } else {
            str2 = "fetch_auth_flows_content_init";
        }
        HashMap A0u = AnonymousClass001.A0u();
        A0u.put("logger_data", fBPayLoggerData);
        A0u.put("product", str);
        this.A01.BZT(str2, A0u);
        return S4s.A00(r302, 2FP.A01(S5F.A00, 7zR.A0n(this.A00, A0L)));
    }
}
