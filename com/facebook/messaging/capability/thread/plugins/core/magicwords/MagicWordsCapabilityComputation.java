package com.facebook.messaging.capability.thread.plugins.core.magicwords;

import X.1Bi;
import X.1Br;
import X.1Bu;
import X.1Wa;
import X.7zT;
import X.AbG;
import X.C1v9;
import android.content.Context;
import com.facebook.messaging.model.threads.ThreadSummary;
import com.facebook.user.model.User;

/* loaded from: MagicWordsCapabilityComputation.class */
public final class MagicWordsCapabilityComputation {
    public final Context A00;
    public final 1Wa A01;
    public final 1Br A02;
    public final 1Br A03;
    public final 1Br A04;
    public final ThreadSummary A05;
    public final User A06;
    public final C1v9 A07;

    public MagicWordsCapabilityComputation(Context context, ThreadSummary threadSummary, User user, C1v9 c1v9) {
        7zT.A1T(context, c1v9, threadSummary);
        this.A00 = context;
        this.A07 = c1v9;
        this.A06 = user;
        this.A05 = threadSummary;
        this.A02 = 1Bu.A00(50228);
        this.A03 = AbG.A0b();
        this.A04 = 1Bu.A00(16671);
        this.A01 = (1Wa) 1Bi.A03(66347);
    }
}
