package com.facebook.messaging.threadlist.plugins.core.threadmetadata.sendstate;

import X.11T;
import X.C01g;
import X.C01i;
import X.C2nt;
import X.C2xu;
import android.content.Context;
import com.facebook.auth.usersession.FbUserSession;

/* loaded from: SendStateProviderImplementation.class */
public final class SendStateProviderImplementation {
    public final C01i A00;

    public SendStateProviderImplementation(Context context, FbUserSession fbUserSession) {
        11T.A0F(context, 1);
        11T.A0F(fbUserSession, 2);
        this.A00 = C01g.A01(new C2xu(context, fbUserSession, 12));
    }

    public final C2nt A00() {
        C2nt c2nt = (C2nt) this.A00.getValue();
        11T.A0I(c2nt, "null cannot be cast to non-null type com.facebook.xapp.messaging.threadlist.thread.syncprotocol.metadataprovider.ThreadMetadataProvider<out com.facebook.xapp.messaging.threadlist.thread.row.model.api.ThreadMetadata>");
        return c2nt;
    }
}
