package com.facebook.messaging.threadlist.threaditemmenu.plugins.core.pinmenuitem;

import X.04R;
import X.11T;
import X.1BK;
import X.1Br;
import X.1Lm;
import X.1Um;
import X.7zQ;
import X.BDJ;
import X.BU3;
import X.CHA;
import X.CSF;
import X.Czi;
import X.Czj;
import android.content.Context;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.messaging.inbox.units.InboxTrackableItem;
import com.facebook.messaging.model.threads.ThreadSummary;
import com.facebook.msys.mca.MailboxFutureImpl;

/* loaded from: PinMenuItemImplementation.class */
public final class PinMenuItemImplementation {
    public final Context A00;

    public PinMenuItemImplementation(Context context) {
        11T.A0F(context, 1);
        this.A00 = context;
    }

    public final void A00(FbUserSession fbUserSession, InboxTrackableItem inboxTrackableItem, ThreadSummary threadSummary) {
        11T.A0H(fbUserSession, threadSummary);
        Context context = this.A00;
        CHA cha = (CHA) 1Lm.A05(context, fbUserSession, 82633);
        CSF csf = new CSF(this, inboxTrackableItem, 32);
        BDJ bdj = (BDJ) 1Br.A0B(cha.A04);
        1Um AQV = bdj.mMailboxApiHandleMetaProvider.AQV(0);
        MailboxFutureImpl A0P = 1BK.A0P(AQV);
        Czj.A01(AQV, A0P, bdj, 95);
        A0P.addResultCallback(new Czi(11, context, csf, threadSummary, cha));
        if (inboxTrackableItem != null) {
            BU3.A00().A04(inboxTrackableItem, "longpressinbox:favorite", 04R.A0A(7zQ.A1b("at", "favorite")));
        }
    }
}
