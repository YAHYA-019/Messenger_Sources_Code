package com.facebook.messaging.communitymessaging.plugins.bumpedthreads.unbumpmenuitem;

import X.11T;
import X.1Bq;
import X.1Br;
import X.1Bu;
import X.2SI;
import X.7zM;
import X.AbG;
import android.content.Context;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.messaging.inbox.units.InboxTrackableItem;
import com.facebook.messaging.model.threads.ThreadSummary;

/* loaded from: UnbumpMenuItemImplementation.class */
public final class UnbumpMenuItemImplementation {
    public final Context A00;
    public final FbUserSession A01;
    public final 1Br A02;
    public final 1Br A03;
    public final 1Br A04;
    public final 1Br A05;
    public final 1Br A06;
    public final InboxTrackableItem A07;
    public final ThreadSummary A08;
    public final 2SI A09;

    public UnbumpMenuItemImplementation(Context context, FbUserSession fbUserSession, InboxTrackableItem inboxTrackableItem, ThreadSummary threadSummary, 2SI r306) {
        11T.A0F(r306, 4);
        this.A00 = context;
        this.A08 = threadSummary;
        this.A07 = inboxTrackableItem;
        this.A09 = r306;
        this.A01 = fbUserSession;
        this.A03 = 7zM.A0O();
        this.A04 = 1Bu.A01(context, 83118);
        this.A06 = AbG.A0U();
        this.A05 = 1Bq.A00(68669);
        this.A02 = AbG.A0X();
    }
}
