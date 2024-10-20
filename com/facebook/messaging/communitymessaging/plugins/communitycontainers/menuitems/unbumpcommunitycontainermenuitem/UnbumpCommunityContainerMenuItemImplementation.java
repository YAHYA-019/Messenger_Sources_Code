package com.facebook.messaging.communitymessaging.plugins.communitycontainers.menuitems.unbumpcommunitycontainermenuitem;

import X.1BL;
import X.1Br;
import X.AbG;
import android.content.Context;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.messaging.model.threads.ThreadSummary;

/* loaded from: UnbumpCommunityContainerMenuItemImplementation.class */
public final class UnbumpCommunityContainerMenuItemImplementation {
    public final Context A00;
    public final FbUserSession A01;
    public final 1Br A02;
    public final ThreadSummary A03;

    public UnbumpCommunityContainerMenuItemImplementation(Context context, FbUserSession fbUserSession, ThreadSummary threadSummary) {
        1BL.A1F(context, fbUserSession);
        this.A00 = context;
        this.A01 = fbUserSession;
        this.A03 = threadSummary;
        this.A02 = AbG.A0Q();
    }
}
