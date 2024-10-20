package com.facebook.messaging.business.ads.leadgen.plugins.messenger.threadsettingsrow.pagectas;

import X.06Z;
import X.1Bq;
import X.1Br;
import X.2Sh;
import X.7zT;
import android.content.Context;
import com.facebook.messaging.model.threadkey.ThreadKey;

/* loaded from: MessengerThreadSettingsPageCtaRows.class */
public final class MessengerThreadSettingsPageCtaRows {
    public final Context A00;
    public final 06Z A01;
    public final 1Br A02;
    public final ThreadKey A03;
    public final 2Sh A04;

    public MessengerThreadSettingsPageCtaRows(Context context, 06Z r303, ThreadKey threadKey, 2Sh r305) {
        7zT.A1T(context, threadKey, r303);
        this.A00 = context;
        this.A03 = threadKey;
        this.A04 = r305;
        this.A01 = r303;
        this.A02 = 1Bq.A00(83200);
    }
}
