package com.facebook.messaging.communitymessaging.plugins.bumpedthreads.bumpmenuitem;

import X.1Bq;
import X.1Br;
import X.7zM;
import X.AbG;
import android.content.Context;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.messaging.inbox.units.InboxTrackableItem;
import com.facebook.messaging.model.threads.ThreadSummary;

/* loaded from: BumpMenuItemImplementation.class */
public final class BumpMenuItemImplementation {
    public final Context A00;
    public final FbUserSession A01;
    public final InboxTrackableItem A06;
    public final ThreadSummary A07;
    public final 1Br A03 = 7zM.A0O();
    public final 1Br A04 = AbG.A0c();
    public final 1Br A05 = 1Bq.A00(68669);
    public final 1Br A02 = AbG.A0X();

    public BumpMenuItemImplementation(Context context, FbUserSession fbUserSession, InboxTrackableItem inboxTrackableItem, ThreadSummary threadSummary) {
        this.A00 = context;
        this.A07 = threadSummary;
        this.A06 = inboxTrackableItem;
        this.A01 = fbUserSession;
    }
}
