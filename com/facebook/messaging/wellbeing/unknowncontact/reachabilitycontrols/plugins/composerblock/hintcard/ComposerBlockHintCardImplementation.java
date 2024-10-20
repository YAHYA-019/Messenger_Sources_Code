package com.facebook.messaging.wellbeing.unknowncontact.reachabilitycontrols.plugins.composerblock.hintcard;

import X.06Z;
import X.1BL;
import X.1Br;
import X.1Bu;
import X.7zR;
import android.content.Context;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.messaging.model.threads.ThreadSummary;
import com.facebook.user.model.User;

/* loaded from: ComposerBlockHintCardImplementation.class */
public final class ComposerBlockHintCardImplementation {
    public static String A07;
    public final Context A00;
    public final 06Z A01;
    public final FbUserSession A02;
    public final 1Br A03;
    public final ThreadSummary A04;
    public final User A05;
    public final String A06;

    public ComposerBlockHintCardImplementation(Context context, 06Z r303, FbUserSession fbUserSession, ThreadSummary threadSummary, User user, String str) {
        7zR.A1N(context, fbUserSession);
        1BL.A1G(str, r303);
        this.A00 = context;
        this.A05 = user;
        this.A02 = fbUserSession;
        this.A04 = threadSummary;
        this.A06 = str;
        this.A01 = r303;
        this.A03 = 1Bu.A00(99674);
    }
}
