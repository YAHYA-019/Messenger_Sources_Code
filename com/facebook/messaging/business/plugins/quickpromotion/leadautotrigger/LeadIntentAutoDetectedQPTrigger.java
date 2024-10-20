package com.facebook.messaging.business.plugins.quickpromotion.leadautotrigger;

import X.11T;
import X.1Bq;
import X.1Br;
import X.1Lm;
import X.1Uj;
import X.1Um;
import X.A1c;
import X.C21h;
import X.C7Nz;
import X.N82;
import android.content.Context;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.msys.mca.MailboxFeature;
import com.facebook.msys.mca.MailboxFutureImpl;

/* loaded from: LeadIntentAutoDetectedQPTrigger.class */
public final class LeadIntentAutoDetectedQPTrigger {
    public C21h A00;
    public final Context A01;
    public final FbUserSession A02;
    public final 1Br A03;
    public final ThreadKey A04;

    public LeadIntentAutoDetectedQPTrigger(Context context, FbUserSession fbUserSession, ThreadKey threadKey) {
        11T.A0F(context, 1);
        11T.A0F(threadKey, 2);
        11T.A0F(fbUserSession, 3);
        this.A01 = context;
        this.A04 = threadKey;
        this.A02 = fbUserSession;
        this.A03 = 1Bq.A00(16385);
    }

    public static final void A00(LeadIntentAutoDetectedQPTrigger leadIntentAutoDetectedQPTrigger, C7Nz c7Nz) {
        MailboxFeature mailboxFeature = new MailboxFeature((1Uj) 1Lm.A05(leadIntentAutoDetectedQPTrigger.A01, leadIntentAutoDetectedQPTrigger.A02, 16686));
        long A0r = leadIntentAutoDetectedQPTrigger.A04.A0r();
        1Um AQV = mailboxFeature.mMailboxApiHandleMetaProvider.AQV(0);
        MailboxFutureImpl mailboxFutureImpl = new MailboxFutureImpl(AQV);
        if (!AQV.Cj2(new N82(6, A0r, mailboxFeature, mailboxFutureImpl))) {
            mailboxFutureImpl.cancel(false);
        }
        mailboxFutureImpl.addResultCallback(new A1c(c7Nz, leadIntentAutoDetectedQPTrigger, 5));
    }
}
