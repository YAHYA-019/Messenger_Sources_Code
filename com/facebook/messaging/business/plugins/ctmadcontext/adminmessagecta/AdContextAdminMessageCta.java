package com.facebook.messaging.business.plugins.ctmadcontext.adminmessagecta;

import X.1Bq;
import X.1Br;
import X.7zM;
import X.7zT;
import X.AdT;
import android.content.Context;
import com.facebook.messaging.model.messages.AdminMessageCta;
import com.facebook.messaging.model.threadkey.ThreadKey;

/* loaded from: AdContextAdminMessageCta.class */
public final class AdContextAdminMessageCta {
    public final 1Br A00;
    public final 1Br A01;
    public final AdT A02;
    public final AdminMessageCta A03;
    public final ThreadKey A04;
    public final String A05;
    public final Context A06;

    public AdContextAdminMessageCta(Context context, AdminMessageCta adminMessageCta, ThreadKey threadKey, String str) {
        7zT.A1T(context, adminMessageCta, threadKey);
        this.A06 = context;
        this.A03 = adminMessageCta;
        this.A05 = str;
        this.A04 = threadKey;
        this.A01 = 7zM.A0e(context);
        this.A02 = new AdT(context);
        this.A00 = 1Bq.A00(83233);
    }
}
