package com.facebook.messaging.capability.thread.plugins.core.threadphotocustomization;

import X.1BL;
import X.1Br;
import X.1Bu;
import X.AbG;
import X.C1v9;
import android.content.Context;
import com.facebook.messaging.model.threads.ThreadSummary;

/* loaded from: ThreadPhotoCustomizationCapabilityComputation.class */
public final class ThreadPhotoCustomizationCapabilityComputation {
    public final 1Br A00;
    public final 1Br A01;
    public final 1Br A02;
    public final 1Br A03;
    public final 1Br A04;
    public final 1Br A05;
    public final ThreadSummary A06;
    public final C1v9 A07;
    public final Context A08;

    public ThreadPhotoCustomizationCapabilityComputation(Context context, ThreadSummary threadSummary, C1v9 c1v9) {
        1BL.A1H(context, threadSummary, c1v9);
        this.A08 = context;
        this.A06 = threadSummary;
        this.A07 = c1v9;
        this.A03 = 1Bu.A01(context, 82392);
        this.A04 = 1Bu.A00(82617);
        this.A01 = AbG.A0Q();
        this.A00 = 1Bu.A01(context, 83104);
        this.A02 = AbG.A0b();
        this.A05 = 1Bu.A00(16671);
    }
}
