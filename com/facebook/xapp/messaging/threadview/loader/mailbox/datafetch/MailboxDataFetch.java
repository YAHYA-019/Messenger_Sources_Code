package com.facebook.xapp.messaging.threadview.loader.mailbox.datafetch;

import X.5TX;
import X.5iJ;
import X.5iK;
import com.facebook.auth.viewercontext.ViewerContext;
import com.facebook.messaging.model.threadkey.ThreadKey;

/* loaded from: MailboxDataFetch.class */
public final class MailboxDataFetch extends 5iK {
    public long A00;
    public ViewerContext A01;
    public ThreadKey A02;
    public 5iJ A03;
    public 5TX A04;

    /* JADX WARN: Type inference failed for: r0v0, types: [com.facebook.xapp.messaging.threadview.loader.mailbox.datafetch.MailboxDataFetch, java.lang.Object] */
    public static MailboxDataFetch create(5iJ r301, 5TX r302) {
        ?? obj = new Object();
        obj.A03 = r301;
        obj.A00 = r302.A00;
        obj.A02 = r302.A02;
        obj.A01 = r302.A01;
        obj.A04 = r302;
        return obj;
    }
}
