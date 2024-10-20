package com.facebook.messaging.privacyframework.cmcd.messenger.plugins.cmcddbsource.cmcddbsource;

import X.1BL;
import X.1Bq;
import X.1Br;
import X.C1qM;
import X.N6n;
import X.Rsn;
import android.content.Context;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.msys.mca.MailboxCallback;

/* loaded from: CMCDDBSourceImplementation.class */
public final class CMCDDBSourceImplementation {
    public final Context A00;
    public final FbUserSession A01;
    public final 1Br A02;
    public final ThreadKey A03;
    public final C1qM A04;
    public final MailboxCallback A05;

    public CMCDDBSourceImplementation(Context context, FbUserSession fbUserSession, ThreadKey threadKey) {
        1BL.A1H(context, fbUserSession, threadKey);
        this.A00 = context;
        this.A01 = fbUserSession;
        this.A03 = threadKey;
        this.A02 = 1Bq.A00(99801);
        this.A04 = new N6n(this, 0);
        this.A05 = Rsn.A00;
    }
}
