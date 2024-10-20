package com.facebook.messaging.threadlist.plugins.core.threadmetadata.timestamp;

import X.11T;
import X.2SI;
import X.C01g;
import X.C01i;
import X.C2nv;
import X.C2xw;
import android.content.Context;
import com.facebook.auth.usersession.FbUserSession;

/* loaded from: TimestampImplementation.class */
public final class TimestampImplementation {
    public final C01i A00;

    public TimestampImplementation(Context context, FbUserSession fbUserSession, 2SI r304) {
        11T.A0F(context, 1);
        11T.A0F(fbUserSession, 2);
        11T.A0F(r304, 3);
        this.A00 = C01g.A01(new C2xw(2, context, r304, fbUserSession));
    }

    public final C2nv A00() {
        C2nv c2nv = (C2nv) this.A00.getValue();
        11T.A0I(c2nv, "null cannot be cast to non-null type com.facebook.xapp.messaging.threadlist.thread.syncprotocol.metadataprovider.ThreadMetadataProvider<out com.facebook.xapp.messaging.threadlist.thread.row.model.api.ThreadMetadata>");
        return c2nv;
    }
}
