package X;

import android.os.Bundle;
import java.util.List;

/* loaded from: L0h.class */
public final class L0h {
    public final 1Br A00;
    public final java.util.Map A01;
    public final KVp A02;
    public final KeJ A03;
    public final List A04;
    public final java.util.Map A05;
    public final java.util.Map A06;

    /* JADX WARN: Type inference failed for: r0v5, types: [X.KVp, java.lang.Object] */
    public L0h() {
        new Bundle();
        this.A03 = new KeJ();
        this.A02 = new Object();
        03W A0G = 04R.A0G();
        this.A05 = A0G;
        this.A00 = 1Bu.A00(82044);
        Object obj = A0G.get("lifetimeConfig");
        11T.A0I(obj, "null cannot be cast to non-null type kotlin.collections.MutableMap<kotlin.Pair<kotlin.String, com.facebook.analytics.structuredlogger.enums.IABAttentionFrameworkLevers>, kotlin.Int>");
        this.A06 = C0B7.A02(obj);
        Object obj2 = A0G.get("perLeverConfig");
        11T.A0I(obj2, "null cannot be cast to non-null type kotlin.collections.MutableMap<kotlin.Pair<kotlin.String, com.facebook.analytics.structuredlogger.enums.IABAttentionFrameworkLevers>, kotlin.Int>");
        this.A01 = C0B7.A02(obj2);
        this.A04 = C0s8.A14(1BK.A1G("autofill", KPL.A01), 1BK.A1G("product_tracker", KPL.A02));
        11T.A0I(A0G.get("perSessionConfig"), "null cannot be cast to non-null type kotlin.Int");
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.util.Map A00(android.content.Intent r301) {
        /*
            java.lang.String r0 = "BrowserLiteIntent.EXTRA_TRACKING_CODES"
            r302 = r0
            r0 = 0
            r303 = r0
            r0 = r301
            if (r0 == 0) goto L63
            r0 = r301
            r1 = r302
            java.lang.String r0 = r0.getStringExtra(r1)
            r304 = r0
            r0 = r304
            if (r0 == 0) goto L63
            r0 = r304
            java.lang.String r0 = X.L9d.A01(r0)
            r305 = r0
        L19:
            r0 = r301
            r1 = r302
            java.lang.String r0 = r0.getStringExtra(r1)
            r304 = r0
        L1f:
            r0 = r304
            java.lang.String r0 = X.L9d.A00(r0)
            r302 = r0
            r0 = r301
            if (r0 == 0) goto L2d
            r0 = r301
            java.lang.String r0 = X.JQx.A0u(r0)
            r303 = r0
        L2d:
            java.lang.String r0 = "ad_id"
            r1 = r302
            X.03Y r0 = X.1BK.A1G(r0, r1)
            r306 = r0
            java.lang.String r0 = "tracking_token"
            r1 = r305
            X.03Y r0 = X.1BK.A1G(r0, r1)
            r302 = r0
            java.lang.String r0 = "iab_session_id"
            r1 = r303
            X.03Y r0 = X.1BK.A1G(r0, r1)
            r304 = r0
            r0 = 3
            X.03Y[] r0 = new X.03Y[r0]
            r1 = r0
            r2 = r0; r3 = r1; 
            r4 = 0
            r5 = r306
            r3[r4] = r5
            r3 = 1
            r4 = r302
            r2[r3] = r4
            r2 = 2
            r3 = r304
            r1[r2] = r3
            java.util.LinkedHashMap r0 = X.04R.A0A(r0)
            r302 = r0
            r0 = r302
            java.lang.String r1 = "null cannot be cast to non-null type kotlin.collections.MutableMap<kotlin.Any, kotlin.Any>"
            X.11T.A0I(r0, r1)
            r0 = r302
            java.util.Map r0 = X.C0B7.A02(r0)
            return r0
        L63:
            java.lang.String r0 = ""
            r305 = r0
            r0 = r301
            if (r0 != 0) goto L19
            r0 = 0
            r304 = r0
            goto L1f
        */
        throw new UnsupportedOperationException("Method not decompiled: X.L0h.A00(android.content.Intent):java.util.Map");
    }
}
