package com.facebook.messaging.threadsettings.plugins.core.contextsubheading.activestatus;

import X.11T;
import X.1BL;
import X.1Br;
import X.1Bu;
import X.2Sh;
import android.content.Context;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.messaging.model.threads.ThreadSummary;
import com.facebook.user.model.User;
import com.facebook.xapp.messaging.capability.vector.Capabilities;

/* loaded from: ActiveStatusThreadSettingsContextSubheading.class */
public final class ActiveStatusThreadSettingsContextSubheading {
    public final Context A00;
    public final FbUserSession A01;
    public final 1Br A02;
    public final ThreadSummary A03;
    public final User A04;
    public final Capabilities A05;
    public final 2Sh A06;

    public ActiveStatusThreadSettingsContextSubheading(Context context, FbUserSession fbUserSession, ThreadSummary threadSummary, User user, Capabilities capabilities, 2Sh r307) {
        11T.A0F(capabilities, 4);
        1BL.A1G(r307, fbUserSession);
        this.A00 = context;
        this.A03 = threadSummary;
        this.A04 = user;
        this.A05 = capabilities;
        this.A06 = r307;
        this.A01 = fbUserSession;
        this.A02 = 1Bu.A01(context, 83203);
    }
}
