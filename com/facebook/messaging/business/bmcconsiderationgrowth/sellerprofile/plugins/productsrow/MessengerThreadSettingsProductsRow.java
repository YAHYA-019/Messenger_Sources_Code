package com.facebook.messaging.business.bmcconsiderationgrowth.sellerprofile.plugins.productsrow;

import X.11T;
import X.1Br;
import X.1Bu;
import X.1Lm;
import X.2Sh;
import X.7zT;
import android.content.Context;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.mig.scheme.interfaces.MigColorScheme;

/* loaded from: MessengerThreadSettingsProductsRow.class */
public final class MessengerThreadSettingsProductsRow {
    public static final long A07 = MessengerThreadSettingsProductsRow.class.hashCode();
    public final Context A00;
    public final 1Br A01;
    public final 1Br A02;
    public final 1Br A03;
    public final ThreadKey A04;
    public final MigColorScheme A05;
    public final 2Sh A06;

    public MessengerThreadSettingsProductsRow(Context context, FbUserSession fbUserSession, ThreadKey threadKey, MigColorScheme migColorScheme, 2Sh r306) {
        7zT.A1U(context, fbUserSession, threadKey);
        11T.A0F(migColorScheme, 5);
        this.A06 = r306;
        this.A00 = context;
        this.A04 = threadKey;
        this.A05 = migColorScheme;
        this.A03 = 1Bu.A00(793);
        this.A02 = 1Bu.A00(82651);
        this.A01 = 1Lm.A00(context, fbUserSession, 66472);
    }
}
