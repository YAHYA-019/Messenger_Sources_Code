package com.facebook.messaging.communitymessaging.plugins.adminonboarding.hintcard;

import X.0Q8;
import X.11T;
import X.1BK;
import X.1Br;
import X.1G2;
import X.1HN;
import X.1NK;
import X.63D;
import X.64W;
import X.6IV;
import X.7zM;
import X.AbG;
import X.Czs;
import android.content.Context;
import com.facebook.messaging.model.threads.ThreadSummary;
import com.facebook.messaging.threadview.params.ThreadViewParams;
import com.facebook.prefs.shared.FbSharedPreferences;

/* loaded from: SendWelcomeMessageHintCardImplementation.class */
public final class SendWelcomeMessageHintCardImplementation {
    public static 1HN A0A;
    public static boolean A0B;
    public final Context A00;
    public final 1Br A01;
    public final 1Br A02;
    public final 1Br A03;
    public final ThreadSummary A04;
    public final 64W A05;
    public final 63D A06;
    public final ThreadViewParams A07;
    public final 6IV A08;
    public final Czs A09;

    public SendWelcomeMessageHintCardImplementation(Context context, ThreadSummary threadSummary, 64W r304, 63D r305, ThreadViewParams threadViewParams, 6IV r307) {
        1BK.A1J(context, 1, r304);
        this.A00 = context;
        this.A08 = r307;
        this.A05 = r304;
        this.A06 = r305;
        this.A07 = threadViewParams;
        this.A04 = threadSummary;
        1Br A0E = 1BK.A0E();
        this.A02 = A0E;
        this.A01 = AbG.A0c();
        this.A03 = 7zM.A0Q();
        Czs czs = new Czs(this, 4);
        this.A09 = czs;
        if (A0B) {
            return;
        }
        A0A = czs;
        FbSharedPreferences A09 = 1Br.A09(A0E);
        1G2 r0 = 1NK.A06;
        1HN r02 = A0A;
        if (r02 == null) {
            11T.A0L("listener");
            throw 0Q8.createAndThrow();
        }
        A09.CcV(r02, r0);
        A0B = true;
    }
}
