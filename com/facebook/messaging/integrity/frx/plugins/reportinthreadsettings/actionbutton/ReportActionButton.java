package com.facebook.messaging.integrity.frx.plugins.reportinthreadsettings.actionbutton;

import X.06Z;
import X.7zR;
import android.content.Context;
import com.facebook.messaging.model.threads.ThreadSummary;

/* loaded from: ReportActionButton.class */
public final class ReportActionButton {
    public final Context A00;
    public final 06Z A01;
    public final ThreadSummary A02;

    public ReportActionButton(Context context, 06Z r303, ThreadSummary threadSummary) {
        7zR.A1N(context, r303);
        this.A00 = context;
        this.A02 = threadSummary;
        this.A01 = r303;
    }
}
