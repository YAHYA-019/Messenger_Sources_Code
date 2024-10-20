package com.facebook.messaging.business.ads.leadgen.plugins.messenger.threadsettingsrow.pageinfoloader;

import X.1BL;
import X.1Bq;
import X.1Br;
import X.1Bu;
import X.BcG;
import X.C1x;
import android.content.Context;

/* loaded from: MessengerThreadSettingsPageInfoData.class */
public final class MessengerThreadSettingsPageInfoData {
    public String A00;
    public boolean A01;
    public final Context A02;
    public final 1Br A03;
    public final 1Br A04;
    public final BcG A05;
    public final C1x A06;

    public MessengerThreadSettingsPageInfoData(Context context, C1x c1x) {
        1BL.A1F(context, c1x);
        this.A02 = context;
        this.A06 = c1x;
        this.A04 = 1Bu.A01(context, 82702);
        this.A03 = 1Bq.A00(83200);
        this.A05 = new BcG(this);
    }
}
