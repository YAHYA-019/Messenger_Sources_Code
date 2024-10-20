package com.facebook.messaging.threadlist.plugins.core.threadmetadata.seenheads;

import X.11T;
import X.C01g;
import X.C01i;
import X.C2xu;
import android.content.Context;
import com.facebook.auth.usersession.FbUserSession;

/* loaded from: SeenHeadsProviderImplementation.class */
public final class SeenHeadsProviderImplementation {
    public final C01i A00;

    public SeenHeadsProviderImplementation(Context context, FbUserSession fbUserSession) {
        11T.A0F(context, 1);
        11T.A0F(fbUserSession, 2);
        this.A00 = C01g.A01(new C2xu(context, fbUserSession, 11));
    }
}
