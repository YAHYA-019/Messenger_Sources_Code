package com.facebook.messaging.communitymessaging.threadedreplies.plugins.titlebarbutton.options;

import X.06Z;
import X.11T;
import X.5Sh;
import X.64W;
import X.C5xv;
import android.content.Context;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.messaging.threadview.scheme.interfaces.ThreadViewColorScheme;
import com.facebook.xapp.messaging.capability.vector.Capabilities;

/* loaded from: ThreadedRepliesTitleBarOptionsButtonImpl.class */
public final class ThreadedRepliesTitleBarOptionsButtonImpl {
    public final Context A00;
    public final 06Z A01;
    public final FbUserSession A02;
    public final 5Sh A03;
    public final 64W A04;
    public final ThreadViewColorScheme A05;
    public final C5xv A06;
    public final Capabilities A07;

    public ThreadedRepliesTitleBarOptionsButtonImpl(Context context, 06Z r303, FbUserSession fbUserSession, 5Sh r305, 64W r306, ThreadViewColorScheme threadViewColorScheme, C5xv c5xv, Capabilities capabilities) {
        11T.A0F(threadViewColorScheme, 3);
        this.A00 = context;
        this.A03 = r305;
        this.A05 = threadViewColorScheme;
        this.A01 = r303;
        this.A07 = capabilities;
        this.A04 = r306;
        this.A06 = c5xv;
        this.A02 = fbUserSession;
    }
}
