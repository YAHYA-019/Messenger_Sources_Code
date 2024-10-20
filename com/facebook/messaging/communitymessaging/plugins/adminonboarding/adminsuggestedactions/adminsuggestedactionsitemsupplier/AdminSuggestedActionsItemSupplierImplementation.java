package com.facebook.messaging.communitymessaging.plugins.adminonboarding.adminsuggestedactions.adminsuggestedactionsitemsupplier;

import X.0S2;
import X.1BK;
import X.1Bq;
import X.1Br;
import X.2Si;
import X.2Sk;
import X.7zM;
import X.7zN;
import X.7zR;
import X.8LU;
import X.95X;
import android.content.Context;
import com.facebook.messaging.model.threadkey.ThreadKey;
import java.util.List;

/* loaded from: AdminSuggestedActionsItemSupplierImplementation.class */
public final class AdminSuggestedActionsItemSupplierImplementation {
    public List A00;
    public final long A01;
    public final Context A02;
    public final 1Br A03;
    public final 1Br A04;
    public final 2Si A05;
    public final String A06;
    public final 2Sk A07;

    public AdminSuggestedActionsItemSupplierImplementation(Context context, 2Si r303, 2Sk r304) {
        7zR.A1N(context, r303);
        this.A02 = context;
        this.A07 = r304;
        this.A05 = r303;
        this.A03 = 1Bq.A00(16449);
        this.A00 = 7zN.A0e(new 8LU(95X.A04, 0S2.A00, "", "", "", "", "", "", "", 0, 5, 0, false));
        ThreadKey threadKey = r304.A02;
        if (threadKey == null) {
            throw 1BK.A0h();
        }
        this.A01 = threadKey.A0r();
        this.A06 = r304.A05;
        this.A04 = 7zM.A0e(context);
    }
}
