package com.facebook.messaging.groups.plugins.core.threadsettings.joinrequestssurface;

import X.1Bq;
import X.1Br;
import X.7zT;
import X.DHc;
import X.DIi;
import android.content.Context;
import com.facebook.messaging.model.threadkey.ThreadKey;

/* loaded from: JoinRequestsSurface.class */
public final class JoinRequestsSurface {
    public final 1Br A00;
    public final ThreadKey A01;
    public final DIi A02;
    public final DHc A03;
    public final Context A04;

    public JoinRequestsSurface(Context context, ThreadKey threadKey, DIi dIi, DHc dHc) {
        7zT.A1W(context, threadKey, dIi, dHc);
        this.A04 = context;
        this.A01 = threadKey;
        this.A02 = dIi;
        this.A03 = dHc;
        this.A00 = 1Bq.A00(82449);
    }
}
