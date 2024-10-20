package com.facebook.messaging.capability.thread.plugins.core.archivethread;

import X.1BL;
import X.1Br;
import X.1Bu;
import X.C1v9;
import android.content.Context;
import com.facebook.messaging.model.threads.ThreadSummary;

/* loaded from: ArchiveThreadCapabilityComputation.class */
public final class ArchiveThreadCapabilityComputation {
    public final 1Br A00;
    public final 1Br A01;
    public final ThreadSummary A02;
    public final C1v9 A03;
    public final Context A04;

    public ArchiveThreadCapabilityComputation(Context context, ThreadSummary threadSummary, C1v9 c1v9) {
        1BL.A1H(context, threadSummary, c1v9);
        this.A04 = context;
        this.A02 = threadSummary;
        this.A03 = c1v9;
        this.A01 = 1Bu.A00(33058);
        this.A00 = 1Bu.A00(82621);
    }
}
