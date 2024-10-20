package com.facebook.messaging.inbox.fragment.plugins.core.performancemanager;

import X.11T;
import X.1Bq;
import X.1Br;
import X.1Bu;
import X.1Lm;
import X.6CH;
import X.6CJ;
import X.82O;
import X.C5iq;
import X.C5is;
import X.C5it;
import android.content.Context;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.quicklog.LightweightQuickPerformanceLogger;

/* loaded from: PerformanceScrollListenerPluginImplementation.class */
public final class PerformanceScrollListenerPluginImplementation {
    public final 6CH A00;
    public final C5it A01;
    public final 1Br A02;
    public final 1Br A03;
    public final 1Br A04;
    public final 1Br A05;
    public final FbUserSession A06;

    public PerformanceScrollListenerPluginImplementation(Context context, FbUserSession fbUserSession) {
        11T.A0F(context, 1);
        11T.A0F(fbUserSession, 2);
        this.A06 = fbUserSession;
        this.A05 = 1Bu.A01(context, 65581);
        this.A03 = 1Bu.A00(66946);
        this.A02 = 1Lm.A00(context, fbUserSession, 66545);
        this.A04 = 1Bq.A00(16520);
        this.A00 = ((82O) this.A05.A00.get()).A02(5505081);
        this.A01 = new C5is(context, new C5iq((LightweightQuickPerformanceLogger) ((6CJ) this.A03.A00.get()).A00.A00.get(), "android_messenger_thread_list_scroll_perf", 5505221));
    }
}
