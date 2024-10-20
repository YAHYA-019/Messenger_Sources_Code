package com.facebook.rtc.activities.integrityprecall;

import X.11T;
import X.4YU;
import X.7zQ;
import X.CBN;
import X.CP0;
import X.DKT;
import X.IMQ;
import android.content.Intent;
import android.os.Bundle;
import com.facebook.base.activity.FbFragmentActivity;
import com.facebook.messaging.model.threadkey.ThreadKey;

/* loaded from: MinorSafetyNoticeActivity.class */
public final class MinorSafetyNoticeActivity extends FbFragmentActivity {
    @Override // com.facebook.base.activity.FbFragmentActivity
    public void A2x(Intent intent) {
        11T.A0F(intent, 0);
        super.A2x(intent);
    }

    @Override // com.facebook.base.activity.FbFragmentActivity
    public void A2y(Bundle bundle) {
        Intent intent = getIntent();
        ThreadKey threadKey = (ThreadKey) intent.getParcelableExtra("thread_key");
        String stringExtra = intent.getStringExtra("trigger");
        if (stringExtra == null) {
            stringExtra = "";
        }
        boolean booleanExtra = intent.getBooleanExtra("has_seen_pw", false);
        if (threadKey != null) {
            DKT A0P = 7zQ.A0P();
            CP0 A00 = CP0.A00("com.bloks.www.rp_wellbeing.precall_interstitial.onetoone");
            A00.A05("user_id", 4YU.A0z(threadKey));
            A00.A05("entry_point", CBN.A00(stringExtra));
            A00.A05("location", CBN.A01(stringExtra));
            A00.A05("thread_type", String.valueOf(ThreadKey.A00(threadKey.A06)));
            A00.A04(Boolean.valueOf(booleanExtra), "has_seen_pw");
            A00.A04 = true;
            DKT.A03(this, BDe(), new IMQ(this, 2), A0P, A00.A03(), 35, 35, 64);
        }
    }
}
