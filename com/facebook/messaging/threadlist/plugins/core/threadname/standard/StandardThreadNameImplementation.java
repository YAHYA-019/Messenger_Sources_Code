package com.facebook.messaging.threadlist.plugins.core.threadname.standard;

import X.11T;
import X.2mM;
import X.C01g;
import X.C01i;
import X.C0ty;
import X.C2gh;
import X.C2xu;
import android.content.Context;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.messaging.model.threads.ThreadSummary;
import com.google.common.collect.ImmutableList;

/* loaded from: StandardThreadNameImplementation.class */
public final class StandardThreadNameImplementation {
    public final C01i A00;

    public StandardThreadNameImplementation(Context context, FbUserSession fbUserSession) {
        11T.A0F(context, 1);
        11T.A0F(fbUserSession, 2);
        this.A00 = C01g.A01(new C2xu(context, fbUserSession, 13));
    }

    public final 2mM A00(ThreadSummary threadSummary) {
        11T.A0F(threadSummary, 0);
        String str = threadSummary.A20;
        if (str == null) {
            str = "";
        }
        if (str.length() > 0) {
            return new 2mM(str, C0ty.A00);
        }
        ImmutableList immutableList = ((C2gh) this.A00.getValue()).A01(threadSummary).A02;
        11T.A0A(immutableList);
        return new 2mM((String) null, immutableList);
    }
}
