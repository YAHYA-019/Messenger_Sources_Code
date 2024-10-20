package com.facebook.messenger.neue;

import X.11T;
import X.4YU;
import X.4YV;
import X.7zL;
import X.C00i;
import X.C0A2;
import X.C1ic;
import X.CDN;
import android.net.Uri;
import android.os.Bundle;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.base.activity.FbFragmentActivity;
import com.facebook.common.stringformat.StringFormatUtil;

/* loaded from: MKForwardActivity.class */
public class MKForwardActivity extends FbFragmentActivity {
    public C00i A00;

    @Override // com.facebook.base.activity.FbFragmentActivity
    public void A2y(Bundle bundle) {
        this.A00 = 7zL.A0R(this, 82146);
        String formatStrLocaleSafe = StringFormatUtil.formatStrLocaleSafe(C1ic.A0f, "messenger_me_tab");
        FbUserSession A0D = 4YV.A0D(this);
        CDN cdn = (CDN) 4YU.A0p(this.A00);
        Uri A03 = C0A2.A03(formatStrLocaleSafe);
        11T.A0G(A0D, 0, A03);
        CDN.A00(this, A03, A0D, cdn, false);
        finish();
    }
}
