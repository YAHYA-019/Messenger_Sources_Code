package com.facebook.messaging.wellbeing.reportingenforcement.plugins.unsend.unsendwarningbanner;

import X.1BY;
import X.1Bn;
import X.1HN;
import X.1LI;
import X.6JT;
import X.6Ky;
import X.7OD;
import X.7OX;
import X.9DU;
import X.9pX;
import X.C1pq;
import X.C3v;
import X.C9eu;
import X.C9g0;
import X.C9pc;
import android.R;
import android.content.Context;
import android.view.View;
import com.facebook.messaging.model.threads.ThreadSummary;
import com.google.common.collect.ImmutableList;

/* loaded from: UnsendWarningBanner.class */
public final class UnsendWarningBanner {
    public 1HN A00;
    public final C9eu A01;
    public final C3v A02;
    public final 7OD A03;

    public UnsendWarningBanner(Context context) {
        this.A03 = (7OD) 1Bn.A0E(context, (1BY) null, 67591);
        this.A01 = (C9eu) 1Bn.A0E(context, (1BY) null, 67895);
        this.A02 = (C3v) 1Bn.A0E(context, (1BY) null, 85089);
    }

    public static void A00(Context context, ThreadSummary threadSummary, 7OX r303, UnsendWarningBanner unsendWarningBanner) {
        String string = context.getString(2131960083);
        C1pq.A08("title", string);
        String string2 = context.getString(2131960082);
        r303.CXr(new 6Ky((View.OnClickListener) null, (View.OnClickListener) null, (1LI) null, (C9g0) null, 9DU.A00(new C9pc(6, unsendWarningBanner, threadSummary, context, r303), context.getString(2131960081)), 9DU.A00(new 9pX(7, unsendWarningBanner, threadSummary, r303), context.getString(R.string.ok)), (ImmutableList) null, "ls://circleicon?icon=undo&iconColor=staticwhite&circleColor=blue", string2, string, 6JT.class, (Integer) null, 0, false));
        C9eu.A00(unsendWarningBanner.A01, threadSummary, "show");
        unsendWarningBanner.A03.A01();
    }
}
