package com.facebook.messaging.wellbeing.selfremediation.plugins.cannotreply.hintcard;

import X.06Z;
import X.1Br;
import X.1Bu;
import X.7zR;
import X.7zS;
import X.KPP;
import android.content.Context;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.messaging.model.threads.ThreadSummary;
import com.facebook.user.model.User;

/* loaded from: CannotReplyHintCardImplementation.class */
public final class CannotReplyHintCardImplementation {
    public KPP A00;
    public final Context A01;
    public final 06Z A02;
    public final FbUserSession A03;
    public final 1Br A04;
    public final 1Br A05;
    public final 1Br A06;
    public final 1Br A07;
    public final ThreadKey A08;
    public final ThreadSummary A09;
    public final User A0A;
    public final String A0B;

    public CannotReplyHintCardImplementation(Context context, 06Z r303, FbUserSession fbUserSession, ThreadSummary threadSummary, User user) {
        7zS.A17(1, context, fbUserSession, r303);
        this.A01 = context;
        this.A09 = threadSummary;
        this.A0A = user;
        this.A03 = fbUserSession;
        this.A02 = r303;
        this.A04 = 1Bu.A00(66665);
        this.A06 = 1Bu.A01(context, 83021);
        this.A07 = 1Bu.A00(66297);
        this.A05 = 1Bu.A00(99674);
        this.A0B = 7zR.A0s();
        this.A08 = threadSummary != null ? threadSummary.A0n : null;
    }
}
