package com.facebook.messaging.cutover.plugins.readonlycomposerblock;

import X.11T;
import X.1BL;
import X.63D;
import android.content.Context;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.messaging.model.threads.ThreadSummary;
import com.facebook.user.model.User;

/* loaded from: ReadOnlyThreadComposerBlockImplementation.class */
public final class ReadOnlyThreadComposerBlockImplementation {
    public static String A06;
    public final Context A00;
    public final FbUserSession A01;
    public final ThreadSummary A02;
    public final 63D A03;
    public final User A04;
    public final String A05;

    public ReadOnlyThreadComposerBlockImplementation(Context context, FbUserSession fbUserSession, ThreadSummary threadSummary, 63D r305, User user, String str) {
        11T.A0F(context, 1);
        1BL.A1G(str, fbUserSession);
        this.A00 = context;
        this.A04 = user;
        this.A03 = r305;
        this.A02 = threadSummary;
        this.A05 = str;
        this.A01 = fbUserSession;
    }
}
