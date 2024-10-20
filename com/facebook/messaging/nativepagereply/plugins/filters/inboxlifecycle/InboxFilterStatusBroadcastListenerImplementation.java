package com.facebook.messaging.nativepagereply.plugins.filters.inboxlifecycle;

import X.1BL;
import X.1Br;
import X.1Lm;
import X.2Vr;
import X.AKO;
import X.C01g;
import X.C01i;
import android.content.Context;
import com.facebook.auth.usersession.FbUserSession;

/* loaded from: InboxFilterStatusBroadcastListenerImplementation.class */
public final class InboxFilterStatusBroadcastListenerImplementation {
    public final Context A00;
    public final 1Br A01;
    public final 2Vr A02;
    public final C01i A03;
    public final FbUserSession A04;

    public InboxFilterStatusBroadcastListenerImplementation(Context context, FbUserSession fbUserSession, 2Vr r304) {
        1BL.A1H(context, r304, fbUserSession);
        this.A00 = context;
        this.A02 = r304;
        this.A04 = fbUserSession;
        this.A01 = 1Lm.A00(context, fbUserSession, 33197);
        this.A03 = C01g.A01(new AKO(this, 41));
    }
}
