package com.facebook.messaging.mentorship.plugins.core.threadsettingssecondarydata;

import X.1BL;
import X.1Br;
import X.1Bu;
import X.C1x;
import android.content.Context;
import com.facebook.messaging.model.threadkey.ThreadKey;

/* loaded from: ThreadSettingsMentorshipInfoData.class */
public final class ThreadSettingsMentorshipInfoData {
    public final 1Br A00;
    public final ThreadKey A01;
    public final C1x A02;
    public final Context A03;

    public ThreadSettingsMentorshipInfoData(Context context, ThreadKey threadKey, C1x c1x) {
        1BL.A1H(context, threadKey, c1x);
        this.A03 = context;
        this.A01 = threadKey;
        this.A02 = c1x;
        this.A00 = 1Bu.A01(context, 83193);
    }
}
