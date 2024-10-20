package X;

import com.facebook.acra.constants.ActionId;
import com.facebook.graphql.query.GraphQlQueryParamSet;
import com.facebook.privacy.acs.falco.FalcoACSProvider;
import com.google.common.base.Preconditions;
import com.google.common.collect.ImmutableList;
import java.util.concurrent.ExecutorService;

/* renamed from: X.4Cb, reason: invalid class name */
/* loaded from: 4Cb.class */
public abstract class C4Cb {
    public final 1Ve A00;
    public final ExecutorService A01;

    public C4Cb(1Ve r302, ExecutorService executorService) {
        this.A01 = executorService;
        this.A00 = r302;
    }

    public C3sa A00(KSz kSz, ImmutableList immutableList) {
        GraphQlQueryParamSet graphQlQueryParamSet;
        2Jf r313;
        if (this instanceof C4Ca) {
            ImmutableList.Builder builder = ImmutableList.builder();
            1Du it = immutableList.iterator();
            while (it.hasNext()) {
                String A0i = AnonymousClass001.A0i(it);
                2Jd r0 = new 2Jd(92);
                r0.A09("issue_data", A0i);
                builder.m11011add((Object) r0);
            }
            graphQlQueryParamSet = new GraphQlQueryParamSet();
            String str = kSz.A05;
            graphQlQueryParamSet.A05("configId", str);
            boolean A1T = AnonymousClass001.A1T(str);
            graphQlQueryParamSet.A05("projectName", FalcoACSProvider.PROJECT_NAME);
            ImmutableList build = builder.build();
            graphQlQueryParamSet.A06("issueElement", build);
            boolean A1T2 = AnonymousClass001.A1T(build);
            Preconditions.checkArgument(A1T);
            Preconditions.checkArgument(A1T2);
            r313 = new 2Jf(2JX.class, (Class) null, "FalcoACSIssueQuery", (String) null, "fbandroid", 1565947353, 0, 2815206551L, 2815206551L, false, true);
        } else {
            C4QN c4qn = (C4QN) this;
            11T.A0F(immutableList, 1);
            ImmutableList.Builder builder2 = new ImmutableList.Builder();
            1Du it2 = immutableList.iterator();
            while (it2.hasNext()) {
                String A0i2 = AnonymousClass001.A0i(it2);
                2Jd r02 = new 2Jd(92);
                r02.A09("issue_data", A0i2);
                builder2.m11011add((Object) r02);
            }
            graphQlQueryParamSet = new GraphQlQueryParamSet();
            graphQlQueryParamSet.A05("projectName", c4qn.A00);
            2Jd r03 = new 2Jd(93);
            r03.A0A("issue_element", builder2.build());
            r03.A06("request_proof", false);
            graphQlQueryParamSet.A01(r03, "message");
            String str2 = kSz.A05;
            graphQlQueryParamSet.A05("configId", str2);
            Preconditions.checkArgument(AnonymousClass001.A1T(str2));
            r313 = new 2Jf(2JX.class, (Class) null, "FBMessagingACSIssueQuery", (String) null, "fbandroid", -1793975968, 0, 2390915331L, 2390915331L, false, true);
        }
        r313.A00 = graphQlQueryParamSet;
        return C3sa.A00(r313);
    }

    public ImmutableList A01(C23u c23u) {
        Class cls;
        2JY A0L;
        int i;
        int i2;
        2JY r0 = (2JY) c23u;
        if (this instanceof C4Ca) {
            cls = 2JX.class;
            A0L = (2JY) r0.A0L(1200175646, cls, -1796490663);
            if (A0L == null) {
                return null;
            }
            i = 858523452;
            i2 = 61861153;
        } else {
            11T.A0F(r0, 0);
            cls = 2JX.class;
            A0L = r0.A0L(995363493, cls, -1097235422);
            if (A0L == null) {
                return null;
            }
            i = 858523452;
            i2 = 1032961950;
        }
        return A0L.A0c(i, cls, i2);
    }

    public ImmutableList A02(C23u c23u) {
        Class cls;
        2JY A0L;
        int i;
        int i2;
        2JY r0 = (2JY) c23u;
        if (this instanceof C4Ca) {
            cls = 2JX.class;
            A0L = (2JY) r0.A0L(1200175646, cls, -1796490663);
            if (A0L == null) {
                return null;
            }
            i = 106940740;
            i2 = 1791269295;
        } else {
            11T.A0F(r0, 0);
            cls = 2JX.class;
            A0L = r0.A0L(995363493, cls, -1097235422);
            if (A0L == null) {
                return null;
            }
            i = 106940740;
            i2 = 808506815;
        }
        return A0L.A0c(i, cls, i2);
    }

    public String A03(C23u c23u) {
        2JY r0 = (2JY) c23u;
        if (!(this instanceof C4Ca)) {
            11T.A0F(r0, 0);
        }
        return r0.A0r(99);
    }

    public String A04(C23u c23u) {
        2JY r0 = (2JY) c23u;
        if (!(this instanceof C4Ca)) {
            11T.A0F(r0, 0);
        }
        return r0.A0r(3076010);
    }

    public String A05(C23u c23u) {
        2JY r0 = (2JY) c23u;
        if (!(this instanceof C4Ca)) {
            11T.A0F(r0, 0);
        }
        return r0.A0r(ActionId.RTMP_STREAM_PREPARED);
    }
}
