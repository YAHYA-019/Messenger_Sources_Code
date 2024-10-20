package com.facebook.messaging.publicchats.plugins.externalsharehscrollbuttons.sharetofacebook;

import X.11T;
import com.facebook.messaging.model.threads.ThreadSummary;
import com.facebook.mig.scheme.interfaces.MigColorScheme;

/* loaded from: ShareToFacebookHScrollButtonImplementation.class */
public final class ShareToFacebookHScrollButtonImplementation {
    public final ThreadSummary A00;
    public final MigColorScheme A01;
    public final String A02;

    public ShareToFacebookHScrollButtonImplementation(ThreadSummary threadSummary, MigColorScheme migColorScheme, String str) {
        11T.A0F(migColorScheme, 1);
        this.A01 = migColorScheme;
        this.A00 = threadSummary;
        this.A02 = str;
    }
}
