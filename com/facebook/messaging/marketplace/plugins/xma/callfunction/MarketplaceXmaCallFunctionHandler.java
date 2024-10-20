package com.facebook.messaging.marketplace.plugins.xma.callfunction;

import X.11T;
import X.1EZ;
import X.1Fw;
import X.1Lm;
import X.1Uj;
import X.7zQ;
import X.C8y5;
import android.content.Context;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.msys.mca.MailboxFeature;

/* loaded from: MarketplaceXmaCallFunctionHandler.class */
public final class MarketplaceXmaCallFunctionHandler {
    public final C8y5 A00;
    public final Context A01;
    public final FbUserSession A02;
    public final 1EZ A03;
    public final 1Uj A04;

    /* JADX WARN: Type inference failed for: r0v13, types: [X.8y5, com.facebook.msys.mca.MailboxFeature] */
    public MarketplaceXmaCallFunctionHandler(Context context) {
        11T.A0F(context, 1);
        this.A01 = context;
        1EZ A0O = 7zQ.A0O(context);
        this.A03 = A0O;
        FbUserSession A04 = 1Fw.A04(A0O);
        this.A02 = A04;
        1Uj r0 = (1Uj) 1Lm.A05(context, A04, 16686);
        this.A04 = r0;
        this.A00 = new MailboxFeature(r0);
    }
}
