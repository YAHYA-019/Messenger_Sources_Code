package com.facebook.messaging.polling.plugins.core.msysmutation;

import X.11T;
import X.1Bq;
import X.1Br;
import X.1Lm;
import X.7zM;
import android.content.Context;
import com.facebook.auth.usersession.FbUserSession;

/* loaded from: PollMutationMsysImplementation.class */
public final class PollMutationMsysImplementation {
    public long A00;
    public long A01;
    public final 1Br A02;
    public final 1Br A03;
    public final 1Br A04;
    public final 1Br A05;
    public final Context A06;
    public final FbUserSession A07;

    public PollMutationMsysImplementation(Context context) {
        11T.A0F(context, 1);
        this.A06 = context;
        1Br A0e = 7zM.A0e(context);
        this.A05 = A0e;
        FbUserSession A03 = 1Br.A03(A0e);
        this.A07 = A03;
        this.A02 = 1Lm.A00(context, A03, 68268);
        this.A03 = 1Bq.A00(66774);
        this.A04 = 7zM.A0O();
    }
}
