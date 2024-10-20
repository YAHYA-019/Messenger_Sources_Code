package com.facebook.messaging.communitymessaging.polls.plugins.polldeletion.polldetailsaction;

import X.1BL;
import X.1Br;
import X.1Bu;
import X.7zM;
import android.content.Context;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.messaging.model.threadkey.ThreadKey;

/* loaded from: PollDetailsActionImplementation.class */
public final class PollDetailsActionImplementation {
    public final Context A00;
    public final FbUserSession A01;
    public final 1Br A02;
    public final 1Br A03;
    public final ThreadKey A04;
    public final String A05;

    public PollDetailsActionImplementation(Context context, FbUserSession fbUserSession, ThreadKey threadKey, String str) {
        1BL.A11(1, context, threadKey, fbUserSession);
        this.A00 = context;
        this.A05 = str;
        this.A04 = threadKey;
        this.A01 = fbUserSession;
        this.A02 = 7zM.A0U();
        this.A03 = 1Bu.A01(context, 83032);
    }
}
