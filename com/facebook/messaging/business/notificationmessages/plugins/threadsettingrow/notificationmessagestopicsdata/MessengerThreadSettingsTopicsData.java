package com.facebook.messaging.business.notificationmessages.plugins.threadsettingrow.notificationmessagestopicsdata;

import X.7zR;
import X.BkV;
import X.C1x;
import android.content.Context;
import com.facebook.messaging.model.threadkey.ThreadKey;

/* loaded from: MessengerThreadSettingsTopicsData.class */
public final class MessengerThreadSettingsTopicsData {
    public BkV A00;
    public boolean A01;
    public final Context A02;
    public final ThreadKey A03;
    public final C1x A04;

    public MessengerThreadSettingsTopicsData(Context context, ThreadKey threadKey, C1x c1x) {
        7zR.A1N(context, c1x);
        this.A02 = context;
        this.A03 = threadKey;
        this.A04 = c1x;
    }
}
