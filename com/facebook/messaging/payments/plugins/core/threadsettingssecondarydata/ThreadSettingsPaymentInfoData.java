package com.facebook.messaging.payments.plugins.core.threadsettingssecondarydata;

import X.1BL;
import X.1Br;
import X.1Bu;
import X.7zM;
import X.C1x;
import android.content.Context;
import com.facebook.messaging.model.threadkey.ThreadKey;

/* loaded from: ThreadSettingsPaymentInfoData.class */
public final class ThreadSettingsPaymentInfoData {
    public boolean A00;
    public final 1Br A01;
    public final 1Br A02;
    public final ThreadKey A03;
    public final C1x A04;
    public final Context A05;

    public ThreadSettingsPaymentInfoData(Context context, ThreadKey threadKey, C1x c1x) {
        1BL.A1H(context, threadKey, c1x);
        this.A05 = context;
        this.A03 = threadKey;
        this.A04 = c1x;
        this.A02 = 7zM.A0e(context);
        this.A01 = 1Bu.A00(83194);
    }
}
