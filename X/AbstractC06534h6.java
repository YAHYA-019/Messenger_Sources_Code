package X;

import android.content.Context;
import com.facebook.graphql.executor.GraphQLResult;
import com.facebook.graphql.query.GraphQlQueryParamSet;
import com.facebook.prefs.shared.FbSharedPreferences;
import com.google.common.base.Preconditions;
import com.google.common.collect.ImmutableList;
import java.util.HashMap;
import java.util.concurrent.Executor;

/* renamed from: X.4h6, reason: invalid class name and case insensitive filesystem */
/* loaded from: 4h6.class */
public abstract class AbstractC06534h6 {
    public String A00 = "";

    public Context A00() {
        return ((C06524h5) this).A00;
    }

    public ImmutableList A01() {
        return ImmutableList.of((Object) "DEFAULT_LAUNCH");
    }

    public void A02() {
        1Vd r0 = (1Vd) 1Bn.A0E(A00(), (1BY) null, 16691);
        1UD r02 = (04J) 1Bi.A03(16634);
        4hT r03 = (4hT) 1Bi.A03(49203);
        Executor executor = (Executor) 1Bi.A03(16477);
        String A00 = 4hT.A00(r03, new HashMap());
        this.A00 = A00;
        1UG A002 = 1UD.A00(r02, 1ZG.A01, "privacy_flow_trigger_event");
        if (A002.isSampled()) {
            A002.A5c(EnumC07184j2.CLIENT_SEND_REQUEST, "trigger_event");
            A002.A7R("extra_data_json", A00);
            A002.BZL();
        }
        GraphQlQueryParamSet graphQlQueryParamSet = new GraphQlQueryParamSet();
        ImmutableList A01 = A01();
        graphQlQueryParamSet.A06("supported_behaviors", A01);
        boolean z = false;
        if (A01 != null) {
            z = true;
        }
        graphQlQueryParamSet.A05("extra_data_json", this.A00);
        Preconditions.checkArgument(z);
        2Jf r04 = new 2Jf(2JX.class, (Class) null, "FBPrivacyFlowTriggerQuery", (String) null, "fbandroid", 1152296901, 0, 1287805361L, 1287805361L, false, true);
        r04.A00 = graphQlQueryParamSet;
        C3sa A003 = C3sa.A00(r04);
        ((C3sb) A003).A03 = 0L;
        A003.A0B = false;
        A003.A05 = new 1iF(1883795328438252L);
        1Kd.A0F(new Fvu(r02, this, 4), r0.A09(A003), executor);
    }

    public void A03(GraphQLResult graphQLResult) {
        Object obj;
        2JY A0L;
        C06524h5 c06524h5 = (C06524h5) this;
        1G1 r0 = c06524h5.A01;
        if (r0 == null || !r0.A07) {
            C08494n5 c08494n5 = (C08494n5) 1Bn.A0A(49254);
            C7z6 c7z6 = (graphQLResult == null || (obj = ((AbstractC08294mh) graphQLResult).A03) == null || (A0L = ((2JY) obj).A0L(-816631278, 2JX.class, -1624701692)) == null) ? null : (C7z6) A0L.A0L(1034957566, 7ZO.class, -978886642);
            c08494n5.A02(c7z6, ((AbstractC06534h6) c06524h5).A00);
            if (c7z6 == null || !c7z6.BNg()) {
                return;
            }
            int BHH = c7z6.BHH();
            String str = r0.A02;
            1G2 A0D = AbstractC06454gx.A02.A0D(str);
            1G2 A0D2 = AbstractC06454gx.A01.A0D(str);
            1Ql edit = ((FbSharedPreferences) c06524h5.A03.get()).edit();
            edit.CaE(A0D, BHH);
            edit.CaH(A0D2, ((C0dp) c06524h5.A02.get()).now());
            edit.commit();
        }
    }
}
