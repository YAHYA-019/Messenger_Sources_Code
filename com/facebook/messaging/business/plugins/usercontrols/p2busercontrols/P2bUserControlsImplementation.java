package com.facebook.messaging.business.plugins.usercontrols.p2busercontrols;

import X.06Z;
import X.11T;
import X.7zT;
import android.content.Context;
import com.facebook.messaging.model.messages.AdminMessageCta;
import com.facebook.messaging.model.threadkey.ThreadKey;

/* loaded from: P2bUserControlsImplementation.class */
public final class P2bUserControlsImplementation {
    public final Context A00;
    public final 06Z A01;
    public final AdminMessageCta A02;
    public final ThreadKey A03;
    public final String A04;

    public P2bUserControlsImplementation(Context context, 06Z r303, AdminMessageCta adminMessageCta, ThreadKey threadKey, String str) {
        7zT.A1T(context, adminMessageCta, threadKey);
        11T.A0F(r303, 5);
        this.A00 = context;
        this.A02 = adminMessageCta;
        this.A04 = str;
        this.A03 = threadKey;
        this.A01 = r303;
    }
}