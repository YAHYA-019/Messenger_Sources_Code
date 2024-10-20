package com.facebook.messaging.business.bmcconsiderationgrowth.sellerprofile.plugins.photosrow;

import X.1Br;
import X.1Bu;
import X.2Sh;
import X.7zT;
import X.82O;
import X.CEO;
import android.content.Context;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.mig.scheme.interfaces.MigColorScheme;

/* loaded from: MessengerThreadSettingsPhotosRow.class */
public final class MessengerThreadSettingsPhotosRow {
    public final 1Br A00;
    public final CEO A01;
    public final Context A02;
    public final ThreadKey A03;
    public final MigColorScheme A04;
    public final 2Sh A05;

    public MessengerThreadSettingsPhotosRow(Context context, ThreadKey threadKey, MigColorScheme migColorScheme, 2Sh r305) {
        7zT.A1U(context, threadKey, migColorScheme);
        this.A05 = r305;
        this.A02 = context;
        this.A03 = threadKey;
        this.A04 = migColorScheme;
        1Br A00 = 1Bu.A00(793);
        this.A00 = A00;
        this.A01 = new CEO(context, (82O) 1Br.A0B(A00), threadKey, migColorScheme, r305);
    }
}
