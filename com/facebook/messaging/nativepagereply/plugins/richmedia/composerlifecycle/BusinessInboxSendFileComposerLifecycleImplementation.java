package com.facebook.messaging.nativepagereply.plugins.richmedia.composerlifecycle;

import X.1BL;
import X.1Bq;
import X.1Br;
import X.6Qf;
import X.C7Zq;
import android.content.Context;
import com.facebook.auth.usersession.FbUserSession;

/* loaded from: BusinessInboxSendFileComposerLifecycleImplementation.class */
public final class BusinessInboxSendFileComposerLifecycleImplementation {
    public final Context A00;
    public final FbUserSession A01;
    public final 1Br A02;
    public final 6Qf A03;
    public final C7Zq A04;

    /* JADX WARN: Type inference failed for: r0v5, types: [X.7Zq] */
    public BusinessInboxSendFileComposerLifecycleImplementation(final Context context, FbUserSession fbUserSession, 6Qf r304) {
        1BL.A1H(r304, fbUserSession, context);
        this.A03 = r304;
        this.A01 = fbUserSession;
        this.A00 = context;
        this.A04 = new Object(context) { // from class: X.7Zq
            public final Context A00;
            public final 1Br A01;

            {
                this.A00 = context;
                this.A01 = 1Bu.A01(context, 115949);
            }
        };
        this.A02 = 1Bq.A00(68137);
    }
}
