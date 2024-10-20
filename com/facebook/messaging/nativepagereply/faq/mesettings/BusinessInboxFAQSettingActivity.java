package com.facebook.messaging.nativepagereply.faq.mesettings;

import X.11T;
import X.1BK;
import X.1pK;
import X.AbE;
import X.C8vB;
import android.os.Bundle;
import com.facebook.messaging.settings.surface.MessengerSettingActivity;

/* loaded from: BusinessInboxFAQSettingActivity.class */
public final class BusinessInboxFAQSettingActivity extends MessengerSettingActivity {
    @Override // com.facebook.messaging.settings.surface.MessengerSettingActivity, com.facebook.base.activity.FbFragmentActivity
    public void A2y(Bundle bundle) {
        String stringExtra = getIntent().getStringExtra(AbE.A00(23));
        if (!11T.A0O(stringExtra, "inbox_qp") && !11T.A0O(stringExtra, "me_settings") && !11T.A0O(stringExtra, "message_action")) {
            stringExtra = "unknown";
        }
        super.A2y(bundle);
        A3B();
        1pK c8vB = new C8vB();
        Bundle A05 = 1BK.A05();
        A05.putString("arg_entry_point", stringExtra);
        c8vB.setArguments(A05);
        A3C(c8vB);
    }
}
