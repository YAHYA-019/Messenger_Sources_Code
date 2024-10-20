package X;

import android.content.Context;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.graphql.query.GraphQlQueryParamSet;

/* renamed from: X.4cb, reason: invalid class name and case insensitive filesystem */
/* loaded from: 4cb.class */
public final class C04924cb implements 1Vf {
    public final Context A00;
    public final FbUserSession A01;
    public final C04934cc A02 = (C04934cc) 1Bn.A0A(49182);

    public C04924cb(Context context, FbUserSession fbUserSession) {
        this.A00 = context;
        this.A01 = fbUserSession;
    }

    public void BQC(1Q5 r302, 1Vp r303, String str) {
        11T.A0F(str, 1);
        if (!str.equals("com.facebook.xapp.messaging.events.common.lifecycle.OnVisible")) {
            throw 4YV.A0f(str);
        }
        0fH.A0l("ValueModelRankingSyncInboxHandler", "Attempt to fetch Value Model Weights");
        C04934cc c04934cc = this.A02;
        Context context = this.A00;
        1G1 r0 = this.A01;
        2kS r02 = (2kS) 1Lo.A06(r0, 66483);
        String str2 = r0.A02;
        long now = c04934cc.A00.now();
        long Av1 = 2kS.A00(r02).Av1(2kS.A09.A0F(str2), 0L);
        if (now < Av1) {
            0fH.A0d(Long.valueOf(Av1), Long.valueOf(now), "MessengerInboxTrayValueModelWeightsFetcher", "Refresh time is %d. Current time is %d. Using stored weights instead");
            return;
        }
        GraphQlQueryParamSet graphQlQueryParamSet = new GraphQlQueryParamSet();
        2Jf r03 = new 2Jf(2JX.class, (Class) null, "MessengerInboxTrayValueModelWeightsQuery", (String) null, "fbandroid", -142019031, 0, 1328207524L, 1328207524L, false, true);
        r03.A00 = graphQlQueryParamSet;
        C3sa A00 = C3sa.A00(r03);
        A00.A09(600L);
        C00s.A00();
        1Kd.A0F(new AC7(r02, c04934cc, str2, 0), 1VX.A0D(context).A09(A00), c04934cc.A01);
    }
}
