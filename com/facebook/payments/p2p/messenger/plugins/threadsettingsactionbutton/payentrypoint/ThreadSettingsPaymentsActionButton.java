package com.facebook.payments.p2p.messenger.plugins.threadsettingsactionbutton.payentrypoint;

import X.1BQ;
import X.1Br;
import X.2MQ;
import X.2yD;
import X.4YU;
import X.4YV;
import X.5yY;
import X.AbL;
import X.C00i;
import X.C3P0;
import X.C8R;
import X.COp;
import X.DHb;
import X.FXt;
import android.content.Context;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.messaging.model.threads.ThreadSummary;
import com.facebook.user.model.User;
import com.facebook.xapp.messaging.capability.vector.Capabilities;

/* loaded from: ThreadSettingsPaymentsActionButton.class */
public final class ThreadSettingsPaymentsActionButton {
    public static final 2MQ A01 = C3P0.A00("USD");
    public final C00i A00 = 1BQ.A02(50013);

    public static boolean A00(ThreadSummary threadSummary, 5yY r302, User user, Capabilities capabilities) {
        if (AbL.A1D()) {
            return false;
        }
        if (user != null && user.A05) {
            return false;
        }
        1Br r0 = r302.A00;
        if (((2yD) r0.get()).AZk(36312870454826067L) && threadSummary != null && 4YU.A1Y(capabilities, 0)) {
            return ((2yD) r0.get()).AZk(36312870454760530L);
        }
        return false;
    }

    /* JADX WARN: Type inference failed for: r0v12, types: [X.COp, java.lang.Object] */
    public C8R A01(Context context, DHb dHb, 5yY r304) {
        int i = 2131967132;
        if (((2yD) r304.A00.get()).AZk(36312870457644129L)) {
            i = 2131967131;
        }
        FbUserSession A0D = 4YV.A0D(context);
        ?? obj = new Object();
        ((COp) obj).A03 = new FXt(30, A0D, this, dHb);
        COp.A01(A01, (COp) obj);
        ((COp) obj).A01 = i;
        return COp.A00((COp) obj, i);
    }
}
