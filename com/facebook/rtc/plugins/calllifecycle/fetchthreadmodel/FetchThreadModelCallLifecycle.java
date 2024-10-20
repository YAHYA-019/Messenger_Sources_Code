package com.facebook.rtc.plugins.calllifecycle.fetchthreadmodel;

import X.1BL;
import X.1Br;
import X.1Bu;
import X.1HG;
import X.1Lm;
import X.1PA;
import X.3Fu;
import X.47I;
import X.5Vk;
import X.5Vm;
import X.GOp;
import X.Gyu;
import X.IPV;
import X.Inh;
import android.content.Context;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.common.callercontext.CallerContext;
import com.facebook.messaging.model.threadkey.ThreadKey;

/* loaded from: FetchThreadModelCallLifecycle.class */
public final class FetchThreadModelCallLifecycle {
    public 1PA A00;
    public final 1Br A01;
    public final 1Br A02;
    public final 3Fu A03;
    public final Context A04;
    public final FbUserSession A05;

    public FetchThreadModelCallLifecycle(Context context, FbUserSession fbUserSession) {
        1BL.A1F(context, fbUserSession);
        this.A04 = context;
        this.A05 = fbUserSession;
        this.A03 = Gyu.A00(this, 31);
        this.A01 = 1HG.A00(context, 65728);
        this.A02 = 1Lm.A00(context, fbUserSession, 99978);
    }

    public static final void A00(FetchThreadModelCallLifecycle fetchThreadModelCallLifecycle) {
        ThreadKey threadKey = GOp.A0r(fetchThreadModelCallLifecycle.A02).A05;
        if (threadKey != null) {
            IPV ipv = (IPV) 1Bu.A06(fetchThreadModelCallLifecycle.A04, 114871);
            FbUserSession fbUserSession = fetchThreadModelCallLifecycle.A05;
            5Vm A02 = ((5Vk) 1Br.A0B(ipv.A01)).A02(threadKey);
            A02.A03 = true;
            A02.A01 = CallerContext.A06(IPV.class);
            47I A00 = A02.A00();
            1Br.A0D(ipv.A02, new Inh(13, threadKey, ipv, fbUserSession), A00);
        }
    }
}
