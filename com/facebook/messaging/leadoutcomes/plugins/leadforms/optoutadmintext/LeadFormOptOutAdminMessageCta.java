package com.facebook.messaging.leadoutcomes.plugins.leadforms.optoutadmintext;

import X.1BL;
import android.content.Context;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.messaging.model.threads.ThreadSummary;

/* loaded from: LeadFormOptOutAdminMessageCta.class */
public final class LeadFormOptOutAdminMessageCta {
    public final Context A00;
    public final FbUserSession A01;
    public final ThreadSummary A02;

    public LeadFormOptOutAdminMessageCta(Context context, FbUserSession fbUserSession, ThreadSummary threadSummary) {
        1BL.A1F(context, fbUserSession);
        this.A00 = context;
        this.A01 = fbUserSession;
        this.A02 = threadSummary;
    }
}
