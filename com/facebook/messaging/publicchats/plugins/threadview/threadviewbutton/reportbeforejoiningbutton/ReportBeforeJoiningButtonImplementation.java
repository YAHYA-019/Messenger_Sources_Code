package com.facebook.messaging.publicchats.plugins.threadview.threadviewbutton.reportbeforejoiningbutton;

import X.06Z;
import X.11T;
import X.1BL;
import X.1Br;
import X.5Sh;
import X.7zM;
import android.content.Context;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.messaging.threadview.scheme.interfaces.ThreadViewColorScheme;

/* loaded from: ReportBeforeJoiningButtonImplementation.class */
public final class ReportBeforeJoiningButtonImplementation {
    public final Context A00;
    public final 06Z A01;
    public final 1Br A02;
    public final 1Br A03;
    public final ThreadKey A04;
    public final 5Sh A05;
    public final ThreadViewColorScheme A06;

    public ReportBeforeJoiningButtonImplementation(Context context, 06Z r303, ThreadKey threadKey, 5Sh r305, ThreadViewColorScheme threadViewColorScheme) {
        1BL.A1H(threadViewColorScheme, context, threadKey);
        11T.A0F(r303, 5);
        this.A06 = threadViewColorScheme;
        this.A00 = context;
        this.A04 = threadKey;
        this.A05 = r305;
        this.A01 = r303;
        this.A03 = 7zM.A0e(context);
        this.A02 = 7zM.A0U();
    }
}
