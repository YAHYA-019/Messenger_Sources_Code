package com.facebook.messaging.communitymessaging.plugins.takedowns.threadname;

import X.11T;
import X.1BK;
import X.5yJ;
import X.C2ow;
import android.content.Context;
import com.facebook.messaging.model.threads.ThreadSummary;

/* loaded from: TakedownThreadNameImplementation.class */
public final class TakedownThreadNameImplementation {
    public final Context A00;

    public TakedownThreadNameImplementation(Context context) {
        11T.A0F(context, 1);
        this.A00 = context;
    }

    public final C2ow A00(ThreadSummary threadSummary) {
        11T.A0F(threadSummary, 0);
        if (!5yJ.A01(threadSummary)) {
            return null;
        }
        String str = threadSummary.A20;
        if (str == null) {
            str = "";
        }
        if (str.length() == 0) {
            str = 1BK.A0u(this.A00, 2131966709);
        }
        return new C2ow(str);
    }
}
