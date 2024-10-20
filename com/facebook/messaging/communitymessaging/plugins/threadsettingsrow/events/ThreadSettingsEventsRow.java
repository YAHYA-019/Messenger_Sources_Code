package com.facebook.messaging.communitymessaging.plugins.threadsettingsrow.events;

import X.1BL;
import X.2Sh;
import X.DHd;
import android.content.Context;
import com.facebook.messaging.model.threads.ThreadSummary;

/* loaded from: ThreadSettingsEventsRow.class */
public final class ThreadSettingsEventsRow {
    public final Context A00;
    public final ThreadSummary A01;
    public final DHd A02;
    public final 2Sh A03;

    public ThreadSettingsEventsRow(Context context, ThreadSummary threadSummary, DHd dHd, 2Sh r305) {
        1BL.A1F(context, dHd);
        this.A00 = context;
        this.A02 = dHd;
        this.A01 = threadSummary;
        this.A03 = r305;
    }
}
