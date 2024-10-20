package com.facebook.messaging.wellbeing.selfremediation.restrict.plugins.hintcard;

import X.1BL;
import X.1Br;
import X.1Lm;
import X.6IV;
import X.AbG;
import X.AnonymousClass001;
import android.content.Context;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.messaging.model.threads.ThreadSummary;
import com.facebook.user.model.User;

/* loaded from: RestrictHintCardPluginImplementation.class */
public final class RestrictHintCardPluginImplementation {
    public final Context A00;
    public final 1Br A01;
    public final 1Br A02;
    public final ThreadSummary A03;
    public final 6IV A04;
    public final User A05;
    public final FbUserSession A06;

    public RestrictHintCardPluginImplementation(Context context, FbUserSession fbUserSession, ThreadSummary threadSummary, 6IV r305, User user) {
        1BL.A1F(context, fbUserSession);
        this.A00 = context;
        this.A06 = fbUserSession;
        this.A03 = threadSummary;
        if (user == null) {
            throw AnonymousClass001.A0L("Required value was null.");
        }
        this.A05 = user;
        if (r305 == null) {
            throw AnonymousClass001.A0L("Required value was null.");
        }
        this.A04 = r305;
        this.A01 = 1Lm.A00(context, fbUserSession, 82499);
        this.A02 = AbG.A0P();
    }
}
