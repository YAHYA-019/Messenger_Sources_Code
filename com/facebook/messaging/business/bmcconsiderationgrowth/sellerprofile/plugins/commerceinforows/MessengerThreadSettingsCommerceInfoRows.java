package com.facebook.messaging.business.bmcconsiderationgrowth.sellerprofile.plugins.commerceinforows;

import X.1Br;
import X.2Sh;
import X.7zT;
import X.AbG;
import android.content.Context;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.mig.scheme.interfaces.MigColorScheme;

/* loaded from: MessengerThreadSettingsCommerceInfoRows.class */
public final class MessengerThreadSettingsCommerceInfoRows {
    public static final long A05 = MessengerThreadSettingsCommerceInfoRows.class.hashCode();
    public final Context A00;
    public final 1Br A01;
    public final ThreadKey A02;
    public final MigColorScheme A03;
    public final 2Sh A04;

    public MessengerThreadSettingsCommerceInfoRows(Context context, ThreadKey threadKey, MigColorScheme migColorScheme, 2Sh r305) {
        7zT.A1U(context, threadKey, migColorScheme);
        this.A04 = r305;
        this.A00 = context;
        this.A02 = threadKey;
        this.A03 = migColorScheme;
        this.A01 = AbG.A0O();
    }
}
