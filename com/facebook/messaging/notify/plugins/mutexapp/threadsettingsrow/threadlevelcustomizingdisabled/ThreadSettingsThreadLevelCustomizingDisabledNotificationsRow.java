package com.facebook.messaging.notify.plugins.mutexapp.threadsettingsrow.threadlevelcustomizingdisabled;

import X.06Z;
import X.1Br;
import X.1Bu;
import X.7zT;
import X.AQq;
import X.C01g;
import X.C01i;
import X.DHd;
import android.content.Context;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.messaging.model.threads.ThreadSummary;
import com.facebook.user.model.User;

/* loaded from: ThreadSettingsThreadLevelCustomizingDisabledNotificationsRow.class */
public final class ThreadSettingsThreadLevelCustomizingDisabledNotificationsRow {
    public final Context A00;
    public final 06Z A01;
    public final 1Br A02;
    public final ThreadKey A03;
    public final ThreadSummary A04;
    public final DHd A05;
    public final User A06;
    public final C01i A07;

    public ThreadSettingsThreadLevelCustomizingDisabledNotificationsRow(Context context, 06Z r303, ThreadKey threadKey, ThreadSummary threadSummary, DHd dHd, User user) {
        7zT.A1W(context, r303, dHd, threadKey);
        this.A00 = context;
        this.A01 = r303;
        this.A05 = dHd;
        this.A03 = threadKey;
        this.A06 = user;
        this.A04 = threadSummary;
        this.A02 = 1Bu.A00(147589);
        this.A07 = C01g.A01(AQq.A00(this, 13));
    }
}
