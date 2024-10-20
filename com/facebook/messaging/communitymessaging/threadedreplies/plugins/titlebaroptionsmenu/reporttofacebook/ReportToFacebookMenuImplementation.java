package com.facebook.messaging.communitymessaging.threadedreplies.plugins.titlebaroptionsmenu.reporttofacebook;

import X.06Z;
import X.1BL;
import X.1Br;
import X.7zM;
import android.content.Context;
import com.facebook.messaging.model.threads.ThreadSummary;

/* loaded from: ReportToFacebookMenuImplementation.class */
public final class ReportToFacebookMenuImplementation {
    public final Context A00;
    public final 06Z A01;
    public final 1Br A02;
    public final ThreadSummary A03;

    public ReportToFacebookMenuImplementation(Context context, 06Z r303, ThreadSummary threadSummary) {
        1BL.A1F(context, r303);
        this.A00 = context;
        this.A01 = r303;
        this.A03 = threadSummary;
        this.A02 = 7zM.A0e(context);
    }
}
