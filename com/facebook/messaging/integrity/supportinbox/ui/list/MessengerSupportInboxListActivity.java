package com.facebook.messaging.integrity.supportinbox.ui.list;

import X.1BJ;
import X.1BV;
import X.1Bi;
import X.1Br;
import X.1UG;
import X.4YU;
import X.AbK;
import X.AbL;
import X.B8n;
import X.C00i;
import X.C6k;
import X.C9U;
import android.os.Bundle;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.messaging.integrity.supportinbox.ui.MessengerSupportInboxBaseActivity;
import com.facebook.quicklog.reliability.UserFlowLoggerImpl;

/* loaded from: MessengerSupportInboxListActivity.class */
public class MessengerSupportInboxListActivity extends MessengerSupportInboxBaseActivity {
    public C00i A00;
    public final C9U A01 = (C9U) 1Bi.A03(81940);

    @Override // com.facebook.base.activity.FbFragmentActivity
    public void A2y(Bundle bundle) {
        super.A2y(bundle);
        FbUserSession A08 = AbL.A08(this);
        this.A00 = 1BV.A00(82363);
        AbK.A1D(this, A08);
        if (bundle == null) {
            1UG.A07(1Br.A02(((C6k) 4YU.A0p(this.A00)).A00), 1BJ.A00(1811));
            String stringExtra = getIntent().getStringExtra(UserFlowLoggerImpl.SOURCE_ANNOTATION);
            C9U c9u = this.A01;
            if (stringExtra == null) {
                stringExtra = "";
            }
            c9u.A02(948444588, stringExtra);
        }
        A3B(new B8n());
    }

    @Override // com.facebook.base.activity.FbFragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        this.A01.A00();
        super.onBackPressed();
    }
}
