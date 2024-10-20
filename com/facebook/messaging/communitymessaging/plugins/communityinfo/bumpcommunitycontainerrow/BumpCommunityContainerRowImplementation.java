package com.facebook.messaging.communitymessaging.plugins.communityinfo.bumpcommunitycontainerrow;

import X.1BL;
import X.1Br;
import X.2Sh;
import X.AbG;
import android.content.Context;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.messaging.model.threads.ThreadSummary;

/* loaded from: BumpCommunityContainerRowImplementation.class */
public final class BumpCommunityContainerRowImplementation {
    public final Context A00;
    public final FbUserSession A01;
    public final 1Br A02;
    public final ThreadSummary A03;
    public final 2Sh A04;

    public BumpCommunityContainerRowImplementation(Context context, FbUserSession fbUserSession, ThreadSummary threadSummary, 2Sh r305) {
        1BL.A11(1, context, fbUserSession, r305);
        this.A00 = context;
        this.A03 = threadSummary;
        this.A01 = fbUserSession;
        this.A04 = r305;
        this.A02 = AbG.A0Q();
    }
}
