package com.facebook.messaging.games.plugins.customupdatemute.muteadminmessagecta;

import X.1BL;
import X.1Br;
import X.1Bu;
import android.content.Context;
import com.facebook.messaging.model.messages.AdminMessageCta;
import com.facebook.messaging.model.threads.ThreadSummary;

/* loaded from: CustomUpdateMuteAdminMessageCta.class */
public final class CustomUpdateMuteAdminMessageCta {
    public final Context A00;
    public final 1Br A01;
    public final AdminMessageCta A02;
    public final ThreadSummary A03;
    public final String A04;

    public CustomUpdateMuteAdminMessageCta(Context context, AdminMessageCta adminMessageCta, ThreadSummary threadSummary, String str) {
        1BL.A1F(context, adminMessageCta);
        this.A00 = context;
        this.A02 = adminMessageCta;
        this.A04 = str;
        this.A03 = threadSummary;
        this.A01 = 1Bu.A01(context, 16428);
    }
}
