package com.facebook.messaging.wellbeing.plugins.core.privacysettings;

import X.1BK;
import X.1Bn;
import X.4YU;
import X.7zT;
import X.AbL;
import X.ArR;
import X.BOD;
import X.C3o5;
import X.C5ww;
import X.C7j;
import X.CG8;
import android.content.Context;
import android.content.Intent;
import com.facebook.inject.FbInjector;
import com.facebook.messaging.wellbeing.unknowncontact.reachabilitycontrols.activity.ReachabilitySettingsActivity;
import java.io.Serializable;

/* loaded from: PrivacySettingsMessageRow.class */
public final class PrivacySettingsMessageRow {
    public static final C7j A00(Context context, CG8 cg8, ArR arR) {
        7zT.A1S(context, cg8, arR);
        Context A01 = FbInjector.A01();
        AbL.A0y(arR);
        1Bn.A0K();
        FbInjector.A04(A01);
        String A0u = 1BK.A0u(context, 2131964151);
        String A0t = 4YU.A0t(context.getResources(), 2131964152);
        Intent A0D = C3o5.A0D(context, ReachabilitySettingsActivity.class);
        A0D.putExtra("entry_point", (Serializable) BOD.A02);
        return cg8.A01(A0D, (C5ww) null, A0t, A0u, "message_delivery");
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x0061, code lost:
    
        if (X.1Br.A07(r0.A02).AZk(36315481791144920L) == false) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final boolean A01(android.content.Context r301, X.ArR r302) {
        /*
            r0 = 1
            r303 = r0
            r0 = r302
            r1 = r303
            X.11T.A0F(r0, r1)
            android.content.Context r0 = com.facebook.inject.FbInjector.A01()
            r304 = r0
            r0 = r302
            X.AbL.A0y(r0)
            r0 = r301
            r1 = r303
            X.11T.A0F(r0, r1)     // Catch: java.lang.Throwable -> L6b
            X.1Bn.A0K()     // Catch: java.lang.Throwable -> L6b
            r0 = r304
            com.facebook.inject.FbInjector.A04(r0)
            r0 = 83147(0x144cb, float:1.16514E-40)
            java.lang.Object r0 = X.1Bn.A0A(r0)
            X.Bqy r0 = (X.Bqy) r0
            r301 = r0
            r0 = r301
            X.11T.A0A(r0)
            r0 = r301
            X.1Br r0 = r0.A00
            r305 = r0
            r0 = r305
            java.lang.Object r0 = X.1Br.A0B(r0)
            X.1uz r0 = (X.C1uz) r0
            r304 = r0
            r0 = r304
            r1 = 10
            boolean r0 = r0.A02(r1)
            r303 = r0
            r0 = r303
            if (r0 == 0) goto L64
            r0 = r301
            X.1Br r0 = r0.A02
            r305 = r0
            r0 = r305
            X.2yD r0 = X.1Br.A07(r0)
            r301 = r0
            r0 = 36315481791144920(0x8104bd000223d8, double:3.0293951432033716E-306)
            r306 = r0
            r0 = r301
            r1 = r306
            boolean r0 = r0.AZk(r1)
            r308 = r0
            r0 = 1
            r303 = r0
            r0 = r308
            if (r0 != 0) goto L69
        L64:
            r0 = 0
            r303 = r0
            r0 = 0
            r305 = r0
        L69:
            r0 = r303
            return r0
        L6b:
            r305 = move-exception
            X.1Bn.A0K()
            r0 = r304
            com.facebook.inject.FbInjector.A04(r0)
            r0 = r305
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.messaging.wellbeing.plugins.core.privacysettings.PrivacySettingsMessageRow.A01(android.content.Context, X.ArR):boolean");
    }
}
