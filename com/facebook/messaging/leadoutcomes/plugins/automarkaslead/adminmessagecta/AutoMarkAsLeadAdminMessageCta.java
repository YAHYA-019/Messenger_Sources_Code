package com.facebook.messaging.leadoutcomes.plugins.automarkaslead.adminmessagecta;

import X.06Z;
import X.11T;
import X.1Br;
import X.1Bu;
import X.7zT;
import android.content.Context;
import com.facebook.messaging.model.messages.AdminMessageCta;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.messaging.model.threads.ThreadSummary;

/* loaded from: AutoMarkAsLeadAdminMessageCta.class */
public final class AutoMarkAsLeadAdminMessageCta {
    public final Context A00;
    public final 06Z A01;
    public final 1Br A02;
    public final ThreadKey A03;
    public final ThreadSummary A04;
    public final AdminMessageCta A05;

    public AutoMarkAsLeadAdminMessageCta(Context context, 06Z r303, AdminMessageCta adminMessageCta, ThreadKey threadKey, ThreadSummary threadSummary) {
        7zT.A1T(context, adminMessageCta, threadKey);
        11T.A0F(r303, 6);
        this.A00 = context;
        this.A05 = adminMessageCta;
        this.A03 = threadKey;
        this.A04 = threadSummary;
        this.A01 = r303;
        this.A02 = 1Bu.A00(66590);
    }
}
