package com.facebook.messaging.communitymessaging.plugins.activation.autocreatechannelinterstitial;

import X.02H;
import X.06Z;
import X.11T;
import X.1BK;
import X.4YW;
import X.7zS;
import X.C4Mg;
import android.content.Context;
import com.facebook.xapp.messaging.model.secondarydata.ParcelableSecondaryData;
import java.util.Map;
import java.util.Set;

/* loaded from: AutoCreateChannelInterstitialImplementation.class */
public final class AutoCreateChannelInterstitialImplementation {
    public static final Map A03;
    public static final Map A04;
    public static final Set A05;
    public final Context A00;
    public final 06Z A01;
    public final ParcelableSecondaryData A02;

    static {
        C4Mg c4Mg = C4Mg.A06;
        C4Mg c4Mg2 = C4Mg.A02;
        C4Mg c4Mg3 = C4Mg.A03;
        C4Mg c4Mg4 = C4Mg.A07;
        A05 = 02H.A02(new C4Mg[]{c4Mg, c4Mg2, c4Mg3, c4Mg4});
        A04 = 4YW.A0A(c4Mg3, "chat_entity_create_general_chat_interstitial", 1BK.A1G(c4Mg2, "admin_nux_gc_interstitial"));
        A03 = 7zS.A14(c4Mg, "messenger_community_messaging:ia_inbox_no_chat_community", 1BK.A1G(c4Mg2, "messenger_community_messaging:nux_admin_interstitial_qp"), 1BK.A1G(c4Mg4, "messenger_community_messaging:nux_multi_group_admin_interstitial_qp"));
    }

    public AutoCreateChannelInterstitialImplementation(Context context, 06Z r303, ParcelableSecondaryData parcelableSecondaryData) {
        11T.A0F(r303, 2);
        this.A00 = context;
        this.A01 = r303;
        this.A02 = parcelableSecondaryData;
    }
}
