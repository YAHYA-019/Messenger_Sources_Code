package com.facebook.bloks.messenger.implementations.plugins.core.userflowannotate;

import X.11T;
import X.1Bi;
import X.AnonymousClass001;
import X.C0B7;
import X.DKC;
import X.DKD;
import X.DKE;
import X.DKc;
import X.FIV;
import com.facebook.quicklog.reliability.UserFlowLogger;
import java.util.Iterator;
import java.util.Map;

/* loaded from: UserFlowAnnotate.class */
public final class UserFlowAnnotate {
    public final UserFlowLogger A00 = (UserFlowLogger) 1Bi.A03(16705);

    public final Object A00(DKc dKc) {
        Object A10 = DKC.A10(dKc, 0);
        A10.getClass();
        int A05 = DKD.A05(A10, "null cannot be cast to non-null type kotlin.Number");
        int A0B = DKE.A0B(dKc);
        Object A102 = DKC.A10(dKc, 2);
        11T.A0I(A102, "null cannot be cast to non-null type kotlin.collections.MutableMap<kotlin.String, kotlin.Any>");
        Map A02 = C0B7.A02(A102);
        UserFlowLogger userFlowLogger = this.A00;
        if (A02 == null) {
            return null;
        }
        long generateFlowId = userFlowLogger.generateFlowId(A05, A0B);
        Iterator A0y = AnonymousClass001.A0y(A02);
        while (A0y.hasNext()) {
            Map.Entry A0z = AnonymousClass001.A0z(A0y);
            Object value = A0z.getValue();
            if (value instanceof Number) {
                userFlowLogger.flowAnnotate(generateFlowId, AnonymousClass001.A0j(A0z), AnonymousClass001.A03(A0z.getValue()));
            } else {
                boolean z = value instanceof Boolean;
                String A0j = AnonymousClass001.A0j(A0z);
                Object value2 = A0z.getValue();
                if (z) {
                    userFlowLogger.flowAnnotate(generateFlowId, A0j, AnonymousClass001.A1V(value2));
                } else {
                    userFlowLogger.flowAnnotate(generateFlowId, A0j, FIV.A00(value2));
                }
            }
        }
        return null;
    }
}
