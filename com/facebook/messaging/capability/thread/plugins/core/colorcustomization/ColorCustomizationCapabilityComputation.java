package com.facebook.messaging.capability.thread.plugins.core.colorcustomization;

import X.1BK;
import X.1BL;
import X.1Bq;
import X.1Br;
import X.1Bu;
import X.AbG;
import X.C1v9;
import android.content.Context;
import com.facebook.messaging.model.threads.ThreadSummary;
import com.facebook.user.model.User;

/* loaded from: ColorCustomizationCapabilityComputation.class */
public final class ColorCustomizationCapabilityComputation {
    public final Context A00;
    public final 1Br A01;
    public final 1Br A02;
    public final 1Br A03;
    public final 1Br A04;
    public final 1Br A05;
    public final ThreadSummary A06;
    public final User A07;
    public final C1v9 A08;

    public ColorCustomizationCapabilityComputation(Context context, ThreadSummary threadSummary, User user, C1v9 c1v9) {
        1BL.A11(1, context, threadSummary, c1v9);
        this.A00 = context;
        this.A07 = user;
        this.A06 = threadSummary;
        this.A08 = c1v9;
        this.A01 = 1Bu.A00(50228);
        this.A02 = 1Bq.A00(67347);
        this.A05 = 1Bq.A00(67703);
        this.A03 = AbG.A0b();
        this.A04 = 1BK.A0C();
    }
}
