package com.facebook.messaging.business.bmcconsiderationgrowth.plugins.considerationlogger.threadview;

import X.11T;
import X.1Bq;
import X.1Br;
import X.1Lm;
import android.content.Context;
import com.facebook.auth.usersession.FbUserSession;

/* loaded from: BusinessMessagingThreadViewLogger.class */
public final class BusinessMessagingThreadViewLogger {
    public final 1Br A00;
    public final 1Br A01;
    public final Context A02;

    public BusinessMessagingThreadViewLogger(Context context, FbUserSession fbUserSession) {
        11T.A0F(context, 1);
        11T.A0F(fbUserSession, 2);
        this.A02 = context;
        this.A01 = 1Bq.A00(66468);
        this.A00 = 1Lm.A00(context, fbUserSession, 66472);
    }
}
