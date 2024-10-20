package com.facebook.messaging.marketplace.viewlisting;

import X.04J;
import X.1BK;
import X.1Bi;
import X.1Hv;
import X.1UG;
import X.1iF;
import X.1vZ;
import X.2Kl;
import X.4YT;
import X.9XC;
import X.AbL;
import android.os.Bundle;
import com.facebook.base.activity.FbFragmentActivity;
import com.facebook.common.stringformat.StringFormatUtil;

/* loaded from: ThreadNotificationViewListingActivity.class */
public class ThreadNotificationViewListingActivity extends FbFragmentActivity implements 1vZ, 2Kl {
    @Override // com.facebook.base.activity.FbFragmentActivity
    public 1iF A2g() {
        return AbL.A0A();
    }

    @Override // com.facebook.base.activity.FbFragmentActivity
    public void A2y(Bundle bundle) {
        super.A2y(bundle);
        String stringExtra = getIntent().getStringExtra(4YT.A00(1234));
        1UG A08 = 1BK.A08((04J) 1Bi.A03(16634), 4YT.A00(69));
        if (A08.isSampled()) {
            A08.A7R("surface", "NOTIFICATION");
            A08.A7R("uiComponent", "MARKETPLACE_NOTIF_VIEW_LISTING_ACTION");
            A08.BZL();
        }
        ((9XC) 1Hv.A02(this, 68167)).A00(this, stringExtra == null ? "https://www.facebook.com/marketplace/" : StringFormatUtil.formatStrLocaleSafe("https://www.facebook.com/marketplace/item/%s/?referralSurface=%s&referralCode=%s", stringExtra, "NOTIFICATION", 1BK.A0d(), "NOTIFICATION"));
    }
}
