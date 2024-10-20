package com.facebook.messaging.communitymessaging.threadedreplies.plugins.titlebarbutton.subthreadlistbutton;

import X.1BL;
import X.1Br;
import X.1Bu;
import X.5Sh;
import X.64W;
import X.6FI;
import X.7zT;
import android.content.Context;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.messaging.threadview.scheme.interfaces.ThreadViewColorScheme;

/* loaded from: SubThreadListButton.class */
public final class SubThreadListButton {
    public final Context A00;
    public final FbUserSession A01;
    public final 1Br A02;
    public final 5Sh A03;
    public final 64W A04;
    public final ThreadViewColorScheme A05;
    public final 6FI A06;

    public SubThreadListButton(Context context, FbUserSession fbUserSession, 5Sh r304, 64W r305, ThreadViewColorScheme threadViewColorScheme, 6FI r307) {
        7zT.A1W(context, fbUserSession, r304, threadViewColorScheme);
        1BL.A1G(r307, r305);
        this.A00 = context;
        this.A01 = fbUserSession;
        this.A03 = r304;
        this.A05 = threadViewColorScheme;
        this.A06 = r307;
        this.A04 = r305;
        this.A02 = 1Bu.A00(82374);
    }
}
