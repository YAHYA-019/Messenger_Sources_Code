package com.facebook.messaging.msys.lifecycle.plugins.lifecycle.familycenter.supervision;

import X.11T;
import X.1Br;
import X.1Lm;
import X.1Um;
import X.C1qM;
import X.C3aj;
import X.C3b5;
import X.C3b7;
import android.content.Context;
import android.content.SharedPreferences;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.msys.mca.MailboxFeature;
import com.facebook.msys.mca.MailboxFutureImpl;

/* loaded from: SupervisionEdgeMailboxLifecycleListener.class */
public final class SupervisionEdgeMailboxLifecycleListener {
    public final Context A00;
    public final 1Br A01;
    public final C1qM A02;
    public final FbUserSession A03;

    public SupervisionEdgeMailboxLifecycleListener(Context context, FbUserSession fbUserSession) {
        11T.A0F(context, 1);
        11T.A0F(fbUserSession, 2);
        this.A00 = context;
        this.A03 = fbUserSession;
        this.A01 = 1Lm.A00(context, fbUserSession, 33124);
        this.A02 = new C3aj(this, 10);
    }

    public static final void A00(SupervisionEdgeMailboxLifecycleListener supervisionEdgeMailboxLifecycleListener) {
        FbUserSession fbUserSession = supervisionEdgeMailboxLifecycleListener.A03;
        Context context = supervisionEdgeMailboxLifecycleListener.A00;
        MailboxFeature mailboxFeature = (MailboxFeature) 1Lm.A05(context, fbUserSession, 33187);
        SharedPreferences sharedPreferences = context.getSharedPreferences("supervision_", 0);
        1Um AQV = mailboxFeature.mMailboxApiHandleMetaProvider.AQV(0);
        MailboxFutureImpl mailboxFutureImpl = new MailboxFutureImpl(AQV);
        if (!AQV.Cj2(new C3b5(mailboxFutureImpl, mailboxFeature, 18))) {
            mailboxFutureImpl.cancel(false);
        }
        mailboxFutureImpl.addResultCallback(new C3b7(sharedPreferences, 28));
    }
}
