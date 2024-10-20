package com.facebook.xapp.messaging.composer.datafetch.mailbox;

import X.5iJ;
import X.5iK;
import X.7De;
import android.os.Bundle;
import com.facebook.auth.viewercontext.ViewerContext;

/* loaded from: MailboxComposerDataFetch.class */
public final class MailboxComposerDataFetch extends 5iK {
    public Bundle A00;
    public ViewerContext A01;
    public 5iJ A02;
    public 7De A03;

    /* JADX WARN: Type inference failed for: r0v0, types: [com.facebook.xapp.messaging.composer.datafetch.mailbox.MailboxComposerDataFetch, java.lang.Object] */
    public static MailboxComposerDataFetch create(5iJ r301, 7De r302) {
        ?? obj = new Object();
        obj.A02 = r301;
        obj.A00 = r302.A00;
        obj.A01 = r302.A01;
        obj.A03 = r302;
        return obj;
    }
}
