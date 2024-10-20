package com.facebook.messaging.quickpromotion.chatentity.plugins.usercontrol.usercontroldataload;

import X.1BL;
import X.1Br;
import X.1Lm;
import X.6iB;
import X.A1d;
import X.C1qM;
import X.C9zx;
import android.content.Context;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.msys.mca.MailboxCallback;

/* loaded from: UserControlDataLoad.class */
public final class UserControlDataLoad {
    public String A00;
    public final 1Br A01;
    public final 1Br A02;
    public final 1Br A03;
    public final 6iB A04;
    public final C1qM A05;
    public final MailboxCallback A06;
    public final Context A07;

    public UserControlDataLoad(Context context, FbUserSession fbUserSession, 6iB r304) {
        1BL.A1H(context, fbUserSession, r304);
        this.A07 = context;
        this.A04 = r304;
        this.A03 = 1Lm.A00(context, fbUserSession, 33124);
        this.A01 = 1Lm.A00(context, fbUserSession, 33222);
        this.A02 = 1Lm.A00(context, fbUserSession, 49926);
        this.A05 = new C9zx(this, 9);
        this.A06 = A1d.A00(this, 100);
    }
}
