package com.facebook.bloks.messenger.implementations.plugins.core.userflowmarkpoint;

import X.1Bi;
import X.AnonymousClass001;
import X.C0B7;
import X.DKC;
import X.DKD;
import X.DKE;
import X.DKc;
import X.FIV;
import com.facebook.quicklog.PointEditor;
import com.facebook.quicklog.reliability.UserFlowLogger;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: UserFlowMarkPoint.class */
public final class UserFlowMarkPoint {
    public final UserFlowLogger A00 = (UserFlowLogger) 1Bi.A03(16705);

    public final Object A00(DKc dKc) {
        Object A10 = DKC.A10(dKc, 0);
        A10.getClass();
        int A05 = DKD.A05(A10, "null cannot be cast to non-null type kotlin.Number");
        int A0B = DKE.A0B(dKc);
        List list = dKc.A00;
        String A0x = DKD.A0x(list, 2);
        Map A02 = C0B7.A02(list.get(3));
        UserFlowLogger userFlowLogger = this.A00;
        long generateFlowId = userFlowLogger.generateFlowId(A05, A0B);
        if (A02 == null) {
            userFlowLogger.flowMarkPoint(generateFlowId, A0x);
            return null;
        }
        PointEditor markPointWithEditor = userFlowLogger.markPointWithEditor(generateFlowId, A0x);
        Iterator A0y = AnonymousClass001.A0y(A02);
        while (A0y.hasNext()) {
            Map.Entry A0z = AnonymousClass001.A0z(A0y);
            Object value = A0z.getValue();
            if (value instanceof Number) {
                markPointWithEditor.addPointData(AnonymousClass001.A0j(A0z), AnonymousClass001.A03(A0z.getValue()));
            } else {
                boolean z = value instanceof Boolean;
                String A0j = AnonymousClass001.A0j(A0z);
                Object value2 = A0z.getValue();
                if (z) {
                    markPointWithEditor.addPointData(A0j, AnonymousClass001.A1V(value2));
                } else {
                    markPointWithEditor.addPointData(A0j, FIV.A00(value2));
                }
            }
        }
        markPointWithEditor.markerEditingCompleted();
        return null;
    }
}
