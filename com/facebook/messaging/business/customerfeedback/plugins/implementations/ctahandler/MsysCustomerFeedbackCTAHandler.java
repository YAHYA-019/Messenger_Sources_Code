package com.facebook.messaging.business.customerfeedback.plugins.implementations.ctahandler;

import X.11T;
import X.1Br;
import X.1EZ;
import X.1Fw;
import X.1Lm;
import X.1Uj;
import X.7zQ;
import X.C8xs;
import android.content.Context;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.msys.mca.MailboxFeature;

/* loaded from: MsysCustomerFeedbackCTAHandler.class */
public final class MsysCustomerFeedbackCTAHandler {
    public final C8xs A00;
    public final 1Br A01;
    public final FbUserSession A02;
    public final 1EZ A03;

    /* JADX WARN: Type inference failed for: r0v15, types: [X.8xs, com.facebook.msys.mca.MailboxFeature] */
    public MsysCustomerFeedbackCTAHandler(Context context) {
        11T.A0F(context, 1);
        1EZ A0O = 7zQ.A0O(context);
        this.A03 = A0O;
        FbUserSession A04 = 1Fw.A04(A0O);
        this.A02 = A04;
        1Br A00 = 1Lm.A00(context, A04, 16686);
        this.A01 = A00;
        MailboxFeature mailboxFeature = MailboxFeature.$redex_init_class;
        this.A00 = new MailboxFeature((1Uj) 1Br.A0B(A00));
    }
}
