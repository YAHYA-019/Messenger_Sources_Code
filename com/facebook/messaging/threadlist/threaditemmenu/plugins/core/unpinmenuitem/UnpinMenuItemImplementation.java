package com.facebook.messaging.threadlist.threaditemmenu.plugins.core.unpinmenuitem;

import X.04R;
import X.11T;
import X.1Br;
import X.1Lm;
import X.7zQ;
import X.BDb;
import X.BU3;
import X.BWf;
import X.CHA;
import X.CzP;
import X.Czf;
import android.content.Context;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.messaging.inbox.units.InboxTrackableItem;
import com.facebook.messaging.model.threads.ThreadSummary;

/* loaded from: UnpinMenuItemImplementation.class */
public final class UnpinMenuItemImplementation {
    public final Context A00;

    public UnpinMenuItemImplementation(Context context) {
        11T.A0F(context, 1);
        this.A00 = context;
    }

    public final void A00(FbUserSession fbUserSession, InboxTrackableItem inboxTrackableItem, ThreadSummary threadSummary) {
        11T.A0H(fbUserSession, threadSummary);
        CHA cha = (CHA) 1Lm.A05(this.A00, fbUserSession, 82633);
        long A00 = BWf.A00(threadSummary);
        ((BDb) 1Br.A0B(cha.A03)).A00(CzP.A00, Czf.A00(threadSummary, cha, 31, A00), A00);
        if (inboxTrackableItem != null) {
            BU3.A00().A04(inboxTrackableItem, "longpressinbox:unfavorite", 04R.A0A(7zQ.A1b("at", "unfavorite")));
        }
    }
}
