package com.facebook.messaging.cutover.analytics.plugins.logging;

import X.11T;
import X.63D;
import X.6Fy;
import android.content.Context;
import com.facebook.auth.usersession.FbUserSession;

/* loaded from: OpenThreadImpressionLogger.class */
public final class OpenThreadImpressionLogger {
    public final Context A00;
    public final FbUserSession A01;
    public final 63D A02;
    public final 6Fy A03;

    public OpenThreadImpressionLogger(Context context, FbUserSession fbUserSession, 63D r304, 6Fy r305) {
        11T.A0F(context, 1);
        11T.A0F(r304, 2);
        11T.A0F(r305, 3);
        11T.A0F(fbUserSession, 4);
        this.A00 = context;
        this.A02 = r304;
        this.A03 = r305;
        this.A01 = fbUserSession;
    }
}
