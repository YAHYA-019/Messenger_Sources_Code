package com.facebook.messaging.marketplace.meetingplan.deeplink;

import X.7zL;
import X.7zN;
import X.AbJ;
import X.AbL;
import X.C00i;
import X.CRB;
import X.CSG;
import X.DR6;
import android.content.DialogInterface;
import android.os.Bundle;
import android.text.TextUtils;
import com.facebook.acra.constants.ActionId;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.base.activity.FbFragmentActivity;

/* loaded from: RemoveMeetingPlanActivity.class */
public class RemoveMeetingPlanActivity extends FbFragmentActivity {
    public C00i A00;
    public final DialogInterface.OnClickListener A01 = CSG.A00(this, ActionId.RTMP_PACKET_RECEIVED);

    @Override // com.facebook.base.activity.FbFragmentActivity
    public void A2y(Bundle bundle) {
        FbUserSession A08 = AbL.A08(this);
        this.A00 = 7zL.A0R(this, 82020);
        String stringExtra = getIntent().getStringExtra("CURRENT_MEETING_PLAN_ID");
        if (TextUtils.isEmpty(stringExtra)) {
            return;
        }
        DR6 A02 = AbJ.A0c().A02(this);
        A02.A03(getString(2131959365));
        A02.A0J(getString(2131959363));
        A02.A0D(new CRB(this, A08, stringExtra, 4), 2131959364);
        A02.A0B(this.A01, 2131959362);
        A02.A0K(false);
        7zN.A13(A02);
    }
}
