package com.facebook.messaging.inbox.tab.plugins.core.tabtoolbarbutton.facebookbutton.facebooktoolbarbutton;

import X.11T;
import X.1BL;
import X.1Bi;
import X.2QG;
import X.2cJ;
import X.C3Qt;
import X.C67Q;
import X.CDa;
import android.content.Context;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;

/* loaded from: FacebookButtonTabButtonImplementation.class */
public final class FacebookButtonTabButtonImplementation {
    public final C3Qt A00;

    /* JADX WARN: Type inference failed for: r0v6, types: [X.3Qt] */
    public FacebookButtonTabButtonImplementation(final Context context, final 2QG r303, final CDa cDa, final C67Q c67q) {
        1BL.A1H(context, c67q, r303);
        11T.A0F(cDa, 4);
        final 2cJ r0 = (2cJ) 1Bi.A03(66458);
        this.A00 = new Object(context, r303, cDa, r0, c67q) { // from class: X.3Qt
            public final 2cJ A00;
            public final Context A01;
            public final 2QG A02;
            public final CDa A03;
            public final C67Q A04;

            {
                1BL.A11(2, c67q, r303, r0);
                11T.A0F(cDa, 5);
                this.A01 = context;
                this.A04 = c67q;
                this.A02 = r303;
                this.A00 = r0;
                this.A03 = cDa;
            }

            public static final void A00(C3Qt c3Qt) {
                c3Qt.A04.A03(c3Qt.A01, C0A2.A03(C1ic.A0F), C0A2.A03(AbE.A00(70)), 0S2.A0j);
            }

            public final 2Rh A01() {
                Context context2 = this.A01;
                String A06 = C1pq.A06(context2, 2131956668);
                2Rg A01 = 2Rg.A01(2Rc.A00(context2, 2MQ.A0A, C1u3.A0C), 22);
                C1pq.A08(PublicKeyCredentialControllerUtility.JSON_KEY_ICON, A01);
                return new 2Rh((C2iw) null, (2QB) null, A01, (C1p8) null, (String) null, A06, "FacebookButton");
            }
        };
    }
}
