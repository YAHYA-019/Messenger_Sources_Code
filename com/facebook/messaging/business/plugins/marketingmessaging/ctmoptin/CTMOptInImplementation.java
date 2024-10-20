package com.facebook.messaging.business.plugins.marketingmessaging.ctmoptin;

import X.7zT;
import android.content.Context;
import com.facebook.messaging.model.messages.AdminMessageCta;
import com.facebook.messaging.model.threadkey.ThreadKey;

/* loaded from: CTMOptInImplementation.class */
public final class CTMOptInImplementation {
    public final Context A00;
    public final AdminMessageCta A01;
    public final ThreadKey A02;
    public final String A03;

    public CTMOptInImplementation(Context context, AdminMessageCta adminMessageCta, ThreadKey threadKey, String str) {
        7zT.A1T(context, adminMessageCta, threadKey);
        this.A00 = context;
        this.A01 = adminMessageCta;
        this.A03 = str;
        this.A02 = threadKey;
    }
}
