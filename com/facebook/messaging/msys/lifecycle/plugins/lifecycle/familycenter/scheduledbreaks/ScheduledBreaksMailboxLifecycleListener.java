package com.facebook.messaging.msys.lifecycle.plugins.lifecycle.familycenter.scheduledbreaks;

import X.11T;
import X.1Bq;
import X.1Br;
import X.1Lm;
import X.1Um;
import X.22Q;
import X.C1qM;
import X.C3aj;
import X.C3au;
import X.C3b5;
import android.content.Context;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.msys.mca.MailboxFutureImpl;

/* loaded from: ScheduledBreaksMailboxLifecycleListener.class */
public final class ScheduledBreaksMailboxLifecycleListener {
    public final Context A00;
    public final FbUserSession A01;
    public final 1Br A02;
    public final C1qM A03;

    public ScheduledBreaksMailboxLifecycleListener(Context context, FbUserSession fbUserSession) {
        11T.A0F(context, 1);
        11T.A0F(fbUserSession, 2);
        this.A00 = context;
        this.A01 = fbUserSession;
        this.A02 = 1Lm.A00(context, fbUserSession, 33124);
        this.A03 = new C3aj(this, 9);
    }

    public static final void A00(ScheduledBreaksMailboxLifecycleListener scheduledBreaksMailboxLifecycleListener, boolean z) {
        FbUserSession fbUserSession = scheduledBreaksMailboxLifecycleListener.A01;
        Context context = scheduledBreaksMailboxLifecycleListener.A00;
        1Br A00 = 1Lm.A00(context, fbUserSession, 66248);
        22Q r0 = (22Q) 1Lm.A05(context, fbUserSession, 33187);
        1Br A002 = 1Bq.A00(33013);
        1Um AQV = r0.mMailboxApiHandleMetaProvider.AQV(0);
        MailboxFutureImpl mailboxFutureImpl = new MailboxFutureImpl(AQV);
        if (!AQV.Cj2(new C3b5(mailboxFutureImpl, r0, 19))) {
            mailboxFutureImpl.cancel(false);
        }
        mailboxFutureImpl.addResultCallback(new C3au(1, A002, scheduledBreaksMailboxLifecycleListener, A00, z));
        r0.A00().addResultCallback(new C3b5(A00, A002, 23));
    }
}
