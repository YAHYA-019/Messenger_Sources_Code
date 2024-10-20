package com.facebook.messaging.presence.plugins.core.threadpresence.loader;

import X.11T;
import X.1Br;
import X.1Bu;
import X.6iB;
import X.7Nf;
import android.content.Context;
import com.facebook.messaging.model.threadkey.ThreadKey;

/* loaded from: ThreadPresenceDataLoad.class */
public final class ThreadPresenceDataLoad {
    public final 1Br A00;
    public final ThreadKey A01;
    public final 7Nf A02;
    public final Context A03;

    public ThreadPresenceDataLoad(Context context, ThreadKey threadKey, 6iB r304) {
        11T.A0F(context, 1);
        11T.A0F(r304, 3);
        this.A03 = context;
        this.A01 = threadKey;
        this.A00 = 1Bu.A00(67633);
        this.A02 = new 7Nf(this, r304);
    }
}
