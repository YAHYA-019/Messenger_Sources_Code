package com.facebook.messaging.polling.plugins.core.openpolldetailsdata;

import X.1BL;
import android.content.Context;
import com.facebook.auth.usersession.FbUserSession;

/* loaded from: OpenPollDetailsDataImplementation.class */
public final class OpenPollDetailsDataImplementation {
    public final Context A00;
    public final FbUserSession A01;

    public OpenPollDetailsDataImplementation(Context context, FbUserSession fbUserSession) {
        1BL.A1F(context, fbUserSession);
        this.A00 = context;
        this.A01 = fbUserSession;
    }
}
