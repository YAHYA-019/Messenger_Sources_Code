package com.facebook.messaging.encryptedbackups.plugins.inboxrestoringbanner;

import X.1BL;
import X.2Ws;
import X.AQn;
import X.C01i;
import X.C9qq;
import android.content.Context;
import androidx.lifecycle.Observer;
import com.facebook.auth.usersession.FbUserSession;

/* loaded from: InboxRestoringBanner.class */
public final class InboxRestoringBanner {
    public final Context A00;
    public final Observer A01;
    public final FbUserSession A02;
    public final 2Ws A03;
    public final C01i A04;

    public InboxRestoringBanner(Context context, FbUserSession fbUserSession, 2Ws r304) {
        1BL.A1H(context, r304, fbUserSession);
        this.A00 = context;
        this.A03 = r304;
        this.A02 = fbUserSession;
        this.A04 = AQn.A00(this, 37);
        this.A01 = new C9qq(this, 47);
    }
}
