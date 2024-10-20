package com.facebook.messaging.publicchats.plugins.threaddetails.showchannelinpersonalinboxthreadsettingsrow;

import X.7zR;
import android.content.Context;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.messaging.model.threads.ThreadSummary;

/* loaded from: ShowChannelInPersonalInboxThreadSettingsRowImplementation.class */
public final class ShowChannelInPersonalInboxThreadSettingsRowImplementation {
    public final Context A00;
    public final FbUserSession A01;
    public final ThreadSummary A02;

    public ShowChannelInPersonalInboxThreadSettingsRowImplementation(Context context, FbUserSession fbUserSession, ThreadSummary threadSummary) {
        7zR.A1N(context, fbUserSession);
        this.A00 = context;
        this.A02 = threadSummary;
        this.A01 = fbUserSession;
    }
}
