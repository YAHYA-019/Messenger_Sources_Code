package com.facebook.messaging.threadlist.plugins.messengerui.itemviewbinder.threaditem;

import X.06Z;
import X.11T;
import X.1Bq;
import X.1Br;
import X.1Iw;
import X.1pI;
import X.2S4;
import X.2YD;
import X.2YQ;
import X.C01g;
import X.C01i;
import X.C2iF;
import X.C2xn;
import androidx.lifecycle.LifecycleOwner;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.common.callercontext.CallerContext;

/* loaded from: ThreadItemComponentPlugin.class */
public final class ThreadItemComponentPlugin {
    public C2iF A00;
    public final 06Z A01;
    public final LifecycleOwner A02;
    public final FbUserSession A03;
    public final CallerContext A04;
    public final 2S4 A05;
    public final 1pI A06;
    public final 1Br A07;
    public final 1Iw A08;
    public final 2YD A09;
    public final 2YQ A0A;
    public final String A0B;
    public final C01i A0C;

    public ThreadItemComponentPlugin(06Z r302, LifecycleOwner lifecycleOwner, FbUserSession fbUserSession, CallerContext callerContext, 2S4 r306, 1pI r307, 1Iw r308, 2YD r309, 2YQ r310, String str) {
        11T.A0F(r308, 1);
        11T.A0F(r302, 2);
        11T.A0F(lifecycleOwner, 3);
        11T.A0F(r307, 4);
        11T.A0F(r309, 5);
        11T.A0F(r310, 6);
        11T.A0F(callerContext, 7);
        11T.A0F(str, 8);
        11T.A0F(r306, 9);
        11T.A0F(fbUserSession, 10);
        this.A08 = r308;
        this.A01 = r302;
        this.A02 = lifecycleOwner;
        this.A06 = r307;
        this.A09 = r309;
        this.A0A = r310;
        this.A04 = callerContext;
        this.A0B = str;
        this.A05 = r306;
        this.A03 = fbUserSession;
        this.A07 = 1Bq.A00(16385);
        this.A0C = C01g.A01(new C2xn(this, 30));
    }
}
