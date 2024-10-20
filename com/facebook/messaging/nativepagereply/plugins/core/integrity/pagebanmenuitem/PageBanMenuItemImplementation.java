package com.facebook.messaging.nativepagereply.plugins.core.integrity.pagebanmenuitem;

import X.06Z;
import X.1BL;
import android.content.Context;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.messaging.model.threads.ThreadSummary;

/* loaded from: PageBanMenuItemImplementation.class */
public final class PageBanMenuItemImplementation {
    public final Context A00;
    public final 06Z A01;
    public final FbUserSession A02;
    public final ThreadSummary A03;

    public PageBanMenuItemImplementation(Context context, 06Z r303, FbUserSession fbUserSession, ThreadSummary threadSummary) {
        1BL.A11(1, context, r303, fbUserSession);
        this.A00 = context;
        this.A03 = threadSummary;
        this.A01 = r303;
        this.A02 = fbUserSession;
    }
}
