package com.facebook.nativetemplates.fb.screens.common;

import X.07S;
import X.0S2;
import X.1BY;
import X.1Bi;
import X.1Bn;
import X.1CO;
import X.1EZ;
import X.2Jd;
import X.2Jf;
import X.4YV;
import X.5Tn;
import X.5iJ;
import X.5iK;
import X.5iL;
import X.5iN;
import X.C03z;
import X.C3t8;
import X.DKF;
import X.E9t;
import X.F7M;
import X.F9Q;
import X.Roe;
import com.facebook.auth.viewercontext.ViewerContext;
import com.facebook.graphql.calls.GraphQlCallInput;
import com.facebook.graphql.query.GraphQlQueryParamSet;

/* loaded from: ScreenDataFetch.class */
public final class ScreenDataFetch extends 5iK {
    public int A00;
    public int A01;
    public ViewerContext A02;
    public String A03;
    public String A04;
    public String A05;
    public String A06;
    public String A07;
    public String A08;
    public E9t A09;
    public 5iJ A0A;

    /* JADX WARN: Type inference failed for: r0v0, types: [com.facebook.nativetemplates.fb.screens.common.ScreenDataFetch, java.lang.Object] */
    public static ScreenDataFetch create(5iJ r301, E9t e9t) {
        ?? obj = new Object();
        obj.A0A = r301;
        obj.A03 = e9t.A05;
        obj.A04 = e9t.A06;
        obj.A00 = e9t.A01;
        obj.A05 = e9t.A07;
        obj.A01 = e9t.A02;
        obj.A06 = e9t.A08;
        obj.A07 = e9t.A09;
        obj.A08 = e9t.A0A;
        obj.A02 = e9t.A04;
        obj.A09 = e9t;
        return obj;
    }

    public 5Tn A00() {
        5iJ r0 = this.A0A;
        String str = this.A07;
        String str2 = this.A05;
        String str3 = this.A06;
        String str4 = this.A04;
        int i = this.A00;
        int i2 = this.A01;
        String str5 = this.A03;
        String str6 = this.A08;
        ViewerContext viewerContext = this.A02;
        1EZ r02 = (1EZ) 1Bn.A0E(r0.A00, (1BY) null, 16428);
        C3t8 c3t8 = (C3t8) 1Bi.A03(32817);
        Integer valueOf = Integer.valueOf(i);
        Integer valueOf2 = Integer.valueOf(i2);
        C03z c03z = GraphQlCallInput.A02;
        07S r319 = null;
        if (str4 != null && !str4.isEmpty()) {
            r319 = c03z.A02();
            07S.A00(r319, str4, "form_data");
        }
        2Jd A00 = c3t8.A00();
        07S A02 = c03z.A02();
        DKF.A1L(A02, A00, "nt_context");
        07S.A00(A02, str, "path");
        07S.A00(A02, str3, "params");
        if (r319 == null) {
            r319 = c03z.A02();
        }
        A02.A0H(r319, "extra_client_data");
        if (str6 != null) {
            07S.A00(A02, str6, "state_data");
        }
        if (valueOf == null) {
            valueOf = 0;
        }
        if (valueOf2 == null) {
            valueOf2 = 0;
        }
        Roe roe = new Roe();
        GraphQlQueryParamSet graphQlQueryParamSet = roe.A01;
        4YV.A1A(A02, graphQlQueryParamSet, "params");
        roe.A02 = true;
        if (str5 != null) {
            graphQlQueryParamSet.A05("feed_story_render_location", str5);
        }
        if (viewerContext == null) {
            viewerContext = r02.BKF();
            if (viewerContext == null) {
                viewerContext = ViewerContext.A01;
            }
        }
        F9Q f9q = new F9Q((2Jf) null, roe);
        f9q.A0C = true;
        f9q.A04 = viewerContext;
        if (str2 != null) {
            f9q.A08 = "graph_query".equals(str2) ? 0S2.A01 : null;
        }
        int intValue = valueOf.intValue();
        if (intValue == 0 && valueOf2.intValue() == 0) {
            f9q.A02(0L);
            f9q.A0B = false;
        } else {
            f9q.A02(valueOf2.intValue());
            f9q.A00 = intValue;
        }
        Integer num = 0S2.A01;
        1CO r03 = 5iL.A0N;
        return 5iN.A00(r0, new 5iL(r0, f9q, new F7M(r0.A01), num));
    }
}
