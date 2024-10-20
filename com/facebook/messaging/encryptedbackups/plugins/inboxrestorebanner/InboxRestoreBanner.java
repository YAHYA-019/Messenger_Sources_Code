package com.facebook.messaging.encryptedbackups.plugins.inboxrestorebanner;

import X.11T;
import X.1Br;
import X.1Bu;
import X.2Ws;
import X.3UZ;
import X.C01g;
import X.C01i;
import X.C03i;
import X.C2xn;
import android.content.Context;
import androidx.lifecycle.Observer;
import com.facebook.auth.usersession.FbUserSession;

/* loaded from: InboxRestoreBanner.class */
public final class InboxRestoreBanner {
    public final Context A00;
    public final Observer A01;
    public final FbUserSession A02;
    public final 1Br A03;
    public final 2Ws A04;
    public final C01i A05;
    public final C01i A06;

    public InboxRestoreBanner(Context context, FbUserSession fbUserSession, 2Ws r304) {
        11T.A0F(context, 1);
        11T.A0F(r304, 2);
        11T.A0F(fbUserSession, 3);
        this.A00 = context;
        this.A04 = r304;
        this.A02 = fbUserSession;
        this.A06 = C01g.A01(new C2xn(this, 6));
        this.A03 = 1Bu.A00(67874);
        this.A01 = new 3UZ(this, 1);
        this.A05 = C01g.A00(C03i.A02, new C2xn(this, 5));
    }
}
