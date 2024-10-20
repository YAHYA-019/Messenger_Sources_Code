package com.facebook.messaging.business.plugins.quickpromotion.leaddetectedtrigger;

import X.11T;
import X.1Lm;
import X.1Uj;
import X.1Um;
import X.A1b;
import X.C21h;
import X.C7Nz;
import X.N82;
import android.content.Context;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.msys.mca.MailboxFeature;
import com.facebook.msys.mca.MailboxFutureImpl;

/* loaded from: LeadIntentDetectedQPTrigger.class */
public final class LeadIntentDetectedQPTrigger {
    public C21h A00;
    public final Context A01;
    public final FbUserSession A02;
    public final ThreadKey A03;

    public LeadIntentDetectedQPTrigger(Context context, FbUserSession fbUserSession, ThreadKey threadKey) {
        11T.A0F(context, 1);
        11T.A0F(threadKey, 2);
        11T.A0F(fbUserSession, 3);
        this.A01 = context;
        this.A03 = threadKey;
        this.A02 = fbUserSession;
    }

    public static final void A00(LeadIntentDetectedQPTrigger leadIntentDetectedQPTrigger, C7Nz c7Nz) {
        MailboxFeature mailboxFeature = new MailboxFeature((1Uj) 1Lm.A05(leadIntentDetectedQPTrigger.A01, leadIntentDetectedQPTrigger.A02, 16686));
        long A0r = leadIntentDetectedQPTrigger.A03.A0r();
        1Um AQV = mailboxFeature.mMailboxApiHandleMetaProvider.AQV(0);
        MailboxFutureImpl mailboxFutureImpl = new MailboxFutureImpl(AQV);
        if (!AQV.Cj2(new N82(5, A0r, mailboxFeature, mailboxFutureImpl))) {
            mailboxFutureImpl.cancel(false);
        }
        mailboxFutureImpl.addResultCallback(new A1b(c7Nz, 5));
    }
}
